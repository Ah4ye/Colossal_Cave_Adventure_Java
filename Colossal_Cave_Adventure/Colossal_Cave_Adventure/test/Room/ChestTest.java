/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Room;

import Item.Items;
import Personnage.Characters;
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
public class ChestTest {
    
    public ChestTest() {
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
     * Test of randInt method, of class Chest.
     */
    @Test
    public void testRandInt() {
        System.out.println("randInt");
        int min = 0;
        int max = 0;
        int expResult = 0;
        int result = Chest.randInt(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of use_items method, of class Chest.
     */
    @Test
    public void testUse_items() {
        System.out.println("use_items");
        Characters P = null;
        Chest instance = new Chest();
        instance.use_items(P);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StringContenueChest method, of class Chest.
     */
    @Test
    public void testStringContenueChest() {
        System.out.println("StringContenueChest");
        Chest instance = new Chest();
        instance.StringContenueChest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Contenue method, of class Chest.
     */
    @Test
    public void testGet_Contenue() {
        System.out.println("get_Contenue");
        Chest instance = new Chest();
        List<Items> expResult = null;
        List<Items> result = instance.get_Contenue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openChest method, of class Chest.
     */
    @Test
    public void testOpenChest() {
        System.out.println("openChest");
        Chest instance = new Chest();
        instance.openChest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isopenChest method, of class Chest.
     */
    @Test
    public void testIsopenChest() {
        System.out.println("isopenChest");
        Chest instance = new Chest();
        boolean expResult = false;
        boolean result = instance.isopenChest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeChest method, of class Chest.
     */
    @Test
    public void testCloseChest() {
        System.out.println("closeChest");
        Chest instance = new Chest();
        instance.closeChest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
