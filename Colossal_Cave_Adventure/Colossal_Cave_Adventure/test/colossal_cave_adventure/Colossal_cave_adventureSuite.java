/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package colossal_cave_adventure;

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
@Suite.SuiteClasses({colossal_cave_adventure.Colossal_Cave_AdventureTest.class, colossal_cave_adventure.CombatTest.class, colossal_cave_adventure.StoryTest.class, colossal_cave_adventure.ActionsTest.class})
public class Colossal_cave_adventureSuite {

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
