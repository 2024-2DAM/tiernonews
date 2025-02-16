# Tierno News
API REST con [Spring Boot](https://spring.io/projects/spring-boot), Spring Data JPA y MySQL.
Aplicación sencilla con artículos y autorías.
Para el ciclo de Desarrollo de Aplicaciones Multiplataforma.
## Modelos
### Article
Campos:
- id
- title
- content
- date
- author
### Author
- id
- name
- age

## Endpoints
### Article
    GET /article
    GET /article/{id}
    POST /article
    PUT /article/{id}
    DELETE /article/{id}
    DELETE /artible

## Endpoints
### Article
- `GET /article`  
  Obtiene todos los artículos.

- `GET /article/{id}`  
  Obtiene un artículo específico por su ID.

- `POST /article`  
  Crea un nuevo artículo.

- `PUT /article/{id}`  
  Actualiza un artículo existente por su ID.

- `DELETE /article/{id}`  
  Elimina un artículo específico por su ID.

- `DELETE /article`  
  Elimina artículos por título.  
  **Parámetros:**
    - `title` (query): El título del artículo a eliminar.  
      **Respuestas:**
    - `200 OK`: Si se eliminaron artículos. Devuelve el número de artículos eliminados.
    - `400 Bad Request`: Si no se encontraron artículos con el título especificado.
    
