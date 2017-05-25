/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw53;

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
public class Stack2Test {

    public Stack2Test() {
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
     * Test of push method, of class Stack2.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int number = 5;
        Stack2 instance = new Stack2();
        instance.push(number);
        assertEquals(instance.array[0], number);
    }

    /**
     * Test of pop method, of class Stack2.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Stack2 instance = new Stack2();
        int expResult = 3;
        instance.push(1);
        instance.push(2);
        instance.push(expResult);
        int result = instance.pop();
        assertEquals(expResult, result);
    }

    /**
     * Test of top method, of class Stack2.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        Stack2 instance = new Stack2();
        int expResult = 7;
        instance.push(7);
        int result = instance.top();
        assertEquals(expResult, result);
    }

    /**
     * Test of printStack method, of class Stack2.
     */
    @Test
    public void testPrintStack() {
        System.out.println("printStack");
        Stack2 instance = new Stack2();
        instance.push(2);
        instance.push(4);
        instance.push(5);
        int temp = instance.pop();
        instance.printStack();
    }

}