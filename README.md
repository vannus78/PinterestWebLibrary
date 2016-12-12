# PinterestWebLibrary
Pinterest web library. Retrieve Pinterest user's boards and pins

This is a simple library written in java 1.8 used to interface with Pinterest site to retrieve user's boards and pins.

Scraping Pinterest pages is difficult because site use the infinite scroll technique to show boards and pins, so this library is written to retrieve informations simulating AJAX calls made by the browser during site visits.

The library makes HTTP calls to pinterest site in AJAX format, analyze JSON results and store informations in java objects.

<h2>Packages</h2>
<ul>
  <li><b>com.pinterestweblibrary</b> is the main package, it contains the base classes PinterestBoard and PinterestPin. A Pinterest board is a container for Pinterest pins, in fact it expose an array of PinterestPin.</li>
  <li><b>com.pinterestweblibrary.http</b> package contains the connector to Pinterst site. Class PinterestHTTPConnector in the package is the HTTP connector, it expose methods to retrieve boards informations, board's pins and check for user existence.
  The connector is the core of the library and iteracts with pinterest site making AJAX calls and analyzing JSON response.</li>
  <li><b>com.pinterestweblibrary.types</b> package and it's sub packages contains POJO classes necessary to contains JSON response. These objects are used by the connector to make requests to pinterest site and store response. JSON response contains lots of informations filtered by HTTP connector in order to populate PinterestBoard and PinteresPin objects.</li>
</ul>

<h2>Usage</h2>
Let's see some examples:

```java
/*
* This example check if a user exists on Pinterest
*/
import com.pinterestweblibrary.http.PinterestHTTPConnector;

public class TestUserExists {
    public static void main(){
        PinterestHTTPConnector connector = new PinterestHTTPConnector();
        String user = "exampleuser";
        
        if (connector.UserExists(user)){
            System.out.println(user + " exists");
        }
        else{
            System.out.println(user + " doesn't exists");
        }
    }
}

```

```java
/*
* This example retrieves user's boards and all pins in every board
*/
import com.pinterestweblibrary.http.PinterestHTTPConnector;
import com.pinterestweblibrary.http.UserNameNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class GetUserBoardsAndPins {
    public static void main(String args[]){
        PinterestHTTPConnector connector = new PinterestHTTPConnector();
        String user = "exampleuser";
        ArrayList<PinterestBoard> userBoards = null;
        
        try {
            //Use connector to retrieve user boards. PINS are not yet populated
            userBoards = connector.retrieveBoards(user);
            for (Iterator<PinterestBoard> it = userBoards.iterator(); it.hasNext();) {
                PinterestBoard board = it.next();
                
                //Get PINS for current board
                connector.getBoardPins(board);
                
                //Show boards informations
                System.out.println(board.getName());
                System.out.println("Total PINS: " + board.getPins().size());
                System.out.println("===================");
                
                //Show pins informations
                for (Iterator<PinterestPin> iterPins = board.getPins().iterator(); iterPins.hasNext();){
                    PinterestPin pin = iterPins.next();
                    System.out.println(pin.getTitle() + ": " + pin.getUrl());
                }
            }
        } catch (UserNameNotFoundException ex) {
            System.out.println(user + " doesn't exists");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

```

<h2>Dependencies</h2>

<ul>
<li>JDK 1.8</li>
<li>gson 2.6.2 - Google library used to store JSON information into java classes</li>
<li>httpclient-4.5.2 - Apache http client, used to make AJAX calls</li>
<li>httpcore-4.4.4 - Apache http core, supports for http client</li>
</ul>
