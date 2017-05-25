
package hw82;

public class Main {

    public static void main(String[] args) {
        Vector a = new Vector(1,2);
        Vector b = new Vector(3,2);
        System.out.print("Сумма: ");
        a.composition(b).print();
        System.out.print("Разность: ");
        a.subtraction(b).print();
        System.out.println("Скалярное произведение: " + a.scalarMiltiplication(b));
        Vector copy = new Vector(a);
        copy.print();
    }

}
