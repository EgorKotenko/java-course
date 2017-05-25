
package hw3_1;

public class List {
    private List next;
    private int value;

    public boolean isEmpty(List input) {
        if ((input.next == null) && (input.value == 0))
            return true;
        else
            return false;
    }

    public void addToSortedList(List input, int number) {
        List index = input;
        if (input.next == null) {
            List temp = new List();
            index.next = temp;
            temp.next = null;
            temp.value = number;
        } else{
            boolean flag = true;
            while ((flag) && (number < index.next.value)) {
                index = index.next;
                if (index.next == null)
                    flag = false;
            }
            List temp = new List();
            if (flag){
                temp.next = index.next;
                index.next = temp;
                temp.value = number;
            } else {
                index.next = temp;
                temp.next = null;
                temp.value = number;
            }
        }
    }

    public void addToUnsortedList(List input, int x) {
        List l = new List();
        l.next = null;
        l.value = x;
        List temp = input;
        while (temp.next != null)
              temp  = temp.next;
        temp.next = l;
    }

    public void removeElementFromList(List input, int number) {
        List index = input;
        while (number != index.next.value)
            index = index.next;
        List temp = index.next;
        index.next = temp.next;
    }

    public void printList(List input) {
        if (input.isEmpty(input)) 
            System.out.println("Error: your list is empty!");
        else {
            List index = input.next;
            System.out.println("Your list: ");
            while (index.next != null) {
                System.out.print(" " + index.value);
                index = index.next;
            }
            System.out.print(" " + index.value);
            System.out.println();
        }
    }

    public int length(List input) {
        if (input.isEmpty(input))
            return 0;
        else{
            List index = input;
            int n = 0;
            while (index.next != null) {
                index = index.next;
                n++;
            }
            return n;
        }
    }
}
