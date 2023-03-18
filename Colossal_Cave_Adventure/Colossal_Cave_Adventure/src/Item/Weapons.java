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
public abstract class Weapons extends Items{
    
    private int Damage;
    private int Durability;
    
    public Weapons(String name , int poid , int dmg , int dura){
        super(name,poid);
        this.Damage = dmg;
        this.Durability = dura ;
    }
    
    @Override
    public void use_items(Characters P){
        P.equipe_Weapon(this);
    }

    public void choose_name_weapons(String nameChoose)
    {
        super.name = nameChoose ;
        
    }
    public void decremente_Durability(int chiffre){
        this.Durability -= chiffre ;
    }
    
    public String get_name_weapons(){
         return super.name ;
    }
    public int get_damage_weapons()
    {
        return this.Damage ;
    }
    public int get_durability_weapons()
    {
        return this.Durability ;
    }
    
    public abstract int use_weapons();
    
}
