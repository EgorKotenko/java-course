/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw21;

import java.util.Scanner;

/**
 *
 * @author S
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);   
	System.out.println("Put in your number of the Fibonschchi row ");
	int fibNumber = input.nextInt();
	if ((fibNumber == 1) || (fibNumber == 2))											//итеративный подсчёт числа фибоначчи
		System.out.println("Your Fibonachchi number = 1\n");
	else
	{
		int[] a = new int[20];
		a[0] = 1;
		a[1] = 1;
		int i = 2;
		while (i < fibNumber)
		{
			a[i] = a[i - 1] + a[i - 2];
			i++;
		}
		System.out.print("Your Fibonachchi number = ");
                System.out.println(a[i - 1]);
	}
    }
}
