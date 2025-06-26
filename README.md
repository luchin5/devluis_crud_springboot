# Mi primer CRUD con Spring + Spring BOOT 

Este repo tiene un CRUD básico con Spring + Spring BOOT , con un manejo de excepciones GLOBAL y además con manejo de respuestas HTTP. Lo que aprendí de esta tecnología
fue lo siguiente:
- Esto esta diseñado bajo el patrón arquitectónico de CAPAS (Layered)
- Controllers al igual que yo usaba en express js (MVC) , tiene incorporado el nombre de la ruta endpoint , junto con los métodos HTTP
- Este controller tiene un objeto privado que a su vez (INTERNAMENTE) ya crea POLIMORFISMO a si que no es necesario crea el polimorfismo explicito
- Entity por su parte es como el modelo, lo cual es referencia a la tabla que se está creando en POSTGRES, sin la necesidad de hacer manualmente en SGBD
