/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_hijazi;

/**
 *
 * @author inesh
 */
public class Voiture {    
    String Modele; 
    String Marque; 
    int PuissanceCV; 
    Personne Proprietaire ;
    public Voiture(String clio, String renault, int par) {
        Modele = clio;
        Marque = renault;
        PuissanceCV= par; 
        Proprietaire = new Personne ("null","null",0);
                
    }

    @Override
    public String toString() {
        return "Voiture{" + "Modele=" + Modele + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + ", Proprietaire=" + Proprietaire + '}';
    }
    
    
            }
    
