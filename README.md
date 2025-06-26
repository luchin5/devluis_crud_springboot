# Mi primer CRUD con Spring + Spring BOOT 🍃 🚀

Este repo tiene un CRUD básico con Spring + Spring BOOT 🍃, con un manejo de excepciones GLOBAL y además con manejo de respuestas HTTP. Lo que aprendí de esta tecnología
fue lo siguiente:
- Esto esta diseñado bajo el patrón arquitectónico de CAPAS (Layered)
- Controllers al igual que yo usaba en express js (MVC) , tiene incorporado el nombre de la ruta endpoint , junto con los métodos HTTP
- Este controller tiene un objeto privado que a su vez (INTERNAMENTE) ya crea POLIMORFISMO a si que no es necesario crea el polimorfismo explicito
- Entity por su parte es como el modelo, lo cual es referencia a la tabla que se está creando en POSTGRES, sin la necesidad de hacer manualmente en SGBD
- Luego está Repository Usuario, que es una interfaz y que hereda de JPArepository que hace posible con (HIBERNATE) internamente las querys hacia mi base de datos
  mediante métodos por defecto, y que si necesito algo más específico , puede crearlos ahi mismo.
- Generalmente el manejo de excepciones, se hace con RUNTIME EXCEPTION.

 ## Creación del proyecto

 Lo hice con Spring initializr, que es una página que permite crear el proyecto desde ahí, sin la necesidad de descargar SPRING, además marque las depencias de:
- Spring Web
- Spring Data JPA
- PostgreSQL Driver

## Ejecución

Todo el proyecto lo corrí con el IDE INTELLI J

## Conclusión

Para ser mi primera vez con SPRING + SPRING BOOT en Intelli J se ve que es bastante fácil de crear una API REST ful
