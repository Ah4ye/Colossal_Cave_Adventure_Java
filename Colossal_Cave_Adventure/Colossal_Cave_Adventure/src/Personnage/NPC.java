/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author ahaye
 */
public class NPC extends Characters {

    public static final int DEFAULT_HP_HERO = 20 ;
    public NPC(String name, int hp) {
        super(name, hp);
    }
    

    public String get_name_NPC()
    {
        return super.get_name_character();
    }

    @Override
    public void to_String_name()
    {
        if( "Arthur".equals(super.get_name_character()))
        {
            System.out.println("Your faithful companion : " + get_name_NPC() );
        }
        else System.out.println("NPC : " + get_name_NPC() );
    }
}
