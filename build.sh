#!/bin/bash

mvn clean

mvn package -D skipTests=true

cp target/springboot-docker.jar docker/java/app.jar

cd docker/mysql

docker build -t mysql-test-7 .

cd ../java

docker build -t java-test-7 .