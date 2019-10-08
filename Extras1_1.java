/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_1;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Extras1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* realiza un programa que simule un ticket da compra. 
para eso pedimos o numero de unidades mercadas e precio do produto, 
visualizamos.
        Establecemento
    n unidades =
    precio unidade =
    total =
    recibo =
    devolvo =
    Grazas por vir
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantos produtos mercaches?");
        int unidades = teclado.nextInt();
        System.out.println("Cal é o precio da unidade do produto?");
        double precio_unidad = teclado.nextDouble();
        double precio_total = precio_unidad * unidades;
        System.out.println("Canto diñeiro ofreciches?");
        double recibo = teclado.nextDouble();
        double devolvo = recibo - precio_total;
        System.out.println("\t ESTABLECEMENTO\n Nº Unidades = " + unidades
                + ".\n Precio unidade = " + precio_unidad + "€.\n Total = "
                + precio_total + "€.\n Recibo = " + recibo + "€.\n Devolvo = "
                + devolvo + "€.\n Grazas por vir.");

    }

}
