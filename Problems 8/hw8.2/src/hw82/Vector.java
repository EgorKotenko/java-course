
package hw82;

/**
 * Класс "Вектор"
 * @author Егор
 */
public class Vector {

    protected int i;
    protected int j;

    Vector() {
        i = 0;
        j = 0;
    }

    /**
    * Конструктор класса: принимает координаты вектора.
    * @param x i-координата вектора
    * @param y j-координата вектора
    */
    Vector(int x, int y) {
        i = x;
        j = y;
    }

     /**
    * Конструктор копированияа.
    * @param copy Вектор, копию которого нужно создать.
    */
    Vector(Vector copy) {
        i = copy.i;
        j = copy.j;
    }

    /**
    * Сложение векторов.
    * @param a Вектор, который надо прибавить к текущему.
    */
    public Vector composition(Vector a) {
        Vector result = new Vector();
        result.i = i + a.i;
        result.j = j + a.j;
        return result;
    }

    /**
    * Вычитание векторов.
    * @param a Вектор, который надо вычесть из текущего.
    */
    public Vector subtraction(Vector a) {
        Vector result = new Vector();
        result.i = i - a.i;
        result.j = j - a.j;
        return result;
    }

    /**
    * Сколярное произведение векторов.
    * @param a Вектор, который надо сколярно умножить на текущий.
    */
    public double scalarMiltiplication(Vector a) {
        return Math.pow(Math.pow(i - a.i, 2) + Math.pow(j - a.j, 2), 0.5);
    }

    /**
    * Проверка на то, является ли вектор нулевым.
    */
    public boolean isZero() {
        return ((this == null) || (i == 0 && j == 0));
    }

    /**
    * Вывод координат вектора на экран.
    */
    public void print() {
        if (isZero())
            System.out.println("Zero vector");
        else
            System.out.println("(" + i + ";" + j + ")");
    }

    /**
    * Длина вектора.
    */
    public double length() {
        return Math.pow(i*i + j*j, 0.5);
    }
}
