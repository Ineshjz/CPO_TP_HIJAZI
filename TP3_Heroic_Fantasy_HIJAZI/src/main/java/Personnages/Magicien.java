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
    String niv;
    static int nbMag;
    boolean Confirmé;
    
    public Magicien (String nom, int nivDeVie, boolean Confirmé) {
        
        super (nom, nivDeVie);
        this.niv= niv;
        nbMag++;
    }

    public boolean setConfirmé(boolean Confirmé) {
        if(this.Confirmé == true){
            return true;
        }else{
            return false;
            
        }
    }
    public void Niv2 (String niv2) {
        this.niv= niv2;
    }
    public String lireNiv() {
        return this.niv;
    }

    boolean Confirmé() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
