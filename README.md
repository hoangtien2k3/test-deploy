## Deploy Spring Boot Demo Render

## Dockerfile:
```dockerfile
FROM openjdk:17
VOLUME /tmp
ADD target/test-deploy-0.0.1-SNAPSHOT.jar test-deploy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "test-deploy-0.0.1-SNAPSHOT.jar"]
```

<img width="1440" alt="image" src="https://github.com/hoangtien2k3qx1/test-deploy/assets/122768076/9b2affd8-6bc2-4e52-9a1e-05c856b362ff">
