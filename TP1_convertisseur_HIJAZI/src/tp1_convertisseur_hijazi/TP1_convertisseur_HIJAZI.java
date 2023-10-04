/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_hijazi;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class TP1_convertisseur_HIJAZI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println(" Saisir un reel");
        r = sc.nextDouble(); //valeur en degre celsius
        //double k = r + 273.15;
       // System.out.println(" La valeur en Kelvin est "+ k );
        System.out.println("""
                           Saisissez la conversion que vous souhaiter effectuer :
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius
                           3) De Celsius vers Farenheit
                           4) De Kelvin vers Farenheit
                           6) De Farenheit vers Kelvin """);
        int x;
        x = sc.nextInt();
        if (x ==1){
            System.out.println("La valeur en Kelvin est " + CelciusVersKelvin(r) );  
        }
        if (x ==2){
            System.out.println("La valeur en Celsius est " + KelvinVersCelsius(r) );  
        }
        if (x ==3){
            System.out.println("La valeur en Farenheit est " + CelciusVersFarenheit(r) );  
        }
        if (x ==4){
            System.out.println("La valeur en Farenheit est " + KelvinVersFarenheit(r) );  
        }
        if (x ==5){
            System.out.println("La valeur en Kelvin est " + FarenheitVersKelvin(r) );  
        }
    }
    public static double CelciusVersKelvin (double r) {
        double tKelvin = r +273.15;
        return tKelvin;
    }
    public static double KelvinVersCelsius (double r) {
        double tCelsius = r -273.15;
        return tCelsius;
    }
    public static double CelciusVersFarenheit (double k) {
        double tFar = (k -32)/1.8;
        return tFar;
    }
    public static double KelvinVersFarenheit (double r) {
        double tFark = (r -273.15)*(9.0/5)+32;
        return tFark;
    }
    public static double FarenheitVersKelvin (double r) {
        double tfk = (r-32)*(5.0/9)+273.15;
        return tfk; 
    }       
}
