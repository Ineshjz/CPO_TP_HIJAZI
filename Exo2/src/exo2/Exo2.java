/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 * PARTIE 2 HIJAZI TDC
 *
 * @author hp
 */
public class Exo2 {

    public class EXO2 {
    public static void main(String[] args) {
        int nb; // nombre d'entiers à additionner
        int result; // résultat
        int ind; // indice
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nEntrer le nombre :");
            nb = sc.nextInt(); // On demande à sc de donner le prochain entier
            
            // Addition des nb premiers entiers
            result = 0;
            ind = 1;
            while (ind <= nb) {
                result = result + ind;
                ind++; // Incrémentez ind pour éviter une boucle infinie
            }
            // Affichage du résultat
            System.out.println("La somme des " + nb + " entiers est : " + result);
            // Fermez le scanner
        }
    }
}   
    }
    

