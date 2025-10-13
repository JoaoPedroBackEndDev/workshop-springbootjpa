# APi de uma Loja Virtual para Estudo - Spring boot + JPA

Este repositório contém um **projeto backend** em Java com **Spring Boot** e **JPA/Hibernate**, criado com o objetivo de **estudo e prática**. O projeto simula uma **loja virtual** com entidades básicas como **Produtos**, **Usuários** e **Pedidos**, para aprender e testar conceitos de API REST, persistência e arquitetura em camadas.

---

## Objetivo do Projeto

Praticar os principais conceitos do ecossistema Spring:
- Construir uma API REST com Spring Boot.
- Fazer mapeamento objeto-relacional com JPA/Hibernate.
- Modelar entidades e relacionamentos comuns em uma loja virtual.
- Organizar o projeto em camadas (`controller`, `service`, `repository`, `entity`).
- Criar operações CRUD e endpoints de exemplo.

---

## Tecnologias

- Java 17+  
- Spring Boot  
- Spring Data JPA / Hibernate  
- Banco de dados H2 (padrão em memória) ou outro relacional (MySQL, PostgreSQL)  
- Maven  

---

## Estrutura sugerida (exemplo)

```
src/
└── main/
    ├── java/
    │   └── com.aprendendospring.javacurso/
    │       ├── entities/        # Entidades JPA (Product, User, Order, OrderItem...)
    │       ├── repositories/    # Interfaces JpaRepository
    │       ├── services/        # Lógica de negócio
    │       └── controllers/     # Endpoints REST
    └── resources/
        ├── application.properties
        └── data.sql (opcional)
```

---

## Como executar

1. Clone o repositório:
```bash
git clone https://github.com/JoaoPedroBackEndDev/workshop-springbootjpa.git
cd workshop-springbootjpa
```

2. Rodar com Maven:
```bash
mvn spring-boot:run
```

Ou gerar o `.jar` e executar:
```bash
mvn clean package
java -jar target/*.jar
```

A API costuma ficar disponível em `http://localhost:8080`.

---

## Entidades (exemplo)

- **Product**: id, nome, descrição, preço, quantidade em estoque.  
- **User**: id, nome, email, senha (não armazenar sem hashing em produção).  
- **Order**: id, usuário, lista de itens (OrderItem), total, data.  
- **OrderItem**: id composto (order + product), quantidade, preço unitário.

---

## Endpoints de exemplo (ajuste conforme o código)

**Produtos**
- `GET /products` — lista produtos
- `GET /products/{id}` — busca produto por id
- `POST /products` — cria produto
- `PUT /products/{id}` — atualiza produto
- `DELETE /products/{id}` — remove produto

**Usuários**
- `GET /users`
- `POST /users`
- `GET /users/{id}`

**Pedidos**
- `GET /orders`
- `POST /orders` — cria pedido (relacionando user e itens)
- `GET /orders/{id}`

---

## Testes

Executar testes:
```bash
mvn test
```

Adicione testes unitários e de integração para controllers, services e repositórios conforme sua evolução.

---

## Observação importante

Este projeto é **apenas para estudo**. Não use senhas ou dados sensíveis em produção. As estruturas e configurações (por exemplo, armazenamento de senhas ou políticas de CORS) devem ser aprimoradas antes de qualquer uso real.

---

## Contribuições

Sinta-se livre para:
- Fazer fork e personalizar para seus estudos;
- Abrir issues com dúvidas ou sugestões;
- Enviar pull requests com melhorias.

---

## 📜 Licença

MIT LICENSE

---

Criado para estudo — Spring Boot + JPA
