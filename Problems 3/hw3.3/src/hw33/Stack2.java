
package hw33;

/**
 * Реализует структуру данных "Стэк" на основе одномерного массива.
 * @author Егор
 */
public class Stack2 implements StackI{

    private int n = 20;
    private int[] array = new int[n];
    private int length = 0;

    /**
    * Упорядоченно кладёт новый элемент в стэк (на вершину стэка).
    * @author Егор
    * @param number Число, которое является добавляемым в стэк элементом.
    */
    public void push(int number) {
        for (int i = n - 2; i > 0; i--)
            array[i] = array[i-1];
        array[0] = number;
        length++;
    }

    /**
    * Возвращает элемент, добавленный в стек последним (лежащий на вершине стэка), и удаляет этот элемент из стека.
    * @author Егор
    */
    public int pop() {
        int temp = array[0];
        for (int i = 0; i < n-1; i++)
            array[i] = array[i+1];
        length--;
        return temp;
    }

    /**
    * Возвращает элемент, добавленный в стек последним (лежащий на вершине стэка).
    * @author Егор
    */
    public int top() {
        return array[0];
    }

    /**
    * Выводит на экран все элементы стэка, начиная с вершины.
    * @author Егор
    */
    public void printStack() {
        System.out.println("Your stack: ");
        for (int i = 0; i < length; i++)
            System.out.print(" " + array[i]);
        System.out.println();
    }
}
