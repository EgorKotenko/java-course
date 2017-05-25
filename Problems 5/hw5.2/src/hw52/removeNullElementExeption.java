
package hw52;

/**
 * Класс исключения, генерирующийся при попытке удаления из списка несуществующего элемента.
 * @author Егор
 */
public class removeNullElementExeption extends Exception {

    /**
     * Creates a new instance of <code>removeNullElementExeption</code> without detail message.
     */
    public removeNullElementExeption() {
    }

    /**
     * Constructs an instance of <code>removeNullElementExeption</code> with the specified detail message.
     * @param msg the detail message.
     */
    public removeNullElementExeption(String msg) {
        super(msg);
    }
}
