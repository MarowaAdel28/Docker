#FROM maven:3-openjdk-17-slim as build
#COPY . /app/project
#RUN mvn -f /app/project/pom.xml clean package
#RUN jar cfm hello.jar META-INF/MANIFEST.MF gov.iti.jets.*.class
#
#
#FROM openjdk:17-jdk-alpine
#EXPOSE 8080
#COPY --from=build /app/project/target/*.jar hello.jar
#ENTRYPOINT java -jar /hello.jar

FROM openjdk:17-jdk-alpine AS run
EXPOSE 8080
COPY ./target/*.jar  app.jar
ENTRYPOINT ["java" , "-jar" ,"app.jar"]
