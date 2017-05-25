
package hw43;

/**
 * Общий интерфейс классов хэш-функций.
 * @author Егор.
 */
public interface HashFunctionsI {

    /**
    * Вычисляет значение хэш-функции по введённой строке.
    * @param string Строка, значение хэш-функции от которой нужно вычислить.
    */
    public int hashTheString (String str, int hashNumber);
}
