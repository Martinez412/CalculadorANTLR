- Bryan Ariza
- Andres Toledo
- Juan Wilches
- Manuel Cardenas

Introduccion: En esta tarea, nos enfocaremos en la instalación de ANTLR, una poderosa herramienta para la generación de analizadores sintácticos, y en la implementación de una calculadora basada en las instrucciones detalladas en el Capítulo 4 del libro The Definitive ANTLR 4 Reference. ANTLR (Another Tool for Language Recognition) es ampliamente utilizado en la construcción de lenguajes de programación, lo que lo convierte en una opción ideal para este proyecto.
El proceso comenzará con la instalación de ANTLR, siguiendo los pasos proporcionados en la Presentación 04 para asegurar una configuración adecuada. Una vez instalado, pasaremos a la
implementación de la calculadora, entendiendo los conceptos fundamentales y la lógica necesaria para desarrollar una herramienta funcional. Por último, se realizarán pruebas exhaustivas para validar la precisión y fiabilidad de la calculadora, documentando los resultados obtenidos para asegurar la calidad del desarrollo.

Pasos:

1) INSTALAR ANTLR Y JAVA DEVELOPMENT KIT (JDK)
Primero, asegúrate de tener ANTLR y JDK instalados. Puedes instalarlos con los siguientes comandos:

        sudo apt update
        sudo apt install openjdk-11-jdk

 2)LUEGO, DESCARGA ANTLR:
 
           cd /usr/local/lib
           sudo curl -O https://www.antlr.org/download/antlr-4.13.0-complete.jar

3)CONFIGURA EL ALIAS PARA EJECUTAR ANTLR DESDE LA LINE DE COMANDOS:

    export CLASSPATH=".:/usr/local/lib/antlr-4.13.0-complete.jar:$CLASSPATH"
    alias antlr4='java -jar /usr/local/lib/antlr-4.13.0-complete.jar'
    alias grun='java org.antlr.v4.gui.TestRig'
4)NAVEGA AL DIRECTORIO DONDE SE ENCUENTRA "LabeledExpr.g4" Y EJECUTA ANTLR PARA GENERAR EL PARSES Y EL LEXER:

    cd /ruta/al/directorio/CalculadorANTLR
    antlr4 LabeledExpr.g4

5) COMO SE COMPILA EL ARCHIVO DE JAVA?
Compila todos los archivos .java, incluyendo los generados por ANTLR:

       javac *.java

6) EJECUTAR EL PROGRAMA

       java Calc
   
7) PRUEBAS
    El archivo test1.expr podría ser un archivo de prueba. Puedes pasar este archivo al programa para ver cómo funciona:
   
       java Calc test1.expr

   Esto obviamente ejecutara el archivo de texto dependiendo de lo que este puesto como

         A=5
         B=10
         A + B
   Cuando compiles el text1.expr saldra el resultado 15 como se ve en el ejemplo

   8)CAMBIAR VARIABLES
   para cambiar las variables y las expresiones ejecuta el comando

        nano test1.expr
   esto te permitira cambiar las variables y colocar nuevas expresiones como una suma una resta o una multiplicacion

   9)ABRIR EL ARCHIVO
   para abrir el archivo primero necesitas tener instalado el ANTLR y luego colocar el siguente comando en la terminal

         cd ~/Descargas/CalculadorANTLR
   evidentemente el archivo de nuestra calculadora esta guardado en Descargas o en ciertos casos en Downloads o en donde guardes el archivo con las clases
   
   
