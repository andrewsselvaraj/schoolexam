# For Java 8, try this
FROM openjdk:8-jdk-alpine

#FROM adoptopenjdk/openjdk11:alpine-jre
#FROM eclipse-temurin:17-jdk-jammy

#FROM adoptopenjdk:12.0.1_12-jdk-openj9-0.14.1
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} schoolexam.jar
EXPOSE 4000-4444
ENTRYPOINT ["java","-jar","schoolexam.jar"]

## sudo docker run -p 8080:8080 -t docker-spring-boot:1.0
## sudo docker run -p 80:8080 -t docker-spring-boot:1.0
## sudo docker run -p 443:8443 -t docker-spring-boot:1.0
## mvn package.
