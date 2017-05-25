
package hw41;

/**
 * Класс исключения, генерирующийся при попытке удаления из списка несуществующего элемента.
 * @author Егор
 */
public class removeNullElementException extends Exception {

    /**
     * Creates a new instance of <code>removeNullElementExeption</code> without detail message.
     */
    public removeNullElementException() {
    }

    /**
     * Constructs an instance of <code>removeNullElementExeption</code> with the specified detail message.
     * @param msg the detail message.
     */
    public removeNullElementException(String msg) {
        super(msg);
    }
}
