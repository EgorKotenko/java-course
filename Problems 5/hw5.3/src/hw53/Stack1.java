
package hw53;

/**
 * Реализует структуру данных "Стэк" на основе струтуры данных "Список".
 * @author Егор
 */
public class Stack1 implements StackI{

    /**
    * Упорядоченно кладёт новый элемент в стэк (на вершину стэка).
    * @author Егор
    * @param number Число, которое является добавляемым в стэк элементом.
    */
    public void push(int number) {
        List index = new List();
        index.next = top.next;
        index.value = number;
        top.next = index;
    }

    /**
    * Возвращает элемент, добавленный в стек последним (лежащий на вершине стэка), и удаляет этот элемент из стека.
    * @author Егор
    */
    public int pop() {
        List index = top.next;
        top.next = index.next;
        int temp = index.value;
        index = null;
        return temp;
    }

    /**
    * Возвращает элемент, добавленный в стек последним (лежащий на вершине стэка).
    * @author Егор
    */
    public int top() {
        return top.next.value;
    }

    /**
    * Выводит на экран все элементы стэка, начиная с вершины.
    * @author Егор
    */
    public void printStack() {
        List index = top.next;
        System.out.println("Your stack: ");
        while (index != null) {
            System.out.print(" " + index.value);
            index = index.next;
        }
        System.out.println();
    }

    /**
    * Описывает вспомогательную струтуру данных "Список".
    * @author Егор
    */
    protected class List {
        protected List next;
        protected int value;
    }

    /**
    * Описывает начальный элемент структуры данных "Стэк" - его вершину.
    * @author Егор
    */
    protected List top = new List();

}
