package Personnages;


import Personnages.Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author inesh
 */
public class Magicien extends Personnages {
    boolean Confirmé;
    
    public Magicien (String nom, int nivDeVie, boolean Confirmé) {
        super (nom, nivDeVie);
    }

    public void setConfirmé(boolean Confirmé) {
        this.Confirmé = Confirmé;
    }
}
