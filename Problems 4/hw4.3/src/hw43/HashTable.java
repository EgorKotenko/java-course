
package hw43;

import java.io.*;

/**
 * Описывает построение и работу хэш-таблицы.
 * @author Егор
 */
public class HashTable extends List{

    public HashFunctionsI hashF = new HashFunctionsI() {

        public int hashTheString(String str, int hashNumber) {
            return 1;
        }
    };

    /**
    * Устанавливает заданную пользователем хэш-функцию в качестве основной используемой.
    * @param newFunction Новая хэш-функция, заданная пользователем.
    */
    public void setFunction(HashFunctionsI newFunction) {
        hashF = newFunction;
    }

    /**
    * Позволяет переключаться между имеющимися хэш-функциями.
    * @param choise Номер желаемой хэш-функции.
    */
    public void switchFunction (int choise) {
        if (choise == 1)
            hashF = new HashFunction();
        else if (choise == 2)
            hashF = new EasyHashFunction();
        else
            System.out.println("Error: wrong hash-function's index! It must be '1' or '2'!");
    }
    /**
    * Считывает данные из файла "hw4_2.txt".
    */
    public void collectingData() throws IOException {
        FileReader file = new FileReader("hw4_3.txt");
        BufferedReader fileInput = new BufferedReader(file);
        String str = fileInput.readLine();
        String[] strList = str.split(" ");
        int j = 0;
        while (j < strList.length) {
            int index = hashF.hashTheString(strList[j], hashNumber);
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
    */
    public void printStatistics() throws IOException {
        switchFunction(1);
        //switchFunction(2);
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
    * @param key Ключ, данные закодированные которым нужно вернуть.
    */
    public String searchByKey(int key) throws SearchNullElementException{
        if (a[key % hashNumber] == null)
            throw new SearchNullElementException(" searching for non-existent element");
        return a[key % hashNumber].first.str;
    }

    /**
    * Удаляет всю цепочку ключа, которым закодировано данное на вход слово.
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
