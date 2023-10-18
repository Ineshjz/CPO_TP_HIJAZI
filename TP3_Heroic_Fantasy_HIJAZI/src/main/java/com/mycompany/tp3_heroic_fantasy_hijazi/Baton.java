/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_hijazi;

/**
 *
 * @author inesh
 */
public class Baton extends Arme {
   double finesse; 
   int age; 
   
   public double lireFinesse(){
       if (finesse < 100){ 
       return finesse; 
  } else {
   System.out.println("Erreur");
       }
   
   }


    public Baton(double finesse) {
        this.finesse = finesse;
    }

    public Baton(int age) {
        this.age = age;
    }
    
}
