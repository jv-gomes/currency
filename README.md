# Currency Exchange Microservices

Estrutura profissional de backend com **2 microsserviços Spring Boot 3 + Java 21**, focada em arquitetura enterprise, organização de camadas e pronta para evolução.

## Arquitetura

- **currency-service** (`:8081`)
  - Endpoint base: `GET /api/currency/convert`
  - Responsável por conversão de moedas (boilerplate)
- **history-service** (`:8082`)
  - Endpoint base: `GET /api/history/latest`
  - Responsável por histórico de conversões (boilerplate)

### Tecnologias

- Java 21
- Spring Boot 3
- Spring Web / Validation
- Spring Data JPA
- PostgreSQL
- RabbitMQ
- Flyway
- Spring Actuator
- Springdoc OpenAPI (Swagger)
- Docker / Docker Compose

## Estrutura de Pastas

```text
currency-exchange-microservices/
├── currency-service/
│   ├── Dockerfile
│   ├── pom.xml
│   └── src/main/
│       ├── java/com/currency/currencyservice/
│       │   ├── CurrencyServiceApplication.java
│       │   ├── controller/
│       │   ├── service/
│       │   │   └── impl/
│       │   ├── repository/
│       │   ├── dto/
│       │   ├── entity/
│       │   ├── client/
│       │   ├── config/
│       │   └── exception/
│       └── resources/
│           ├── application.yml
│           └── db/migration/
│               └── V1__create_currency_table.sql
├── history-service/
│   ├── Dockerfile
│   ├── pom.xml
│   └── src/main/
│       ├── java/com/currency/historyservice/
│       │   ├── HistoryServiceApplication.java
│       │   ├── controller/
│       │   ├── service/
│       │   │   └── impl/
│       │   ├── repository/
│       │   ├── dto/
│       │   ├── entity/
│       │   ├── consumer/
│       │   ├── config/
│       │   └── exception/
│       └── resources/
│           ├── application.yml
│           └── db/migration/
│               └── V1__create_history_table.sql
├── docker/
│   └── init/
│       └── 01-init-databases.sql
├── docker-compose.yml
└── README.md
```

## Como Executar com Docker Compose

Na raiz do projeto:

```bash
docker compose up --build
```

Serviços disponíveis:

- Currency Service: `http://localhost:8081`
- History Service: `http://localhost:8082`
- RabbitMQ Management: `http://localhost:15672` (`guest/guest`)

## Endpoints Básicos

### currency-service

- `GET /api/currency/convert?from=USD&to=BRL&amount=100`

### history-service

- `GET /api/history/latest`

## Documentação OpenAPI

- Currency: `http://localhost:8081/swagger-ui.html`
- History: `http://localhost:8082/swagger-ui.html`

## Observações

- O projeto foi criado com **foco em estrutura e arquitetura**.
- As classes de serviço e integrações estão em modo **boilerplate**, sem regras de negócio profundas.
- Flyway já está preparado com migração inicial em cada microsserviço.
