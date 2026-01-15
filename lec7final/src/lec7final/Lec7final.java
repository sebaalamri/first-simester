
package lec7final;

import java.util.*;
public class Lec7final {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the size of the array: ");
    int size = input.nextInt();
    double[] arr = new double[size];
     for(int i=0;i<arr.length;i++){
      System.out.println("enter the element in index "+i+": ");  
      arr[i]=input.nextDouble(); }
     System.out.println("enter the number: ");
    double num = input.nextDouble();
     double[] arr2 =copygraterthan ( arr, num); 
     System.out.println("the array after : ");
     for(double n: arr2 ){
     System.out.print(n+ " ");    
     }
    
    }
    
public static double[] copygraterthan (double[] arr,double num){
  
 
  int size2=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>num){
       size2++; }
       
      }
     double[] arr2 = new double[size2];
     int j=0; 
     for(int i=0;i<arr.length;i++){ 
          if(arr[i]>num){
       arr2[j]=arr[i];
          j++;}
       }
     

  return arr2;
    
}
        
        
        
        
        }
