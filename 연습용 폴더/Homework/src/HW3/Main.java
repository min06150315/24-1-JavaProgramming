package HW3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Circle myCircle = new Circle();
        double area1, area2;

        System.out.print("Enter the first radius: ");
        int firstRadius = keyboard.nextInt();
        System.out.print("Enter the second radius: ");
        int secondRadius = keyboard.nextInt();

        myCircle.setFirstRadius(firstRadius);
        myCircle.setSecondRadius(secondRadius);

        myCircle.calculateArea();
        area1 = myCircle.getArea();
        myCircle.calculateCircumference();
        System.out.println("First circle: The area is " + myCircle.getArea() + " and the circumference is " + myCircle.getCircumference() + ".");

        myCircle.calculateArea();
        area2 = myCircle.getArea();
        myCircle.calculateCircumference();
        System.out.println("Second circle: The area is " + myCircle.getArea() + " and the circumference is " + myCircle.getCircumference() + ".");

        myCircle.calculateRatioArea();
        System.out.println("The ratio of the areas is " + myCircle.getRatioArea() + ".");
    }
}