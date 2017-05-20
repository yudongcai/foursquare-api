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
        
To Test
---------
Open urls in a browser, e.g.

* http://localhost:8080/venues/search

* http://localhost:8080/venues/search?near=52.48,1.89&name=premierinn

You can use your own values for the two parameters - "name" (venue name) and "near" (latitude,longitue)

If test with invalid parameter
------------------------------

If you send a query with invalid format for parameter - near, the REST endpoint will just return an empty venue list.

E.g. this url - http://localhost:8080/venues/search?near=xxxx&name=premierinn returns -

{"venues":[]}

To Shutdown
-----------
Press - ctrl + c

Further information
-------------------

* https://developer.foursquare.com/docs/venues/search

* The java classes in the model package are generated from foursquare's json response using online tool - http://www.jsonschema2pojo.org/