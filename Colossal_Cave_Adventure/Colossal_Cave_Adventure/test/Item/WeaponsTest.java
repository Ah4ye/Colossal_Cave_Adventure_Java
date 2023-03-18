/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Item;

import Personnage.Characters;
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
public class WeaponsTest {
    
    public WeaponsTest() {
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
     * Test of decremente_Durability method, of class Weapons.
     */
    @Test
    public void testDecremente_Durability() {
        System.out.println("decremente_Durability");
        int chiffre = 1;
        Weapons instance = new epee();
        instance.decremente_Durability(chiffre);
        int avant = instance.get_durability_weapons();
        instance.decremente_Durability(chiffre);
        int apres = instance.get_durability_weapons();
        
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(avant, apres +chiffre);
    }

    /**
     * Test of get_name_weapons method, of class Weapons.
     */
    @Test
    public void testGet_name_weapons() {
        System.out.println("get_name_weapons");
        Weapons instance = null;
        String expResult = "";
        String result = instance.get_name_weapons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_damage_weapons method, of class Weapons.
     */
    @Test
    public void testGet_damage_weapons() {
        System.out.println("get_damage_weapons");
        Weapons instance = null;
        int expResult = 0;
        int result = instance.get_damage_weapons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_durability_weapons method, of class Weapons.
     */
    @Test
    public void testGet_durability_weapons() {
        System.out.println("get_durability_weapons");
        Weapons instance = null;
        int expResult = 0;
        int result = instance.get_durability_weapons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of use_weapons method, of class Weapons.
     */
    @Test
    public void testUse_weapons() {
        System.out.println("use_weapons");
        Weapons instance = null;
        int expResult = 0;
        int result = instance.use_weapons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class WeaponsImpl extends Weapons {

        public WeaponsImpl() {
            super("", 0, 0, 0);
        }

        public int use_weapons() {
            return 0;
        }
    }
    
}
