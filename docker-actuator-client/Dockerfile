FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY target/docker-actuator-client.jar docker-actuator-client.jar

ENTRYPOINT ["java","-jar","/docker-actuator-client.jar"]