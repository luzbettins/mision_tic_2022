/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion1;

import java.util.Scanner;

/**
 *
 * @author luzbe
 */
public class Sesion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir 
        System.out.println("Hola");
        // Declarar variables 
        // Cadenas
        String texto = " ";
        System.out.print(texto);
        // Enteros
        int numero = 5;
        System.out.println(numero);
        // Flotantes, se recomienda usar double
        float real = 1.0f;
        double realDoble = 3.0;
        System.out.println(real);
        System.out.println(realDoble);
        // Booleanos
        boolean bandera = true;
        System.out.println(bandera);
        // Caracteres
        char letra1 = 'a';
        System.out.println(letra1);
        char letra = 70;
        System.out.println(letra);

        // Para la lectura de datos usamos el objeto Scanner
        Scanner sc = new Scanner(System.in); //se declara el objeto solo una vez
        String nombre = ""; // inicializar la variable
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre);

        // Operaciones aritmeticas
        int nums1 = 5, nums2 = 5; // se pueden inicializar en la misma linea los datos del mismo tipo
        int totsum = nums1 + nums2;
        System.out.println(totsum);
        //división se usa double por los decimales
        double num1 = 3;
        double num2 = 2;
        double total = num1 / num2;
        System.out.println(total);
        
        //PARTE 2
        
//         String texto=sc.nextLine();
//        int numero=sc.nextInt();  // No se recomienda usar nextInt
        int numero2 = Integer.parseInt(sc.nextLine()); // Se recomienda tomar texto y convertirlo a entero
        double numeroreal = Double.parseDouble(sc.nextLine());

        //Operadores de igualdad y relacionales
        System.out.println(2 > 2);
        System.out.println(2 >= 2);
        System.out.println(2 < 2);
        System.out.println(2 <= 2);
        System.out.println(2 == 2);
        System.out.println(2 != 2);
        //Para comparar cadenas se recomienda usar .equals
        System.out.println("Hola".equals("hola"));
        //Para ignorar las minusculas y mayusculas usamos .equalsIgnoreCase
        System.out.println("Hola".equalsIgnoreCase("hola"));

        
        //Operadores de asignación
        int i = 1; // asignación               
        i += 2; //asignación con suma
        i -= 1; //asignación co resta
        
        //Operadores de incremento y decremento
        i++; //incremento, es decir i = i + 1
        i--; //decremento

        System.out.println("Valor: " + i);
    }
    
}
