# ---------- Build stage ----------
FROM gradle:9.8.0-jdk21-alpine AS builder

WORKDIR /build

# Copy Gradle descriptors first to leverage Docker layer caching
COPY settings.gradle build.gradle ./

# Download dependencies with cache mount for faster builds
RUN --mount=type=cache,target=/home/gradle/.gradle \
    gradle dependencies --no-daemon > /dev/null

# Copy the application source and build
COPY src ./src
RUN --mount=type=cache,target=/home/gradle/.gradle \
    gradle bootJar -x test --no-daemon

# ---------- Runtime stage ----------
FROM eclipse-temurin:21-jre-alpine

# Create a non-root user
RUN addgroup -S spring && adduser -S spring -G spring

WORKDIR /app

COPY --from=builder /build/build/libs/naissant-app.jar app.jar

RUN chown spring:spring app.jar

USER spring

EXPOSE 8085

ENV JAVA_OPTS=""

ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar app.jar"]
