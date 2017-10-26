/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float metros;
        Scanner scan=new Scanner(System.in);
        System.out.println("Millas:");
        metros=scan.nextFloat()*1852;
        System.out.println("metros: "+metros);
    }
    
}
