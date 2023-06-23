# Template para generar aplicaciones con spring boot, swagger y bd h2 reactiva

Para levantar el servicio es necesario hacer un fork desde la rama main y de esta manera se descargar el repositorrio.

Solo necesita correr el proyecto, si ingresa [aquí](http://localhost:8080/swagger-ui/) podra visualizar el swagger y un endpoint **/status** donde al consumirlo le regresará una respuesta exitosa, o sea se levanto correctamente el proyecto.
![swagger](https://github.com/angelpaloalto/template/blob/main/imagenes/captura_swagger.png)

Igual se levantara una bd h2 y al [ingresar](http://localhost:8080/h2-console/login.do?jsessionid=d03e104469bb04fdcf90d3f0f78f6912) e iniciar sesion con el usuario que le aparece por defecto podra visulizar la bd.
![login bd](https://github.com/angelpaloalto/template/blob/main/imagenes/captura_bd_login.png)

Y posterior al hacer la conulta **select * from pelicula;** podrá ver un registro.
![consulta a bd](https://github.com/angelpaloalto/template/blob/main/imagenes/captura_bd_consulta.png)
