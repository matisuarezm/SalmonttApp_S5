# 📘 Proyecto: 

## 📝 Descripción general del sistema
Este proyecto corresponde a la evaluación sumativa numero 2 del segundo bimestre correspondiente a la asignatura *Desarrollo Orientado a Objetos I*. Se trata de una aplicacion Java orientada a objetos para gestionar empleados de la empresa Salmontt de Puerto Montt. Permite la lectura de un archivo EXCEL de los empleados con todos sus datos personales como Rut validado, direccion (opcional o completa) y salario, aplicando buenas practicas de herencia, composicion, polimorfismo y validacion en Java.

El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas reales y proponiendo una solución estructurada, modular y reutilizable.

---

## 🧱 Estructura general del proyecto

```
📦 SalmonttApp_S5/
┣ 📂 .idea/
┣ 📂 src/main
┃ ┣ 📂 java/cl/salmontt
┃ ┃ ┣ 📂 model/
┃ ┃ ┣ 📂 services/					
┃ ┃ ┣ 📂 ui/
┃ ┃ ┣ 📂 util/				
┃ ┣ 📂 resources/
┃ ┃ ┣ 📊 Empleados.xlsx
┣ 📂 target/
┃ ┃ ┣ 📦 salmonera-1.0-SNAPSHOT-jar-with-dependencies.jar
┃ 📜 README.md
┗ 📜 pom.xml

```
---

## 🧩 Requisitos

Para trabajar correctamente con los recursos de este repositorio, asegúrate de tener instalado lo siguiente:

- ☕ **Java JDK 18 o superior**  
  - [Descargar Java](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html)

- 💻 **IDE recomendado: IntelliJ IDEA Comunity Edition**  
  - [Descargar IntelliJ IDEA (Community Edition)](https://www.jetbrains.com/idea/download/)  

- 🧰 **Git instalado para clonar y versionar el repositorio**  
  - [Descargar Git](https://git-scm.com/downloads)

- 🌐 **Cuenta de GitHub activa** (obligatoria)  
  - [Crear cuenta en GitHub](https://github.com/signup)  
   > Tu cuenta te servirá para clonar repositorios, subir avances, y entregar evaluaciones a través de GitHub. 

---
## ⚙️ Instruccion de Ejecución

### Instrucciones para clonar y ejecutar el proyecto en IDE

1. clonar el repositorio de github
```bash
git clone https://github.com/matisuarezm/SalmonttApp_S5.git
```
2. Abre el proyecto en tu IDE Favorito, éste fue creado en IntelliJ.
3. Abre la clase Main del paquete app
4. Puedes ejecutar el proyecto.

- Nota: La clase Main ya trae algunos ejemplos que se mostraran por consola.

### Instrucciones para ejecutar el archivo JAR

### 1. clonar el repositorio
```bash
git clone https://github.com/matisuarezm/SalmonttApp_S5.git
```
### 2. Ingresa a la caperta clonada.
### 3. Haz click Derecho dentro de la carpeta y abre una terminal
### 4. Ejecuta los siguientes comando.
```bash
# Ingresa a carpeta Target
cd .\target\

# Lista los archivos de la carpeta
ls

# Ejecución del archivo JAR
java -jar salmonera-1.0-SNAPSHOT-jar-with-dependencies.jar
```
### Con eso abras ejecutado el proyecto en la terminal de tu computador.!!! 

---

## 📚 Caso Planteado

Salmontt es una empresa salmonera con sede en Puerto Montt, dedicada desde hace más de 15 años a la producción, procesamiento y exportación de salmón. Su crecimiento sostenido la ha posicionado como un actor relevante en la industria acuícola del sur de Chile, con múltiples centros de cultivo, plantas de proceso y una red logística nacional e internacional.

Esta evaluación corresponde a la continuación directa del proyecto trabajado previamente en la **Evaluación 1**. Deberás reforzar y ampliar el sistema aplicando nuevos conceptos y buenas prácticas aprendidas hasta la semana 5 del curso.

**La evaluacion 1 la encontraran dentro del siguiente Link.**

- [Proyecto: Gestión de Empleados SALMONTT](https://github.com/matisuarezm/Duoc_Desarrollo_a_Objetos_I)

### Problematica

En el marco del proceso de digitalización de la empresa, se ha solicitado ampliar el sistema desarrollado previamente. Actualmente, Salmontt no cuenta con una herramienta eficiente para registrar y consultar información del dominio, lo que provoca:

- Duplicación y pérdida de datos.
- Dificultad para acceder a información clave.
- Procesos manuales repetitivos sin automatización.

Además, no existen mecanismos para importar datos desde archivos externos ni lógica de validación o búsqueda automática, lo que limita la eficiencia del sistema.
Ante este escenario, la gerencia ha encargado una segunda fase de desarrollo, que debe incluir:

- Una estructura robusta basada en colecciones.
- Validación básica de datos ingresados.
- Lectura de registros desde archivos de texto
- Organización del código en paquetes funcionales.
- Presentación clara y funcional del sistema.

El sistema debe ser capaz de cargar datos dinámicamente, recorrer y filtrar registros, y mostrar resultados de manera clara por consola, abordando así los desafíos actuales de gestión de información de la empresa.

---

## 👤 Autor del proyecto
- **Nombre completo:** Matias Suarez M.
- **Sección:** 003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Carrera 100% Online