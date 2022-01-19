FROM openjdk:11-jre-slim
VOLUME [ "/tmp" ]
ADD *.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "sh","-c","java -jar /app.jar" ]
