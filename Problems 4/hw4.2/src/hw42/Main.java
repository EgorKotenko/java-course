
package hw42;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader file = new FileReader("hw4_2.txt");
        BufferedReader fileInput = new BufferedReader(file);
        char[] s = new char[20];
        char c = (char) file.read();
        int i = 0;
        while (c != ' ') {
             s[i] = c;
             i++;
             c = (char) file.read();
        }
        fileInput.close();
        System.out.println(s);
        System.out.println(i);
        HashTable x = new HashTable();
        x.printStatistics();
        try {
            x.deleteByWord("ololo");
        } catch (RemoveNullElementException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.INFO, "", ex);
        }
        try {
            String str = x.searchByKey(100500);
        } catch (SearchNullElementException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.INFO, "", ex);
        }
    }

}
