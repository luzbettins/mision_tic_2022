/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesiones;

import java.util.Scanner;

/**
 *
 * @author luzbe
 */
public class Session1 {

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
        
    }

}
