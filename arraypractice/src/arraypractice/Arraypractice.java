
package arraypractice;

import java.util.*;
public class Arraypractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of people you want to add to the guest list: ");
        int people = input.nextInt();
        
        String[] arr = new String[people];
        System.out.print("\nEnter the names of the people: ");
        
        for(int i=0;i<arr.length;i++){
         System.out.print("\nEnter name "+(i+1)+": "); 
         String NAMES=input.next();
         arr[i]=NAMES;
        }
        
        System.out.print("\nGuests whose names start with'A': "); 
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0)=='A'){
            System.out.print("\n"+arr[i]); 
        }
            
            
        }
        
        
        
        
        

        
        
        
        
        
    }
    
}
