/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package Item;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ahaye
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Item.KeyDoorTest.class, Item.WeaponsTest.class, Item.FoodTest.class, Item.KeyChestTest.class, Item.GraalTest.class, Item.BatonTest.class, Item.ExcaliburnTest.class, Item.epeeTest.class, Item.ItemsTest.class, Item.handsTest.class, Item.MobweaponsTest.class})
public class ItemSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
