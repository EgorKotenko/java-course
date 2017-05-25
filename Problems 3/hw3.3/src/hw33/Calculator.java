
package hw33;

/**
 * Описывает класс "Калькулятор": по строке string, являющейся постфиксной записью выражения, вычисляется значение этого выражения.
 * @author Егор
 */
public class Calculator {

    protected String string = new String();
    private Stack2 stack = new Stack2();

    /**
    * Обрабатывает операцию умножения.
    * @author Егор
    */
    private int multiplication() {
        int temp = stack.pop();
        return temp * stack.pop();
    }

    /**
    * Обрабатывает операцию деления.
    * @author Егор
    */
    private int division() {
        int temp = stack.pop();
        return (int)stack.pop()/temp;
    }

    /**
    * Обрабатывает операцию сложения.
    * @author Егор
    */
    private int addition() {
        int temp = stack.pop();
        return temp + stack.pop();
    }

    /**
    * Обрабатывает операцию вычитания.
    * @author Егор
    */
    private int subtraction() {
        int temp = stack.pop();
        return stack.pop() - temp;
    }

    /**
    * Осуществяляет непосредственно вычисление значения постфиксного выражения, содержащегося в строке string.
    * @author Егор
    */
    public int calculation() {
        int length = string.length();
        char[] str = string.toCharArray();
        for (int i = 0; i < length; i ++) {
            if ((str[i] >= '0') && ( str[i] <= '9'))
                stack.push(str[i] - '0');
            else if (str[i] == '*') {
                stack.push(multiplication());
            } else if (str[i] == '/') {
                stack.push(division());
            } else if (str[i] == '+') {
                stack.push(addition());
            } else if (str[i] == '-') {
                stack.push(subtraction());
            } else 
                return 100500;
        }
        return stack.top();
    }

}
