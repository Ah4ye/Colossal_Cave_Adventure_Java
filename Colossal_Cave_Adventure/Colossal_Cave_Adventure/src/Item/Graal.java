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
public class Graal extends Weapons{

    public Graal(String name, int poid, int dmg, int dura) {
        super(name, poid, dmg, dura);
    }

    

    @Override
    public void use_items(Characters P) {
        System.out.println("LA PUISSANCE DU GRAAL");
        P.equipe_Weapon(this);
    }

    @Override
    public int use_weapons() {
        int a = 0 ;
        return a;
    }
    
}
