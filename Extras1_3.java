/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_3;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Extras1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* realiza un programa que lea un numero de 3 cifras e amose por 
        pantalla as cifras do numero */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número de 3 cifras");
        int numero = teclado.nextInt();
        int cifra_1 = numero / 100;
        int cuenta = numero - (cifra_1 * 100);
        int cifra_2 = cuenta / 10;
        int cifra_3 = cuenta - (cifra_2 * 10);
        System.out.println("La primera cifra es " + cifra_1 + ", la segunda "
                + "cifra es " + cifra_2 + " y la tercera cifra es "
                + cifra_3 + ".");
    }

}
