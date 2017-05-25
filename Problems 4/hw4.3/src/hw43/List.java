
package hw43;

/**
 * Описывает односвязный список.
 * @author Егор
 */
public class List {

    /**
    * Добавляет новый элемент в список.
    * @author Егор
    * @param string Строка, являющаяся добовляемым в список элементом.
    * @param number Число, являющееся показателем количества повторов данной строки.
    */
    public void addToList(String string, int number) {
        if (isEmpty()) {
            Node l = new Node();
            l.next = null;
            l.value = number;
            l.str = string;
            first = l;
        }
        else {
            Node l = new Node();
            l.next = null;
            l.value = number;
            l.str = string;
            Node temp = first;
            while (temp.next != null)
                  temp  = temp.next;
            temp.next = l;
        }
    }

    /**
    * Выводит все элементы списка на экран.
    */
    public void printList() {
        if (first.next == null)
            System.out.println("  " + first.str + "          " + first.value);
        else {
            Node index = first;
            while (index.next != null) {
                System.out.println("  " + index.str + "         " + index.value);
                index = index.next;
            }
            System.out.print(" " + index.str + "         " + index.value);
            System.out.println();
        }
    }

    /**
    * Возвращает длину (количество элементов) списка.
    * @return число, равное длине (количеству элементов) списка
    */
    public int length() {
        if (isEmpty())
            return 0;
        else{
            Node index = first;
            int n = 1;
            while (index.next != null) {
                index = index.next;
                n++;
            }
            return n;
        }
    }

    /**
    * Проверяет, является ли список пустым.
    * @return true, если список пуст, и false, если не пуст
    */
    public boolean isEmpty() {
        return (first == null);
    }

    /**
    * Описывает струтуру данных "Узел" - отдельный элемент списка.
    */
    protected class Node {
        protected Node next;
        protected int value;
        protected String str;
    }

    protected Node first;
}


