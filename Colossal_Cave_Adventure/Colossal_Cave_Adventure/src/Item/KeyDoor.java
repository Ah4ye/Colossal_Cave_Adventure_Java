/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Item;

import Personnage.Characters;
import Room.Door;

/**
 *
 * @author ahaye
 */
public class KeyDoor extends Items {

    private final Door porte ;
    public KeyDoor(Door portes)
    {
        super("Key",1);
        this.porte = portes;
    }
    
    
    @Override
    public void use_items(Characters P) {
       porte.open();
    }
    
}
