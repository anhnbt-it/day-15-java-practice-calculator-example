import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/23/2020
 * Time: 1:56 PM
 */
public class CalculationExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = input.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = input.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    public void calculate(int x, int y) {
        try {
            int addition = x + y;
            int subtraction = x - y;
            int multiplication = x * y;
            int division = x / y;
            System.out.println("Tổng x + y: " + addition);
            System.out.println("Tổng x - y: " + subtraction);
            System.out.println("Tổng x * y: " + multiplication);
            System.out.println("Tổng x / y: " + division);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
