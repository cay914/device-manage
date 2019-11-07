FROM jdk

MAINTAINER Eric
ENV LANG en_US.UTF-8
ADD target/eurekasvr-0.0.1-SNAPSHOT.jar /opt/eurekasvr/eurekasvr-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/opt//eurekasvr-0.0.1-SNAPSHOT.jar"]
EXPOSE 30761
