/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Item.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahaye
 */
public class Characters {
    
    private String name ;
    int HP ;
    private Weapons Weapons ;
    private List <Items> Inventaire ;
    
    public Characters(String name , int hp )
    {
        this.name = name;
        this.HP = hp ;
        this.Weapons = null;
        this.Inventaire = new ArrayList<>() ;
    }
    public int damage_item(){
        return this.Weapons.get_damage_weapons();
    }
    public void Ajoute_Items(Items i){
        this.Inventaire.add(i);
    }
    public void Supprime_Items(Items i){
        Inventaire.remove(i);
    }
    
    public Items give_Item_From_Inventaire(Items i){
        if(i != null){
            int index = Inventaire.indexOf(i);
            if(index != -1)
                return Inventaire.get(index);
            else
                return null;
        }
        else
            return null;
    }
    
    public void equipe_Weapon(Weapons i){
            if(give_Item_From_Inventaire(i) != null){
                this.Weapons = i;
                System.out.println("Arme equiper");
            }
            else
                System.out.println("Impossible equiper arme");
        }
    
    public void choose_name(String nameChoose)
    {
        this.name = nameChoose ;
        
    }
    
    public void change_List(List <Items> l){
        this.Inventaire = l;
    }
 
    public void to_String_name()
    {
            System.out.println("Hello my name is : " + get_name_character() );
    }
    public void look_Inventaire(){
        System.out.println("Inventaire : ");
        for(Items itf : Inventaire){
            System.out.println(itf.name);
        }
    }
    
    public String get_name_character()
    {
        return this.name ;
    }
    
    public int get_HP_Characters()
    {
        return this.HP ;
    }
    
    public Weapons get_Weapons(){
        return this.Weapons;
    }
    
    public List <Items> get_List(){
        return this.Inventaire;
    }
    
    public void HP_Characters_Modif( int value)
    {
        this.HP = value ;
    }
    
    public void Eat( Food F )
    {
        this.HP += F.get_value_food() ;
    }
    
    public void Take_Damage( int damage){
        if(this.En_vie())
            this.HP -= damage ;
        
    }
    public boolean En_vie(){
        return this.HP > 0 ;
    }
    
}
