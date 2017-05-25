
package hw32;

/**
 * Описывает односвязный список.
 * @author Егор
 */
public class OneWayList implements List{

    /**
     * Описывает струтуру данных "Узел" - отдельный элемент списка.
     * @author Егор
     */
    private class Node {
        private Node next;
        private int value;
    }

    private Node first;

    /**
    * Упорядоченно добавляет новый элемент в односвязный список.
    * @author Егор
    * @param number Число, которое является добавляемым в список элементом.
    */
    public void addToSortedList(int number) {
        if (first == null) {
            Node l = new Node();
            l.next = null;
            l.value = number;
            first = l;
        } else {
            Node temp = new Node();
            if (first.next == null) {
                temp.next = null;
                if (number < first.value) {
                    temp.value = number;
                    first.next = temp;
                } else {
                    temp.value = first.value;
                    first.next = temp;
                    first.value = number;
                }
            } else {
                temp.value = number;
                if (number > first.value) {
                    Node temp2 = first;
                    temp.next = temp2;
                    first = temp;

                } else {
                    Node index = first;
                    boolean flag = true;
                    while ((flag) && (number < index.next.value)) {
                        index = index.next;
                        if (index.next == null)
                            flag = false;
                    }
                    if (flag){
                        temp.next = index.next;
                        index.next = temp;
                    } else {
                        index.next = temp;
                        temp.next = null;
                    }
                }
            }
        }
    }

    /**
    * Добавляет новый элемент в конец односвязного списка.
    * @author Егор
    * @param number Число, которое является добавляемым в список элементом.
    */
    public void addToUnsortedList(int number) {
        if (first == null) {
            Node l = new Node();
            l.next = null;
            l.value = number;
            first = l;
        }
        else {
            Node l = new Node();
            l.next = null;
            l.value = number;
            Node temp = first;
            while (temp.next != null)
                  temp  = temp.next;
            temp.next = l;
        }
    }

    /**
    * Удаляет элемент из односвязного списка.
    * @author Егор
    * @param number Число, которое является элементом, выбранным для удаления.
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
                }
            } else {
                Node index = this.first;
                while (number != index.next.value)
                    index = index.next;
                Node temp = index.next;
                index.next = temp.next;
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
