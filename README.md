# Tierno News
API REST con [Spring Boot](https://spring.io/projects/spring-boot), Spring Data JPA y MySQL.
Aplicación sencilla con artículos y autorías.
Para el ciclo de Desarrollo de Aplicaciones Multiplataforma.
## Modelos

### Article
Representa un artículo en el sistema.

#### Atributos:
- **`id`** (Long): Identificador único del artículo (autogenerado).
- **`title`** (String): Título del artículo.
- **`content`** (String): Contenido del artículo.
- **`date`** (LocalDateTime): Fecha y hora de creación del artículo.

#### Ejemplo de JSON:
```json
{
  "id": 1,
  "title": "Título del artículo",
  "content": "Contenido del artículo...",
  "date": "2023-10-05T12:34:56"
}
```

## Author

Representa une autore en el sistema. Les autores pueden estar asociados a artículos.

#### Atributos
- **`id`** (Long): Identificador único del autor (autogenerado).
- **`name`** (String): Nombre de le autore. Campo es obligatorio (no null).
- **`age`** (Integer): Edad de le autore. Opcional.

#### Ejemplo de JSON

```json
{
  "id": 1,
  "name": "Amira Pérez",
  "age": 30
}
```

## Endpoints

### Article

- **`GET /`**  
  Devuelve un mensaje de prueba.  
  **Respuesta:**
    - `200 OK`: Devuelve el mensaje "Hola mundoooooo!".

- **`GET /article`**  
  Obtiene todos los artículos.  
  **Respuesta:**
    - `200 OK`: Devuelve una lista de todos los artículos.

- **`GET /article/{id}`**  
  Obtiene un artículo específico por su ID.  
  **Parámetros:**
    - `id` (path): El ID del artículo a buscar.  
      **Respuesta:**
    - `200 OK`: Devuelve el artículo correspondiente al ID.
    - `404 Not Found`: Si no se encuentra ningún artículo con el ID especificado.

- **`POST /article`**  
  Crea un nuevo artículo.  
  **Cuerpo de la solicitud (Body):**
    - Un objeto `Article` en formato JSON.  
      **Respuesta:**
    - `200 OK`: Devuelve el artículo creado.

- **`PUT /article/{id}`**  
  Actualiza un artículo existente por su ID.  
  **Parámetros:**
    - `id` (path): El ID del artículo a actualizar.  
      **Cuerpo de la solicitud (Body):**
    - Un objeto `Article` en formato JSON con los nuevos datos.  
      **Respuesta:**
    - `200 OK`: Devuelve el artículo actualizado.
    - `404 Not Found`: Si no se encuentra ningún artículo con el ID especificado.

- **`DELETE /article/{id}`**  
  Elimina un artículo específico por su ID.  
  **Parámetros:**
    - `id` (path): El ID del artículo a eliminar.  
      **Respuesta:**
    - `200 OK`: Si el artículo fue eliminado correctamente. Devuelve el mensaje "Deleted".
    - `400 Bad Request`: Si no se encuentra ningún artículo con el ID especificado.

- **`DELETE /article`**  
  Elimina artículos por título.  
  **Parámetros:**
    - `title` (query): El título del artículo a eliminar.  
      **Respuesta:**
    - `200 OK`: Si se eliminaron artículos. Devuelve el número de artículos eliminados.
    - `400 Bad Request`: Si no se encontraron artículos con el título especificado.


### Author

- **`GET /author`**  
  Obtiene todos los autores.  
  **Respuesta:**
    - `200 OK`: Devuelve una lista de todos los autores.

- **`GET /author/{id}`**  
  Obtiene un autor específico por su ID.  
  **Parámetros:**
    - `id` (path): El ID del autor a buscar.  
      **Respuesta:**
    - `200 OK`: Devuelve el autor correspondiente al ID.
    - `404 Not Found`: Si no se encuentra ningún autor con el ID especificado.

- **`GET /authorTest`**  
  Obtiene un autor específico por su ID (vía query).  
  **Parámetros:**
    - `id` (query): El ID del autor a buscar.  
      **Respuesta:**
    - `200 OK`: Devuelve el autor correspondiente al ID.
    - `404 Not Found`: Si no se encuentra ningún autor con el ID especificado.

- **`POST /author`**  
  Crea un nuevo autor.  
  **Cuerpo de la solicitud (Body):**
    - Un objeto `Author` en formato JSON.  
      **Respuesta:**
    - `200 OK`: Devuelve el autor creado.

- **`GET /authorAge`**  
  Obtiene autores con edad menor o igual a la especificada.  
  **Parámetros:**
    - `age` (query): Edad máxima para filtrar autores.  
      **Respuesta:**
    - `200 OK`: Devuelve una lista de autores que cumplen con el criterio.