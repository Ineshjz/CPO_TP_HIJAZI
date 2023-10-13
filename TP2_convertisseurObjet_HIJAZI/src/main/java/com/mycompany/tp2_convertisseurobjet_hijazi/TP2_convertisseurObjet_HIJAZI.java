/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_convertisseurobjet_hijazi;

import java.util.Scanner;

/**
 *
 * @author inesh
 */
public class TP2_convertisseurObjet_HIJAZI {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        System.out.println(" Saisir un reel");
        int x; 
        System.out.println("""
                           Saisissez la conversion que vous souhaiter effectuer :
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius
                           3) De Celsius vers Farenheit
                           4) De Kelvin vers Farenheit
                           6) De Farenheit vers Kelvin """);
        Convertisseur c = new Convertisseur(); 
      
        x = sc.nextInt();
        if (x ==1){
            System.out.println("La valeur en Kelvin est " + c.CelciusVersKelvin(r) + c.toString());  
        }
        if (x ==2){
            System.out.println("La valeur en Celsius est " + c.KelvinVersFarenheit(r)+ c.toString() );  
        }
        if (x ==3){
            System.out.println("La valeur en Farenheit est " + c.CelciusVersFarenheit(r)+ c.toString() );  
        }
        if (x==4){
            System.out.println("La valeur en Farenheit est " + c.KelvinVersFarenheit(r)+ c.toString() );  
        }
        if (x==5){
            System.out.println("La valeur en Kelvin est " + c.FarenheitVersKelvin(r)+ c.toString() );  
        }
    }
}


