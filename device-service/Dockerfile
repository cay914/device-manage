FROM jdk

MAINTAINER Eric
ENV LANG en_US.UTF-8

RUN mkdir -p /opt/device-service/
RUN chmod -R 777 /opt/device-service/
ADD target/device-service-0.0.1-SNAPSHOT.jar /opt/device-service/device-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/opt/device-service/device-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 9003
