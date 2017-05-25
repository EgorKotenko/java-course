
package hw32;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        OneWayList l = new OneWayList();
        //TwoWayList l = new TwoWayList();

        if (l.isEmpty() == true)
            System.out.println("Your list is empty");
        else
            System.out.println("Your list isn't empty");
        l.addToUnsortedList(4);
        l.addToUnsortedList(2);
        l.addToSortedList(3);
        l.addToSortedList(1);
        l.addToSortedList(5);
        l.addToUnsortedList(0);
        l.removeElementFromList(3);
        l.removeElementFromList(5);
        l.printList();
        System.out.println("the length of your list = " + l.length());
        if (l.isEmpty())
            System.out.println("Your list is empty");
        else
            System.out.println("Your list isn't empty");
    }

}
