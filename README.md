# Store in Spring Boot

The aim of this repository is to understand the Spring Boot framework

## Initialise project

Go to [Spring initializer](https://start.spring.io/) and set up the project settings.

| Component  | Description     |
|------------|-----------------|
| Maven      | Package manager |
| JDK 24     | JDK Version     |
| com.dehyju | Package name    |
| store      | Artifact        |

### Dependencies

Packages are found at [Maven Central](https://central.sonatype.com/artifact/org.springframework.boot/)

These are found in [./pom.xml](./pom.xml) under dependencies

| Package                  | Purpose                      | Link                                                                                                              |
|--------------------------|------------------------------|-------------------------------------------------------------------------------------------------------------------|
| spring-boot-starter      | Package for core spring boot | A default dependency                                                                                              |
| spring-boot-starter-test | Package for creating tests   | A default dependency                                                                                              |
| spring-boot-starter-web  | Package for REST API         | [spring-boot-starter-web](https://central.sonatype.com/artifact/org.springframework.boot/spring-boot-starter-web) |