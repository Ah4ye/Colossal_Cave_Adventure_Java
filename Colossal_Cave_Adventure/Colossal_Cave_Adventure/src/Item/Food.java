/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Item;

import Personnage.Characters;

/**
 *
 * @author ahaye
 */
public class Food extends Items {
    
    private final int give_hp ;
    public final static String DEFAULT_NAME_FOOD = "FOOD" ;
    public final static int DEFAULT_POID_FOOD = 1 ;
    public final static int DEFAULT_GIVEHP_FOOD = 1 ;
    
    public Food(){
        super(DEFAULT_NAME_FOOD,DEFAULT_POID_FOOD);
        this.give_hp = DEFAULT_GIVEHP_FOOD ;
    }
    
    public Food(String name , int poid , int value){
     super(name,poid);
     this.give_hp = value ;
    }
    
   @Override
    public void use_items(Characters P )
    {
        System.out.println("valeur vie avant : "+ P.get_HP_Characters());
        P.Eat(this);
        System.out.println("valeur vie apres : "+ P.get_HP_Characters());
        
    }
    
    public int get_value_food()
    {
        return this.give_hp ;
    }
    
}
