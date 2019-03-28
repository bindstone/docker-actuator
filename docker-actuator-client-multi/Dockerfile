# Build in Image 1
FROM maven:3.6-jdk-8-alpine as builder
COPY . .
RUN mvn clean install

# Copy Artifact from image 1 -> Image 2 and start

FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY --from=builder target/docker-actuator-client-multi.jar docker-actuator-client-multi.jar
ENTRYPOINT ["java","-jar","/docker-actuator-client-multi.jar"]