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
         // TIPOS DE DATOS
        // Cadenas
        String texto=sc.nextLine();
        // Enteros
        int numero=sc.nextInt();
        // No se recomienda usar nextInt, mejor tomar texto y convertirlo a entero
        int numero2 = Integer.parseInt(sc.nextLine());
        // Flotantes
        double numeroreal = Double.parseDouble(sc.nextLine());
    }
    
}
