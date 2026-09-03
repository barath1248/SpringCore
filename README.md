# firstProgram

Simple Spring Core example project demonstrating dependency injection and basic application structure.

## Project structure

- `src/main/java/businessLayer/firstProgram` - main application classes and configuration
- `src/test/java/businessLayer/firstProgram` - unit tests

## Requirements

- Java 8+ (JDK)
- Maven

## Build

Run the standard Maven build:

```bash
mvn clean package
```

## Run

After building, run the main class from the `target/classes` directory. For example:

```bash
java -cp target/classes businessLayer.firstProgram.App
```

Alternatively use the Maven Exec plugin:

```bash
mvn exec:java -Dexec.mainClass="businessLayer.firstProgram.App"
```

## Tests

Run tests with:

```bash
mvn test
```

## Notes

- Configuration files: see `src/main/java/businessLayer/firstProgram/application-context.xml` and the `DependencyInjection` folder for DI examples.
- This is a small demo project intended to exercise Spring Core features.
