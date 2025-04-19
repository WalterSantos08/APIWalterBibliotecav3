# 📚 WalterAPI

API RESTful para gerenciamento de leitura de livros, permitindo que usuários cadastrem livros, registrem leituras, definam status como *"quero ler"*, *"lendo"* ou *"lido"*, além de atribuir notas e comentários.

---

## 🔧 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4.3
- Maven
- MySQL
- Lombok
- Swagger (OpenAPI)
- Spring Data JPA
- Jakarta Bean Validation

---

## 🗂️ Estrutura do Projeto

```mermaid
erDiagram
    USUARIO {
        INT id PK
        VARCHAR nome
        VARCHAR email
        VARCHAR senha
    }

    LIVRO {
        INT id PK
        VARCHAR titulo
        VARCHAR autor
        INT ano_publicacao
        VARCHAR genero
        TEXT descricao
    }

    LIVRO_USUARIO {
        INT id PK
        INT livro_id FK
        INT usuario_id FK
        ENUM status_leitura
        DATE data_inicio
        DATE data_fim
        INT nota
        TEXT comentario
    }



    USUARIO ||--o{ LIVRO_USUARIO : "possui"
    LIVRO ||--o{ LIVRO_USUARIO : "é lido em"
```


# 🎯 Passos para rodar o projeto🔹Backend (Java)
# Clone o repositório
```git
git clone https://github.com/WalterSantos08/APIWalterBibliotecav3
```


# 🛠️ Endpoints da API

### 🧑‍💻 Usuário
- `POST /api/usuario` – Cadastrar novo usuário  
- `GET /api/usuario` – Listar todos os usuários  
- `PUT /api/usuario/{id}` – Atualizar usuário por ID  
- `DELETE /api/usuario/{id}` – Deletar usuário por ID  

### 📘 Livro
- `POST /api/livro` – Cadastrar novo livro  
- `GET /api/livro` – Listar todos os livros  
- `PUT /api/livro/{id}` – Atualizar livro por ID  
- `DELETE /api/livro/{id}` – Deletar livro por ID  

### 📖 Leitura (LivroUsuario)
- `POST /api/livro-usuario` – Relacionar livro a um usuário  
- `GET /api/livro-usuario` – Listar todas as leituras  
- `PUT /api/livro-usuario/{id}` – Atualizar status de leitura  
- `DELETE /api/livro-usuario/{id}` – Remover relação de leitura  



### 🛠️ Tratamento de Erros
A API trata os erros mais comuns com mensagens claras:
- `400 Bad Request` – Dados inválidos  
- `404 Not Found` – Recurso inexistente  
- `409 Conflict` – Duplicidade (ex: mesmo livro para o mesmo usuário)

---



# Autor
<tr align="center">
  <td>
    <a href="https://github.com/WalterSantos08">
      <img src="https://avatars.githubusercontent.com/u/178443270?v=4" height="200px" width="200px">
      <br>
      <strong>Walter Santos</strong>
    </a>
  </td>
</tr>

