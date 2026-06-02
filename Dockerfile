# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/MyDiarySpringBootRestAPI-0.0.1-SNAPSHOT.jar app.jar

# Expose Render's dynamic port
ENV PORT=8080
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "app.jar"]
