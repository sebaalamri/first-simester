package methodpractice7;

import java.util.*;
public class Methodpractice7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        int CHOICE = 0;

        System.out.print("Enter 1 to calculate area of a rectangle or 2 for a circle: ");
        CHOICE = input.nextInt();

        while (CHOICE != 1 && CHOICE != 2) {
            System.out.println("Invalid choice. Try again.");
            System.out.print("Enter 1 to calculate area of a rectangle or 2 for a circle: ");
            CHOICE = input.nextInt();
        }

        while (CHOICE == 1 || CHOICE == 2) {

            switch (CHOICE) {

                case 1:
                    System.out.print("\nEnter the length: ");
                    int LEANTH = input.nextInt();
                    System.out.print("\nEnter the width: ");
                    int WIDTH = input.nextInt();
                    calculateArea(LEANTH, WIDTH);
                    break;

                case 2:
                    System.out.print("\nEnter the radius: "); 
                    double radius = input.nextDouble();
                    calculateArea(radius);
                    break;
            }

            System.out.print("\nEnter 1 for rectangle or 2 for circle: ");
            CHOICE = input.nextInt();

            while (CHOICE != 1 && CHOICE != 2) {
                System.out.println("Invalid choice. Try again.");
                System.out.print("Enter 1 for rectangle or 2 for circle: ");
                CHOICE = input.nextInt();
            }
        }
    }

    public static void calculateArea(int LEANTH, int WIDTH) {
        int AREAREC = LEANTH * WIDTH;
        System.out.print("\nThe area of the rectangle is: " + AREAREC);
    }

    public static void calculateArea(double radius) {
        double result = (Math.PI * Math.pow(radius, 2));
        System.out.printf("\nThe area of the circle is: %.2f", result);
    }
}
