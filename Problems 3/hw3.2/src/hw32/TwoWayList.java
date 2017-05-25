
package hw32;

/**
 * Описывает двусвязный список.
 * @author Егор
 */
public class TwoWayList implements List{

    /**
     * Описывает струтуру данных "Узел" - отдельный элемент списка.
     * @author Егор
     */
    private class Node {
        private Node next;
        private Node last;
        private int value;
    }

    private Node first;

    /**
    * Упорядоченно добавляет новый элемент в двусвязный список.
    * @author Егор
    * @param number Число, которое является добавляемым в список элементом.
    */
    public void addToSortedList(int number) {

        if (first == null) {
            Node l = new Node();
            l.next = null;
            l.last = null;
            l.value = number;
            first = l;
        } else {
            Node index = first;
            boolean flag = true;
            while ((flag) && (number < index.value)) {
                index = index.next;
                if (index.next == null)
                    flag = false;
            }
            Node temp = new Node();
            if (flag){
                temp.next = index.next;
                index.next = temp;
                temp.last = index;
                temp.value = number;
            } else {
                index.next = temp;
                temp.next = null;
                temp.last = index;
                temp.value = number;
            }
        }
    }

    /**
    * Добавляет новый элемент в конец двусвязного списка.
    * @author Егор
    * @param number Число, которое является добавляемым в список элементом.
    */
    public void addToUnsortedList(int number) {
        if (first == null) {
            Node l = new Node();
            l.next = null;
            l.last = null;
            l.value = number;
            first = l;
        }
        else {
            Node l = new Node();
            l.next = null;
            l.last = null;
            l.value = number;
            Node temp = first;
            while (temp.next != null)
                  temp  = temp.next;
            temp.next = l;
            l.last = temp;
        }
    }

    /**
    * Удаляет элемент из двусвязного списка.
    * @author Егор
    * @param x Число, которое является элементом, выбранным для удаления.
    */
    public void removeElementFromList(int number) {
        if (isEmpty()) {
            System.out.println("Error: your list is empty!");
        } else {
            if (number == first.value) {
                if (first.next == null)
                    first = null;
                else {
                    first = first.next;
                    first.next.last = first;
                }
            } else {
                Node index = first;
                while (number != index.next.value)
                    index = index.next;
                Node temp = index.next;
                index.next = temp.next;
                temp.next.last = index;
            }
        }
    }

    /**
    * Выводит все элементы списка на экран.
    * @author Егор
    */
    public void printList() {
        if (isEmpty())
            System.out.println("Error: your list is empty!");
        else {
            Node index = first;
            System.out.println("Your list: ");
            while (index.next != null) {
                System.out.print(" " + index.value);
                index = index.next;
            }
            System.out.print(" " + index.value);
            System.out.println();
        }
    }

    /**
    * Возвращает длину (количество элементов) списка.
    * @author Егор
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
    * @author Егор
    * @return true, если список пуст, и false, если не пуст
    */
    public boolean isEmpty() {
        return (first == null);
    }

}
