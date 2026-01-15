package evaluation10;

import java.util.Scanner;
public class JavaEvaluation10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("choose shape to calculate volume: ");
        System.out.println("1. rectangular prism");
        System.out.println("2. cylinder");
        System.out.print("enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter the length of the rectangular prism: ");
            int length = input.nextInt();
            System.out.print("Enter the width of the rectangular prism: ");
            int width = input.nextInt();
            System.out.print("Enter the height of the rectangular prism: ");
            int height = input.nextInt();

            int volume = calculateVolume(length, width, height);
            System.out.println("The volume of the rectangular prism = " + volume);

        } else if (choice == 2) {
            System.out.print("Enter the radius of the cylinder: ");
            double radius = input.nextDouble();

            System.out.print("Enter the height of the cylinder: ");
            double height = input.nextDouble();

            double volume = calculateVolume(radius, height);
            System.out.println("The volume of the cylinder = " + volume);

        } else {
            System.out.println("invalid choice.");
        }
    }

    public static int calculateVolume(int length, int width, int height) {
        return length * width * height;
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}
