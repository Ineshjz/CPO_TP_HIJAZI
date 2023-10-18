/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_hijazi;

/**
 *
 * @author inesh
 */
public abstract class Arme {
    String nom; 
    int NiveauAttaque;

    public String lireNomArme() {
        return nom; 
    } 
    
    public int lireNiveauAttaque() {
        return NiveauAttaque;
    }
    @Override
    public String toString() {
        return "Nom: " + nom + "Niveau d'attaque: " + NiveauAttaque;  
    }
}
