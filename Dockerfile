# Use a base image with Java 21
FROM eclipse-temurin:21

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/springboot.beckend-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
