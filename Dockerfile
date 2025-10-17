# Stage 1: Build
FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /app

# Copy only pom.xml first for caching dependencies
COPY pom.xml .
RUN mvn dependency:resolve

# Copy source code
COPY src ./src

# Build the project
RUN mvn clean package -DskipTests


FROM eclipse-temurin:21
COPY --from=build /target/hello-0.0.1-SNAPSHOT.jar into hello.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","hello.jar"]
