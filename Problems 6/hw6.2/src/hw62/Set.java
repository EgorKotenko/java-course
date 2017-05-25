
package hw62;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * АТД "Множество"
 * @author Егор
 */
public class Set <Type> {

    /**
    * Добавляет новый элемент в множество.
    * @param input Добавляемый в множество элемент.
    */
    public void addToSet(Type input) throws uniqueElementException{
        if ((existInSet(input)) && (flag))
            throw new uniqueElementException(" adding repeated element");
        if (isEmpty()) {
            Node l = new Node();
            l.next = null;
            l.value = input;
            first = l;
        }
        else {
            Node l = new Node();
            l.next = null;
            l.value = input;
            Node temp = first;
            while (temp.next != null)
                  temp  = temp.next;
            temp.next = l;
        }
    }

    /**
    * Удаляет элемент из множества.
    * @param input Удаляемый элемент.
    */
    public void removeFromSet (Type input) throws removeNullElementException{
        if (!existInSet(input) || isEmpty())
            throw new removeNullElementException(" removing non-existent element");
        if (input == first.value) {
            if (first.next == null)
                first = null;
            else {
                first = first.next;
            }
        } else {
            Node index = this.first;
            while (input != index.next.value)
                index = index.next;
            Node temp = index.next;
            index.next = temp.next;
        }
    }

    /**
    * Проверяет элемент на принадлежность множеству.
    * @param input Элемент, принадлежность множеству которого мы проверяем.
    */
    public boolean existInSet(Type input) {
        if (isEmpty())
            return false;
        else{
            Node index = first;
            boolean flag1 = false;
            while (index != null) {
                if (index.value.equals(input)) {
                    flag1 = true;
                    break;
                }
                index = index.next;
            }
            return flag1;
        }
    }

    /**
    * Возвращает множество, являющееся пересечением текущего и данного на вход множеств.
    * @param B Множество, пересечение с которым требуется найти.
    */
    public Set<Type> setsIntersection (Set<Type> b) {
        if (isEmpty() || b.isEmpty())
            return null;
        else {
            Set<Type> c = new Set<Type>();
            Set<Type> temp = new Set<Type>();
            Node index = first;
            while (index != null) {
                try {
                    temp.addToSet(index.value);
                } catch (uniqueElementException ex) {
                    Logger.getLogger(Set.class.getName()).log(Level.SEVERE, null, ex);
                }
                index = index.next;
            }
            index = b.first;
            while (index != null) {
                if (temp.existInSet(index.value))
                    try {
                    c.addToSet(index.value);
                } catch (uniqueElementException ex) {
                    Logger.getLogger(Set.class.getName()).log(Level.SEVERE, null, ex);
                }
                index = index.next;
            }
            return c;
        }
    }

    /**
    * Возвращает множество, являющееся объединением текущего и данного на вход множеств.
    * @param B Множество, объединение с которым требуется найти.
    */
    public Set<Type> setsUnion (Set<Type> b) {
        if (isEmpty() && b.isEmpty())
            return null;
        else if (isEmpty())
            return b;
        else if (b.isEmpty())
            return this;
        else {
            Set<Type> c = new Set<Type>();
            flag = false;
            c.flag = false;
            Node index = first;
            while (index != null) { 
                try {                   
                    c.addToSet(index.value);
                } catch (uniqueElementException ex) {
                    Logger.getLogger(Set.class.getName()).log(Level.INFO, "", ex);
                }
                index = index.next;
            }
            index = b.first;
            while (index != null) {
                try {
                    c.addToSet(index.value);
                } catch (uniqueElementException ex) {
                    Logger.getLogger(Set.class.getName()).log(Level.INFO, "", ex);
                }
                index = index.next;
            }
            flag = true;
            c.flag = true;
            return c;
        }
    }

    /**
    * Выводит все элементы множества на экран.
    */
    public void printSet () {
        if (isEmpty())
            System.out.println("Error: your set is empty!");
        else {
            Node index = first;
            System.out.print("Your set: ");
            while (index.next != null) {
                System.out.print(" " + index.value);
                index = index.next;
            }
            System.out.print(" " + index.value);
            System.out.println();
        }
    }

    protected boolean isEmpty () {
        return (first == null);
    }

    protected class Node {
        protected Node next;
        protected Type value;
    }

    protected Node first;
    protected boolean flag = true;
}
