/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import java.util.Scanner;

/**
 *
 * @author luzbe
 */
public class Sesion2 {
    //Creando una función
     public static void primeraFuncion(){
        System.out.println("Primera Función");
    }
     
    public static void suma(int numero, int numero2){
        System.out.println(numero+numero2);
    }
    
    //función que retorne algo
    public static int resta(int numero1, int numero2){
        return numero1-numero2;
    }

    //función que retorne dos tipos de datos
    public static String edadNombre(String nombre, int edad){
        return nombre + " " + edad;
    }
    
    //función math 
    public static double f(double number){
        return Math.pow(number, 2); // exponeciación, pow devolvera la number elevado a la 2
    }
    
    
    
    public static void main(String[] args) {
        //Llamando una función
        primeraFuncion();
        suma(4,3);
        int total = resta(4,3);
        System.out.println(total);
        
        // Llamando una función usando Scanner
//        Scanner sc = new Scanner(System.in);
//        String nombre = sc.nextLine();
//        int edad = Integer.parseInt(sc.nextLine());
//        System.out.println(edadNombre(nombre, edad));
//        
        System.out.println(f(4.3));
    }
    
}
