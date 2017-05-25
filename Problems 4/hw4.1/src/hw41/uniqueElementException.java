
package hw41;

/**
 * Класс исключения, генерирующийся при попытке добавления в список уже существующего элемента.
 * @author Егор
 */
public class uniqueElementException extends Exception {

    /**
     * Creates a new instance of <code>uniqueListExeption</code> without detail message.
     */
    public uniqueElementException() throws uniqueElementException {

    }

    /**
     * Constructs an instance of <code>uniqueListExeption</code> with the specified detail message.
     * @param msg the detail message.
     */
    public uniqueElementException(String msg) {
        super(msg);
    }
}
