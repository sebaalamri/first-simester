
package methodpractice1;

import java.util.*;
public class Methodpractice1 {

    public static void main(String[] args) {
           
     Scanner input = new Scanner (System.in);
     System.out.println("Enter the lower limit: ");
     int lowerLIMIT = input.nextInt();
     System.out.println("Enter the upper limit: ");
      int upperLIMIT = input.nextInt(); 
      
    int chosenNUMBER = (int) (Math.random()*(upperLIMIT-lowerLIMIT+1)+ lowerLIMIT);
        
   System.out.println("Guess the number between"+ lowerLIMIT + "and" + upperLIMIT + ": ");
   int guess = input.nextInt();
   
   if(guess==chosenNUMBER){
     System.out.println("CONGRAUALTIONS YOU GUESSED THE CORRECT NUMBER");

   }
   
   else{
       System.out.println("SORRY THE CORRECT NUMBER WAS: " + chosenNUMBER);
   }
    
    
    
    
    
    }
    
}
