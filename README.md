# 馃摌 Proyecto: Gesti贸n de Empleados Salmontt Versi贸n 2

## 馃摑 Descripci贸n general del sistema
Este proyecto es la segunda versi贸n del sistema de gesti贸n de empleados para la empresa Salmontt de Puerto Montt, desarrollado como evaluaci贸n sumativa n煤mero 2 de la asignatura Desarrollo Orientado a Objetos I. Esta versi贸n incorpora la lectura y procesamiento de datos de empleados desde un archivo Excel utilizando la librer铆a Apache POI, permitiendo gestionar informaci贸n laboral y personal (nombre, RUT validado, direcci贸n, cargo, salario, etc.) con estructura modular y buenas pr谩cticas de programaci贸n en Java (herencia, composici贸n, polimorfismo y validaci贸n). El proyecto est谩 construido y gestionado con Maven, facilitando la administraci贸n de dependencias y el despliegue del sistema.

La soluci贸n implementa buenas pr谩cticas de dise帽o orientado a objetos, utilizando herencia, composici贸n, polimorfismo y validaci贸n de datos en Java. Adem谩s, la estructura modular del proyecto permite separar claramente las responsabilidades de cada componente, facilitando la mantenibilidad y la reutilizaci贸n del c贸digo.

Este desarrollo aborda un caso realista y contextualizado de gesti贸n de personas, enfrentando desaf铆os t铆picos en empresas como la importaci贸n de informaci贸n, validaciones personalizadas (por ejemplo, del RUT chileno) y la generaci贸n de consultas por criterios. As铆, el proyecto evidencia una propuesta estructurada y adaptable a nuevos requerimientos, cumpliendo con est谩ndares de calidad y promoviendo la creaci贸n de c贸digo limpio, reusable y extensible.

---

## 馃П Estructura general del proyecto

```
馃摝 SalmonttApp_S5/
鈹?馃搨 .idea/
鈹?馃搨 src/main
鈹?鈹?馃搨 java/cl/salmontt
鈹?鈹?鈹?馃搨 model/			#Clases que representan los datos y entidades (Empleado, Rut, Persona, Direcci贸n)
鈹?鈹?鈹?馃搨 services/		#Servicios y L贸gica general de la gesti贸n de empleados
鈹?鈹?鈹?馃搨 ui/			#Punto de entrada, interfaz y Ejecuci贸n principal (Main)
鈹?鈹?鈹?馃搨 util/			#utilitarios, validaciones y excepciones personalizadas
鈹?鈹?馃搨 resources/
鈹?鈹?鈹?馃搳 Empleados.xlsx		#Archivo Excel con los datos de empleados
鈹?馃搨 target/
鈹?鈹?鈹?馃摝 salmonera-1.0-SNAPSHOT-jar-with-dependencies.jar 		#Archivo ejecutable generado por Maven
鈹?馃摐 README.md
鈹?馃摐 pom.xml

```
---

## 馃З Requisitos

Para trabajar correctamente con los recursos de este repositorio, aseg煤rate de tener instalado lo siguiente:

- 鈽?**Java JDK 18 o superior**  
  - [Descargar Java](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html)

- 馃捇 **IDE recomendado: IntelliJ IDEA Comunity Edition**  
  - [Descargar IntelliJ IDEA (Community Edition)](https://www.jetbrains.com/idea/download/)  

- 馃О **Git instalado para clonar y versionar el repositorio**  
  - [Descargar Git](https://git-scm.com/downloads)

- 馃寪 **Cuenta de GitHub activa** (obligatoria)  
  - [Crear cuenta en GitHub](https://github.com/signup)  
   > Tu cuenta te servir谩 para clonar repositorios, subir avances, y entregar evaluaciones a trav茅s de GitHub. 

---
## 鈿欙笍 Instruccion de Ejecuci贸n

### Instrucciones para clonar y ejecutar el proyecto en IDE

- clonar el repositorio de github
```bash
git clone https://github.com/matisuarezm/SalmonttApp_S5.git
```
- Abre el proyecto en tu IDE Favorito, 茅ste fue creado en IntelliJ.
- Abre la clase Main del paquete app
- Puedes ejecutar el proyecto.

	> Nota: La clase Main ya trae algunos ejemplos que se mostraran por consola.

### Instrucciones para ejecutar el archivo JAR

- clonar el repositorio
```bash
git clone https://github.com/matisuarezm/SalmonttApp_S5.git
```
- Ingresa a la caperta clonada.
- Haz click Derecho dentro de la carpeta y abre una terminal
- Ejecuta los siguientes comando.
```bash
# Ingresa a carpeta Target
cd .\target\

# Lista los archivos de la carpeta
ls

# Ejecuci贸n del archivo JAR
java -jar salmonera-1.0-SNAPSHOT-jar-with-dependencies.jar
```
> Con eso abras ejecutado el proyecto en la terminal de tu computador.!!! 

---

## 馃摎 Caso Planteado

Salmontt es una empresa salmonera con sede en Puerto Montt, dedicada desde hace m谩s de 15 a帽os a la producci贸n, procesamiento y exportaci贸n de salm贸n. Su crecimiento sostenido la ha posicionado como un actor relevante en la industria acu铆cola del sur de Chile, con m煤ltiples centros de cultivo, plantas de proceso y una red log铆stica nacional e internacional.

Esta evaluaci贸n corresponde a la continuaci贸n directa del proyecto trabajado previamente en la **Evaluaci贸n 1**. Deber谩s reforzar y ampliar el sistema aplicando nuevos conceptos y buenas pr谩cticas aprendidas hasta la semana 5 del curso.

**La evaluacion 1 la encontraran dentro del siguiente Link.**

- [Proyecto: Gesti贸n de Empleados SALMONTT](https://github.com/matisuarezm/Duoc_Desarrollo_a_Objetos_I)

### Problematica

En el marco del proceso de digitalizaci贸n de la empresa, se ha solicitado ampliar el sistema desarrollado previamente. Actualmente, Salmontt no cuenta con una herramienta eficiente para registrar y consultar informaci贸n del dominio, lo que provoca:

- Duplicaci贸n y p茅rdida de datos.
- Dificultad para acceder a informaci贸n clave.
- Procesos manuales repetitivos sin automatizaci贸n.

Adem谩s, no existen mecanismos para importar datos desde archivos externos ni l贸gica de validaci贸n o b煤squeda autom谩tica, lo que limita la eficiencia del sistema.
Ante este escenario, la gerencia ha encargado una segunda fase de desarrollo, que debe incluir:

- Una estructura robusta basada en colecciones.
- Validaci贸n b谩sica de datos ingresados.
- Lectura de registros desde archivos de texto
- Organizaci贸n del c贸digo en paquetes funcionales.
- Presentaci贸n clara y funcional del sistema.

El sistema debe ser capaz de cargar datos din谩micamente, recorrer y filtrar registros, y mostrar resultados de manera clara por consola, abordando as铆 los desaf铆os actuales de gesti贸n de informaci贸n de la empresa.

---

## 馃懁 Autor del proyecto
- **Nombre completo:** Matias Suarez M.
- **Secci贸n:** 003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Carrera 100% Online