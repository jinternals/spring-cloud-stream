# spring-cloud-stream
Spring cloud stream provide abstraction over messaging broker and its features, and provides consistent feature across the binders like kafka and rabbitmq. 
It works like polyfill for messaging if some feature is missing from binder, like native partition support is missing in rabbitmq spring cloud spring provides this out of box.  


#### How to run :


##### build code and docker images :
```
    mvn clean install docker:build 
```

##### start containers :

```
    docker-compose -f kafka-docker-compose.yml up -d
```

 ##### stop containers :

 ```
    docker-compose -f kafka-docker-compose.yml stop
  
```

 ##### remove containers :
  
```  
    docker-compose -f kafka-docker-compose.yml rm -f
                  
```

#### view kafka topics :

```
    http://localhost:8000
```