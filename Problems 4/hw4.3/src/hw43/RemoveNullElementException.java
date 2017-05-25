
package hw43;

/**
 * Класс исключения, генерирующийся при попытке удаления из хэш-таблицы несуществующего элемента.
 * @author Егор
 */
public class RemoveNullElementException extends Exception {

    /**
     * Creates a new instance of <code>removeNullElementExeption</code> without detail message.
     */
    public RemoveNullElementException() {
    }

    /**
     * Constructs an instance of <code>removeNullElementExeption</code> with the specified detail message.
     * @param msg the detail message.
     */
    public RemoveNullElementException(String msg) {
        super(msg);
    }
}