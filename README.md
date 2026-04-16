# Simple Maven Library Management System

## Description
Console Java app for managing library borrowings. Inputs user details, books count, days borrowed. Calculates fine if late (>14 days): $1 per day per book.

## Run
```
mvn clean compile exec:java -Dexec.mainClass="com.example.App"
```
Or `mvn compile` then `java -cp target/classes com.example.App`

## Test
```
mvn test
```

## Build for Jenkins
Compatible with Maven: clean compile test jar package.
