
package hw81;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Bag<String> col = new Bag<String>();
        col.add("aaa");
        col.add("bbb");
        col.add("ccc");
        col.add("ddd");
        col.remove("ccc");
        System.out.println("Collection size: " + col.size());
        col.print();
        if (col.contains("bbb"))
            System.out.println("Collection includes element 'bbb'");
        Iterator<String> i = col.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        Bag<String> col2 = new Bag<String>();
        col2.add("eee");
        col2.add("fff");
        col2.add("ggg");
        boolean flag = col.addAll(col2);
        col.print();
    }

}
