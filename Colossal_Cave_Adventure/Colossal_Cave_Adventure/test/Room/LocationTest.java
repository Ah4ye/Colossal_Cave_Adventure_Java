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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of affiche_ALL method, of class Location.
     */
    @Test
    public void testAffiche_ALL() {
        System.out.println("affiche_ALL");
        Location instance = new Location();
        instance.affiche_ALL();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Get_Door method, of class Location.
     */
    @Test
    public void testGet_Door() {
        System.out.println("Get_Door");
        String txt = "";
        Location instance = new Location();
        Door expResult = null;
        Door result = instance.Get_Door(txt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Get_Items method, of class Location.
     */
    @Test
    public void testGet_Items() {
        System.out.println("Get_Items");
        String txt = "";
        Location instance = new Location();
        Items expResult = null;
        Items result = instance.Get_Items(txt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init_locations_Debut method, of class Location.
     */
    @Test
    public void testInit_locations_Debut() {
        System.out.println("init_locations_Debut");
        Location milieu = null;
        Location instance = new Location();
        instance.init_locations_Debut(milieu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init_locations_Milieu method, of class Location.
     */
    @Test
    public void testInit_locations_Milieu() {
        System.out.println("init_locations_Milieu");
        Location debut = null;
        Location fin = null;
        Location instance = new Location();
        instance.init_locations_Milieu(debut, fin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init_locations_Fin method, of class Location.
     */
    @Test
    public void testInit_locations_Fin() {
        System.out.println("init_locations_Fin");
        Location debut = null;
        Location instance = new Location();
        instance.init_locations_Fin(debut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Get_name method, of class Location.
     */
    @Test
    public void testGet_name() {
        System.out.println("Get_name");
        Location instance = new Location();
        String expResult = "";
        String result = instance.Get_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to_String_location method, of class Location.
     */
    @Test
    public void testTo_String_location() {
        System.out.println("to_String_location");
        Location instance = new Location();
        instance.to_String_location();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to_String_characters_here method, of class Location.
     */
    @Test
    public void testTo_String_characters_here() {
        System.out.println("to_String_characters_here");
        Location instance = new Location();
        instance.to_String_characters_here();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to_String_Items_here method, of class Location.
     */
    @Test
    public void testTo_String_Items_here() {
        System.out.println("to_String_Items_here");
        Location instance = new Location();
        instance.to_String_Items_here();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ajoute_Characters method, of class Location.
     */
    @Test
    public void testAjoute_Characters() {
        System.out.println("Ajoute_Characters");
        Characters champion = null;
        Location instance = new Location();
        instance.Ajoute_Characters(champion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ajoute_Items method, of class Location.
     */
    @Test
    public void testAjoute_Items() {
        System.out.println("Ajoute_Items");
        Items item = null;
        Location instance = new Location();
        instance.Ajoute_Items(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Supprime_Items method, of class Location.
     */
    @Test
    public void testSupprime_Items() {
        System.out.println("Supprime_Items");
        Items item = null;
        Location instance = new Location();
        instance.Supprime_Items(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Supprime_Characters method, of class Location.
     */
    @Test
    public void testSupprime_Characters() {
        System.out.println("Supprime_Characters");
        Characters champion = null;
        Location instance = new Location();
        instance.Supprime_Characters(champion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find_Arthur method, of class Location.
     */
    @Test
    public void testFind_Arthur() {
        System.out.println("find_Arthur");
        Location instance = new Location();
        Characters expResult = null;
        Characters result = instance.find_Arthur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Get_All_Charac method, of class Location.
     */
    @Test
    public void testGet_All_Charac() {
        System.out.println("Get_All_Charac");
        Location instance = new Location();
        List<Characters> expResult = null;
        List<Characters> result = instance.Get_All_Charac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Get_All_Items method, of class Location.
     */
    @Test
    public void testGet_All_Items() {
        System.out.println("Get_All_Items");
        Location instance = new Location();
        List<Items> expResult = null;
        List<Items> result = instance.Get_All_Items();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Trouve_Tresor method, of class Location.
     */
    @Test
    public void testTrouve_Tresor() {
        System.out.println("Trouve_Tresor");
        Location instance = new Location();
        Chest expResult = null;
        Chest result = instance.Trouve_Tresor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ouvre_Tresor method, of class Location.
     */
    @Test
    public void testOuvre_Tresor() {
        System.out.println("Ouvre_Tresor");
        Chest T = null;
        Location instance = new Location();
        instance.Ouvre_Tresor(T);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
