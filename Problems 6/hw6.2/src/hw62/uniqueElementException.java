/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw62;

/**
 *
 * @author S
 */
public class uniqueElementException extends Exception {

    /**
     * Creates a new instance of <code>uniqueElementException</code> without detail message.
     */
    public uniqueElementException() {
    }


    /**
     * Constructs an instance of <code>uniqueElementException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public uniqueElementException(String msg) {
        super(msg);
    }
}
