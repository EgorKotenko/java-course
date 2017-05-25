
package hw33;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put in your expression: ");
        String string = input.next();
        Calculator calc = new Calculator();
        calc.string = string;
        if (calc.calculation() == 100500)
            System.out.println("Error: incorrect expression. Please, try again.");
        else
            System.out.println("Result: " + calc.calculation());
    }

}
