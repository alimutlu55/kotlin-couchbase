FROM openjdk:11-jre-slim-stretch
WORKDIR /app
COPY /target/product-api-*.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","app.jar"]
