package hw24;

import java.util.Scanner;
import java.util.Random;

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
        System.out.print("Put in a number of rows: ");
        int n = input.nextInt();
        System.out.print("Put in a number of columns: ");
        int m = input.nextInt();

        Random rand = new Random(System.currentTimeMillis() | 0xFACE0FF);
        int[][] a = new int[10][10];
        for(int i = 0; i < n; i++)							// заполняем матрицу рандомными цифрами
           for(int j = 0; j < m; j++)
               a[i][j] = rand.nextInt(90) + 10;

        System.out.println("Initial matrix:");
        for(int i = 0; i < n; i++){							// выводим получившуюся матрицу
           for(int j = 0; j < m; j++)
               System.out.print(" " + a[i][j]);
           System.out.println();
        }

        int[] temp = new int[10];
        System.arraycopy(a[0], 0, temp, 0, m);
        bubbleSort(temp, m);

        int[][] aNew = new int[10][10];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < m; j++)
                if (temp[i] == a[0][j])
                    for (int k = 0; k < n; k++)
                        aNew[k][i] = a[k][j];

        System.out.println("\nSorted matrix:");
        for(int i = 0; i < n; i++){							// выводим получившуюся матрицу
           for(int j = 0; j < m; j++)
               System.out.print(" " + aNew[i][j]);
           System.out.println();
        }
        System.out.println();
        }

}
