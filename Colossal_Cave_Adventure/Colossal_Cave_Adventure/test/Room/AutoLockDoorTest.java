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
public class AutoLockDoorTest {
    
    public AutoLockDoorTest() {
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
     * Test of lock method, of class AutoLockDoor.
     */
    @Test
    public void testLock() {
        System.out.println("lock");
        AutoLockDoor instance = null;
        instance.lock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unlock method, of class AutoLockDoor.
     */
    @Test
    public void testUnlock() {
        System.out.println("unlock");
        AutoLockDoor instance = null;
        instance.unlock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class AutoLockDoor.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        AutoLockDoor instance = null;
        instance.open();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class AutoLockDoor.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        AutoLockDoor instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_is_locked method, of class AutoLockDoor.
     */
    @Test
    public void testGet_is_locked() {
        System.out.println("get_is_locked");
        AutoLockDoor instance = null;
        boolean expResult = false;
        boolean result = instance.get_is_locked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to_String method, of class AutoLockDoor.
     */
    @Test
    public void testTo_String() {
        System.out.println("to_String");
        AutoLockDoor instance = null;
        instance.to_String();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
