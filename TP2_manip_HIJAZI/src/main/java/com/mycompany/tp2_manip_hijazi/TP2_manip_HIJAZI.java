/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_manip_hijazi;

/**
 *
 * @author inesh
 */
public class TP2_manip_HIJAZI {

    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ; // une reference objet
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        // 3 ref objet ont été créées.
        Tartiflette a1 = assiette1;
        assiette1 = assiette2; 
        assiette2 = a1; 
        
        System.out.println("nb de calories de Assiette 1 : " +
        assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        
        ///Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
    Moussaka[] m = new Moussaka[10];
       // Tableau de 10 ref de moussaka 
        for (int i = 0; i < m.length; i++) { // boucle if pour repetition 10 fois
            m[i] = new Moussaka((i+1)*100);
        
    }
    }
}
