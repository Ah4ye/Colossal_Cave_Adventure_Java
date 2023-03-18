/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Room;

/**
 *
 * @author ahaye
 */
    import java.util.*;
public class Door {
    
    private Location gauche  ;
    private Location droite ;
    private String name;
    private boolean etat   ;


    public  Door(String Name,Location gauche,Location droite)
        {
            this.name = Name;
            this.etat = false ;
            this.droite = droite;
            this.gauche = gauche;
        }
    
        public String get_name_door(){
            return this.name;
        }
        
        public Location get_great_direction(Location here){
            if(here == gauche)
                return droite;
            else
                return gauche;
        }
        public void open()
        {
            this.etat = true ; 
        }

        public void close()
        {
            this.etat = false ; 
        }
        
        public boolean isopen()
        {
            if (this.etat == true)
                    {
                 return true ;
            }
               return false ;    
        }

        public boolean get_etat()
        {
            return this.etat ;
        }
        
        public static void printDoorList(List <? extends Door> doorList )
        {
           doorList.forEach(d -> d.to_String());
        }
        
        
        
        public void to_String()
        {
            System.out.println( getClass().getSimpleName()+ " Etat porte : "+ get_etat() + " " );
        }
}


