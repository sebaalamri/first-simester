
package methodpractice3;

import java.util.Scanner;
public class Methodpractice3 {

   
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        
        System.out.println("enter an intger : ");
        int number = input.nextInt(); 
        
        boolean isEVEN = isEVEN(number);
        
        if (isEVEN == true){
        System.out.printf( "%d is even",number) ;
        }
        else {
           System.out.printf( "%d is odd",number) ;   
        }
 
    }
    
public static boolean isEVEN (int number){
      
    if (number%2==0){
    return true;
 
    }
    else {
        return false;
    }
   
      
  } 
    
    
    
    
}
