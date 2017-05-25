
package hw34;

import java.util.Random;

public class AnticlockSpiral {

    public void arrayBuild(int[][] a, int[] a1, int n) {
        Random rand = new Random(System.currentTimeMillis() | 0xFACE0FF);
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
		a[i][j] = rand.nextInt(90) + 10;
        int i = 0;
        int j = 0;
        int tempN = n;
        int k = 0;

        while(i < tempN){
            j = n - tempN;
            while (j < tempN){
                a1[k] = a[i][j];
                k++;
                j++;
            }
            j--;
            i++;
            while (i < tempN){
                a1[k] = a[i][j];
                k++;
                i++;
            }
            i--;
            j--;
            while(j >= n - tempN){
                a1[k] = a[i][j];
                k++;
                j--;
            }
            j++;
            i--;
            while (i > n - tempN){
                a1[k] = a[i][j];
                k++;
                i--;
            }
            i++;
            tempN--;
        }
    }
}
