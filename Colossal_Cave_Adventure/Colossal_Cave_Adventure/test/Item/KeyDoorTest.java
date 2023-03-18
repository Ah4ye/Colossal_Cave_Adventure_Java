/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Item;

import Personnage.Characters;
import Room.Door;
import Room.Location;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahaye
 */
public class KeyDoorTest {
    
    public KeyDoorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of use_items method, of class KeyDoor.
     */
    @Test
    public void testUse_items() {
        System.out.println("use_items");
        Characters P = null;
        Location l = new Location();
        Door porte = new Door("porte",l ,l) ;
        porte.close();
        assertFalse(porte.isopen());
        KeyDoor instance = new KeyDoor(porte);
       
        instance.use_items(P);
        assertTrue(porte.isopen());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
