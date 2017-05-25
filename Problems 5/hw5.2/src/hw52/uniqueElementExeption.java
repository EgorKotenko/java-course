
package hw52;

/**
 * Класс исключения, генерирующийся при попытке добавления в список уже существующего элемента.
 * @author Егор
 */
public class uniqueElementExeption extends Exception {

    /**
     * Creates a new instance of <code>uniqueListExeption</code> without detail message.
     */
    public uniqueElementExeption() throws uniqueElementExeption {

    }

    /**
     * Constructs an instance of <code>uniqueListExeption</code> with the specified detail message.
     * @param msg the detail message.
     */
    public uniqueElementExeption(String msg) {
        super(msg);
    }
}
