/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Personnage;

import Item.Weapons;
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
public class HeroTest {
    
    public HeroTest() {
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
     * Test of get_name_Hero method, of class Hero.
     */
    @Test
    public void testGet_name_Hero() {
        System.out.println("get_name_Hero");
        Hero instance = null;
        String expResult = "";
        String result = instance.get_name_Hero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Weapons method, of class Hero.
     */
    @Test
    public void testGet_Weapons() {
        System.out.println("get_Weapons");
        Hero instance = null;
        Weapons expResult = null;
        Weapons result = instance.get_Weapons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to_String_name method, of class Hero.
     */
    @Test
    public void testTo_String_name() {
        System.out.println("to_String_name");
        Hero instance = null;
        instance.to_String_name();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to_String_Inventory method, of class Hero.
     */
    @Test
    public void testTo_String_Inventory() {
        System.out.println("to_String_Inventory");
        Hero instance = null;
        instance.to_String_Inventory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
