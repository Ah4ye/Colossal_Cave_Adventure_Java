/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Item.*;

/**
 *
 * @author ahaye
 */
 

public class Hero extends Characters {
    
        public static final int DEFAULT_HP_HERO = 100 ;

        public Hero( String nameChoose){
            super(nameChoose, DEFAULT_HP_HERO);
            Weapons w = new hands();
            this.Ajoute_Items(w);
            this.equipe_Weapon(w);
            this.Supprime_Items(w);
        }
    
        public String get_name_Hero()
        {
            return super.get_name_character();
        }
        @Override
        public Weapons get_Weapons(){
            return super.get_Weapons();
        }
        @Override
        public void to_String_name()
        {
            System.out.println("Hero : " + get_name_Hero() );
        }
        public void to_String_Inventory()
        {
             System.out.println("INVENTAIRE HERO : " );
             if( this.get_List() != null )
             {
                 
                 this.get_List().forEach(i -> i.StringItems()); 
             }
             else {System.out.println("Votre inventaire est vide pauvre Hero " );
             }
        }
}
