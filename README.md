# appweb

Aplicación web en Java con conexión a base de datos PostgreSQL, desplegada localmente en Payara Server.  
Desarrollada como ejercicio práctico para implementar un CRUD completo con integración a base de datos, usando Jakarta EE y EclipseLink (JPA).

## ⚙️ Tecnologías utilizadas

- Java 17
- Jakarta EE
- EclipseLink (JPA)
- PostgreSQL
- Maven
- Payara Server 6.2025
- NetBeans (desarrollo inicial)
- VSCode
- Docker

## 📁 Estructura general

- `src/main/java`: Lógica de negocio, controladores y entidades.
- `src/main/webapp`: Vistas JSP/HTML y archivos estáticos.
- `src/main/resources`: Configuración y archivos persistentes.
- `target/`: Archivos compilados y empaquetados (ignorado en Git).
- `pom.xml`: Archivo de configuración de Maven.

## 🧪 Estado actual

- CRUD funcional completo para entidad `Alumno`.
- Conexión a base de datos PostgreSQL establecida.
- Proyecto desplegable en entorno local Payara.
- Configurado para futuros pasos de dockerización y despliegue en producción.

## 🚀 Cómo ejecutar localmente

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tuusuario/appweb.git
   cd appweb
   ```

2. Configura la base de datos PostgreSQL y credenciales si es necesario.

3. Compila y empaqueta con Maven:
   ```bash
   mvn clean package
   ```

4. Despliega el `.war` generado en `target/` dentro de Payara Server.

---

## 📌 Notas

- Este proyecto está en desarrollo activo.
- Dockerización y autenticación serán implementadas en las siguientes fases.
