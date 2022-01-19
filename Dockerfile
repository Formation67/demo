FROM openjdk:11-jdk as base
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src

FROM base as build
RUN ./mvnw package
FROM openjdk:11-jre-slim as production
EXPOSE 8080
COPY --from=build *.jar /app.jar
CMD ["sh","-c","java -jar /app.jar"]
