/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Item.*;

/**
 *
 * @author abott
 */
public class Arthur extends NPC{
    
    private final static String DEFAULT_NAME_ARTHUR = "Arthur";
    private final static int DEFAULT_HP_ARTHUR = 100  ;
    
    public Arthur() {
        super(DEFAULT_NAME_ARTHUR, DEFAULT_HP_ARTHUR);
        Weapons w = new Excaliburn();
        this.Ajoute_Items(w);
        this.equipe_Weapon(w) ;
    }
 
    
}
