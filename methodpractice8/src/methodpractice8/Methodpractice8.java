
package methodpractice8;

import java.util.Scanner;
public class Methodpractice8 {

  
    public static void main(String[] args) {
        int choice =0;
        Scanner input = new Scanner(System.in);
         System.out.print("\nEnter 1 to aplly a precentge discount or 2 to aplly a fixed discount: ");
         choice = input.nextInt();  
        while(choice!=1&&choice!=2){
       System.out.print("\ninvalid choice. try again");
         System.out.print("\nEnter 1 to aplly a precentge discount or 2 to aplly a fixed discount: ");
         choice = input.nextInt();  }
        while(choice==1||choice==2){
            if(choice==1){
             System.out.print("\nEnter the original price: ");
             double ORG1 = input.nextDouble();
             System.out.print("\nEnter the discount precentge: ");
             double PRC1 = input.nextDouble();
             System.out.print("\nThe final price after discount is: "+ calculateDiscount(ORG1,PRC1) );
            }
            if(choice==2){
             System.out.print("\nEnter the original price: ");
             double ORG2 = input.nextDouble();
             System.out.print("\nEnter the discount amount in dollars: ");
             double PRC2 = input.nextDouble();
             System.out.print("\nEnter the threshold price: ");
             double LIMIT = input.nextDouble();
             System.out.print("\nThe final price after discount is: "+ calculateDiscount(ORG2,PRC2,LIMIT) );
            }
            System.out.print("\nEnter 1 to aplly a precentge discount or 2 to aplly a fixed discount: ");
        choice = input.nextInt();
        while(choice!=1&&choice!=2){
       System.out.print("\ninvalid choice. try again");
         System.out.print("\nEnter 1 to aplly a precentge discount or 2 to aplly a fixed discount: ");
         choice = input.nextInt();  }
        
        
        
        }
       
     
    
    
    
     } 

public static double calculateDiscount(double ORG1,double PRC1){
    double resul = ((PRC1/100)*ORG1);
    double result =ORG1-resul;
    return result;
}    
public static double calculateDiscount(double ORG2,double PRC2,double LIMIT){
    double result=0;
    if(ORG2>=LIMIT){
     double resul = ((PRC2/100)*ORG2);
     result =ORG2-resul;  
    
    }
    else{
    System.out.print("\nsorry!,  you need to buy more than"+LIMIT+"or equal to be able to use the discount. ");    
 
    }
    return result;
}   
}
        
        
   
     
        
        
        
        
    











