
package javaapplication60;

import java.util.Scanner;
public class JavaApplication60 {

    
    public static boolean isPositive( int num){
    if(num>0){
        return true;
    }
   return false; 
    }

    public static void main(String[] args) {
    int[] arr = new int[10];
    Scanner input = new Scanner(System.in);
    System.out.print("Enter numbers: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=input.nextInt();
    }
    int num;
    int count=0;
     for(int i=0;i<arr.length;i++){
     num=arr[i];
     boolean s = isPositive( num);
     if(s){
      count++;   
     } } 
     System.out.println("you have entered "+count+" positive numbers ");
    } }
