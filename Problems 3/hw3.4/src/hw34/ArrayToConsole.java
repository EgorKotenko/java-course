
package hw34;

public class ArrayToConsole extends AnticlockSpiral {

    public void printArray(int[][] a, int[] a1, int n) {
        System.out.println("Initial matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(" " + a[i][j]);
                System.out.println();
        }
        System.out.println("Elements of the array in an anticlockwise spiral: ");
        for(int i = n * n - 1; i >= 0; i--)
            System.out.print(" " + a1[i]);
        System.out.println();

    }
}
