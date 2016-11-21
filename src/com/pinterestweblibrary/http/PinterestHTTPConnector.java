/*
 * The MIT License
 *
 * Copyright 2016 Stefano Vannucci.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.pinterestweblibrary.http;

import com.google.gson.Gson;
import com.pinterestweblibrary.PinterestBoard;
import com.pinterestweblibrary.PinterestPin;
import com.pinterestweblibrary.types.TypeRequestPin;
import com.pinterestweblibrary.types.TypeRequestUserBoards;
import com.pinterestweblibrary.types.TypeResponsePin;
import com.pinterestweblibrary.types.TypeResponseUserBoards;
import com.pinterestweblibrary.types.board.TypeData;
import com.pinterestweblibrary.types.board.TypeOptions;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Pinterest HTTP Connector. 
 * Call Pinterest site AJAX functionality to retrieve user's boards and pins.
 * This class simulate the AJAX calls made by the browser to navigate Pinterest site,
 * parse JSON reponse and store informations in wrapped classes (boards an pins).
 * 
 * @author Stefano Vannucci
 */
public class PinterestHTTPConnector implements AutoCloseable{
    private final static String BOOKMARK_END = "-end-";
    
    private CloseableHttpClient httpclient = null;
    private HttpGet httpget = null;
    private CloseableHttpResponse response = null;
    private URI uri = null;
    private ResponseHandler<String> handler = null;
    private Gson parser = null;
    
    public PinterestHTTPConnector(){
        this.httpclient = HttpClients.createDefault();
        this.httpget = new HttpGet();
        httpget.setHeader("Host", "www.pinterest.com");
        httpget.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:46.0) Gecko/20100101 Firefox/46.0");
        httpget.setHeader("Accept", "application/json, text/javascript, */*; q=0.01");
        httpget.setHeader("Accept-Language", "it-IT,it;q=0.8,en-US;q=0.5,en;q=0.3");
        httpget.setHeader("Accept-Encoding", "gzip, deflate, br");
        httpget.setHeader("X-Pinterest-AppState", "active");
        httpget.setHeader("X-NEW-APP", "1");
        httpget.setHeader("X-APP-VERSION", "16bafb7");
        httpget.setHeader("X-Requested-With", "XMLHttpRequest");
        httpget.setHeader("Referer", "https://www.pinterest.com");
        this.handler = new BasicResponseHandler();
        this.parser = new Gson();
    }
    
    /**
     * Retrieve boards list of a Pinerest User.
     * 
     * @param userName
     * @return
     * @throws URISyntaxException
     * @throws IOException 
     */
    public  ArrayList<PinterestBoard> retrieveBoards(String userName) throws URISyntaxException, IOException{
        
        TypeRequestUserBoards callData = new TypeRequestUserBoards();
        TypeOptions callOptions = new TypeOptions();
        TypeResponseUserBoards userBoards = null;
        ArrayList<PinterestBoard> output = new ArrayList<>();
        String [] bookmarks = null;
        String [] urlSplit = null;
        
        callOptions.setUsername(userName);
        callOptions.setField_set_key("grid_item");
        do{
            callOptions.setBookmarks(bookmarks);
            callData.setOptions(callOptions);
            uri = new URIBuilder()
                    .setScheme("https")
                    .setHost("www.pinterest.com")
                    .setPath("/resource/ProfileBoardsResource/get/")
                    .setParameter("data", parser.toJson(callData))
                    .setParameter("_", Double.toString(Math.random()*1000))
                    .build();

            this.httpget.setURI(uri);
            this.response = httpclient.execute(this.httpget);
            userBoards =  parser.fromJson(handler.handleResponse(this.response), TypeResponseUserBoards.class);
            this.response.close();
            
            for (TypeData currData : userBoards.getResource_response().getData()) {
                urlSplit = currData.getUrl().split("/");
                
                PinterestBoard newBoard = new PinterestBoard();
                newBoard.setId(currData.getId());
                newBoard.setDescription(currData.getDescription());
                newBoard.setName(currData.getName());
                newBoard.setUrl("https://www.pinterest.com"+currData.getUrl());
                newBoard.setSlug(urlSplit[urlSplit.length -1 ]);
                
                output.add(newBoard);
            }
            
            bookmarks = userBoards.getResource().getOptions().getBookmarks();
            
        }
        while (!bookmarks[0].equals(BOOKMARK_END));
        
        return output;
    }
    
    /**
     * Return a list of all PinterestPin of a given board.
     * 
     * @param board
     * @return
     * @throws URISyntaxException
     * @throws IOException 
     */
    public ArrayList<PinterestPin> getBoardPins(PinterestBoard board) throws URISyntaxException, IOException {
        return getBoardPins(board,100);
    }
    
    /**
     * Return a list of all PinterestPin of a given board. 
     * Pins are read page by page simulating the infinite page scrolling.
     * Page size specify how many pins are read in a request.
     * 
     * @param pinBoard
     * @param pageSize
     * @return 
     * @throws java.net.URISyntaxException 
     * @throws java.io.IOException 
     */
    public ArrayList<PinterestPin> getBoardPins(PinterestBoard pinBoard,  int pageSize) throws URISyntaxException, IOException{
        
        ArrayList<PinterestPin> output = new ArrayList<>();
        TypeRequestPin callData = new TypeRequestPin();
        TypeResponsePin boardPins = new TypeResponsePin();
        com.pinterestweblibrary.types.pin.TypeOptions dataOptions = new  com.pinterestweblibrary.types.pin.TypeOptions();
        String [] bookmarks = null;
        
        dataOptions.setBoard_id(pinBoard.getId());
        dataOptions.setPage_size(pageSize);
        do{
            dataOptions.setBookmarks(bookmarks);
            callData.setOptions(dataOptions);
            
            uri = new URIBuilder()
                    .setScheme("https")
                    .setHost("www.pinterest.com")
                    .setPath("/resource/BoardFeedResource/get/")
                    .setParameter("data", parser.toJson(callData))
                    .setParameter("_", Double.toString(Math.random()*1000))
                    .build();
            
            this.httpget.setURI(uri);
            String body = "";
            this.response = httpclient.execute(this.httpget);
            body = handler.handleResponse(this.response);
            boardPins =  parser.fromJson(body, TypeResponsePin.class);
            this.response.close();
            
            for (com.pinterestweblibrary.types.pin.TypeData data : boardPins.getResource_response().getData()) {
                com.pinterestweblibrary.types.pin.TypeData currData = data;
                PinterestPin pin = new PinterestPin();
                pin.setDescription(currData.getDescription());
                pin.setId(currData.getId());
                pin.setTitle(currData.getTitle());
                pin.setUrl(currData.getImages().getOrig().getUrl());
                output.add(pin);
            }
            
            bookmarks = boardPins.getResource().getOptions().getBookmarks();
        }
        while (!bookmarks[0].equals(BOOKMARK_END));
        
        return output;
    }
    
    /**
     * Release resources
     * 
     * @throws Exception 
     */
    @Override
    public void close() throws Exception {
        httpclient.close();
    }
}
