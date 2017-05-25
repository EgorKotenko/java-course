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
public class UniqueListTest {

    public UniqueListTest() {
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
     * Test of addToSortedList method, of class UniqueList.
     */
    @Test(expected=uniqueElementExeption.class)
    public void testAddToSortedList() throws Exception {
        System.out.println("addToSortedList");
        int number = 7;
        UniqueList instance = new UniqueList();
        instance.addToSortedList(number);
        instance.addToSortedList(number);
        assertEquals(instance.first.value, number);
    }

    /**
     * Test of addToUnsortedList method, of class UniqueList.
     */
    @Test(expected=uniqueElementExeption.class)
    public void testAddToUnsortedList() throws Exception {
        System.out.println("addToUnsortedList");
        int number = 7;
        UniqueList instance = new UniqueList();
        instance.addToSortedList(number);
        instance.addToSortedList(number);
        assertEquals(instance.first.value, number);
    }

}