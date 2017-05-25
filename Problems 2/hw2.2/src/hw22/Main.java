package hw22;

import java.util.Scanner;

public class Main {
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr, int num){
        for(int i = num - 1 ; i >= 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] )
                   swap(arr, j, j+1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	System.out.print("Put in the number of elements: ");
	int num = input.nextInt();

        int[] a = new int[20];
        System.out.println("Put in the elements: ");
        for (int i = 0; i < num; i++){
            a[i] = input.nextInt ();
        }

        bubbleSort(a, num);
        
        System.out.println("Your bubble sorted elements: ");
        for (int i = 0; i < num; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
