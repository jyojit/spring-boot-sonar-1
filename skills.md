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
