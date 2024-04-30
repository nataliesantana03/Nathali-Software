# Nathali-Software
Trabajo de desarrollo de software-Unisinu

Video de explicacion: https://youtu.be/lGOMgLCy-fI?si=3k81UlkItj0GqKZC

Manual de Usuario:

A continuación encontrarás una guía paso a paso para utilizar este sistema correctamente.

1. Descarga y Ejecución del Programa:
   - Descarga el archivo del programa y guárdalo en tu computadora.
   - Abre una terminal o línea de comandos en tu sistema operativo.
   - Navega hasta la ubicación donde guardaste el archivo del programa.
   - Ejecuta el programa con el comando java Main.

2. Interfaz del Sistema:
   - Al ejecutar el programa, verás la salida en la terminal que muestra el costo de envío y el tipo de cada envío.

3. Crear un Nuevo Envío:
   - Para crear un nuevo envío, debes editar el código fuente en el archivo Java proporcionado.
   - Puedes crear un objeto de tipo PaqueteEstándar, DocumentoUrgente o ArticuloFragil en el método main().

4. Información Mostrada:
   - Cuando se ejecuta el programa, se mostrará la siguiente información para cada envío:
     - Costo de Envío: El costo calculado para el envío en función de sus características.
     - Tipo de Envío: Indica si el envío es un Paquete Estándar, Documento Urgente o Artículo Frágil.

5. Advertencias y Consideraciones:
   - Asegúrate de entender la lógica de programación orientada a objetos y Java antes de realizar cambios en el código.
   - Ten cuidado al manipular objetos de tipo ArticuloFragil, ya que pueden tener cargos adicionales por fragilidad.

6. Finalizar la Ejecución:
   - Una vez que hayas terminado de utilizar el programa, puedes cerrar la terminal o línea de comandos para finalizar la ejecución.
     

Manual de Requerimientos, Funciones y No Funcionales:


1. Requerimientos Funcionales:

A: Creación de Envíos:
   - Los usuarios deben poder crear nuevos envíos especificando el tipo (paquete estándar, documento urgente, artículo frágil) y sus características como peso y dimensiones.

B: Cálculo del Costo del Envío:
   - El sistema es capaz de calcular automáticamente el costo del envío basado en las características del envío y el tipo de envío seleccionado.

C: Mostrar Información del Envío:
   - Después de calcular el costo del envío el sistema debe mostrar información detallada sobre cada envío, incluyendo el tipo de envío y el costo calculado.

2. Requerimientos No Funcionales:

A: Precisión en los Cálculos:
   - El sistema realiza cálculos precisos y exactos del costo del envío según la lógica definida para cada tipo de envío.
     
B: Eficiencia en el Cálculo:
   - El cálculo del costo del envío debe ser eficiente y rápido para proporcionar una respuesta instantánea al usuario.
     

Mnual Técnico del Software:


1. Arquitectura del Sistema:
El sistema está desarrollado en Java utilizando programación orientada a objetos (POO). La arquitectura sigue un enfoque de clases y herencia para representar diferentes tipos de envíos y sus cálculos de costos.

2. Tecnologías Utilizadas:
   - Lenguaje de Programación: Java
   - Sistema de Control de Versiones: Git
   - Repositorio: GitHub para el control de versiones.

3. Estructura del Código Fuente:
   - Envio.java: Clase base que representa un envío genérico con atributos como peso y dimensiones, y método para calcular el costo del envío.
   - PaqueteEstándar.java, DocumentoUrgente.java, Fragil.java: Clases que heredan de Envio y representan los diferentes tipos de envíos con implementaciones específicas para el cálculo de costos.
   - Main: Contiene el método main() para la ejecución del programa, creación de objetos de envío y cálculo de costos.

4. Configuración del Entorno de Desarrollo:
   - Instala Java Development Kit (JDK) en tu computadora.
   - Descarga e instala un IDE compatible como IntelliJ IDEA, Eclipse, NetBeans, etc.
   - Clona el repositorio Git del proyecto o descarga los archivos del programa en tu computadora.

