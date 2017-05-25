
package hw43;

/**
 * Вторая(простая) хэш-функция.
 * @author Егор
 */
public class EasyHashFunction implements HashFunctionsI {

    /**
    * Вычисляет значение хэш-функции по введённой строке.
    * @param string Строка, значение хэш-функции от которой нужно вычислить.
    */
    public int hashTheString (String str, int hashNumber) {
        int temp = 0;
        char[] s = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
            temp += s[i] - 'a' + 1;
        if (temp < 0)
            return -temp % hashNumber;
        else
            return temp % hashNumber;
    }
}

