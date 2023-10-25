/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_hijazi_version_console2;

import java.util.Random;

/**
 *
 * @author inesh
 */
public class GrilleDeJeu {
    int nbLignes; 
    int nbColonnes;
    CelluleLumineuse[][]matriceCellules;

    /**
     *
     * @param p_nbLignes
     * @param p_nbColonnes
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        
        for (int i=0; i<nbLignes; i++){//la méthode parcours toutes les lignes et colonnes
            for(int j=0; j<nbColonnes; j++){
                matriceCellules[i][j]=new CelluleLumineuse(); 
            }
        }
    }
    public void eteindreToutesLesCellules(){
        for (int i=0; i<nbLignes; i++){ //la méthode parcours toutes les lignes et colonnes
            for(int j=0; j<nbColonnes; j++){
                matriceCellules[i][j].eteindreCellule();
        }
        }
    }
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random rd = new Random(); 
        int x= rd.nextInt(4);
        if (x==0){ //active ligne aléatoire
            int x = rd.nextInt(nbLignes);
            matriceCellules[nbLignes][nbColonnes].activerCellule(); 
        }
        if (x==1){ //active colonne aléatoire
            int x = rd.nextInt(nbColonnes);
            matriceCellules[nbLignes][nbColonnes].activerCellule();
        }
        if (x==2){ //active diagonale aléatoire
            for (int i=0; i<nbLignes; i++){
                for (int j=0; j<nbColonnes; j++)
            }
            int x = rd.nextInt(nb);
            matriceCellules[nbLignes][nbColonnes].activerCellule();
        }
   
         
     }   
        
    
    
    
           
    
}
