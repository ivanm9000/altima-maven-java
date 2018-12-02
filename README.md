#Altima project

Maven based java application.
Finding exit path for vehicle , in case there is existing path for selected tunnel return value is exit position,
otherwise it is written how to come back to start point.
Only 3 tunnels are made and have map.

## Installation

To install all required packages execute following maven command

``` cmd
mvn install
```

## Test

To execute tests use following command

``` cmd
mvn test
```

## Run application

Main project class is altima.AltimaApp
To run it from java CLI

``` cmd
java -cp ./target/classes altima/AltimaApp
```