
package hw52;

/**
 * Описывает структуру списка, в котором нет повторяющихся элементов.
 * @author Егор
 */
public class UniqueList extends List{

    /**
    * Упорядоченно добавляет новый элемент в односвязный список.
    * @author Егор
    * @param number Число, которое является добавляемым в список элементом.
    */
    @Override
    public void addToSortedList(int number) throws uniqueElementExeption{
        if (existInList(number))
            throw new uniqueElementExeption(" adding repeated element");
        super.addToSortedList(number);
    }

    /**
    * Добавляет новый элемент в конец односвязного списка.
    * @author Егор
    * @param number Число, которое является добавляемым в список элементом.
    */
    @Override
    public void addToUnsortedList(int number) throws uniqueElementExeption{
        if (existInList(number))
            throw new uniqueElementExeption(" adding repeated element");
        super.addToUnsortedList(number);
    }

    
}
