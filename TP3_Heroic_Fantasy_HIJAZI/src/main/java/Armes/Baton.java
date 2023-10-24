/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/*
 *
 * @author inesh
 */
public class Baton extends Arme {
    public int age;
    
    public Baton(String nom, int nivAttaque, int age) {
        super(nom,nivAttaque);
        if (age  < 100){   
        this.age = age;     
      } else {
        System.out.println("Erreur");
        this.age=0; 
       }
    }
    public int Age() {
        return age;
    }
    
}
