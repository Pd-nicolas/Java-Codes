import java.util.Scanner;
public class ConsoleTest {
    public static void main(String[] args) {
        Scanner calculation = new Scanner(System.in);
        System.out.println("enter a number:");
        int number1 = calculation.nextInt();
        System.out.println("enter another number:");
        int number2 = calculation.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }
}
