/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_relation_1_hijazi;

/**
 *
 * @author inesh
 */
public class TP2_relation_1_HIJAZI {

    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne bob = new Personne("Bobby", "Sixkiller", 40);
        Personne reno = new Personne("Reno", "Raines", 55);
        
        System.out.println("liste des voitures disponibles "+ uneClio +
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[1] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;

        System.out.println("la premiere voiture de Bob est " +
        bob.liste_voitures[1] ) ;
        
        bob.liste_voitures[2] = uneAutreClio ;
        bob.nbVoitures = 2 ;
        uneAutreClio.Proprietaire = bob ;
         
        System.out.println("la deuxième voiture de Bob est " +
        bob.liste_voitures[2] ) ;

        reno.liste_voitures[1] = une2008 ;
        reno.nbVoitures = 1 ;
        une2008.Proprietaire = reno ;
        
        System.out.println("la premiere voiture de reno est " +
        reno.liste_voitures[1] ) ;
        
        reno.liste_voitures[2] = uneMicra ;
        reno.nbVoitures = 2 ;
        uneMicra.Proprietaire = reno ;
        
        System.out.println("la deuxième voiture de reno est " +
        reno.liste_voitures[2] ) ;



        
        
    }
}
