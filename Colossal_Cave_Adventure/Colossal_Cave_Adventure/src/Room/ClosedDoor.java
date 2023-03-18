/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Room;

import Room.Door;

/**
 *
 * @author ahaye
 */

public class ClosedDoor extends Door {
    
    
    private boolean closed ; 
    
    public ClosedDoor(String s,Location entre,Location sortis)
    {
        super(s,entre,sortis);
        this.closed = true ; 
    }
    
    
    public void lock_ClosedDoor(){
        if(this.get_etat() == false){
            this.closed= true;
        }
    }
    
    public void unlock_ClosedDoor(){
        if(this.get_etat() == false){
            this.closed = false;
        }
    }
    
    public boolean get_islock()
    {
        return this.closed ;
    }
    
    @Override
    public void to_String()
    {
        System.out.println( getClass().getSimpleName()+ " Etat porte : "+ get_etat() + ", A clé  : " + get_islock() );
    }
    
    
}
