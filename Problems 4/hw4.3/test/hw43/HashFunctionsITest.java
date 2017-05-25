
package hw43;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Юнит-тест интерфейса.
 * @author Егор
 */
public class HashFunctionsITest {

    public HashFunctionsITest() {
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
     * Test of hashTheString method, of class HashFunctionsI.
     */
    @Test
    public void testHashTheString() {
        System.out.println("hashTheString");
        String str = "a";
        int hashNumber = 8111;
        HashFunctionsI instance = new HashFunctionsIImpl();
        instance = new EasyHashFunction();
        int expResult = 1;
        int result = instance.hashTheString(str, hashNumber);
        instance = new HashFunction();
        int expResult1 = 9;
        int result1 = instance.hashTheString(str, hashNumber);
        assertEquals(expResult - result, expResult1 - result1);
    }

    public class HashFunctionsIImpl implements HashFunctionsI {

        public int hashTheString(String str, int hashNumber) {
            return 0;
        }
    }

}