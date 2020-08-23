# Docker build command with tag name
docker build -t dheeraj1990kk/docker-simple-example:0.0.1-SNAPSHOT .

# Docker run command
docker run -p 8086:8086 dheeraj1990kk/docker-simple-example:0.0.1-SNAPSHOT

# Docker check all container
docker ps --all

# Docker stop command
docker stop container-id

# Docker delete container command
docker system prune

# Docker push command to docker hub
docker push dheeraj1990kk/docker-simple-example:0.0.1-SNAPSHOT

# Docker pull command from docker hub
docker pull dheeraj1990kk/docker-simple-example:0.0.1-SNAPSHOT

# delete an existing image
docker rmi image-id