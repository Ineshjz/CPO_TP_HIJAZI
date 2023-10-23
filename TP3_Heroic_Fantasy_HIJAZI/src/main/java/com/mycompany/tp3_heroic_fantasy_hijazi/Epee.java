/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_hijazi;
import java.until.Scanner;
/**
 *
 * @author inesh
 */
public class Epee extends Arme{
    int indice; 
    
    public Epee (String nom, int nivAttaque, int indice) {
        super(nom, nivAttaque);
        if (indice < 100){   
        this.indice = indice;     
      } else {
        System.out.println("Erreur");
       }
    }
    
}
