/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Item;

import Personnage.Characters;
import Room.ChestClose;
import Room.Door;

/**
 *
 * @author ahaye
 */
public class KeyChest extends Items {
    

    private final ChestClose coffre ;
    public KeyChest(ChestClose coffre)
    {
        super("KeyChest",1);
        this.coffre = coffre;
    }
    
    

    @Override
    public void use_items(Characters P) {
       this.coffre.openChest();
    }
    
}
