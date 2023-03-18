/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package Room;

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
@Suite.SuiteClasses({Room.DoorTest.class, Room.ChestCloseTest.class, Room.ChestTest.class, Room.AutoLockDoorTest.class, Room.LocationTest.class, Room.SecretCodeDoorTest.class, Room.ClosedDoorTest.class, Room.MapTest.class})
public class RoomSuite {

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
