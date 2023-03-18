/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colossal_cave_adventure;

/**
 *
 * @author ahaye
 */
import Personnage.*;
import Room.Map;
import Room.Location;

import java.util.Scanner ;
public class Colossal_Cave_Adventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello i'm GOD, i'm here to be your guide in this world, what's your name ?");
        
        //Story party = new Story(1);
        boolean marche = true ;
        
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        
        Map world = new Map(text) ;
        Actions ordre = new Actions(world,text);
        Story hs = new Story(text);
        
        hs.Context();
        world.get_Here().to_String_location();
        hs.Debut();
        while(marche){
            System.out.println("Instruction :");

            ordre.getInstruction(sc);
            if(!(world.get_Hero().En_vie()))
                marche = false;
            if("GRAAL".equals(world.get_Hero().get_Weapons().name)){
                marche =false;
                System.out.println("FIN DU GAME BINE JOUE");
            }
                
        }
    }
    
}
