A continuación se detalla lo realizado en cada una de las clases del proyecto "TestAutomation"

En primer lugar se utiliza un archivo llamado datos.json con el objetivo de tenes los datos a utilizarse durante el proyecto, de manera organizada.

En el path src/main/java estan las siguientes clases:

Datos.java:
El objetivo principal es obtener los datos desde el archivo .json
El metodo que se implementó recibe por parametro el nombre del arreglo, la posicion en la que se encuentra y el dato especifico a obtener.

SetUp.java:
En esta clase se encuentran los metodos necesarios para inicializar y finalizar el driver.

Configuracion.java:
Tiene los metodos que permiten ingresar a cada una de las paginas que se utilizaron para automatizar. Obtiene estos datos desde el archivo .json

Login.java:
En esta clase se encuentran los metodos necesarios para realizar un login en Gmail.
- loguearUsuarios() recibe por parametro el mail y la contraseña, las cuales va a utilizar para ingresar.

- verificarPantallaIngreso() es un método de tipo boolean que permite verificar si se ingreso correctamente al mail o no.

Ebay.java:
Donde se encuetran los metodos necesarios para consultar el precio de un articulo en la pagina de Ebay.
- buscarArticulo() recibe por parametro el nombre del articulo que se va a buscar en la pagina.

- abrirArticulo() este metodo permite abrir el articulo que se busco

- obtenerPrecio() devuelve un valor de tipo string donde se va a almacenar el precio del producto.

En el path src/test estan las siguientes clases:

LoginTest.java:
Hay dos test uno para un flujo positivo en donde se proporcionan las credenciales correctas y se ingresa al mail de manera exitosa,
el otro es un flujo negativo en donde la contraseña es incorrecta y no se loguea en el Gmail.

EbayTest.java:
Contiene el flujo del test correspondiente a ingresar a la pagina de Ebay, buscar un determinado articulo y devolver por consola el precio del mismo.

