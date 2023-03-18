/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Item.*;

import java.util.List;

/**
 *
 * @author abott
 */
public class Blop extends NPC{
    
    private final static String DEFAULT_NAME_BLOP = "blop";
    private final static int DEFAULT_HP_BLOP = 20 ;
    
    public Blop(List <Items> l) {
        super(DEFAULT_NAME_BLOP, DEFAULT_HP_BLOP);
        if(l != null)
            this.change_List(l);
        Weapons w1 = new Mobweapons("blop_weapons",1,5,1);
        this.Ajoute_Items(w1);
        this.equipe_Weapon(w1);
        this.Supprime_Items(w1);
    }
    
    
}
