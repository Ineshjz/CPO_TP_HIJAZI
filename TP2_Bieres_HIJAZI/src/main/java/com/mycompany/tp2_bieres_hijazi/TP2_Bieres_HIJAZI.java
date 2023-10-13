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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson ");
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson" ;
        uneBiere.ouverte = false ;
        uneBiere.lireEtiquette();
        uneBiere.Décapsuler(); 
        
        BouteilleBiere secondeBiere = new BouteilleBiere("Heineken", 5.0, "Brasserie Heineken ");
        secondeBiere.nom = "Heineken";
        secondeBiere.degreAlcool = 5.0 ;
        secondeBiere.brasserie = "Brasserie Heineken" ;
        secondeBiere.ouverte = false ;
        secondeBiere.lireEtiquette();
        secondeBiere.Décapsuler();
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe ");
        autreBiere.nom = "Leffe";
        autreBiere.degreAlcool = 6.6 ;
        autreBiere.brasserie = "Abbaye de Leffe" ;
        autreBiere.ouverte = false ;
        autreBiere.lireEtiquette();
        autreBiere.Décapsuler();
        
        System.out.println(uneBiere) ;
        System.out.println(secondeBiere) ;
        System.out.println(autreBiere) ;


    
    }
}
