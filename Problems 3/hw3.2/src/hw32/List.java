
package hw32;

/**
 * Интерфейс описывающий структуру данных "Список".
 * @author Егор
 */
public interface List {

    /**
    * Упорядоченно добавляет новый элемент в список.
    * @author Егор
    * @param number Число, которое является добавляемым в список элементом.
    */
    public void addToSortedList(int number);

    /**
    * Добавляет новый элемент в конец списка.
    * @author Егор
    * @param number Число, которое является добавляемым в список элементом.
    */
    public void addToUnsortedList(int number);
    
    /**
    * Удаляет элемент из списка.
    * @author Егор
    * @param number Число, которое является элементом, выбранным для удаления.
    */
    public void removeElementFromList(int number);

    /**
    * Выводит все элементы списка на экран.
    * @author Егор
    */
    public void printList(); 
    
    /**
    * Возвращает длину (количество элементов) списка.
    * @author Егор
    * @return число, равное длине (количеству элементов) списка
    */
    public int length();

    /**
    * Проверяет, является ли список пустым.
    * @author Егор
    * @return true, если список пуст, и false, если не пуст
    */
    public boolean isEmpty();

}
