FROM eclipse-temurin:21-jdk
WORKDIR /src
COPY target/testing-0.0.1-SNAPSHOT.jar /src/testing.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "testing.jar"]
