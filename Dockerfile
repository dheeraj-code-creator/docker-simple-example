FROM openjdk:8
WORKDIR '/app'
ADD target/docker-springboot.jar docker-springboot.jar
EXPOSE 8086
COPY . .
ENTRYPOINT ["java", "-jar", "docker-springboot.jar"]