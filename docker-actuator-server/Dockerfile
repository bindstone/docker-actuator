# This project is creating the artifacts inside the Docker
# For this it is based on the Maven JDK8 image, it loads the
# sources and build the artifacts before starting the server.

FROM maven:3.6-jdk-8-alpine

COPY . .

RUN mvn clean install

ENTRYPOINT ["java","-jar","/target/docker-actuator-server.jar"]
