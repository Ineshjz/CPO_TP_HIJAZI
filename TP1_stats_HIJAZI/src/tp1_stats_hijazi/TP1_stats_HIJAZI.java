/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_hijazi;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class TP1_stats_HIJAZI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Tab = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier x: ");
        int x = scanner.nextInt();
        
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            int resultatLancer = random.nextInt(6);
            Tab[resultatLancer]++;
        }
        System.out.println("Rzsultat du lancer de des: ");
        for (int i = 0; i < Tab.length; i++) {
            double pourcentage = (double) Tab[i] / x * 100.0;
            System.out.println("Face " + (i + 1) + " : " + pourcentage + "%");
        }
    }
    
}
