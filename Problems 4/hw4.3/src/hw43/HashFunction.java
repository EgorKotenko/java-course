
package hw43;

/**
 * Первая(основная) хэш-функция.
 * @author Егор
 */
public class HashFunction implements HashFunctionsI{

    /**
    * Вычисляет значение хэш-функции по введённой строке.
    * @param string Строка, значение хэш-функции от которой нужно вычислить.
    */
    public int hashTheString (String str, int hashNumber) {
        int temp = 0;
        int k = 31;
        int t = 11;
        char[] s = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            temp += ((s[i] - 'a' + 1) * k) % t;
            k *= 31;
            t*= 11;
        }
        if (temp % hashNumber < 0)
            return (-1)*(temp % hashNumber);
        else
            return temp % hashNumber;
    }
}
