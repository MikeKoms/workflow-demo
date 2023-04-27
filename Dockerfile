FROM openjdk:17

COPY target/anekdot-sender-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT exec java -jar /app.jar
