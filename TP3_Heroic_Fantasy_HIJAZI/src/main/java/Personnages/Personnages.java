package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author inesh
 */
public abstract class Personnages {
    String nom; 
    int nivDeVie;

    public String lireNomPerso() {
        return nom; 
    } 
    
    public int lireNiveauDeVie() {
        return nivDeVie;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nom: " + nom + "Niveau de vie: " + nivDeVie;  
    }
}
    

