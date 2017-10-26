/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float euros, dolares, cambio;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce euros");
        euros = scan.nextFloat();
        System.out.println("introduce cambio");
        cambio = scan.nextFloat();
        dolares = euros * cambio;
        System.out.println("Cambio: " + dolares + " Dolares");
    }
}
