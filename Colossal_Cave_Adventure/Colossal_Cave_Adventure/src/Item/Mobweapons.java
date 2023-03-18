package Item;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abott
 */
public class Mobweapons extends Weapons{
    
    private final int DECREMENTE = 0 ;
    public Mobweapons(String name , int poids , int dmg , int durability) {
        super(name, poids ,dmg,durability);
    }

    @Override
    public int use_weapons(){
        this.decremente_Durability(DECREMENTE);
        return this.get_damage_weapons();
    }
}
