#!/bin/sh
getPort() {
    echo $1 | cut -d : -f 3 | xargs basename
}

EUREKASERVER_URI=http://codebattery.top:30001/eureka/
 
#echo "********************************************************"
#echo "Waiting for the eureka server to start on port $(getPort 8761)"
#echo "********************************************************"
#while ! `nc -zv 10.244.1.58  8761`; do sleep 3; done
#echo "******* Eureka Server has started"

echo "********************************************************"
echo "Starting Configuration Service with Eureka Endpoint:  $EUREKASERVER_URI";
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom -Deureka.client.serviceUrl.defaultZone=$EUREKASERVER_URI -jar /usr/local/configserver/@project.build.finalName@.jar
