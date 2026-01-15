
package arraynmethod3;

import java.util.*;
public class Arraynmethod3 {
static int multi=1;
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.print("\nEnter the size of the array: ");
     int SIZE = input.nextInt();
     
    int[] ARRAY = new int[SIZE];
    System.out.print("\nEnter the elements of the array: ");
    for(int i=0;i<ARRAY.length;i++){
      System.out.print("\nEnter element at the index : "+i+": "); 
      int ee = input.nextInt();
      ARRAY[i]=ee;
      if(ARRAY[i]%2==0){
       multi=multi*ARRAY[i];    
      }
    }
    System.out.print("\nthe result of multipying all even numbers in the array is: "+ multi);
    
    
    
     
    
        
               
    } 
    
        
    }
    
        
        
        
        
    
    

