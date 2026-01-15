
package water;

import java.util.Scanner;
public class Water {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to WD.");
        System.out.print("Enter bottle size: ");
        
        
        int bottle_size = input.nextInt();
        final int pump = 300;
        
       double num_pump = bottle_size/pump;
        System.out.println("\nNumber of pumps=" + (int)num_pump);
       
      if(num_pump>4){
          System.out.println("WD in rest mode for half minute");
      }
      else{
          System.out.println("Enjoy your water");
      }
        
        
        
        
        
        
        
        
        
        
    }
    
}
