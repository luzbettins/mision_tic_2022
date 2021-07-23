/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2;

import java.util.Scanner;

/**
 *
 * @author luzbe
 */
public class Session2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto=sc.nextLine();
        int numero=sc.nextInt();  // No se recomienda usar nextInt
        int numero2 = Integer.parseInt(sc.nextLine()); // Se recomienda tomar texto y convertirlo a entero
        double numeroreal = Double.parseDouble(sc.nextLine());

        //Operadores Lógicos
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
