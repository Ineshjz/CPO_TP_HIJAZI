/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_hijazi;

/**
 *
 * @author inesh
 */
public class Personne {
    String nom; 
    String prenom;
    int nbVoitures = 0 ;
    Voiture [] liste_voitures ;
    
    
    public Personne(String bobby, String sixkiller, int v) {
    nom= bobby;
    prenom= sixkiller;
    nbVoitures = v;
    liste_voitures = new Voiture [3];
    }
    public boolean ajouter_voiture(Voiture voiture_a_ajouter){
        if (voiture_a_ajouter.Proprietaire.nbVoitures!=0){
            System.out.println("La voiture est volée.");
        }
        if (voiture_a_ajouter.Proprietaire.nbVoitures > 3){
            return false;
        }
        else {
            
            nbVoitures++;
        }
        voiture_a_ajouter.Proprietaire = this ; 
        return true; 
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    

}
