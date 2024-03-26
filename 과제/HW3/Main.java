import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Circle myCircle = new Circle();

        System.out.print("Enter the first radius: ");
        double first = keyboard.nextDouble();
        System.out.print("Enter the second radius: ");
        double second = keyboard.nextDouble();
        myCircle.setRaduis(first, second);

        double area1 = myCircle.calArea1();
        double circum1 = myCircle.calCircumference1();
        double area2 = myCircle.calArea2();
        double circum2 = myCircle.calCircumference2();
        /*
        System.out.println("First circle: The area is " + area1 + " and the circumference is " + circum1 + ".");
        System.out.println("Second circle: The area is " + area2 + " and the circumference is " + circum2 + ".");
         */
        System.out.println("First circle: The area is " + String.format("%.2f", area1) + " and the circumference is " + String.format("%.2f", circum1) + ".");
        System.out.println("Second circle: The area is " + String.format("%.2f", area2) + " and the circumference is " + String.format("%.2f", circum2) + ".");
        
        double ratio = myCircle.calRatio(area1, area2);
        System.out.println("The ratio of the areas is " + String.format("%.2f", ratio) + ".");

        keyboard.close();
    }
}
