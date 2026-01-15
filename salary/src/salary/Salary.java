
package salary;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
  
   System.out.println("Welcome to AIR.");
   System.out.print("Enter the salary in month:");
    
    int monthly_salary = input.nextInt();
   final int MT = 12;
   int annaul_salary = monthly_salary*MT;
   
   if(annaul_salary<=360000){
       System.out.println("The annual salary equal to: " + annaul_salary + " SR\n AIR IS 2.5%");
   }
   else{
        System.out.println("The annual salary equal to: " + annaul_salary + " SR\n AIR IS 3.5%");
   }
   
   
        
        
        
        
        
    }
    
}
