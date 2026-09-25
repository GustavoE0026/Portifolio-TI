# Cadastro de Clientes com Java Servlet

## Objetivo

Demonstrar o fluxo completo de uma aplicação Java Web:

```text
Formulário HTML → Requisição HTTP POST → Servlet → Processamento → Resposta HTTP
```

## Funcionalidades

- formulário para nome, e-mail e idade;
- envio dos dados pelo método POST;
- recebimento com `HttpServletRequest`;
- leitura com `request.getParameter()`;
- validação básica;
- resposta HTML gerada pelo Servlet;
- escape de caracteres especiais antes da exibição.

## Tecnologias

- Java;
- Jakarta Servlet;
- HTML;
- Apache Tomcat;
- Maven;
- Eclipse IDE.

## Estrutura

```text
src/main/java/br/com/portfolio/ClienteServlet.java
src/main/webapp/index.html
pom.xml
```

## Como executar

1. instalar Java 17 ou superior;
2. instalar o Apache Tomcat 10.1;
3. importar o projeto Maven no Eclipse;
4. adicionar o projeto ao servidor Tomcat;
5. iniciar o servidor;
6. abrir o endereço do projeto em `http://localhost:8080`.
