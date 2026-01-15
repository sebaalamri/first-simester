
package javaapplication43;
import java.util.Scanner;
public class JavaApplication43 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
System.out.print("\n Enter the size of the array: ");
int SIZE = input.nextInt();

int[] ARRAY = new int[SIZE];

for(int i=0;i<ARRAY.length;i++){
System.out.print("\nEnter elemnt at index"+i+": ");
int ELE =input.nextInt();
ARRAY[i]=ELE;}
System.out.print("\ninitial array: \n");

PRINT(ARRAY);

for(int i=0;i<ARRAY.length;i++){
ARRAY[i]=ARRAY[i]*3; }
System.out.print("\nmodified array: \n");
PRINT(ARRAY);


}

public static void PRINT(int[] ARRAY){
    
    for(int i=0;i<ARRAY.length;i++){
     System.out.print(ARRAY[i]);
   System.out.print(" ");    
    }
    
}

        
        
        
    }
    

