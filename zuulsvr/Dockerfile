FROM jdk

MAINTAINER Eric
ENV LANG en_US.UTF-8

RUN mkdir -p /opt/zuulsvr/
RUN chmod -R 777 /opt/zuulsvr/
ADD ./zuulsvr-0.0.1-SNAPSHOT.jar /opt/zuulsvr/zuulsvr-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Xms64m", "-Xmx256m", "-jar", "/opt/zuulsvr/zuulsvr-0.0.1-SNAPSHOT.jar"]
EXPOSE 5555
