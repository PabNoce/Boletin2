/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_10;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float soldoFixo, tVendas, km, dias, bruto, liquido;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce soldo fixo");
        soldoFixo=scan.nextFloat();
        System.out.println("Introduce o total de vendas");
        tVendas=scan.nextFloat();
        System.out.println("Introduce a quilometraxe");
        km=scan.nextFloat();
        System.out.println("Introduce dias de desprazamento");
        dias=scan.nextFloat();
        bruto=(float) (soldoFixo+tVendas*0.05+km*2+30*dias);
        liquido=(float) (bruto-36-bruto*0.18);
        System.out.println("Bruto: "+bruto);
        System.out.println("liquido: "+liquido);
    }
    
}
