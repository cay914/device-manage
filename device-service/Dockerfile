FROM jdk

MAINTAINER Eric
ENV LANG en_US.UTF-8

RUN mkdir -p /opt/device-service/
RUN chmod -R 777 /opt/device-service/
COPY ./device-service-0.0.1-SNAPSHOT.jar /opt/device-service/device-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Xms64m", "-Xmx256m", "-jar", "/opt/device-service/device-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 9003
