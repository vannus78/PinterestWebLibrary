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
package com.pinterestweblibrary.types.pin;

/**
 *
 * @author Stefano Vannucci
 */
public class TypeOptions {
    private String board_id = "";
    private boolean show_done = false;
    private String board_url = "";
    private int page_size = 0;
    private boolean add_vase = false;
    private String [] access = null;
    private String board_layout = "default";
    private String [] bookmarks = null;
    private boolean prepend = false;

    public String getBoard_id() {
        return board_id;
    }

    public void setBoard_id(String board_id) {
        this.board_id = board_id;
    }

    public boolean isShow_done() {
        return show_done;
    }

    public void setShow_done(boolean show_done) {
        this.show_done = show_done;
    }

    public String getBoard_url() {
        return board_url;
    }

    public void setBoard_url(String board_url) {
        this.board_url = board_url;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public boolean isAdd_vase() {
        return add_vase;
    }

    public void setAdd_vase(boolean add_vase) {
        this.add_vase = add_vase;
    }

    public String [] getAccess() {
        return access;
    }

    public void setAccess(String [] access) {
        this.access = access;
    }

    public String getBoard_layout() {
        return board_layout;
    }

    public void setBoard_layout(String board_layout) {
        this.board_layout = board_layout;
    }

    public String[] getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(String[] bookmarks) {
        this.bookmarks = bookmarks;
    }

    public boolean isPrepend() {
        return prepend;
    }

    public void setPrepend(boolean prepend) {
        this.prepend = prepend;
    }
}
