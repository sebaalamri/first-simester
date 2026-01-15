
package pkg447005341sebaalamri_labeva7;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int DAY = 1; 
        double sum =0;
        
        
        while (DAY<=3) { 
            System.out.print("Enter tempeutre for day" +DAY+ ":");
            double TEMPUTURE = input.nextDouble();
            sum+= TEMPUTURE;
            DAY++;
        }
   
        double AVARGE = sum/3;
        System.out.printf("Avarge temuture : %.2f", AVARGE );
        
        
        
        
        
        
        
        
        
        
    }
    
}
