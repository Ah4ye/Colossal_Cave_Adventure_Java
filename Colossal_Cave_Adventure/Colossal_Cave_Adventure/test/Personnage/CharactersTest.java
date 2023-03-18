/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Personnage;

import Item.Food;
import Item.Items;
import Item.Weapons;
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
public class CharactersTest {
    
    public CharactersTest() {
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
     * Test of damage_item method, of class Characters.
     */
    @Test
    public void testDamage_item() {
        System.out.println("damage_item");
        Characters instance = null;
        int expResult = 0;
        int result = instance.damage_item();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ajoute_Items method, of class Characters.
     */
    @Test
    public void testAjoute_Items() {
        System.out.println("Ajoute_Items");
        Items i = null;
        Characters instance = null;
        instance.Ajoute_Items(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Supprime_Items method, of class Characters.
     */
    @Test
    public void testSupprime_Items() {
        System.out.println("Supprime_Items");
        Items i = null;
        Characters instance = null;
        instance.Supprime_Items(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of give_Item_From_Inventaire method, of class Characters.
     */
    @Test
    public void testGive_Item_From_Inventaire() {
        System.out.println("give_Item_From_Inventaire");
        Items i = null;
        Characters instance = null;
        Items expResult = null;
        Items result = instance.give_Item_From_Inventaire(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equipe_Weapon method, of class Characters.
     */
    @Test
    public void testEquipe_Weapon() {
        System.out.println("equipe_Weapon");
        Weapons i = null;
        Characters instance = null;
        instance.equipe_Weapon(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of choose_name method, of class Characters.
     */
    @Test
    public void testChoose_name() {
        System.out.println("choose_name");
        String nameChoose = "";
        Characters instance = null;
        instance.choose_name(nameChoose);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of change_List method, of class Characters.
     */
    @Test
    public void testChange_List() {
        System.out.println("change_List");
        List<Items> l = null;
        Characters instance = null;
        instance.change_List(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to_String_name method, of class Characters.
     */
    @Test
    public void testTo_String_name() {
        System.out.println("to_String_name");
        Characters instance = null;
        instance.to_String_name();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of look_Inventaire method, of class Characters.
     */
    @Test
    public void testLook_Inventaire() {
        System.out.println("look_Inventaire");
        Characters instance = null;
        instance.look_Inventaire();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_name_character method, of class Characters.
     */
    @Test
    public void testGet_name_character() {
        System.out.println("get_name_character");
        Characters instance = null;
        String expResult = "";
        String result = instance.get_name_character();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_HP_Characters method, of class Characters.
     */
    @Test
    public void testGet_HP_Characters() {
        System.out.println("get_HP_Characters");
        Characters instance = null;
        int expResult = 0;
        int result = instance.get_HP_Characters();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Weapons method, of class Characters.
     */
    @Test
    public void testGet_Weapons() {
        System.out.println("get_Weapons");
        Characters instance = null;
        Weapons expResult = null;
        Weapons result = instance.get_Weapons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_List method, of class Characters.
     */
    @Test
    public void testGet_List() {
        System.out.println("get_List");
        Characters instance = null;
        List<Items> expResult = null;
        List<Items> result = instance.get_List();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HP_Characters_Modif method, of class Characters.
     */
    @Test
    public void testHP_Characters_Modif() {
        System.out.println("HP_Characters_Modif");
        int value = 0;
        Characters instance = null;
        instance.HP_Characters_Modif(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eat method, of class Characters.
     */
    @Test
    public void testEat() {
        System.out.println("Eat");
        Food F = null;
        Characters instance = null;
        instance.Eat(F);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Take_Damage method, of class Characters.
     */
    @Test
    public void testTake_Damage() {
        System.out.println("Take_Damage");
        int damage = 0;
        Characters instance = null;
        instance.Take_Damage(damage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of En_vie method, of class Characters.
     */
    @Test
    public void testEn_vie() {
        System.out.println("En_vie");
        Characters instance = null;
        boolean expResult = false;
        boolean result = instance.En_vie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
