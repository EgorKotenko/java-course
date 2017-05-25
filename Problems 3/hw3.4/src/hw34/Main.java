
package hw34;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
	System.out.print("Put in the odd length of the array: ");
	int n = input.nextInt();
        System.out.print("Please, Choose the type of outputting: \n '1' - to console, '2' - to file \nYour choise: ");
        int index = input.nextInt();
        if ((index != 1) && (index != 2))
            System.out.println("Error: wrong choise number! Try again, please.");
        else{
            int[][] a = new int[n][n];
            int[] a1 = new int[n*n];
            if (index == 1){
                ArrayToConsole s = new ArrayToConsole();           
                s.arrayBuild(a, a1, n);
                s.printArray(a, a1, n);
            }
            else{
                ArrayToFile s = new ArrayToFile();
                s.arrayBuild(a, a1, n);
                s.printArray(a, a1, n);
            }
        }
    }
}
