
package hw43;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Юнит-тест основной хэш-функции.
 * @author Егор
 */
public class HashFunctionTest {

    public HashFunctionTest() {
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
     * Test of hashTheString method, of class HashFunction.
     */
    @Test
    public void testHashTheString() {
        System.out.println("hashTheString");
        String str = "a";
        int hashNumber = 8111;
        HashFunction instance = new HashFunction();
        int expResult = 9;
        int result = instance.hashTheString(str, hashNumber);
        assertEquals(expResult, result);
    }

}