FROM jdk

MAINTAINER Eric
ENV LANG en_US.UTF-8
 
RUN mkdir -p /opt/configurationserver/
RUN chmod -R 777 /opt/configurationserver/
ADD ./configurationserver-0.0.1-SNAPSHOT.jar /opt/configurationserver/configurationserver-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/opt/configurationserver/configurationserver-0.0.1-SNAPSHOT.jar"]
EXPOSE 30888
