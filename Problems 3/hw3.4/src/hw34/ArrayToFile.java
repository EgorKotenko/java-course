
package hw34;

import java.io.*;

class ArrayToFile extends AnticlockSpiral {

    public void printArray(int[][] a, int[] a1, int n) throws IOException {
        FileWriter file = new FileWriter("hw3_4.txt");
        file.write("Initial matrix:\r\n");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                file.write(" " + a[i][j]);
            file.write("\r\n");
        }
        file.write("Elements of the array in an anticlockwise spiral: \r\n");
        for(int i = n * n - 1; i >= 0; i--)
            file.write(" " + a1[i]);
        file.close();
        System.out.println("Operation comleted. Check out 'hw3_4.txt', please.");
    }
}
