FROM eclipse-temurin:21-jdk-noble AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21
COPY --from=build /target/hello-0.0.1-SNAPSHOT.jar into hello.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","hello.jar"]