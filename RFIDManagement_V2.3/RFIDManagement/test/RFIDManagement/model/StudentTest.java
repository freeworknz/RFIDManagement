/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RFIDManagement.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author york
 */
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getTagID method, of class Student.
     */
    @Test
    public void testGetTagID() {
        System.out.println("getTagID");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getTagID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTagID method, of class Student.
     */
    @Test
    public void testSetTagID() {
        System.out.println("setTagID");
        String tagID = "";
        Student instance = new Student();
        instance.setTagID(tagID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Student instance = new Student();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProUrl method, of class Student.
     */
    @Test
    public void testGetProUrl() {
        System.out.println("getProUrl");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getProUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProUrl method, of class Student.
     */
    @Test
    public void testSetProUrl() {
        System.out.println("setProUrl");
        String proUrl = "";
        Student instance = new Student();
        instance.setProUrl(proUrl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoom method, of class Student.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoom method, of class Student.
     */
    @Test
    public void testSetRoom() {
        System.out.println("setRoom");
        int room = 0;
        Student instance = new Student();
        instance.setRoom(room);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
