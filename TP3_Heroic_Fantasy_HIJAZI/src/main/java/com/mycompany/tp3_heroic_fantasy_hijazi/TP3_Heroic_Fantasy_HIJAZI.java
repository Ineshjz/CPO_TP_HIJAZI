/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp3_heroic_fantasy_hijazi;

import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import Personnages.Magicien;
import Personnages.Personnages;
import Personnages.Guerrier; 
import java.util.ArrayList;

/**
 *
 * @author inesh
 */
public class TP3_Heroic_Fantasy_HIJAZI {

    public static void main(String[] args) {
        Epee Excalibur = new Epee ("Excalibur", 7, 5);
        Epee Durandal = new Epee ("Durandal",4,7);
        Baton Chêne = new Baton ("Chêne", 4, 5);
        Baton Charme = new Baton ("Charme", 5, 6);
        ArrayList<Arme> listeArme=new ArrayList<Arme>();
        listeArme.add (Excalibur);
        listeArme.add (Durandal);
        listeArme.add (Chêne);
        listeArme.add (Charme);
        listeArme.size();
        System.out.println(listeArme); 
        
        Magicien Gandalf = new Magicien ("Gandalf", 65, true);
        Magicien Garcimore = new Magicien ("Garcimore", 44, false);
        Guerrier Conan = new Guerrier ("Conan", 78, false);
        Guerrier Lannister = new Guerrier ("Lannister", 45, true);
        
        ArrayList<Personnages> listePerso=new ArrayList<Personnages>();
        listePerso.add (Gandalf);
        listePerso.add (Garcimore);
        listePerso.add (Conan);
        listePerso.add (Lannister);
        listePerso.size();
        System.out.println(listePerso);
        
        for (int i=0; i<listePerso.size(); i++) {
            String a = listePerso.get(i).nivAttaque;
            System.out.println(a+","+b);
            if (listePerso.get(i).getClass() == Epee.class) {
                int x = 1;
                System.out.println (","+x);
            } if (listePerso.get(i).getClass() == Baton.class) {
                int y = 2; 
                System.out.println(","+y);
                
            }
        }
        
        Magicien Abracadabra = new Magicien ("Abracadabra", 25, false);
        Guerrier Hercule = new Guerrier ("Hercule", 88, true);
        Epee Hippolyte = new Epee("Hippolyte", 9, 4);
        Epee Mousquetaire = new Epee("Mousquetaire", 8,8);
        Epee Obelix = new Epee("Obelix",2,5);
        Baton Bois = new Baton("Bois", 4,16);
        Baton Fer = new Baton("Fer", 5,6);
        Baton Bambou = new Baton("Bambou", 3, 90);
        
        Hercule.ajoutArme(Mousquetaire);
        Hercule.ajoutArme(Obelix);
        Hercule.ajoutArme(Bambou);
       
    
        
        System.out.println(Hercule);
        Hercule.seFatiguer();
        System.out.println(Hercule);
        System.out.println("Hercule est vivant : "+ Hercule.estVivant());
        Hercule.Attaquer(Abracadabra);
        System.out.println(Hercule);
        System.out.println(Abracadabra);
        System.out.println("Abracadabra est vivant : "+ Abracadabra.estVivant());

        //Epee Excalibur = new Epee("Excalibur", 7, 5);
        //Epee Durandal = new Epee("Durandal", 4,7);
        //Baton Chene = new Baton("Chêne", 4,5);
        //Baton Charme = new Baton("Charme", 5,6);
        
        //Magicien Abracadabra = new Magicien("Abracadabra", 25, false);
        //Guerrier Hercule = new Guerrier("Hercule", 88, true);
        
        System.out.println(Hercule);
        System.out.println(Abracadabra);
        
        Hercule.ajoutArme(Durandal);
        Hercule.EquiperPerso(Durandal);
        Abracadabra.ajoutArme(Chêne );
        Abracadabra.EquiperPerso(Chêne);
        
        Hercule.Attaquer(Abracadabra);
        System.out.println(Hercule);
        System.out.println(Abracadabra);
        
        Abracadabra.Attaquer(Hercule);
        System.out.println(Hercule);
        System.out.println(Abracadabra);
        
        System.out.println("Hercule a survécu : "+ Hercule.estVivant());
        System.out.println("Abracadabra a survécu : "+ Abracadabra.estVivant());


     }
}
