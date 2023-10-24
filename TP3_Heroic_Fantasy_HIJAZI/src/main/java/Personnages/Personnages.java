package Personnages;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author inesh
 */
public abstract class Personnages {
    String nom; 
    int nivDeVie;
    Arme Arme_en_main =null;
    public static int nbpersos;
    
    public Personnages (String nom, int nivDeVie) {
        this.nom = nom;
        this.nivDeVie= nivDeVie;
        nbpersos++;
    }
    public String lireNomPerso() {
        return nom; 
    } 
    
    public int lireNiveauDeVie() {
        return nivDeVie;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nom: " + nom + "Niveau de vie: " + nivDeVie + "Arme en main: "+ Arme_en_main ;  
    }
    ArrayList<Arme> ListeArmesPerso = new ArrayList <>();
    public void ajoutArme (Arme arme){
        if(ListeArmesPerso.size()<5){
           ListeArmesPerso.add(arme);
        }
    }
    public Arme Lire_Arme_en_main(){
        return Arme_en_main;
    }
    
    public String EquiperPerso(Arme arme){
        if (ListeArmesPerso.contains(arme)) {
            int i=0;
            while (arme!= ListeArmesPerso.get(i)){
                i++;
            }
            Arme_en_main=ListeArmesPerso.get(i);
        
            return this.nom +" est equipé de: "+ Arme_en_main;
        } else {
            return "Erreur, cet arme n'est pas disponible";
        }
    }
    public String NbArmes(){
        int nb=0;
        if (this instanceof Magicien){
            for (int k = 0; k< ListeArmesPerso.size(); k++ ){
                if (ListeArmesPerso.get(k) instanceof Baton){
                        nb++;
                    }
            }
        } if (this instanceof Guerrier) {
            for (int g = 0; g <ListeArmesPerso.size(); g++ ){
                if (ListeArmesPerso.get(g) instanceof Epee){
                    nb++;   
                }
            }
        }
        return this.nom + " a "+nb;
    }
    
    public void finalize(){
        nbpersos--;
    }
    
    public void seFatiguer(){
        nivDeVie = nivDeVie-10;
    }
    
    public boolean estVivant(){
        if (nivDeVie<0){
            return false;
        } else {
            return true;
        }
    }
    
    public void estAttaqué(int nbpts){
        nivDeVie=nivDeVie-nbpts;
    }
    
    public void Attaquer(Personnages perso){
        if (this instanceof Magicien){
            if (this.Arme_en_main instanceof Baton baton){
                if (((Guerrier)perso).aCheval == true){
                    perso.estAttaqué(Arme_en_main.nivAttaque * baton.age /2);
                } else {
                    perso.estAttaqué(Arme_en_main.nivAttaque * baton.age);
                }
            }
        } if (this instanceof Guerrier){
            if (this.Arme_en_main instanceof Epee epee){
                if (((Magicien)perso).Confirmé() == true){
                    perso.estAttaqué(Arme_en_main.nivAttaque * epee.finesse /2);
                } else {
                    perso.estAttaqué(Arme_en_main.nivAttaque * epee.finesse);
                }
            }
        }
        this.seFatiguer();
    }
    
}

    

