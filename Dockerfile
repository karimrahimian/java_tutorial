# Tecnotree pinned base https://wiki.tecnotree.com/confluence/display/DEVOPS/DevOps-Docker-BaseImages
FROM openjdk:17-oracle
#dev-docker-registry.tecnotree.com/mirror/registry.docker.io/adoptopenjdk/openjdk17:jre-latest AS stage0
RUN echo SALAM
WORKDIR /app
COPY target/product-0.0.1-SNAPSHOT.jar /app/product-0.0.1-SNAPSHOT.jar
EXPOSE 9000
CMD ["java", "-jar", "product-0.0.1-SNAPSHOT.jar"]

