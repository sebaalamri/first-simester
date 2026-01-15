
package javaapplication25;

import java.util.Scanner;

public class JavaApplication25 {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);  
  int i=1;
  int num=0;
  for(i=1;i<=5;i++){
      System.out.printf("\nenter the %d number: ",i);
      num=input.nextInt();
      
      if(num>0){
          System.out.printf("%d is an positive number", num);
          
      }
      
      else if(num<0){
          System.out.printf("%d is an negitive number", num);
      }
      
      else {
           System.out.println("0 is niethar positive or negitive");
      }
      
      
      
      
      
      
      
  }
     


 }
  
 }
    

