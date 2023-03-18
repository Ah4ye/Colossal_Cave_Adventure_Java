/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Item;

import Personnage.Characters;
import Room.ChestClose;
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
public class KeyChestTest {
    
    public KeyChestTest() {
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
     * Test of use_items method, of class KeyChest.
     */
    @Test
    public void testUse_items() {
        System.out.println("use_items");
        Characters P = new Characters("Paul", 10) ;
        ChestClose test = new ChestClose() ;
        KeyChest instance = new KeyChest(test);
        instance.use_items(P);
        boolean reponse = test.isopenChest() ;
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(!reponse);
    }
    
}
