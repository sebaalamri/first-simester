
package arraypmethod1;

import java.util.Scanner;
public class Arraypmethod1 {
 
    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
System.out.print("\n Enter the size of the array: ");
int SIZE = input.nextInt();

int[] ARRAY = new int[SIZE];

for(int i=0;i<ARRAY.length;i++){
System.out.print("\nEnter elemnt at index"+i+": ");
int ELE =input.nextInt();
ARRAY[i]=ELE;}

for(int n: ARRAY){
   System.out.print(n); 
}
    
        
        
        
} }
    
    

    

