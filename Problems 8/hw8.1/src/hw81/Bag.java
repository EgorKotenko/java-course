
package hw81;

import java.util.Collection;
import java.util.Iterator;

/**
 * Класс, реализующий интерфейс "Collection".
 * @author Егор.
 */
public class Bag<Type> implements Collection<Type> {

    public int size() {
        if (isEmpty())
            return 0;
        else {
            Node<Type> index = first;
            int n = 1;
            while (index.next != null) {
                index = index.next;
                n++;
            }
            return n;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public boolean contains(Object input) {
        if (isEmpty())
            return false;
        else{
            Node<Type> index = first;
            boolean flag = false;
            while (index != null) {
                if (index.value == input) {
                    flag = true;
                    break;
                }
                index = index.next;
            }
            return flag;
        }
    }

    public Iterator<Type> iterator() {
        return iterator;
    }

    public Object[] toArray() {
        Object[] a = new Object[size()];
        Node<Type> index = first;
        int i = 0;
        while (index != null) {
            a[i] = index.value;
            i++;
            index = index.next;
        }
        return a;
    }

    public Object[] toArray(Object[] a) {
        Node<Type> index = first;
        int i = 0;
        while (index != null) {
            a[i] = index.value;
            i++;
            index = index.next;
        }
        return a;
    }

    public boolean add(Type input) {
        if (isEmpty()) {
            Node<Type> l = new Node<Type>();
            l.next = null;
            l.value = input;
            first = l;
            Node<Type> temp = new Node<Type>();
            temp.next = first;
            link = temp;
        }
        else {
            Node<Type> l = new Node<Type>();
            l.next = null;
            l.value = input;
            Node<Type> temp = first;
            while (temp.next != null)
                  temp  = temp.next;
            temp.next = l;
        }
        return true;
    }

    public boolean remove(Object input) {
        if (!contains(input) || first == null)
            return false;
        else {
            if (input == first.value) {
                if (first.next == null)
                    first = null;
                else {
                    first = first.next;
                }
                link.next = first;
            } else {
                Node<Type> index = first;
                while (input != index.next.value)
                    index = index.next;
                Node<Type> temp = index.next;
                index.next = temp.next;
                if (link == index)
                    link = temp;
            }
            return true;
        }
    }

    public boolean containsAll(Collection<?> c) {
        boolean flag = true;
        Iterator<Type> i = (Iterator<Type>) c.iterator();
        while (i.hasNext() && flag) {
            if (!contains(i.next()))
                flag = false;
        }
        return flag;
    }

    public boolean addAll(Collection<? extends Type> c) {
        Iterator<Type> i = (Iterator<Type>) c.iterator();
        while (i.hasNext()) {
            addToTheEnd(i.next());
        }
        return true;
    }

    public boolean removeAll(Collection<?> c) {
        Node<Type> temp = first;
        while (temp != null) {
            if (c.contains(temp.value))
                remove(temp.value);
            temp = temp.next;
        }
        return true;
    }

    public boolean retainAll(Collection<?> c) {
        Node<Type> temp = first;
        while (temp != null) {
            if (!c.contains(temp.value))
                remove(temp.value);
            temp = temp.next;
        }
        return true;
    }

    public void clear() {
        Node<Type> temp = first;
        while (temp != null) {
            remove(temp.value);
            temp = temp.next;
        }
    }

    /**
    * Добавляет данный элемент в хвост коллекции.
    * @param input Добавляемый элемент
    */
    protected void addToTheEnd(Type input) {
        Node<Type> l = new Node<Type>();
        if (isEmpty()) {
            l.next = null;
            l.value = input;
            first = l;
        }
        else {       
            l.next = null;
            l.value = input;
            Node<Type> temp = first;
            while (temp.next != null)
                  temp  = temp.next;
            temp.next = l;
        }
    }

    /**
    * Выводит все элементы коллекции на экран.
    */
    public void print() {
        if (isEmpty())
            System.out.println("Error: your collection is empty!");
        else {
            Node<Type> index = first;
            System.out.print("Your collection: ");
            while (index.next != null) {
                System.out.print(" " + index.value);
                index = index.next;
            }
            System.out.print(" " + index.value);
            System.out.println();
        }
    }

    public Iterator<Type> iterator = new Iterator() {

        public boolean hasNext() {
            return (link != null && link.next != null);
        }

        public Object next() {
            if (hasNext()){
                link = link.next;
                return link.value;
            } else
                return null;
        }

        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };

    /**
     * Внутрений класс для описания каждого отдельного элемента коллекции.
    */
    protected class Node<Type> {
        protected Node<Type> next;
        protected Type value;
        protected int number;
    }

    protected Node<Type> first;
    protected Node<Type> link;

}
