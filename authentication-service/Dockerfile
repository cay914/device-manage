FROM jdk

MAINTAINER Eric
ENV LANG en_US.UTF-8

RUN mkdir -p /opt/authentication-service/
RUN chmod -R 777 /opt/authentication-service/
COPY ./authentication-service-0.0.1-SNAPSHOT.jar /opt/authentication-service/authentication-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Xms64m", "-Xmx256m", "-jar", "/opt/authentication-service/authentication-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8901
