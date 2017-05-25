/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw62;

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
public class SetTest {

    public SetTest() {
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
     * Test of addToSet method, of class Set.
     */
    @Test(expected=uniqueElementException.class)
    public void testAddToSet() throws Exception {
        System.out.println("addToSet");
        String input = "a";
        Set<String> instance = new Set<String>();
        instance.addToSet(input);
        instance.addToSet(input);
    }

    /**
     * Test of removeFromSet method, of class Set.
     */
    @Test(expected=removeNullElementException.class)
    public void testRemoveFromSet() throws Exception {
        System.out.println("removeFromSet");
        Object input = null;
        Set instance = new Set();
        instance.removeFromSet(input);
    }

    /**
     * Test of existInSet method, of class Set.
     */
    @Test
    public void testExistInSet() {
        System.out.println("existInSet");
        Object input = null;
        Set instance = new Set();
        boolean expResult = false;
        boolean result = instance.existInSet(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of SetsIntersection method, of class Set.
     */
    @Test
    public void testSetsIntersection() {
        System.out.println("SetsIntersection");
        Set B = null;
        Set instance = new Set();
        Set expResult = null;
        Set result = instance.setsIntersection(B);
        assertEquals(expResult, result);
    }

    /**
     * Test of SetsUnion method, of class Set.
     */
    @Test
    public void testSetsUnion() {
        System.out.println("SetsUnion");
        Set B = new Set();
        Set instance = new Set();
        Set expResult = null;
        Set result = instance.setsUnion(B);
        assertEquals(expResult, result);
    }

    /**
     * Test of printSet method, of class Set.
     */
    @Test
    public void testPrintSet() {
        System.out.println("printSet");
        Set instance = new Set();
        instance.printSet();
    }

    /**
     * Test of isEmpty method, of class Set.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Set instance = new Set();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

}