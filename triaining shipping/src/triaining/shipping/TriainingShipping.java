
package triaining.shipping;
import java.util.Scanner;
public class TriainingShipping {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the weight of the package in kilograms:");
double WEIGHT = input.nextInt();

final int commission = 3;

if (WEIGHT<=10){
   double SHIPPING_COAST1 =(5+commission);
   System.out.printf("The shipping cost for a package weighing %.1f kilograms is: %.1f SR   ",WEIGHT ,SHIPPING_COAST1);
}

else {
    double SHIPPING_COAST2 =(10+commission);
    System.out.printf("The shipping cost for a package weighing %.1f kilograms is: %.1f SR   ",WEIGHT ,SHIPPING_COAST2);
}














    }
    
}

