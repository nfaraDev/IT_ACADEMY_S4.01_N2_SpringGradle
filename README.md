## Spring-Gradle

****SPRING Initializr ****************************************************************************************************************************
 Spring Initializr es una herramienta web que permite generar rápidamente un proyecto de Spring Boot con la configuración inicial necesaria. Proporciona una interfaz
 intuitiva y fácil de usar que permite a los desarrolladores personalizar y configurar su proyecto de Spring Boot de acuerdo con sus necesidades específicas.

Con Spring Initializr, los desarrolladores pueden seleccionar las dependencias y características deseadas para su proyecto, como Spring Web, Spring Data, Spring Security,
entre otras. También pueden especificar el lenguaje de programación, el sistema de construcción (Maven o Gradle), la versión de Spring Boot y otros detalles del proyecto.

La herramienta genera un archivo ZIP que contiene la estructura básica del proyecto, incluyendo el archivo de configuración, las dependencias seleccionadas y los 
archivos necesarios para el inicio rápido del desarrollo. Una vez que el archivo ZIP se descarga, los desarrolladores pueden importarlo en su entorno de desarrollo 
integrado (IDE) y comenzar a trabajar en su aplicación de Spring Boot sin tener que configurar manualmente todos los aspectos iniciales.
En resumen, Spring Initializr es una herramienta web que simplifica la creación y configuración inicial de proyectos de Spring Boot, permitiendo a los desarrolladores
comenzar rápidamente con su desarrollo sin tener que ocuparse de la configuración inicial.

*********************************************************************************************************************************************

- Ejercicio Spring y Gradle
Este ejercicio es un primer contacto con Spring y Gradle.

Accede en la página ->https://start.spring.io/, y genera un proyecto Spring boot con las siguientes características:
PROJECT (gestor de dependencias): Gradle.
LANGUAGE:                         Java.
SPRING BOOT:                     La última versión estable.
PROJECT METADATA Group:          cat.itacademy.barcelonactiva.apellidos.nombre.s04.t01.n02
Artifact:                        S04T01N02GognomsNom
Name:                            S04T01N02GognomsNom
Description:                     S04T01N02GognomsNom
Package name:                    cat.itacademy.barcelonactiva.apellidos.nombre.s04.t01.n02
PACKAGIN:                        Jar
JAVA:                            Mínimo versión 11
Dependencias:
                                 Spring Boot DevTools
                                 Spring Web

Impórtalo a un IDE (Eclipse/IntelliJ/Visual Basic) con la opción Hilo > Importe > Existing Gradle Project.
Al archivo application.properties, configura la variable server.puerto con el valor 9001.

Convertiremos esta aplicación en una API REST:
Dependiendo del package principal, crea otro subpackage denominado Controllers, y para sus adentros, añade la clase HelloWorldController.
Tendrá que tener dos métodos:
String saluda
String saluda2
Estos dos métodos recibirán un parámetro String llamado nombre, y devolverán la frase:
“Hola, “ + nombre + “. Estás ejecutando un proyecto Gradle”.

1-El primer método responderá a una petición GET, y tendrá que ser configurado para recibir el parámetro como un RequestParam. El parámetro "nombre" tendrá el valor por defecto “UNKNOWN”.
Tendrá que responder a:
http://localhost:9001/HelloWorld
http://localhost:9001/HelloWorld?nombre=Mi nombre

2- El segundo método responderá a una petición GET, y tendrá que ser configurado para recibir el parámetro como una PathVariable. El parámetro "nombre" será opcional.
Tendrá que responder a:

http://localhost:9001/HelloWorld2
http://localhost:9001/HelloWorld2/mi nombre

## Enlaces
   - [Enlace  Spring-Gradle]([(ttps://www.youtube.com/watch?v=2tUHNRp7Auo)pi](https://www.youtube.com/watch?v=5_JUDghTsNE)])
         
## Uso

 Para usar Spring Initializr y crear un proyecto de Spring Boot, puedes seguir los siguientes pasos:

1 Accede a la página web del Spring Initializr, que es una herramienta web proporcionada por Pivotal Web Service. Puedes acceder a ella a través de este enlace: Spring Initializr.
2 En la página del Spring Initializr, verás diferentes opciones para configurar tu proyecto. Aquí puedes especificar los siguientes detalles:
  -Project: Elige el tipo de proyecto que deseas crear, ya sea Maven o Gradle.
  -Language: Selecciona el lenguaje de programación que utilizarás en tu proyecto, por ejemplo, Java.
  -Spring Boot: Elige la versión de Spring Boot que deseas utilizar.
  -Group: Especifica el identificador del grupo para tu proyecto.
  -Artifact: Define el nombre del artefacto para tu proyecto.
  -Dependencies: Selecciona las dependencias que deseas incluir en tu proyecto. Puedes elegir entre una amplia variedad de dependencias, como Spring Web, Spring Data JPA, Spring Security, entre otras.
3 Una vez que hayas configurado los detalles de tu proyecto, haz clic en el botón "Generate" para generar la estructura del proyecto.
4 Después de hacer clic en "Generate", se descargará un archivo ZIP que contiene la estructura del proyecto con la configuración especificada.
5 Extrae el archivo ZIP descargado en la ubicación deseada de tu sistema de archivos.
6 Abre tu IDE preferido, como IntelliJ IDEA o Eclipse, y selecciona la opción para abrir un proyecto existente.
7 Navega hasta la carpeta donde extrajiste el archivo ZIP y selecciona la carpeta del proyecto.
8 Importa el proyecto en tu IDE y espera a que se resuelvan las dependencias y se configuren las configuraciones del proyecto.
9 Una vez importado el proyecto, puedes comenzar a desarrollar tu aplicación de Spring Boot según tus necesidades.
