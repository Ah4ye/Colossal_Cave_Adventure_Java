/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package colossal_cave_adventure;

import Item.Items;
import Personnage.Arthur;
import Personnage.Characters;
import Personnage.Hero;
import Room.Location;
import java.util.List;
import java.util.Scanner;
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
public class ActionsTest {
    
    public ActionsTest() {
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
     * Test of getInstruction method, of class Actions.
     */
    @Test
    public void testGetInstruction() {
        System.out.println("getInstruction");
        Scanner input = null;
        Actions instance = null;
        instance.getInstruction(input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Look_all method, of class Actions.
     */
    @Test
    public void testLook_all() {
        System.out.println("Look_all");
        Actions instance = null;
        instance.Look_all();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Take method, of class Actions.
     */
    @Test
    public void testTake() {
        System.out.println("Take");
        String name = "";
        Actions instance = null;
        instance.Take(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Go_Location method, of class Actions.
     */
    @Test
    public void testGo_Location() {
        System.out.println("Go_Location");
        String loc = "";
        Actions instance = null;
        instance.Go_Location(loc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Help method, of class Actions.
     */
    @Test
    public void testHelp() {
        System.out.println("Help");
        Actions instance = null;
        instance.Help();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of combat method, of class Actions.
     */
    @Test
    public void testCombat() {
        System.out.println("combat");
        String mes = "";
        Actions instance = null;
        instance.combat(mes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of combat_bis method, of class Actions.
     */
    @Test
    public void testCombat_bis() {
        System.out.println("combat_bis");
        Characters ennemie = null;
        Hero me = null;
        Arthur Arthur = null;
        Actions instance = null;
        instance.combat_bis(ennemie, me, Arthur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Use_Items method, of class Actions.
     */
    @Test
    public void testUse_Items() {
        System.out.println("Use_Items");
        List<Items> v = null;
        String message = "";
        Characters Hero = null;
        Actions instance = null;
        instance.Use_Items(v, message, Hero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Use_coffre method, of class Actions.
     */
    @Test
    public void testUse_coffre() {
        System.out.println("Use_coffre");
        Location l = null;
        Actions instance = null;
        instance.Use_coffre(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
