/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RFIDManagement.view;

import RFIDManagement.model.Student;
import RFIDManagement.model.Teacher;
import java.util.ArrayList;
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
public class StartPageTest {
    
    public StartPageTest() {
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
     * Test of main method, of class StartPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StartPage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStd method, of class StartPage.
     */
    @Test
    public void testGetStd() {
        System.out.println("getStd");
        StartPage instance = new StartPage();
        Student expResult = null;
        Student result = instance.getStd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStd method, of class StartPage.
     */
    @Test
    public void testSetStd() {
        System.out.println("setStd");
        Student std = null;
        StartPage instance = new StartPage();
        instance.setStd(std);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTch method, of class StartPage.
     */
    @Test
    public void testGetTch() {
        System.out.println("getTch");
        StartPage instance = new StartPage();
        Teacher expResult = null;
        Teacher result = instance.getTch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTch method, of class StartPage.
     */
    @Test
    public void testSetTch() {
        System.out.println("setTch");
        Teacher tch = null;
        StartPage instance = new StartPage();
        instance.setTch(tch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getToPass method, of class StartPage.
     */
    @Test
    public void testGetToPass() {
        System.out.println("getToPass");
        StartPage instance = new StartPage();
        ArrayList expResult = null;
        ArrayList result = instance.getToPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setToPass method, of class StartPage.
     */
    @Test
    public void testSetToPass() {
        System.out.println("setToPass");
        ArrayList toPass = null;
        StartPage instance = new StartPage();
        instance.setToPass(toPass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
