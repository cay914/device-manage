FROM openjdk:8-jdk-alpine

MAINTAINER Eric

ENV LANG en_US.UTF-8
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/eurekaserver
ADD eurekasvr-0.0.1-SNAPSHOT.jar /usr/local/eurekaserver/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
