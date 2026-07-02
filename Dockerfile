# ---------- Build stage ----------
FROM maven:3.9.9-amazoncorretto-8-alpine AS builder


WORKDIR /build

# Copy Maven descriptor first to leverage Docker layer caching
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy the application source
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# ---------- Runtime stage ----------
FROM amazoncorretto:8-alpine

# Create a non-root user
RUN addgroup -S spring && adduser -S spring -G spring

WORKDIR /app

# Copy the built JAR from the builder stage
COPY --from=builder /build/target/*.jar app.jar

RUN chown spring:spring app.jar

USER spring

EXPOSE 8080

ENV JAVA_OPTS=""

ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar app.jar"]