FROM openjdk:17

WORKDIR /app

COPY ./target/inventory-service.jar /app

EXPOSE 8086

CMD ["java", "-jar", "inventory-service.jar"]