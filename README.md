# Título del Proyecto

_Proyecto SOAP, PSU_

## Descripción 🚀

_Este proyecto consiste en levantar un servidor que sigue el protocolo SOAP,_ 
_lo cual se debe ingresar el nombre, tipo mime y contenido en base64. Este_
_programa es un OpenSource construido con lenguaje java, y para levantar_
_el servidor se utiliza Apache Tomcat. Solo es compatible con Ubuntu y el_
_tipo mime que se exige es **txt/csv**._

_El programa consiste en la simulación de PSU para ingresos de carreras de la UTEM,_
_lo cual permite generar en un archivo xlsx, que contiene un listado de alumnos que están_
_inscribiendo en las carreras. El programa debe ser capaz de seleccionar los alumnos con_
_mejores puntajes para acceder en las carreras recomendadas. El contenido entrante debe estar_
_encodeado en base64 y tener la estructura (rut;nem;ranking;matemática;lenguaje;ciencia;historia),_
_donde el primero es el rut del postulante y el resto son puntajes obtenidos en la PSU como_
_su nombre indica._

### Requisitos 📋

* Tener instalado Java 8 JDK, se podrá instalar ingresando el siguiente comando en el terminal:
```
sudo apt-get install openjdk-8-jdk
```
* Tener instalado Apache Tomcat, se podra descargar [aqui](https://archive.apache.org/dist/tomcat/tomcat-8/v8.0.27/bin/)

### Ejecución del programa 🔧

_Para ejecutar el programa, se debe seguir los siguientes pasos manualmente:_

_1) Posicionarse en la carpeta o directorio del Apache Tomcat._
   _Por defecto, puede ser la carpeta **apache-tomcat-8.0.27**_
   
_2) Crear una carpeta o directorio dentro de la carpeta **webapps**._
   _por defecto se nombra como **soapparalela**._
   
_3) Se descomprime el archivo soapparalela.war en la carpeta creada._

_4) Desde la carpeta de Apache Tomcat, se debe ingresar el siguiente_
   _comando para activar el servidor:_
```
bin/startup.sh
```

_5) Por último, se debe abrir un navegador e ingresar el siguiente link,_
   _con el fin de verificar su funcionamiento:_ 
   
   **http://localhost:8080/soapparalela/carreras**

_Listo, el servidor ya se encuentra abierta y podrá ingresar datos con SOAPUI._
_Los datos que se ingresan son tres, los cuales son:_
* Nombre del archivo.
* Tipo mime del archivo.
* Contenido del archivo, encodeado en base64.

_En caso de quiera cerrar el puerto 8080 y no se pueda por salir de la ejecución, se debe ingresar el siguiente comando:_
```
fuser -k 8080/tcp
```

## Ejecutando las pruebas ⚙️

_En SOAPUI, se ingresan los 3 datos mencionados anteriormente y lo ejecuta._
_Luego, se copia el contenido del excel en base64 e ingresarlo en [esta pagina](https://www.freeformatter.com/base64-encoder.html)._
_Tras ingresarlo, se debe presionar en **Decode and download** para generar_
_un archivo. Por último se cambia **.data** por **.xslx**, de esta forma se_
_podrá visualizar los postulantes seleccionados en cada hoja de dicha carrera,_
_y están ordenados desde mayor a menor puntaje, obteniendo así el **primer puntaje**_
_y **último puntaje** matriculado para el año 2020._


## Herramientas 🛠️

* [Netbeans 8.2](https://netbeans.org/downloads/8.2/rc/) - Entorno de desarrollo integrado libre
* [SOAPUI 5.0.0](https://www.soapui.org/downloads/soapui/) - Herramientas de prueba API 

## Integrantes del proyecto ✒️

* **Sebastián Garrido Valenzuela** - [Sebastron](https://github.com/Sebastron)
* **Ramiro Uribe Garrido** - [RamiroUribe](https://github.com/RamiroUribe)
* **Javier Gálvez González** - [javerix](https://github.com/javerix)

