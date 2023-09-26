/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_hijazi;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class TP1_manipNombresInt_HIJAZI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ent1;
        int ent2; 
        System.out.println(" Saisir 2 entiers");
        ent1= sc.nextInt();
        ent2= sc.nextInt();
        int somme = ent1 + ent2;
        System.out.println("Leur somme est "+ somme);
        int diff = ent1 - ent2;
        System.out.println("Leur difference est " +diff);
        int prod = ent1 * ent2;
        System.out.println("Leur produit est " +prod);
        int qu = ent1 / ent2;
        System.out.println("La partie entiere de leur quotient est "+ qu);
        int reste = ent1 % ent2;
        System.out.println("Le reste de la division euclidienne est "+ reste);
       
                
       
    }
    
}
