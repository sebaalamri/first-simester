
package prices.java;

import java.util.Scanner;

public class PricesJava {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to DCA.");
        System.out.print("Enter the total price:");
        int total =input.nextInt();
        final double DISCOUNT = 0.1;
        int totalWdiscount = total- (int)(total*DISCOUNT);
        
        if (total>400){ 
            System.out.printf("The total price after the discount is: %d \n", totalWdiscount);
            }
        
        else { 
             System.out.printf("The amount is not eligible for a discount \n");
        }
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
    }
    
}
