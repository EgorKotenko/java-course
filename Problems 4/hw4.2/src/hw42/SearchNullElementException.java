
package hw42;

/**
 * Класс исключения, генерирующийся при попытке поиска в хэш-таблицы несуществующего элемента.
 * @author Егор
 */
public class SearchNullElementException extends Exception {

    /**
     * Creates a new instance of <code>SearchNullElementException</code> without detail message.
     */
    public SearchNullElementException() {
    }


    /**
     * Constructs an instance of <code>SearchNullElementException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public SearchNullElementException(String msg) {
        super(msg);
    }
}
