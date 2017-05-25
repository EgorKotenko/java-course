
package hw51;

import java.io.*;

/**
 * Описывает построение и работу хэш-таблицы.
 * @author Егор
 */
public class HashTable extends List{

    /**
    * Вычисляет значение хэш-функции по введённой строке.
    * @author Егор
    * @param string Строка, значение хэш-функции от которой нужно вычислить.
    */
    public int hashTheString (String str) {
        int temp = 0;
        int k = 31;
        int t = 11;
        char[] s = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            temp += ((s[i] - 'a' + 1) * k) % t;
            k *= 31;
            t*= 11;
        }
        if (temp % hashNumber < 0)
            return (-1)*(temp % hashNumber);
        else
            return temp % hashNumber;
    }

    /**
    * Считывает данные из файла "hw4_2.txt".
    * @author Егор
    */
    public void collectingData() throws IOException {
        FileReader file = new FileReader("hw4_2.txt");
        BufferedReader fileInput = new BufferedReader(file);
        String str = fileInput.readLine();
        String[] strList = str.split(" ");
        int j = 0;
        while (j < strList.length) {
            int index = hashTheString(strList[j]);
            //System.out.println(strList[j]);
            //System.out.println(index);
            if (a[index] == null) {
                a[index] = new List();
                a[index].addToList(strList[j], 1);
            } else {
                Node l = a[index].first;
                boolean flag = true;
                while ((l != null) && (flag)) {
                    if (strList[j].equals(l.str)) {
                        l.value += 1;
                        flag = false;
                    }
                    l = l.next;
                }
                if (flag)
                    a[index].addToList(strList[j], 1);
            }
            j++;
        }
    }

    /**
    * Собирает статистику на основе данных из файла (общее количество коллизий, максимальная длинна цепочки).
    * @author Егор
    */
    public void statistics() {
        for (int i = 1; i < hashNumber + 1 ; i++) {
            if (a[i] != null) {
                words += a[i].first.value;
                collisionsNumber += a[i].length() - 1 ;
            }
        }
        for (int i = 1; i < 8112; i++) {
            if (a[i] != null) 
                if (a[i].length() > maxLength)
                    maxLength = a[i].length();
        }
    }

    /**
    * Выводит на экран статистику.
    * @author Егор
    */
    public void printStatistics() throws IOException {
        collectingData();
        statistics();
        System.out.println(" Statistics:");
        System.out.println("  Load factor:             " + (double) words / hashNumber);
        System.out.println("  NumberOfCollisions:      " + collisionsNumber);
        System.out.println("  Maximal list length:     " + maxLength);
        System.out.println("\n Word:             Times:");
	for (int i = 1; i < 8112 ; i++) {
            if (a[i] != null)
                a[i].printList();
        }
        System.out.println("\n");
    }

    /**
    * Возвращает данные закодированные полученным на вход ключём.
    * @author Егор
    * @param key Ключ, данные закодированные которым нужно вернуть.
    */
    public String searchByKey(int key) throws SearchNullElementException{
        if (a[key % hashNumber] == null)
            throw new SearchNullElementException(" searching for non-existent element");
        return a[key % hashNumber].first.str;
    }

    /**
    * Удаляет всю цепочку ключа, которым закодировано данное на вход слово.
    * @author Егор
    * @param string Слово, по которому надо удалить цепочку ключа.
    */
    public void deleteByWord(String string) throws RemoveNullElementException{
        boolean flag = true;
        int i = 0;
        while ((flag) && (i < hashNumber)) {
            if (a[i] == null)
                throw new RemoveNullElementException(" removing non-existent element");
            if (a[i].first.str.equals(string)) {          
                a[i] = null;
                flag = false;
            }
        }
    }

    protected int hashNumber = 8111;
    protected List[] a = new List[hashNumber + 1];
    protected int words = 0;
    protected int collisionsNumber = 0;
    protected int  maxLength = 0;
 
}
