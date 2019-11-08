FROM jdk

MAINTAINER Eric
ENV LANG en_US.UTF-8

RUN mkdir -p /opt/zuulsvr/
RUN chmod -R 777 /opt/zuulsvr/
ADD target/zuulsvr-0.0.1-SNAPSHOT.jar /opt/zuulsvr/zuulsvr-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/opt/zuulsvr/zuulsvr-0.0.1-SNAPSHOT.jar"]
EXPOSE 5555
