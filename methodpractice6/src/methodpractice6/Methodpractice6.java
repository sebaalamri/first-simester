
package methodpractice6;
import java.util.Scanner;

public class Methodpractice6 {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter temputure by cielus: ");
       double CILUS = input.nextDouble();
       
        System.out.print("\nEnter 1 to convert to Fahrenhiet or 2 to convert to kelvin: ");
        int CHOICE = input.nextInt();
        
        switch(CHOICE){
            case 1:
                double frane = convert(CILUS);
                   System.out.println("tempreture in fahrenheit: " + frane);
                break;
            case 2:
                double b = 273.15;
                double kelvin = convert(CILUS,b);
                System.out.println("tempreture in kelvin: " + kelvin);
                break;
            default:
                System.out.println("invalid choice");
            
            
            
            
        }
    
    }
 public static double convert(double CILUS) {
   double fran = (CILUS*9/5)+32;
   return fran;
 }

 public static double convert(double CILUS,double b) {
   double kelvin = CILUS+b;
   return kelvin;
 }
    
    
    
}
