# API REST de Gestión de Usuarios con Spring Boot y MySQL

## 📌 Descripción
Esta API REST permite gestionar usuarios mediante operaciones CRUD (Crear, Leer, Actualizar y Eliminar). 

✅ **Tecnologías utilizadas:**
- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL
- JUnit y Mockito
- Swagger para documentación
- Docker para despliegue

## 🚀 Instalación y Configuración

### 1️⃣ Clonar el repositorio
```sh
git clone https://github.com/tuusuario/tu-repositorio.git
cd tu-repositorio
```

### 2️⃣ Configurar la base de datos MySQL
1. Asegúrate de tener MySQL instalado y en ejecución.
2. Crea la base de datos ejecutando:
```sql
CREATE DATABASE Asigna un nombre;
```
3. Configura las credenciales en `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/(Nombre de la base de datos)
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Ejecutar la aplicación
Usa Maven para compilar y ejecutar:
```sh
mvn clean package
mvn spring-boot:run
```
La API estará disponible en:
```
http://localhost:8080/usuarios
```

## 📡 Endpoints de la API

| Método | Endpoint       | Descripción                     |
|--------|--------------|--------------------------------|
| GET    | `/usuarios`  | Obtener todos los usuarios    |
| GET    | `/usuarios/{id}` | Obtener usuario por ID       |
| POST   | `/usuarios`  | Crear un nuevo usuario        |
| DELETE | `/usuarios/{id}` | Eliminar usuario por ID     |

## 🛠 Pruebas Unitarias
Ejecuta las pruebas con:
```sh
mvn test
```

## 📜 Documentación con Swagger
Accede a la documentación en:
```
http://localhost:8080/swagger-ui/index.html
```

## 🐳 Despliegue con Docker
### 1️⃣ Construir la imagen
```sh
docker build -t miapp .
```

### 2️⃣ Ejecutar el contenedor
```sh
docker run -p 8080:8080 miapp
```

✅ ¡Tu API está lista para usarse en `http://localhost:8080/usuarios`! 🚀
Puede probar los endpoints con Postman.
