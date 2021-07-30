/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;

import java.util.Scanner;

/**
 *
 * @author luzbe
 */
public class Sesion4 {
     public static int[] lee_arreglo_enteros(Scanner sc, int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Componente " + i + "- ́esima?");
            x[i] = sc.nextInt();
        }
        return x;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cadenas
        System.out.println("\thola"); //tabulación
        System.out.println("hola\\"); //caracter \
        System.out.println("hola\n luz"); //salto de línea
        System.out.println("hola \"luz\'"); // comillas
        System.out.println("");

        // Lectura de cadenas
        // Declarar el objeto e inicializa
      Scanner sc = new Scanner(System.in);
//        // lee una cadena
//        String miCadena = sc.nextLine();
//        // Imprime la cadena leída
//        System.out.println(miCadena);
//        
//        // comparación de cadenas
//        // lee cadena 1
//        String miCadena1 = sc.nextLine();
//        // lee cadena 2
//        String miCadena2 = sc.nextLine();
//        // Imprime true o false
//        System.out.println(miCadena1.equals(miCadena2));
        
        //contenencia
        String a = "hola Luz";
        String b = "hola";
        System.out.println(a.contains(b));
        
        //longitud de cadenas
        String nombre = "LUZ";
        System.out.println(nombre.length());
        
        // extracción de caracteres
        String s = "Programar es genial!";
        System.out.println(s.charAt(10)); //recupera un caracter  
        System.out.println(s.substring(10, s.length())); //recupera una subcadena
        
        
        //arreglos en java
      
        int[] x;
         x = lee_arreglo_enteros(sc,3);
         System.out.println(x);
 

 
    }

}
