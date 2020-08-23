FROM openjdk:8
WORKDIR '/app'
ADD target/docker-simple-example.jar docker-simple-example.jar
EXPOSE 8086
COPY . .
ENTRYPOINT ["java", "-jar", "docker-simple-example.jar"]