# Identificadores y variables

### Lenguaje de tipado estático

Al declarar una variable se debe indicar a que tipo de dato pertenece. Ej: C, C++, Java

### Lenguaje de tipado dinámico

Al declarar una variable no es necesario especificar a que tipo de dato pertenece. Ej: Python, Ruby

## Identificadores

> Es una secuencia de símbolos que se utilizan como nombres de variables, funciones, arreglos, clases y otras estructuras de los lenguajes de programación.

Un identificador no debe ser una palabra reservada de Java, ni debe exceder los 4 a 15 caracteres.

**Palabras reservadas en Java:**

## Variables

> Una variable es un espacio de memoria donde se almacena un dato, un espacio donde se guarda la información necesaria para realizar las acciones que ejecutan los programas.

Para declarar una variable se necesitan los componentes: nombre y tipo de dato

# Tipos de datos primitivos

### Numéricos Enteros

Números enteros, sin parte decimal

- byte: 8 bits, almacena valores en el rango [-128, 127]
- short: doble de 1 byte, valores en el rango [-32.768, 32.767]
- int: 4 bytes
- long: 8 bytes

### Punto flotante

Enteros y racionales

- float: 32 bits
- double: 64 bits

### Booleanos

Se declaran con la palabra boolean.

**Valores lógicos:** true, false

### Caracteres

Se declaran con la palabra char, representan 1 byte.

**Caracteres especiales:**

- \n : Nueva línea.
- \t : Tabulador horizontal.
- \ \ : Diagonal invertida (back slash).
- \’ : Imprime apóstrofo.
- \" : Imprime Comillas.
- \b : Retroceso (retrocede un espacio el cursor).
- \v : Tabulador vertical (coloca el cursor justo debajo del ́ultimo carácter de la línea actual).
- \r : Retorno de carro (coloca el cursor en el primer carácter de la línea actual y sobrescribe el texto de la línea).
- \? : Imprime el símbolo de interrogación.

# Lectura de datos

Se utiliza Scanner para la lectura de variables, se debe importar:

```
import java.util.Scanner;
```

Para poder leer datos es necesario crear una instancia del objeto Scanner:

```
Scanner sc = new Scanner(System.in);
```

y dependiendo del tipo de dato se usan diferentes formas de lectura.

```
byte b = Byte.parseByte(sc.nextLine());
short s = Short.parseShort(sc.nextLine());
int i = Integer.parseInt(sc.nextLine())
long l = Long.parseLong(sc.nextLong());
float f = Float.parseFloat(sc.nextLine());
double d = Double.parseDouble(sc.nextLine());
boolean b = Boolean.parseBoolean(sc.nextLine());
char c = sc.nextLine().charAt(0);

```

### Operadores aritmeticos

- - = suma
- - = resta
- - = multiplicación
- / = división
- % = módulo
