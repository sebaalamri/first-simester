
package years;
import java.util.Scanner;
public class Years {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter your salary:");
        int salary = input.nextInt();
        
        System.out.print("Enter your years of experience:");
        int YEARS = input.nextInt();
        final int MIN_YEARS = 5;
        
        
        if(YEARS>MIN_YEARS){ 
            double new_salary = salary+(salary*0.10);
           System.out.printf("your new salary is: %.1f SAR" , new_salary); 
        }
        
        else{
            double new_salary = salary+(salary*0.05);
           System.out.printf("your new salary is: %.1f SAR" , new_salary); 
        }
        
   
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
