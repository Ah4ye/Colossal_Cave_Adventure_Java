/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Room;

/**
 *
 * @author ahaye
 */
public class SecretCodeDoor extends AutoLockDoor {
    
    private final int secretCode = 86 ;
    
    public SecretCodeDoor( int code , String s , Location entre , Location sortis )
    {
        super(s,entre,sortis);
        if ( code == this.secretCode )
        {
            super.unlock();
            super.open();
        }
        else
        {
            super.close();
            super.lock();
            
        }
    }

    

}
