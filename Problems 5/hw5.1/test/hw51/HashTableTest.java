/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw51;

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
public class HashTableTest {

    public HashTableTest() {
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
     * Test of hashTheString method, of class HashTable.
     */
    @Test
    public void testHashTheString() {
        System.out.println("hashTheString");
        String str = "a";
        HashTable instance = new HashTable();
        int expResult = 9;
        int result = instance.hashTheString(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of collectingData method, of class HashTable.
     */
    @Test
    public void testCollectingData() throws Exception {
        System.out.println("collectingData");
        HashTable instance = new HashTable();
        instance.collectingData();
    }

    /**
     * Test of statistics method, of class HashTable.
     */
    @Test
    public void testStatistics() {
        System.out.println("statistics");
        HashTable instance = new HashTable();
        instance.statistics();
        assertEquals(instance.collisionsNumber, 0);
    }

    /**
     * Test of printStatistics method, of class HashTable.
     */
    @Test
    public void testPrintStatistics() throws Exception {
        System.out.println("printStatistics");
        HashTable instance = new HashTable();
        instance.printStatistics();
    }

    /**
     * Test of searchByKey method, of class HashTable.
     */
    @Test(expected=SearchNullElementException.class)
    public void testSearchByKey() throws Exception {
        System.out.println("searchByKey");
        int key = 0;
        HashTable instance = new HashTable();
        String expResult = "";
        String result = instance.searchByKey(key);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteByWord method, of class HashTable.
     */
    @Test(expected=RemoveNullElementException.class)
    public void testDeleteByWord() throws Exception {
        System.out.println("deleteByWord");
        String string = "";
        HashTable instance = new HashTable();
        instance.deleteByWord(string);
    }

}