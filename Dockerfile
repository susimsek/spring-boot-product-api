FROM openjdk:8-jdk-alpine
FROM maven:3.6.0-jdk-8

MAINTAINER suaybsimsek58@gmail.com

ARG PACKAGED_JAR=target/*.jar

ADD ${PACKAGED_JAR} mcy-sb-devtools-docker.jar

ENTRYPOINT ["java","-jar","-Xdebug","-Xrunjdwp:server=y,transport=dt_socket,address=8001,suspend=n","/mcy-sb-devtools-docker.jar"]

EXPOSE 8080:8080
EXPOSE 8001:8001