/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int total;
        System.out.println("Introduce billetes de 100");
        total=scan.nextInt()*100;
        System.out.println("Introduce billetes de 20");
        total=total+scan.nextInt()*20;
        System.out.println("Introduce billetes de 5");
        total=total+scan.nextInt()*5;
        System.out.println("Introduce monedas");
        total=total+scan.nextInt();
        System.out.println("Has introducido: "+total+"€");
    }
    
}
