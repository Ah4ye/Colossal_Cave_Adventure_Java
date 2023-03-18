/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Room;

import Personnage.Hero;
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
public class MapTest {
    
    public MapTest() {
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
     * Test of get_Hero method, of class Map.
     */
    @Test
    public void testGet_Hero() {
        System.out.println("get_Hero");
        Map instance = null;
        Hero expResult = null;
        Hero result = instance.get_Hero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Here method, of class Map.
     */
    @Test
    public void testGet_Here() {
        System.out.println("get_Here");
        Map instance = null;
        Location expResult = null;
        Location result = instance.get_Here();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_List method, of class Map.
     */
    @Test
    public void testGet_List() {
        System.out.println("get_List");
        Map instance = null;
        List<Location> expResult = null;
        List<Location> result = instance.get_List();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of change_pos method, of class Map.
     */
    @Test
    public void testChange_pos() {
        System.out.println("change_pos");
        Location l = null;
        Map instance = null;
        instance.change_pos(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
