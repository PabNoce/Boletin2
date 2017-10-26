/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float a, b, suma, resta, mult, div;
       Scanner scan=new Scanner(System.in);
        System.out.println("Introduce a");
       a=scan.nextFloat();
        System.out.println("Introduce b");
       b=scan.nextFloat();
       suma=a+b;
       resta=a-b;
       mult=a*b;
       div=a/b;
        System.out.println("suma: "+suma+"\nresta: "+resta+"\nmultiplicacion: "+
                mult+"\ndivision: "+div);
           
    }
    
}
