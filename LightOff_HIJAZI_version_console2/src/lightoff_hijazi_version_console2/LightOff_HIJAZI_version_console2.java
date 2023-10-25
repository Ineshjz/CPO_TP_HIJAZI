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
        CelluleLumineuse Noire = new CelluleLumineuse (false);
        CelluleLumineuse Blanche = new CelluleLumineuse (true); 
        Noire.activerCellule();
        Blanche.activerCellule();
        Noire.estEteint();
        Blanche.estEteint(); 
        Noire.eteindreCellule();
        Blanche.eteindreCellule(); 
        Noire.getEtat();
        Blanche.getEtat();
        
        System.out.println("La classe CelluleLumineuse a bien été ajoutée");
        
    }
    
}
