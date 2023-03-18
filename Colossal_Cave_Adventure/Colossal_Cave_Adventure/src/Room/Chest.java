/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Room;

import Item.Items;
import Item.Items;
import Personnage.Characters;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ahaye
 */

public class Chest extends Items {
    

    private List <Items> Contenue = new ArrayList<>() ;
    private Boolean etat ;
    
    public static int randInt(int min, int max) {
        
    
    Random rand = new Random();;
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
    }
    
    @Override
    public void use_items(Characters P)
    {
      if ( this.etat == true)
      {
          System.out.println("Le Contenue du coffre est Placer dans l'Inventaire du Hero");
          this.Contenue.forEach(c ->P.Ajoute_Items(c));
      }
      else if ( this.etat == false)
      {
          System.out.println("Le Contenue du coffre est inaccesible car il faut une KEY"); 
          
      }
        
    }
    public Chest()
    {
        super("Coffre", 0);
        int Nombre = randInt(1,10);
        this.etat = true ;
        for( int i = 1 ; i < Nombre ; i++)
        {
            Items I = Decouvre();
            this.Contenue.add(I);
        }   
    }

    public void StringContenueChest()
    {
        int taille = this.Contenue.size() ;
        for( int i = 0 ; i < taille ; i++)
        {
            this.Contenue.get(i).StringItems();
        }
    }
    public List <Items> get_Contenue()
    {
        return this.Contenue ;
    }
    
        public void openChest()
    {
            this.etat = true ; 
    }
    
    public boolean isopenChest()
    {
            if (this.etat == true)
                    {
                 return true ;
            }
               return false ;    
    } 
    
    public void closeChest()
    {
        this.etat = false ; 
    }

}
