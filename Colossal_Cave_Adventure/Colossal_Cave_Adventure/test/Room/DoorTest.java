/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Room;

import java.util.List;
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
public class DoorTest {
    
    public DoorTest() {
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
     * Test of get_name_door method, of class Door.
     */
    @Test
    public void testGet_name_door() {
        System.out.println("get_name_door");
        Door instance = null;
        String expResult = "";
        String result = instance.get_name_door();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_great_direction method, of class Door.
     */
    @Test
    public void testGet_great_direction() {
        System.out.println("get_great_direction");
        Location here = null;
        Door instance = null;
        Location expResult = null;
        Location result = instance.get_great_direction(here);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class Door.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        Door instance = null;
        instance.open();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class Door.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        Door instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isopen method, of class Door.
     */
    @Test
    public void testIsopen() {
        System.out.println("isopen");
        Door instance = null;
        boolean expResult = false;
        boolean result = instance.isopen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_etat method, of class Door.
     */
    @Test
    public void testGet_etat() {
        System.out.println("get_etat");
        Door instance = null;
        boolean expResult = false;
        boolean result = instance.get_etat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printDoorList method, of class Door.
     */
    @Test
    public void testPrintDoorList() {
        System.out.println("printDoorList");
        List<? extends Door> doorList = null;
        Door.printDoorList(doorList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to_String method, of class Door.
     */
    @Test
    public void testTo_String() {
        System.out.println("to_String");
        Door instance = null;
        instance.to_String();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
