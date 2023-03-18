/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Room;

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
public class ClosedDoorTest {
    
    public ClosedDoorTest() {
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
     * Test of lock_ClosedDoor method, of class ClosedDoor.
     */
    @Test
    public void testLock_ClosedDoor() {
        System.out.println("lock_ClosedDoor");
        ClosedDoor instance = null;
        instance.lock_ClosedDoor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unlock_ClosedDoor method, of class ClosedDoor.
     */
    @Test
    public void testUnlock_ClosedDoor() {
        System.out.println("unlock_ClosedDoor");
        ClosedDoor instance = null;
        instance.unlock_ClosedDoor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_islock method, of class ClosedDoor.
     */
    @Test
    public void testGet_islock() {
        System.out.println("get_islock");
        ClosedDoor instance = null;
        boolean expResult = false;
        boolean result = instance.get_islock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to_String method, of class ClosedDoor.
     */
    @Test
    public void testTo_String() {
        System.out.println("to_String");
        ClosedDoor instance = null;
        instance.to_String();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
