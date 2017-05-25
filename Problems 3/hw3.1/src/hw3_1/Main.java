
package hw3_1;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List l = new List();
        
        l.addToUnsortedList(l, 4);
        l.addToUnsortedList(l, 2);
        l.addToSortedList(l, 3);
        l.addToSortedList(l, 1);
        l.addToSortedList(l, 5);
        l.addToUnsortedList(l, 0);
        l.removeElementFromList(l, 3);
        l.removeElementFromList(l, 5);
        l.printList(l);
        System.out.println("the length od your list = " + l.length(l));

    }

}
