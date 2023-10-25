/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_hijazi_version_console2;

/**
 *
 * @author inesh
 */
public class CelluleLumineuse {
    boolean etat; //true= allumée et false= eteinte
    
    public CelluleLumineuse(boolean etat) {
        this.etat= false;  
        }
        
    
public void activerCellule(){
            if (etat == true ){ 
                this.etat = false ;
        }   else {
                if (etat== false){
                    this.etat= true;    
                }    
        }
} 
public void eteindreCellule(){
    if (etat == true){
        etat = false; 
    }
}

    /**
     *
     */
public void estEteint(){
        if ( etat = true){
            this.etat = false;
    }   else {
            if (etat ==false) {
                this.etat = true; 
            }
        }
    }
public void getEtat(){
    if(etat==true){
        this.etat= true; 
    } else{
        if (etat == false){
            this.etat= false; 
        }
    }   
}

    @Override
    public String toString() {
        String X; 
        String O; 
        if (etat==true){
            return "X"; 
        } else{
            if (etat==false){
                return "O"; 
            }
        }
        return "CelluleLumineuse{" + "etat=" + etat + '}';
    }


}

    
    
    

