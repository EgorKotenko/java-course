
package hw43;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Юнит-тест для хэш-таблицы.
 * @author Егор.
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
     * Test of switchHash method, of class HashTable.
     */
    @Test
    public void testSwitchHash() throws IOException {
        System.out.println("switchHash");
        int choise = 2;
        HashTable instance = new HashTable();
        instance.switchFunction(choise);
        instance.printStatistics();
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