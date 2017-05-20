# foursquare-api

Goal: provide APIs to integrate with FourSquare 

To Build
---------
1. Install Java 8 SDK
2. Install latest maven (I work with 3.3.9)
3. Open a command line window, cd to the project's root folder, and run -
>mvn package

To Run
---------
Still in the project's root folder, and run -
>java -jar ./target/foursquare-api-1.0-SNAPSHOT.jar

To Run Integration Test
-----------------------
in the project's root folder, and run -
>mvn verify
        
To Test
---------
Open a Browser, and open urls, e.g.

* http://localhost:8080/venues/search

* http://localhost:8080/venues/search?near=52.48,1.89&name=premierinn

You can use your own values for the two parameters - "name" (venue name) and "near" (latitude,longitue)

To Shutdown
-----------
press - ctrl + c

Further information
-------------------

* https://developer.foursquare.com/docs/venues/search
