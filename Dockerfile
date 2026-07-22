FROM eclipse-temurin:17-jdk

COPY . .

RUN ./gradlew assemble

ENTRYPOINT ["java", "-jar", "build/libs/Test-app.jar"]

