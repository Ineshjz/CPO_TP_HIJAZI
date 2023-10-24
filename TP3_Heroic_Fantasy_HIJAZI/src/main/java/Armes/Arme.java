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
    int nivAttaque;

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
