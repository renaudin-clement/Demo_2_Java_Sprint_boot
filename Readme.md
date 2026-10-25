# MonsterClass

Projet de démonstration Java / Spring Boot (API web avec PostgreSQL).

## Stack technique

- Java 25
- Spring Boot 4.1.2
- Spring Web MVC (`spring-boot-starter-webmvc`)
- PostgreSQL (driver JDBC)
- Maven (wrapper inclus)

## Prérequis

- JDK 25
- PostgreSQL en local ou via Docker
- Maven (optionnel, `mvnw` est fourni)

## Installation

```bash
git clone https://github.com/renaudin-clement/Demo_2_Java_Sprint_boot.git
cd Demo_2_Java_Sprint_boot
```

## Configuration de la base de données

Créer une base PostgreSQL, puis renseigner `src/main/resources/application.properties` :

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ma_base
spring.datasource.username=mon_user
spring.datasource.password=mon_mot_de_passe
```

Exemple avec Docker :

```bash
docker run --name monster-db -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=ma_base -p 5432:5432 -d postgres
```

## Lancer l'application

```bash
# Linux / macOS
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

Disponible sur http://localhost:8080

## Tests

```bash
./mvnw test
```

http://localhost:8080/greeting 

http://localhost:8080/greeting?name=User


## Build

```bash
./mvnw clean package
java -jar target/MonsterClass-0.0.1-SNAPSHOT.jar
```

## Structure

├── .mvn/wrapper/ # Maven Wrapper  
├── src/ # Code source (main + test)  
├── pom.xml # Dépendances et configuration Maven  
├── mvnw / mvnw.cmd # Scripts Maven Wrapper  


## Endpoints

| Méthode | URL | Description |
|---------|-----|-------------|
| GET     | `/` | À compléter |

## Auteur

[renaudin-clement](https://github.com/renaudin-clement)