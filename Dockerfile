FROM openjdk:17
VOLUME /tmp
ADD target/test-deploy-0.0.1-SNAPSHOT.jar test-deploy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "test-deploy-0.0.1-SNAPSHOT.jar"]
