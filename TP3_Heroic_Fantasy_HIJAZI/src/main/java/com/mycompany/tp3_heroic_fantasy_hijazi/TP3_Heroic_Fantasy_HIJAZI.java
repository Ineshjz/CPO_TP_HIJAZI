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
        listeArme.elementAt();
        listeArme.size();
        System.out.println(listeArme); 
        
        Magicien Gandalf = new Magicien ("Gandalf", 65, True);
        Magicien Garcimore = new Magicien ("Garcimore", 44, False);
        Guerrier Conan = new Guerrier ("Conan", 78, False);
        Guerrier Lannister = new Guerrier ("Lannister", 45, True);
        
        ArrayList<Personnages> listePerso=new ArrayList<Personnages>();
        listePerso.add (Gandalf);
        listePerso.add (Garcimore);
        listePerso.add (Conan);
        listePerso.add (Lannister);
        listePerso.elementAt();
        listePerso.size();
        System.out.println(listePerso); 
        
        ArrayList<Armes> listeAttribution=new ArrayList<Personnages>();

        


     }
}
