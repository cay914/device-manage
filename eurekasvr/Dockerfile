FROM jdk

MAINTAINER Eric
ENV LANG en_US.UTF-8

RUN mkdir -p /opt/eurekasvr/
RUN chmod -R 777 /opt/eurekasvr/
COPY ./eurekasvr-0.0.1-SNAPSHOT.jar /opt/eurekasvr/eurekasvr-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Xms64m", "-Xmx256m", "-jar", "/opt/eurekasvr/eurekasvr-0.0.1-SNAPSHOT.jar"]
EXPOSE 30761
