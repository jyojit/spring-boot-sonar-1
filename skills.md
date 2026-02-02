# Java Application Testing with JUnit 5 & Mockito

## Purpose
Comprehensive guide for writing effective unit and integration tests for Java applications using JUnit 5 (Jupiter) and Mockito Core.

## When to Use This Skill
- Writing unit tests for services, controllers, or repositories
- Creating mock objects for dependencies
- Testing Spring Boot applications
- Verifying behavior and interactions
- Setting up test fixtures and assertions

---

## Core Dependencies

```xml
<!-- Maven Dependencies -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.1</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.8.0</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-junit-jupiter</artifactId>
    <version>5.8.0</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.24.2</version>
    <scope>test</scope>
</dependency>
JAVA/SPRING BOOT PREFERENCES:
- Use Java 21 features when applicable
- Always use constructor injection over field injection
- Prefer record classes for DTOs
- Use Lombok annotations (@Slf4j, @RequiredArgsConstructor)
- Follow REST API best practices (proper HTTP methods, status codes)
- Write tests with JUnit 5 and Mockito
- Use Spring Boot 3.x conventions
- Package structure: controller → service → repository → model
- Always include proper exception handling with @ControllerAdvice
- Use meaningful variable names (no single letters except loops)
- Add brief Javadoc for public methods
- Format: 4 spaces indentation, max 120 chars per line

