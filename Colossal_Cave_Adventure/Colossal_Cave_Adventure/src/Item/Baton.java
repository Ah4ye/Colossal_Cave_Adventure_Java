package Item;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abott
 */
public class Baton extends Weapons{
    public final static String DEFAULT_NAME = "Baton";
    public final static int DEFAULT_POIDS = 2;
    public final static int DEFAULT_DAMAGE = 5;
    public final static int DEFAULT_DURABILITY = 12;

    private final int DECREMENTE = 3 ;
    public Baton() {
        super(DEFAULT_NAME, DEFAULT_POIDS, DEFAULT_DAMAGE, DEFAULT_DURABILITY);
    }

    @Override
    public int use_weapons(){
        this.decremente_Durability(DECREMENTE);
        return this.get_damage_weapons();
    }
    
    
}
