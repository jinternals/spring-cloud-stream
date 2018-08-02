# spring-cloud-stream

[![Build Status](https://travis-ci.org/jinternals/spring-cloud-stream.svg?branch=master)](https://travis-ci.org/jinternals/spring-cloud-stream)

Spring cloud stream provide abstraction over messaging broker and its features, and provides consistent feature across the binders like kafka and rabbitmq. 
It works like polyfill for messaging if some feature is missing from binder, like native partition support is missing in rabbitmq spring cloud spring provides this out of box.  




##### build code and docker images :
```
    mvn clean install docker:build 
```

#### how to run kafka example:


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

#### how to run rabbitmq example:


##### start containers :

```
    docker-compose -f rabbitmq-docker-compose.yml up -d
```

 ##### stop containers :

 ```
    docker-compose -f rabbitmq-docker-compose.yml stop
```

 ##### remove containers :
  
```
    docker-compose -f rabbitmq-docker-compose.yml rm -f   
```


### Known Issues and Fix:

#### Permission issue with  cluster-entrypoint.sh
```
    chmod +x ./config/rabbitmq/cluster-entrypoint.sh
```
