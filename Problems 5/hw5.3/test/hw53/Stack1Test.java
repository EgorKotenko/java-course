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
public class Stack1Test {

    public Stack1Test() {
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
     * Test of push method, of class Stack1.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Stack1 instance = new Stack1();
        int temp = 5;
        instance.push(temp);
        assertEquals(instance.top.next.value ,temp);
    }

    /**
     * Test of pop method, of class Stack1.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Stack1 instance = new Stack1();
        int expResult = 8;
        instance.push(8);
        int result = instance.pop();
        assertEquals(expResult, result);
    }

    /**
     * Test of top method, of class Stack1.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        Stack1 instance = new Stack1();
        int expResult = 7;
        instance.push(7);
        int result = instance.top();
        assertEquals(expResult, result);
    }

    /**
     * Test of printStack method, of class Stack1.
     */
    @Test
    public void testPrintStack() {
        System.out.println("printStack");
        Stack1 instance = new Stack1();
        instance.push(3);
        instance.push(4);
        instance.push(5);
        int temp = instance.pop();
        instance.printStack();
    }

}