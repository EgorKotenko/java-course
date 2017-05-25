/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw81;

import java.util.Collection;
import java.util.Iterator;
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
public class BagTest {

    public BagTest() {
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
     * Test of size method, of class Bag.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Bag<String> instance = new Bag<String>();
        instance.add("aaa");
        instance.add("bbb");
        int expResult = 2;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class Bag.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Bag<String> instance = new Bag<String>();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class Bag.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Bag<String> instance = new Bag<String>();
        instance.add("aaa");
        instance.add("bbb");
        String input = "ccc";
        boolean expResult = false;
        boolean result = instance.contains(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of iterator method, of class Bag.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Bag<String> instance = new Bag<String>();
        Iterator<String> expResult = null;
        Iterator<String> result = instance.iterator();
        assertEquals(expResult, null);
    }

    /**
     * Test of toArray method, of class Bag.
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testToArray_0args() {
        System.out.println("toArray");
        Bag<String> instance = new Bag<String>();
        instance.add("aaa");
        instance.add("bbb");
        Object[] expResult = new Object[2];
        expResult[0] = "aaa";
        expResult[1] = "bbb";
        Object[] result = instance.toArray();
        assertEquals(expResult, result);
    }

    /**
     * Test of toArray method, of class Bag.
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testToArray_ObjectArr() {
        System.out.println("toArray");
        Object[] a = new Object[2];
        Bag<String> instance = new Bag<String>();
        instance.add("aaa");
        instance.add("bbb");
        Object[] expResult = new Object[2];
        expResult[0] = "aaa";
        expResult[1] = "bbb";
        Object[] result = instance.toArray(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Bag.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Bag<String> instance = new Bag<String>();
        String input = "aaa";
        boolean expResult = true;
        boolean result = instance.add(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class Bag.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Bag<String> instance = new Bag<String>();
        instance.add("aaa");
        instance.add("bbb");
        String input = "bbb";
        boolean expResult = true;
        boolean result = instance.remove(input);
        assertEquals(expResult, result);
        instance.print();
    }

    /**
     * Test of containsAll method, of class Bag.
     */
    @Test
    public void testContainsAll() {
        System.out.println("containsAll");
        Bag<String> col = new Bag<String>();
        col.add("aaa");
        col.add("bbb");
        col.add("ccc");
        col.add("ddd");
        Bag<String> col2 = new Bag<String>();
        col2.add("aaa");
        col2.add("ccc");
        boolean expResult = true;
        boolean result = col.containsAll(col2);
        assertEquals(expResult, result);
    }

    /**
     * Test of addAll method, of class Bag.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Bag<String> col = new Bag<String>();
        col.add("aaa");
        col.add("bbb");
        col.add("ccc");
        col.add("ddd");
        Bag<String> col2 = new Bag<String>();
        col2.add("eee");
        col2.add("fff");
        boolean expResult = true;
        boolean result = col.addAll(col2);
        col.print();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeAll method, of class Bag.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        Bag<String> col = new Bag<String>();
        col.add("aaa");
        col.add("bbb");
        col.add("ccc");
        col.add("ddd");
        Bag<String> col2 = new Bag<String>();
        col2.add("aaa");
        col2.add("ccc");
        boolean expResult = true;
        boolean result = col.removeAll(col2);
        col.print();
        assertEquals(expResult, result);
    }

    /**
     * Test of retainAll method, of class Bag.
     */
    @Test
    public void testRetainAll() {
        System.out.println("retainAll");
        Bag<String> col = new Bag<String>();
        col.add("aaa");
        col.add("bbb");
        col.add("ccc");
        col.add("ddd");
        Bag<String> col2 = new Bag<String>();
        col2.add("eee");
        col2.add("aaa");
        boolean expResult = true;
        boolean result = col.retainAll(col2);
        col.print();
        assertEquals(expResult, result);
    }

    /**
     * Test of clear method, of class Bag.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Bag<String> instance = new Bag<String>();
        instance.add("aaa");
        instance.add("bbb");
        instance.clear();
        instance.print();
    }

    /**
     * Test of addToTheEnd method, of class Bag.
     */
    @Test
    public void testAddToTheEnd() {
        System.out.println("addToTheEnd");
        Bag<String> instance = new Bag<String>();
        instance.add("bbb");
        String input = "aaa";
        instance.addToTheEnd(input);
        instance.print();

    }

    /**
     * Test of print method, of class Bag.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Bag<String> instance = new Bag<String>();
        instance.add("aaa");
        instance.add("bbb");
        instance.print();
    }

}