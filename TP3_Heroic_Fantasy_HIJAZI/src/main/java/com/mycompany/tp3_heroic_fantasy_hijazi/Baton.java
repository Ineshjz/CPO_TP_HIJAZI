/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_hijazi;
import Arme.*;

/**
 *
 * @author inesh
 */
public class Baton extends Arme {
    int age;
    
    public Baton(String nom, int nivAttaque, int age) {
        super(nom,nivAttaque);
        if (age  < 100){   
        this.age = age;     
      } else {
        System.out.println("Erreur");
       }
    }
    
}
