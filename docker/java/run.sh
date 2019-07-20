#!/bin/bash

echo 'start'

while ! nc -z ${MYSQL_IP} ${MYSQL_PORT}; do sleep 3; done

echo 'end'

echo "${MYSQL_IP}:${MYSQL_PORT}"

echo `${MYSQL_IP}:${MYSQL_PORT}`

sleep 30

java -jar app.jar
