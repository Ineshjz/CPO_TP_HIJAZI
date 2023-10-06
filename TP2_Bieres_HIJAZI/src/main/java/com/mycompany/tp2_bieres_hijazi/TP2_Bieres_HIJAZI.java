/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_bieres_hijazi;

/**
 *
 * @author inesh
 */
public class TP2_Bieres_HIJAZI {

    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson" ;
        uneBiere.ouverte = false ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere secondeBiere = new BouteilleBiere() ;
        secondeBiere.nom = "Leffe";
        secondeBiere.degreAlcool = 6.6 ;
        secondeBiere.brasserie = "Abbaye de Leffe" ;
        secondeBiere.ouverte = false ;
        secondeBiere.lireEtiquette();
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");


    
    }
}
