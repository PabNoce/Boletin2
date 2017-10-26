/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float tarifa, pago, desc;
        Scanner scan=new Scanner(System.in);
        System.out.println("Precio:");
        pago=scan.nextFloat();
        System.out.println("Tarifa:");
        tarifa=scan.nextFloat();
        System.out.println("Descuento: "+(1-pago/tarifa)*100+"%");
    }
    
}
