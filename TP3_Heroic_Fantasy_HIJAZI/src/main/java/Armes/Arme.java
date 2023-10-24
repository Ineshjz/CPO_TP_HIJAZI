/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author inesh
 */
public abstract class Arme {
    String nom; 

    /**
     *
     */
    public int nivAttaque;
    public Arme(String nom, int nivAttaque) {
        this.nom =nom; 
        if(nivAttaque<100) {
            this.nivAttaque =nivAttaque;
        }else{
            System.out.println("Erreur, saisir un niveau d'attaque inférieur à 100");
            this.nivAttaque = 0;
        }
    }

    public String lireNomArme() {
        return nom; 
    } 
    
    public int lireNiveauAttaque() {
        return nivAttaque;
    }
    @Override
    public String toString() {
        return "Nom: " + nom + "Niveau d'attaque: " + nivAttaque;  
    }
}
