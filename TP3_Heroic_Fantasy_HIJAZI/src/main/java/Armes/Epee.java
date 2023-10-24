/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;
/**
 *
 * @author inesh
 */
public class Epee extends Arme{
    public int finesse; 
    
    public Epee (String nom, int nivAttaque, int finesse) {
        super(nom, nivAttaque);
        if (finesse < 100){   
        this.finesse = finesse;     
      } else {
        System.out.println("Erreur, saisir finesse inférieure à 100");
        this.finesse= 0;
       }
    }
    
}
