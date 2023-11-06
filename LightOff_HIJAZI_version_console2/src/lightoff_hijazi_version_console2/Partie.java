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

    public Partie(GrilleDeJeu unegrille, int nbCoups) {
        this.grille = unegrille;
        //grille = new GrilleDeJeu(10,10);
        this.nbCoups = 0;
    }
    public void initialiserPartie(){
        grille.melangerMatriceAleatoirement(5); //melange grille    
    }
    public void lancerPartie(){
        Scanner scanner = new Scanner (System.in);
        System.out.println(grille); //grille à l'état initial
        
        while(!grille.cellulesToutesEteintes()) {
            System.out.println("1.Activer une colonne\n2.Activer une ligne\n3.Activer une diagonale descendante\n4.Activer une diagonale montante"); 

    
            int cp =scanner.nextInt();
            nbCoups++;
            switch (cp){
                case 1: 
                    System.out.println("Saisir le numéro de la colonne à modifier");
                    int colonne = scanner.nextInt(); 
                    grille.activerColonneDeCellules(colonne);
                    break;
            
                case 2:
                    System.out.println("Saisissez le numéro de la ligne à modifier");
                    int ligne = scanner.nextInt();
                    grille.activerLigneDeCellules(ligne);
                    break;
                case 3:
                    grille.activerdiagonaleDescendante();
                    break;
                case 4:
                    grille.activerdiagonaleMontante();
                    break;
            }
       
            System.out.println(grille);
        }
            System.out.println("Le nombre de coups utilisé est: " + nbCoups);
            System.out.println ("C'est gagné! Toutes les cellules sont éteintes.");
        }
}
    
    
    
    
    

