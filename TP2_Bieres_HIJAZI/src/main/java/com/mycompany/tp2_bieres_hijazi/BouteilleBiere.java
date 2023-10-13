/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_bieres_hijazi;

/**
 *
 * @author inesh
 */
public class BouteilleBiere {
    public String nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte;


public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie);
}

public BouteilleBiere (String unNom, double unDegre, String uneBrasserie) {
nom = unNom;
degreAlcool = unDegre;
brasserie = uneBrasserie;
ouverte = false;
}
public boolean Décapsuler() {
    if (ouverte == false){
        ouverte = true;
    }
    else {
        System.out.println("erreur: bière déjà ouverte");
        ouverte = false ;
    } 
    return ouverte;
}

@Override
public String toString() {
String uneBiere;
uneBiere = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) uneBiere += "oui" ;
else uneBiere += "non" ;
return uneBiere ;
}
}


