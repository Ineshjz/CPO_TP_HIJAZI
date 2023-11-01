/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_hijazi_version_console2;
import java.util.Scanner;
/**
 *
 * @author inesh
 */
public class Partie {
    GrilleDeJeu grille; 
    int nbCoups;

    public Partie(GrilleDeJeu grille, int nbCoups) {
        grille = new GrilleDeJeu();
        this.nbCoups = 0;
    }
    public void initialiserPartie(){
        grille.melangerMatriceAleatoirement(nbCoups); //melange grille    
    }
    public void lancerPartie(){
        Scanner scanner = new Scanner (System.in);
        System.out.println(grille); //grille à l'état initial
        
        while(!grille.cellulesToutesEteintes()) {
            System.out.println("1.Activer une colonne\n" + "2.Activer une ligne" + "3.Activer une diagonale descendante\n" + "4.Activer une diagonale montante"); 
// print ne fonctionne pas??
    
            int cp =scanner.nextInt();
            nbCoups++;
            if (cp==1){
                System.out.println("Saisir le numéro de la colonne à modifier");
                int colonne = scanner.nextInt(); 
                grille.activerColonneDeCellules(colonne);
            }
            if(cp==2){
                System.out.println("Saisissez le numéro de la ligne à modifier");
                int ligne = scanner.nextInt();
                grille.activerLigneDeCellules(ligne);
            }
            if(cp==3){
                //System.out.println("Saissisez le numéro de la diagonale descendante à modifier");
                grille.activerdiagonaleDescendante();
            }
            if (cp==4){
                grille.activerdiagonaleMontante();
            }
       
            System.out.println(grille);
        }
            System.out.println("Le nombre de coups utilisé est: " + nbCoups);
            System.out.println ("C'est gagné! Toutes les cellules sont éteintes.");
        }
}
    
    
    
    
    

