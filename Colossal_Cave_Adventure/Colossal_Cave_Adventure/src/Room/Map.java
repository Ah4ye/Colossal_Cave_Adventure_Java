/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Room;

import Personnage.*;
import Item.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ahaye
 */
public class Map {
    
    private List <Location> intance_game = new ArrayList<>() ;
    private Location Pos_Hero;
    private Hero me;
    
    public Map(String hero) {
        NPC Arthur = new Arthur();

        Location l1 = new Location("Debut");
        Location l2 = new Location("Milieu");
        Location l3 = new Location("Fin");
        
        l1.init_locations_Debut(l2);  // l1 relier a l2
        l2.init_locations_Milieu(l1,l3);  // l2 relier a l1 et l3
        l3.init_locations_Fin(l2);   // l3 relier a l2

        l1.Ajoute_Characters(Arthur);
        this.intance_game.add(l1);
        this.intance_game.add(l2);
        this.intance_game.add(l3);
        
        this.Pos_Hero = l1 ;
        this.me = new Hero(hero);
        
    }
    public Hero get_Hero(){
        return this.me ;
    }
    public Location get_Here(){
        return this.Pos_Hero;
    }
    public List <Location> get_List(){
        return this.intance_game;
    }
    public void change_pos(Location l){
        Characters arthur = this.get_Here().find_Arthur();
        l.Ajoute_Characters(arthur);
        this.get_Here().Supprime_Characters(arthur);
        this.Pos_Hero = l ;
        
    }
}
