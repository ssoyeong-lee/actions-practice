FROM eclipse-temurin:21
LABEL authors="soyounglee"
ARG JAR_FILE=build/libs/actions-practice-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]