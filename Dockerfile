FROM maven AS builder
WORKDIR /xlsx/
COPY . .
RUN mvn clean package


FROM openjdk:17.0.2-slim
COPY --from=builder xlsx/target/demo-0.0.1-SNAPSHOT.jar /xlsx-1.0-SNAPSHOT.jar


ENTRYPOINT ["java", "-Xmx128m", "-XX:+UseZGC", "-XX:ZUncommitDelay=60", "-XX:MaxHeapFreeRatio=30", "-XX:MinHeapFreeRatio=10","xlsx-1.0-SNAPSHOT.jar"]

