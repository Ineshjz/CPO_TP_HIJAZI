/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_hijazi;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class TP1_guessMyNumber_HIJAZI {

    /**
     * @param args the command line arguments  
     */
    public static void main(String[] args) {
         int generateurAleat = random.nextInt(101);
         System.out.print("Saisissez un nombre entre 0 et 100 : ");
        int x = scanner.nextInt();
        
        if (x < generateurAleat) {{
                System.out.println("Trop petit !");
            } 
            else if (x > generateurAleat) {
                System.out.println("Trop grand !");
            } 
            else   {
                System.out.println("Bravo, les 2 nombres sont égaux !");
                    break;
            }
        }
        
        while (x != generateurAleat) {
            System.out.println("Le nombre ne correspond pas. Réessayer!");
        }
        
       
    }
    
}
}    
