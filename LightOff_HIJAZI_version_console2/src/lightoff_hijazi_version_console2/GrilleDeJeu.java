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

    GrilleDeJeu() {
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
        int l= rd.nextInt(3);
        if (l==0){ //active ligne aléatoire
            int x = rd.nextInt(nbLignes);
            for(int i=0; i<nbColonnes; i++){
                matriceCellules[x][i].activerCellule();
            }   
        }
        if (l==1){ //active colonne aléatoire
            int x = rd.nextInt(nbColonnes);
            for(int i=0; i<nbLignes; i++){
            matriceCellules[i][x].activerCellule();
        }
        }
        if (l==2){ //active diagonale aléatoire
            for (int i=0; i<nbLignes; i++){
            matriceCellules[i][i].activerCellule();
        }
        }
        if (l==3){ 
            for (int i=0; i<nbLignes; i++){
            matriceCellules[i][(nbLignes-i)].activerCellule();
            }
        }
         
        }
    public void melangerMatriceAleatoirement (int nbTours){
        this.eteindreToutesLesCellules(); 
        for (int i =0; i<nbTours; i++){
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    public void activerColonneDeCellules (int idColonne){
        for (int i=0; i<nbLignes; i++){
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     *
     * @param idLigne
     */
    public void activerLigneDeCellules (int idLigne){
        for (int i=0; i<nbColonnes; i++){
            matriceCellules[idLigne][i].activerCellule();
        }
    }
    public void activerdiagonaleDescendante(){
        for (int i=0; i<nbLignes; i++){
            matriceCellules[i][i].activerCellule();
        }
    }
    public void activerdiagonaleMontante(){
        for (int i=0; i<nbLignes; i++){
            matriceCellules[i][(nbLignes-i)].activerCellule();
        }
    }
    public boolean cellulesToutesEteintes(){
        int n=0; 
        boolean x = false; 
        for (int i=0; i<nbLignes; i++){
            for (int j=0; j<nbColonnes; j++){
                matriceCellules[i][j].estEteint();
     
            }
        }
        if ( n==0){
            x = true;
    }
        if (n>0){
            x = false;
        }
        return x;
    }

    @Override
    public String toString() { 
        String a="";
        String b=""; 
        String c="";
        for (int j=0; j<nbColonnes; j++){
            a += j+" | ";
        }
        for (int j=0; j<=nbColonnes; j++){
                c+="----";
            }
        for (int i=0; i<nbLignes; i++){
            b += "\n"+c+"\n "+i+" | ";
            for (int j=0; j<nbColonnes; j++){
                b += this.matriceCellules[i][j]+" | ";
            }
        }
        return "   | "+a+b;
    }
}

    
    
        
       
        
