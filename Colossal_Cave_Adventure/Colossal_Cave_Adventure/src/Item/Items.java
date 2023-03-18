/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Item;

import Personnage.*;
import static Room.Chest.randInt;
/**
 *
 * @author ahaye
 */
public abstract class Items {
    
    private final int poids ;
    public String name; 
    
    public Items(String s,int p){
        this.name = s ;
        this.poids = p ;
    }
    public int get_poids_Item(){
        return this.poids;
    }
    public String get_Name_Item(){
        return this.name;
    }
    
    public abstract void use_items(Characters P);
    
    public Items Decouvre()
    {
        int alea = randInt(1,2);
        if ( alea == 1)
        {
            //Weapons w1 ;
            //return w1 ;
            epee e1 = new epee();
            return e1 ;
        }
        else
        {
            Food f1 = new Food("Banane",1,1);
            return f1 ;
        }
    }
    public void StringItems()
    {
        System.out.println( "Items : " + this.name );
    }
}
