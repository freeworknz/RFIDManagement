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
public class CardTest {
    
    public CardTest() {
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
     * Test of getTagID method, of class Card.
     */
    @Test
    public void testGetTagID() {
        System.out.println("getTagID");
        Card instance = new Card();
        String expResult = "";
        String result = instance.getTagID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTagID method, of class Card.
     */
    @Test
    public void testSetTagID() {
        System.out.println("setTagID");
        String tagID = "";
        Card instance = new Card();
        instance.setTagID(tagID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Card.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Card instance = new Card();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Card.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Card instance = new Card();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeachUrl method, of class Card.
     */
    @Test
    public void testGetTeachUrl() {
        System.out.println("getTeachUrl");
        Card instance = new Card();
        String expResult = "";
        String result = instance.getTeachUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeachUrl method, of class Card.
     */
    @Test
    public void testSetTeachUrl() {
        System.out.println("setTeachUrl");
        String teachUrl = "";
        Card instance = new Card();
        instance.setTeachUrl(teachUrl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStuUrl method, of class Card.
     */
    @Test
    public void testGetStuUrl() {
        System.out.println("getStuUrl");
        Card instance = new Card();
        String expResult = "";
        String result = instance.getStuUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStuUrl method, of class Card.
     */
    @Test
    public void testSetStuUrl() {
        System.out.println("setStuUrl");
        String stuUrl = "";
        Card instance = new Card();
        instance.setStuUrl(stuUrl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
