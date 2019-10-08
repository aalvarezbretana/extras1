/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_2;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Extras1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* calcular o area dun circulo pedindo o valor do radio por teclado
        e utilizando a libreria Math.PI, Math.pow(a, a) sabendo que 
        area = PI * r² */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cal é o radio?");
        double radio = teclado.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("O área do circulo a partir do radio recibido é "
                + area + ".");
    }

}
