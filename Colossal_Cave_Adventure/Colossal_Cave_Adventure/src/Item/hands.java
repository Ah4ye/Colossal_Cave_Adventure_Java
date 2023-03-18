package Item;

import Personnage.Characters;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abott
 */
public class hands extends Weapons{
    private final static String DEFAULT_NAME = "hands";
    private final static  int DEFAULT_POIDS = 0 ;
    private final static int DEFAULT_DAMAGE = 1  ;
    private final static int DEFAULT_DURABILITY = 1;
    
    private final int DECREMENTE = 0 ;
    public hands() {
        super(DEFAULT_NAME, DEFAULT_POIDS,DEFAULT_DAMAGE,DEFAULT_DURABILITY);
    }

    @Override
    public int use_weapons(){
        this.decremente_Durability(DECREMENTE);
        return this.get_damage_weapons();
    }
    
}
