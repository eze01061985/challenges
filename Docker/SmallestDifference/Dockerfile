# Use a Java base image
FROM openjdk:11

# Copy the source code into the container
COPY src /app

# Set the working directory
WORKDIR /app

# Compile the Java code
RUN javac SmallestDifference.java

# Run the application when the container starts
CMD ["java", "SmallestDifference"]
