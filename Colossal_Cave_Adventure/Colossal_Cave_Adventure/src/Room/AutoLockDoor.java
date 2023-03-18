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
public class AutoLockDoor extends Door{
    
    private boolean is_locked; //0 : deverouillee
    
    public  AutoLockDoor(String s,Location entre,Location sortis) {
        super(s,entre,sortis);
        this.is_locked = true ;
        
    }

    
    
    public void lock(){
        if(this.get_etat() == false){
            this.is_locked = true;
        }
    }
    
    public void unlock(){
        if(this.get_etat() == false){
            this.is_locked = false;
        }
    }
    
    @Override
    public void open(){
        if(is_locked == false){
            super.open();
        }
    }
    
    @Override
    public void close(){
        if(is_locked == true){
            super.close();
            this.lock();
        }
    }
    
    
    public boolean get_is_locked(){
        return this.is_locked;
    }
    
        @Override
    public void to_String()
    {
        System.out.println( getClass().getSimpleName()+ " Etat porte : "+ get_etat() + " ,"+ " Fermer à code  : " + get_is_locked() );
    }

}
