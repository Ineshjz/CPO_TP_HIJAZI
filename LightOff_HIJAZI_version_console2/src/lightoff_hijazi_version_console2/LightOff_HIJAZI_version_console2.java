/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_hijazi_version_console2;

/**
 *
 * @author inesh
 */
public class LightOff_HIJAZI_version_console2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /// CelluleLumineuse Noire = new CelluleLumineuse ();
        //CelluleLumineuse Blanche = new CelluleLumineuse (); 
        //Noire.activerCellule();
        //Blanche.activerCellule();
        //Noire.estEteint();
        //Blanche.estEteint(); 
        //Noire.eteindreCellule();
        //Blanche.eteindreCellule(); 
        //Noire.getEtat();
        //Blanche.getEtat();
        
        //System.out.println("La classe CelluleLumineuse a bien été ajoutée");
        
        GrilleDeJeu affichage = new GrilleDeJeu(4,4);
        affichage.cellulesToutesEteintes();
        System.out.println(affichage);
        
        //affichage.activerColonneDeCellules(0);
        //System.out.println(affichage);
        //ok
        
        //affichage.activerLigneDeCellules(1);
        //System.out.println(affichage);
        //ok
        
        //affichage.activerdiagonaleDescendante();
        //System.out.println(affichage);
        //ok
        
        //affichage.activerdiagonaleMontante();
        //System.out.println(affichage);
        //Ne fonctionne pas
        
        //affichage.activerLigneColonneOuDiagonaleAleatoire();
        //System.out.println(affichage);
        // ok pour ligne et diagonale
        
        //affichage.melangerMatriceAleatoirement(2);
        //System.out.println(affichage);
        //ok 
        
        System.out.println("La classe GrilleDeJeu a été ajoutée etb fonctionne");

        
        
        
        
        
    }
    
}
