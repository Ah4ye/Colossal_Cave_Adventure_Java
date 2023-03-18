package Item;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abott
 */
public class epee extends Weapons{

    public final static String DEFAULT_NAME = "Epee";
    public final static int DEFAULT_POIDS = 5;
    public final static int DEFAULT_DAMAGE = 10;
    public final static int DEFAULT_DURABILITY = 20;

    private final int DECREMENTE = 1 ;
    public epee() {
        super(DEFAULT_NAME, DEFAULT_POIDS, DEFAULT_DAMAGE, DEFAULT_DURABILITY);
    }

    @Override
    public int use_weapons(){
        if(super.get_durability_weapons() > 0){
            this.decremente_Durability(DECREMENTE);
            return this.get_damage_weapons();
        }
        else return 1;
    }
}
