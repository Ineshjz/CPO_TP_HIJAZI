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
    String aCheval;
    static int nbGuerriers;
    
    public Guerrier(String nom, int nivDeVie, String aCheval) {
        super(nom, nivDeVie);
        this.aCheval=aCheval;
        nbGuerriers++;
    }
        @Override
        public void finalize(){
        nbGuerriers--;
        }
        
    
      public boolean setConfirmé(boolean Confirmé) {
        if("oui".equals(this.aCheval)){
            return true;
        }else{
            return false;
        }

      public void aCheval(String newCheval) {
        this.aCheval =newCheval;
    }
    public String LireCheval(){
        return this.aCheval;
    }
}
    

