/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw52;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author S
 */
public class ListTest {

    public ListTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of removeElementFromList method, of class List.
     */
    @Test(expected=removeNullElementExeption.class)
    public void testRemoveElementFromList() throws Exception {
        System.out.println("removeElementFromList");
        int number = 2;
        List instance = new List();
        instance.addToSortedList(5);
        instance.removeElementFromList(number);
    }

    /**
     * Test of printList method, of class List.
     */
    @Test
    public void testPrintList() {
        System.out.println("printList");
        List instance = new List();
        instance.printList();
    }

    /**
     * Test of length method, of class List.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        List instance = new List();
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class List.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        List instance = new List();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of existInList method, of class List.
     */
    @Test
    public void testExistInList() throws Exception{
        System.out.println("existInList");
        int number = 5;
        List instance = new List();
        instance.addToSortedList(5);
        boolean expResult = true;
        boolean result = instance.existInList(number);
        assertEquals(expResult, result);
    }

}