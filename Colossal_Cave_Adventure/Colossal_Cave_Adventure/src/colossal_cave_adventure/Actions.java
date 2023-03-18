/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colossal_cave_adventure;

import Item.*;
import Personnage.*;
import Room.*;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author ahaye
 */

public class Actions extends Story{
    
    private final Map map_action ;
    public Actions(Map m,String s){
        super(s);
        this.map_action = m ;
        
    }
    public void getInstruction( Scanner input ){
        String message = input.next();
        String arg ;
        if(null == message){
            System.out.println("error get instruction");
        }
        else switch (message) {
            case "GO":
                message = input.next();
                Go_Location(message);
                System.out.println(map_action.get_Here().Get_name());
                this.raconte(map_action.get_Here().Get_name());
               
                break;
            case "LOOK":
                message = input.next();
                
                if("ALL".equals(message) ){
                    Look_all();
                }
                else if("INVENTAIRE".equals(message) ){
                    this.map_action.get_Hero().to_String_Inventory();
                }
                else if ("ARME".equals(message) ){
                   System.out.println("Arme Equiper : " +this.map_action.get_Hero().get_Weapons().get_name_weapons()); 
                }
                else{
                    System.out.println("Objet Introuvable");

                    //look( message);
                }   break;
                
            case "TAKE":
                message = input.next();
                Take(message);
                break;
            case "COMBAT":
                message = input.next();
                combat(message);
            case "QUIT":
                this.map_action.get_Hero().Take_Damage(-1000000);
                break;
            case "USE":
                if((this.map_action.get_Here() != null) || (this.map_action.get_Hero().get_List() != null)){
                    message = input.next();
                    if ( "Coffre".equals(message)  )
                    {
                       
                       if ( (this.map_action.get_Here().Trouve_Tresor().isopenChest()))
                       {
                           System.out.println("Coffre ouvert"); 
                           Use_coffre(this.map_action.get_Here()); 
                       }
                       else
                       {
                           System.out.println("Coffre fermer");
                       }
                    }
                    else{
                        List <Items> inv = this.map_action.get_Hero().get_List();
                        Use_Items(inv , message, this.map_action.get_Hero());
                        if ( message == "Key" || message == "KeyChest" )
                        {
                            System.out.println("La Key doit être TAKE dans votre Inventaire pour être utiliser");
                        }
                    }
                }
                break;
            case "HELP" : 
                Help();
            default:
                System.out.println("error get instruction");
                break;
        }
    }
            
    public void Look_all(){
        this.map_action.get_Here().to_String_characters_here();
        this.map_action.get_Here().to_String_Items_here();
    }
       
    public void Take(String name){
        Items item = this.map_action.get_Here().Get_Items(name);
        if( item != null ){
            this.map_action.get_Hero(). Ajoute_Items(item);
            this.map_action.get_Here().Supprime_Items(item);
        }
        else{
            System.out.println("Objet Introuvable");
        }
    }
    
    public void Go_Location( String loc ){
        Door d = this.map_action.get_Here().Get_Door(loc);

        if( d != null && d.isopen()){
            this.map_action.change_pos(d.get_great_direction(this.map_action.get_Here()));
            this.map_action.get_Here().to_String_location();
            
        }
        else if ( !d.isopen())
        {
            System.out.println("Il Semblerait Que le Passage soit bloquer");
        }
        else         
            System.out.println("GO LOCATION  EROR ");

    }
    public void Help(){
        System.out.println("vailaible commands :");
        System.out.println("GO 'location' select possible location  ");
        System.out.println("LOOK  'arguments'  for loooking arguments ");
        System.out.println("LOOK  empty  for display of all arguments that can be observed ");
        System.out.println("TAKE 'argument' add if possible the argument to the hero's items");
        System.out.println("QUIT for leaving the game");
        System.out.println("USE 'arg1' '[arg2]'  use arg1 with or not arg2");
        System.out.println("COMBAT 'enemie' select possible enemie  ");
        
    }
    
    public void combat(String mes){
        List <Characters> l_c = this.map_action.get_Here().Get_All_Charac();
        for(Characters c : l_c){
            if(c.get_name_character().equals(mes)){
                combat_bis(c,this.map_action.get_Hero(),(Arthur)this.map_action.get_Here().find_Arthur());
                break;
            }
        }
    }
    public void combat_bis(Characters ennemie , Hero me , Arthur Arthur){
        while(ennemie.En_vie() && me.En_vie()){
            System.out.println(Arthur.get_name_character() + " PV : " + Arthur.get_HP_Characters());
            System.out.println(me.get_name_character() + " PV : " + me.get_HP_Characters());
            System.out.println(ennemie.get_name_character() + " PV : " + ennemie.get_HP_Characters());
            
            ennemie.HP_Characters_Modif(ennemie.get_HP_Characters() - me.get_Weapons().use_weapons());
            ennemie.HP_Characters_Modif(ennemie.get_HP_Characters() - Arthur.get_Weapons().use_weapons());
            if(ennemie.En_vie()){
               me.HP_Characters_Modif(me.get_HP_Characters() - ennemie.get_Weapons().use_weapons()); 
               Arthur.HP_Characters_Modif(Arthur.get_HP_Characters() - (ennemie.get_Weapons().use_weapons()/2 ) );
            }
            
            System.out.println(Arthur.get_name_character() + " inflige " + Arthur.get_Weapons().get_damage_weapons());
            System.out.println(me.get_name_character() + " vous venez d'infligez " + me.get_Weapons().get_damage_weapons());
            System.out.println(ennemie.get_name_character() + " viens de vous infligez " + ennemie.damage_item());
        }
        if(me.En_vie()){
            System.out.println("Bien joué vous vous etes bien battue");
            if(ennemie.get_List() != null && ennemie.get_List().size() > 0 ){
                System.out.println("Quelque chose est tomber");
                for(Items i : ennemie.get_List()){
                    this.map_action.get_Here().Ajoute_Items(i);
                }
            }
            else
                System.out.println("Rien est tomber"); 

                this.map_action.get_Here().Get_All_Charac().remove(ennemie);
        }
            
        
    }
    
    public void Use_Items( List <Items> v, String message , Characters Hero)
    {
        
        for (Items itf : v){
            if(itf.get_Name_Item().equals(message))
            {
                 itf.use_items(Hero) ;
                 System.out.println("Vous Venez d'utilisez l'objet"+ message);
            }
        }
    }
    
    public void Use_coffre(Location l)
    {
          Chest ouvre = l.Trouve_Tresor();
          l.Ouvre_Tresor(ouvre);  
    } 
}
    
