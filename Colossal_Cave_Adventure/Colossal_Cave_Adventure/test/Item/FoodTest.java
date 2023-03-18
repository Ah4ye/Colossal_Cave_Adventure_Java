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
public class FoodTest {
    
    public FoodTest() {
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
     * Test of use_items method, of class Food.
     */
    @Test
    public void testUse_items() {
        System.out.println("use_items");
        Characters P = new Characters("Paul", 10) ;
        Food instance = new Food();
        int oldHp = P.get_HP_Characters();
        instance.use_items(P);
        int newHp = P.get_HP_Characters();
        assertEquals(newHp-instance.get_value_food() , oldHp );
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of get_value_food method, of class Food.
     */
    @Test
    public void testGet_value_food() {
        System.out.println("get_value_food");
        Food instance = new Food();
        int expResult = Food.DEFAULT_GIVEHP_FOOD;
        int result = instance.get_value_food();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
