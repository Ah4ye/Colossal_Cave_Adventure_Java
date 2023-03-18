/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Room;

import Item.Graal;
import Personnage.Characters;
import Item.Items;
import Item.KeyChest;
import Item.KeyDoor;
import Item.Weapons;
import Personnage.*;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author ahaye
 */
public class Location{
    
    private List <Door> portes = new ArrayList<>() ;
    private List <Items> objet = new ArrayList<>() ;
    private String name ;
    private List <Characters> Perso = new ArrayList<>();
    
    
    public Location()
    {   
    }
    
    public void affiche_ALL(){
        System.out.println("ALL portes :");
        for(Door d : portes){
            System.out.println(d.get_name_door());
        }
        System.out.println("ALL objet :");
        for(Items i : objet){
            System.out.println(i.get_Name_Item());
        }
        System.out.println("ALL characters:");
        for(Characters c : Perso){
            System.out.println(c.get_name_character());
        }
    }
    public Location(String etape)
    {
        this.name = etape ;
        
    }
   public Door Get_Door(String txt){
       Door door = null;
       int taille = this.portes.size();
       for(int k=0 ; k < taille; k++){
           if( this.portes.get(k).get_name_door().equals(txt) ){
               door = this.portes.get(k);
           }
       }
       return door;
   }
   public Items Get_Items(String txt ){
       Items item = null;
       int taille = this.objet.size();
       for(int k=0 ; k < taille; k++){
           if( this.objet.get(k).name.equals(txt) ){
               item = this.objet.get(k);
           }
       }
       return item;
   }
    
    public void init_locations_Debut(Location milieu)
    {
            Door Chemin = new Door("Chemin",this,milieu) ;
            
            Chemin.open();
            this.portes.add(Chemin);
            
            Chest ch = new Chest();
            this.objet.add(ch);
            
          
            Blop monstre = new Blop(null);
            this.Perso.add(monstre);

    }
    
    public void init_locations_Milieu(Location debut,Location fin )
    {
            Door Chemin_debut = new Door("Chemin",this,debut) ;
            Door Chemin_fin = new Door("Fenetre",this,fin);
            Chemin_debut.open();
          
            this.portes.add(Chemin_debut);
            this.portes.add(Chemin_fin);
            
            Blop monstre = new Blop(null);
            
            ChestClose ch = new ChestClose();
            ch.closeChest();
            this.objet.add(ch);
            
            List <Items> l = new ArrayList<>();
            l.add(new KeyDoor(Chemin_fin));
            
            List <Items> keyChest = new ArrayList<>();
            keyChest.add(new KeyChest(ch));
            
            Blop surprise = new Blop(l);
            Blop surprise2 = new Blop(keyChest);
            
            this.Perso.add(monstre);
            this.Perso.add(surprise);
            this.Perso.add(surprise2);

    }
    public void init_locations_Fin(Location debut)
    {
            Door Chemin = new Door("Fenetre",this,debut) ;
            Chemin.open();
            this.portes.add(Chemin);
            
            List <Items> l = new ArrayList<>();
            l.add(new Graal("GRAAL",0,0,0));
            Blop surprise = new Blop(l);
            
            Blop monstre = new Blop(null);
            
            this.Perso.add(monstre);
            this.Perso.add(monstre);
            this.Perso.add(surprise);
            this.Perso.add(monstre);
            this.Perso.add(monstre);
    }
    
    public String Get_name(){
        return this.name;
    }
    
    public void to_String_location()
      {
              System.out.println("Welcome at the chapter : " + this.name);
      }
  

    public void to_String_characters_here()
        {
            System.out.println("Liste des Personnage present dans les environs");
            this.Perso.forEach(d ->d.to_String_name());
             System.out.println("");
            
        }
    public void to_String_Items_here(){
        System.out.println("Liste des items present dans les environs");
        for(int k = 0 ; k < this.objet.size() ; k++ ){
            System.out.println(" - "+this.objet.get(k).name);
        }
    }
    public void Ajoute_Characters(Characters champion)
        {
            this.Perso.add(champion) ;
            
        }
    public void Ajoute_Items(Items item)
        {
            this.objet.add(item);
            
        }
    public void Supprime_Items ( Items item)
    {
        this.objet.remove(item);
    }
    public void Supprime_Characters(Characters champion){
        this.Perso.remove(champion);
    }
    public Characters find_Arthur(){
        for(Characters c : this.Perso){
            if("Arthur".equals(c.get_name_character()))
                return c;
        }
        return null;
    }
    public List <Characters> Get_All_Charac(){
        return this.Perso;
    }
    public List <Items> Get_All_Items(){
        return this.objet;
    }
    public Chest Trouve_Tresor()
    {
       List <Items> Trouve = this.objet ;
       int taille = Trouve.size();
       for(int i = 0 ; i < taille ; i++)
       {
           if( "Chest".equals(Trouve.get(i).getClass().getSimpleName()))
           {
               
               Chest trouver = (Chest) Trouve.get(i);
               
               return trouver ;
           }
           else if ("ChestClose".equals(Trouve.get(i).getClass().getSimpleName())) 
           {
                ChestClose trouver = (ChestClose) Trouve.get(i);
               
               return trouver ;
           }
       }
       System.out.println("Pas de Coffre Trouver");
       return null ;
    }
    public void Ouvre_Tresor(Chest T)
    {
       T.get_Contenue().forEach(c ->this.objet.add(c));
       this.objet.remove(T);
    }
}

