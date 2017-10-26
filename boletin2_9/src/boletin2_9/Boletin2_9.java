/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dinero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce dinero");
        dinero = scan.nextInt();
        System.out.println(dinero / 100 + " Billetes de 100");
        dinero = dinero % 100;
        System.out.println(dinero / 20 + " Billetes de 20");
        dinero = dinero % 20;
        System.out.println(dinero / 5 + " Billetes de 5");
        dinero = dinero % 5;
        System.out.println(dinero + " Monedas de 1");

    }

}
