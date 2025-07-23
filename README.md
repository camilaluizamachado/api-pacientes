# API de Gestão de Pacientes 

## 💻 Sobre o Projeto

Este projeto consiste em uma API RESTful segura, desenvolvida como um estudo de caso prático para demonstrar competências em desenvolvimento de software back-end. A aplicação simula um sistema simplificado para gerenciamento de pacientes, com foco em boas práticas de arquitetura de software, segurança e documentação de APIs.

## 🛠️ Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias e conceitos:

- **Java 17:** Versão LTS mais recente do Java.
- **Spring Boot 3:** Framework principal para a criação da aplicação.
- **Spring Security:** Para implementação da camada de segurança e autenticação.
- **JWT (JSON Web Token):** Utilizado para a autenticação stateless baseada em token.
- **Spring Data JPA:** Para a persistência de dados e comunicação com o banco.
- **H2 Database:** Banco de dados em memória para agilidade no desenvolvimento e testes.
- **Maven:** Gerenciador de dependências e build do projeto.
- **Lombok:** Para redução de código boilerplate nas classes de modelo.
- **Swagger/OpenAPI:** Para documentação interativa da API.

## ✨ Funcionalidades Implementadas

- ✅ **Autenticação Segura:** Endpoint `/login` que valida as credenciais do usuário e retorna um token JWT.
- ✅ **Segurança de Endpoints:** Todas as rotas, com exceção do login e da documentação, são protegidas e exigem um token JWT válido no cabeçalho da requisição.
- ✅ **CRUD de Pacientes:**
  - `POST /pacientes`: Cadastro de um novo paciente.
  - `GET /pacientes`: Listagem de todos os pacientes cadastrados.
  - *(Funcionalidades de atualização e deleção planejadas para futuras versões).*

## 🚀 Como Executar

Para executar este projeto em um ambiente local, são necessários Java 17 e Maven 3.8+ configurados.

1. Clone o repositório:
   ```bash
   git clone https://github.com/camilaluizamachado/api-pacientes.git
