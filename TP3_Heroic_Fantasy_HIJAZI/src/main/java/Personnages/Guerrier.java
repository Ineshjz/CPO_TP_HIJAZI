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
public class Guerrier extends Personnages {
    boolean aCheval;
    
    public Guerrier(String nom, int nivDeVie, boolean aCheval) {
        super(nom, nivDeVie);
     
        
    }

    public void setaCheval(boolean aCheval) {
        this.aCheval = aCheval;
    }
    
}
