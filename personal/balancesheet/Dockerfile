FROM maven:3.9-eclipse-temurin-25 AS build

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM eclipse-temurin:25-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 10000

ENTRYPOINT ["sh", "-c", "java -jar app.jar --server.port=${PORT:-10000}"]