
package testfinal1;
import java.util.*;
public class Testfinal1 {
    
    

   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the size of the array: ");
   int size =input.nextInt();
   double[] arr = new double [size];
   for(int i=0; i<arr.length;i++){
    System.out.print("\nEnter the elemnt in the index "+i+": ");
    arr[i]=input.nextDouble();
   }   
       
       
       
    }
    
}
