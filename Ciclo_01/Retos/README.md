# ⚡ Retos Semanales

En este apartado subo los retos semanales realizados en el ciclo 1 de Misión TIC.
 
## Guía de contenido

[Reto #1](#-reto-1) | [Reto #2](#-reto-2) | [Reto #3](#-reto-3) | [Reto #4](#-reto-4)


## 🚀 Reto #1

### ¿Quién es más digno del martillo de Thor?

En el UCM (Universo Cinematográfico de Marvel) hay objetos misticos con mucho poder como el martillo de thor que recibe el nombre de *Mjölnir*, el Dios Odin conjuró un hechizo que  permite que solo aquellas personas dignas pudieran tomarlo e invocar el poder de Thor, su hijo, ambos personajes inspirados en la mitología nórdica.

Si se sabe que Visión es el más digno en UHD (Unidades de Honor y Dignidad) y que restando 4 unidades supera el doble de los puntos que posee Capitán América, mientras que un personaje como Deadpool tiene un puntaje  UHD que es cinco veces menor que la suma de unidades de Visión y Capitán América.

Además existen cuatro niveles de Dignidad donde uno es el menor nivel y cuatro es el máximo, así por ejemplo si un personaje tiene entre 0 y 20 UHD se encuentra en el nivel uno, si está entre 21 y 30 UHD está en el nivel dos, si tiene entre 31 y  50  UHD está en el nivel tres y si es superior a 50 se encuentra en nivel cuatro.

Elabore un programa que dado el nivel del Capitán América muestre los puntajes de Dignidad (UHD) separados por un espacio simple para Capitán América, Visión y Deadpool, Luego en la segunda línea imprima el nivel de Deadpool.

A continuación verá un ejemplo de entrada con su respectiva salida.

### Entrada

La entrada es la cantidad entera de UHD (Unidades de Honor y Dignidad) del Capitán América

### Salida

La salida es la impresión de los puntajes enteros calculados para los UHD en orden de Capitán América, Visión  y Deadpool separados por espacio simple y en la segunda linea la categoria del nivel de Deadpool.

### Ejemplo 1
```
INPUT

>>> 18

OUTPUT

>>> 18 40 11
>>> uno
```
### Ejemplo 2
```
INPUT

>>> 210

OUTPUT

>>> 210 424 126
>>> cuatro
```
[Solución Reto #1](/Ciclo_01/Retos/reto1.py)

-----------------------------------------------------------------------------------

## 🚀 Reto #2

### La Liga de la Justicia necesita un nuevo sistema de cifrado con dos llaves

Los sistemas de cifrado son usados para enviar mensajes a través de un canal de comunicación, se utilizan como mecanismo de seguridad para proteger la información que viaja a  través de internet. Lo usan desde los entes de seguridad gubernamental, bancos, páginas web hasta héroes del UCM y DC Comics.

La Liga de la Justicia está ideando un método seguro de comunicación usando no solo una sino dos llaves de cifrado, para este proceso Batman elegirá algunas letras para su clave y Flash elegirá otras, aunque pueden tener letras iguales.

Si la letra que está en el mensaje se encuentra en la clave de Batman se suma un punto a su favor, si la letra se encuentra en la clave de Flash también se suma un punto, de acuerdo al puntaje que lleven a medida que se vaya procesando el mensaje en el cifrado se coloca la letra del que más puntos tenga, la letra ‘B’ en el caso de Batman o la letra ‘F’ en el caso de Flash o si hay un empate se coloca la letra ‘j’.

Haga un programa que reciba las letras de cada clave y el mensaje a cifrar separados por un salto de línea e imprima un mensaje cifrado con el patrón propuesto. La liga de la justicia no sabe si ese sistema de cifrado funcionará pero quieren ver la secuencias generadas para tomar una decisión.

### Entradas 

Una línea con la clave de Batman (Cadena de caracteres)

Una línea con la clave de Flash (Cadena de caracteres)

Una línea con el mensaje a cifrar (Cadena de caracteres)

### Salida

Una línea (Cadena de caracteres) de la misma longitud del mensaje original que solo contará con las letras B F y j.

### Ejemplo 1
```
INPUT

>>> GJSÑH 
>>> LHJAS
>>> HHAGJJHFÑLADGFFSLSSDSHLGS

OUTPUT

>>> jjFjjjjjBjFFjjjjFFFFFFFFF
```
### Ejemplo 2
```
INPUT

>>> SFL 
>>> ÑJH
>>> ÑDDÑDFLHAÑKKSFFADLKÑJÑÑF

OUTPUT

>>> FFFFFFjFFFFFFjBBBBBBjFFF
```
[Solución Reto #2](/Ciclo_01/Retos/reto2.py)

-----------------------------------------------------------------------------------

## 🚀 Reto #3

### Los guardianes del Tiempo

Los guardianes del tiempo son creadores de la sagrada línea del tiempo, cuando una persona se sale de lo que tiene que hacer(destino) genera una nueva línea de tiempo y a estos infractores se les llama variantes

Usted es programador de la AVT (una agencia encargada de custodiar y vigilar la sagrada línea del tiempo) y Moebious le ha solicitado que haga un programa que lea la línea del tiempo representada por una secuencia de caracteres donde cada símbolo (carácter o letra) representa una época y para distinguirlas entre si están separadas por un espacio, si una letra vuelve aparecer en la línea de tiempo tiene un significado místico pero por ahora solo se necesita conocer las veces que se repiten cuando están seguidas.

Para determinar si una época está generando una nueva línea de tiempo se debe contar las veces que aparece la misma letra pero únicamente si se encuentran seguidas.

### Entrada
 
Una cadena de texto separada por espacios

### Salida

Una cadena de texto con los caracteres de la cadena de entrada en orden de aparición en la lista y en otra fila las veces seguidas que aparece dicho dígito, separados por un espacio

### Ejemplo 1
```
INPUT

>>> M M M S S S M M M Ñ Ñ N N O O O O R R R K K Q Q Q L L L

OUTPUT

>>> M S M Ñ N O R K Q L
>>> 3 3 3 2 2 4 3 2 3 3
```
### Ejemplo 2
```
INPUT

>>> O O R S S O O O M M M K K K K R R R P S S S S L L L 

OUTPUT

>>> O R S O M K R P S L
>>> 2 1 2 3 3 4 3 1 4 3
```
[Solución Reto #3](/Ciclo_01/Retos/reto3.py)

-------
## 🚀 Reto #4

### Empanadas Doña Marleny 

Doña Marleny tiene un negocio de empanadas muy conocido en el Valle, ella necesita un socio para ofertar sus productos a través de una aplicación móvil por todo esto de la pandemia y para ello ha abierto una convocatoria donde escogerá el mejor algoritmo con los mejores resultados entre los estudiantes del grupo P44 del programa MisionTIC 2022.

Para este propósito usted debe realizar un programa que lea un diccionario en formato JSON con donde la clave es una letra que identifica cada caja de empanadas disponibles puesto que se trata de una venta al por mayor para tiendas más pequeñas y el valor es el precio de dicha caja. En otra línea el programa recibe las claves de las cajas que el cliente desea separadas por un espacio. El programa debe ver cuáles de las cajas que el cliente desea se encuentran disponibles e imprimir el precio de comprar todas ellas y en otra línea las claves de las cajas de empanada que puede llevar.

### Entradas

Un diccionario en formato JSON {“llave”:valor,….} con llaves de cadena de texto y valores numéricos, donde la llave es el código interno de la caja de empanadas disponibles en la bodega de doña Marleny y el valor de esa llave corresponde con el precio de la misma.

### Salida

Un único dato numérico con el precio de todas las cajas que el cliente desea y que se encuentran disponibles según el diccionario de entrada.

En otra línea las claves de las cajas de empanadas que puede llevar.

### Ejemplos 1
```
INPUT

>>> {"j": 33278, "a": 25124, "w": 61687, "o": 65765, "q": 43923} 
>>> j a q o x

OUTPUT

>>> 168090
>>> j a q o
```
### Ejemplos 2
```
INPUT

>>> {"i": 97483, "b": 89320, "l": 84958, "x": 82823} 
>>> x m i j

OUTPUT

>>> 180306
>>> x i
```
[Solución Reto #4](/Ciclo_01/Retos/reto4.py)

## 🚀 Reto #5

### Colección de Hielocos 

Una importante empresa de productos de bebidas y gaseosas está desarrollando una aplicación para facilitar que sus clientes intercambien hielocos de objetos animados. Los hielocos se organizan por categoría según el color como amarillo, verde, gris, azul y brillante, la única restricción que pedirá la aplicación es que solo se pueden intercambiar por hielocos del mismo tipo.

Lo han contratado a usted y su función es desarrollar una librería llamada “hielocos” que permita realizar las siguientes funciones: 

1. (Vale 1) La función "colordehieloco" que dada una lista de los colores de hieloco (en la posición i-ésima de la lista está el tipo de dicho hieloco), genera una lista con los colores de hielocos sin repetición.

Por ejemplo si el usuario tiene diez hielocos y cada uno tiene los siguientes tipos:

['amarillo','verde','azul','azul','azul','amarillo','verde','azul','azul','azul']

la función debe retornar la lista


['amarillo','verde','azul']

Nótese que las clases aparecen solo una vez. 


2. (Vale 1) La función "mefaltandelcolordelhieloco " que dada una lista con los números de hielocos que les faltan, la lista de las clases de cada hieloco y un clase de hielocos (en ese orden), les retorne una lista con los números de dicha clase que les faltan.

Por ejemplo si se ejecuta la función:

mefaltandelcolordelhieloco([3,6,8],['amarillo','verde','azul','azul','azul','amarillo','verde','azul','azul','azul'],'azul')


debe retornar la lista

[3,8]

Nótese que los números de hielocos empiezan en cero (0) y van hasta el nueve (9) en este ejemplo (siempre empiezan en cero).

Por ejemplo si ejecutan la

función:

mefaltandelcolordelhieloco([1,3,6,8], ['amarillo','verde','azul','azul','azul','amarillo','verde','azul','azul','azul'], 'verde')  


Se debe retornar la lista:

[1,6] 


3. (Vale 1) La función "notengo" que dada una lista con los hielocos que tiene otra persona y una lista con los hielocos que tengo retorna la lista con los hielocos que me interesan de la otra persona.

Por ejemplo si se llama:

notengo([3,5,7,10,15,16],[4,10,5,8])

Se debe retornar la lista:

[3,7,15,16] 

4. (Vale 1) Para simplificar la primera versión de la librería decidieron pensar que todos los hielocos son de un mismo tipo y que la lista que maneja cada persona indica los números de los hielocos que tienen para cambiar y aquellos números que no están en dicha lista son los que necesitan. De esta manera deben crear una función "puedocambiar" que reciba la lista de hielocos que tiene otra persona y la lista de hielocos que tienen ellos y que retorne el número de hielocos que pueden cambiar.

Por ejemplo, llamar la función:

puedocambiar([3,5,7,10,15,16],[4,10,5,8])

Debe retornar

2

Porque a la otra persona solo le interesan dos hielocos que tienen ellos: [4,8], mientras que a ellos les interesan cuatro hielocos que la otra persona tiene: [3,7,15,16] 

[Solución Reto #5](/Ciclo_01/Retos/reto5.py)

