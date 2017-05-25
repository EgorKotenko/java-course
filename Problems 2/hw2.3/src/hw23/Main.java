package hw23;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	System.out.print("Put in the odd length of the array: ");
	int n = input.nextInt();

        Random rand = new Random(System.currentTimeMillis() | 0xFACE0FF);
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++)						// заполняем матрицу рандомными цифрами
            for(int j = 0; j < n; j++)
		a[i][j] = rand.nextInt(100);

        System.out.println("Initial matrix:");
        for(int i = 0; i < n; i++){                                             // выводим получившуюся матрицу
            for(int j = 0; j < n; j++)
                System.out.print(" " + a[i][j]);
            System.out.println();
	}
        System.out.println("Elements of the array in an anticlockwise spiral: ");

        int[] a1 = new int[n*n];                                                // дополнительный массив. Я буду бежать спиралью по матрице (только не из центра, а из нулевого элемента и по часовой стрелке) и записывать текущие элементы матрицы подряд в доп. массив.
	int i = 0;                                                              // счётчик строк
	int j = 0;                                                              // счётчик столбцов
	int tempN = n;                                                          // некоторый счётчик. на каждом шаге цикла while, я иду по новой спирали - каждая следующая спираль находится в нутри предыдущей, этот некоторый счётчик и показывает границы моей текущей спирали для i и j на текущем шаге цикла while.
	int k = 0;                                                              // счётчик, бегающий по моему дополнительному массиву a.

	while(i < tempN){
            j = n - tempN;
            while (j < tempN){                                                  // пробегаем верхнюю линию спирали текущей (слева-направо)
                a1[k] = a[i][j];
                k++;
                j++;
            }
            j--;
            i++;
            while (i < tempN){                                                  // пробегаем правую боковую линию текущей спирали (сверху-вниз)
                a1[k] = a[i][j];
                k++;
                i++;
            }
            i--;
            j--;
            while(j >= n - tempN){                                              // пробегаем нижнюю линию текущей спирали (справа-налево)
                a1[k] = a[i][j];
                k++;
                j--;
            }
            j++;
            i--;
            while (i > n - tempN){                                              // пробегаем левую боковую линию текущей спирали (снизу-вверх)
                a1[k] = a[i][j];
                k++;
                i--;
            }
            i++;
            tempN--;
	}

	for(i = n * n - 1; i >= 0; i--)                                         // вывожу мой дополнительный массив с конца, так как по условию необходимо выводить элементы спиралью из центра, а не с нулевого элемента
            System.out.print(" " + a1[i]);
        
        System.out.println();
    }

}
