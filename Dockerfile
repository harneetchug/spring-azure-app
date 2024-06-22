#FROM openjdk:17-jdk-alpine
FROM openjdk:17
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sample-service.jar
CMD ["java", "-jar", "sample-service.jar"]







