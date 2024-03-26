package practice;
import java.util.Scanner;
public class Number {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Num myNums = new Num();

        System.out.print("Enter the first number: ");
        double num1 = keyboard.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = keyboard.nextDouble();
        myNums.setNums(num1, num2);

        double sum = myNums.calSum();
        double product = myNums.calProduct();

        System.out.println("Sum of the two numbers: " + sum);
        System.out.println("Product of the two numbers: " + product);

        keyboard.close();
    }
}
