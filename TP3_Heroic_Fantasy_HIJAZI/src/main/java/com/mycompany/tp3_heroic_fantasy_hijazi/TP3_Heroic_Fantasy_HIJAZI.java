/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp3_heroic_fantasy_hijazi;

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
        listeArme.add ("Excalibur");
        listeArme.add ("Durandal");
        listeArme.add ("Chêne");
        listeArme.add ("Charme");
        listeArme.size();
        System.out.println(listeArme); 
     }
}
