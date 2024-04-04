FROM maven:3.8.7-amazoncorretto-17 AS BUILD

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn package -DskipTests

FROM amazoncorretto:17.0.7-alpine3.17

WORKDIR /app

COPY --from=BUILD app/target/docker-demo-0.0.1-SNAPSHOT.jar ./docker-demo-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "docker-demo-0.0.1-SNAPSHOT.jar"]




