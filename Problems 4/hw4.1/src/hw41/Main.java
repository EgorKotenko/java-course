
package hw41;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws uniqueElementException, removeNullElementException{
       UniqueList list = new UniqueList();
               //if (existInList(number))
       try {

       list.addToSortedList(9);
       list.addToSortedList(7);
       list.addToSortedList(10);
       list.addToSortedList(4);
       list.addToSortedList(5);
       list.addToSortedList(8);
       list.addToSortedList(11);
       list.addToSortedList(0);
       
       list.removeElementFromList(2);
       list.addToSortedList(4);
       
       } catch (uniqueElementException ex){
           Logger.getLogger(UniqueList.class.getName()).log(Level.INFO, "", ex);
       } catch (removeNullElementException ex1) {
           Logger.getLogger(UniqueList.class.getName()).log(Level.INFO, "", ex1);
       }
       //list.printList();
    }

}
