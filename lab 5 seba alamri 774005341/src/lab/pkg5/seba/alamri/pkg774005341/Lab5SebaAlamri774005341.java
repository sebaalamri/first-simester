
package lab.pkg5.seba.alamri.pkg774005341;

import java.util.Scanner;

public class Lab5SebaAlamri774005341 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        int hours = input.nextInt();

        if (hours < 0) {
            System.out.println("Invalid input");
        } else if (hours <= 40) {
            int salary = hours * 50;
            System.out.println("Your salary is " + salary + " SAR");
        } else {
            int extraHours = hours - 40;
            int salary = (40 * 50) + (extraHours * 75);
            System.out.println("Your salary is " + salary + " SAR");
        }
    }
}