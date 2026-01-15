
package methodpractice2;

import java.util.Scanner;
public class Methodpractice2 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
   System.out.println("Welcome to sweet treats bakery!");
   
   System.out.println("Enter the type of treat (cakes , cookies , cupcakes) : ");     
   String type = input.next(); 
   System.out.println("Enter the quanity: ");
   int amount = input.nextInt();
   
 
   
int totalprice = caculateTOTALPRICE(type,amount);

System.out.println("total price for "+ amount + type +":" + totalprice);
 
    }
  
  public static int caculateTOTALPRICE(String type,int amount){
    int totalprice =0;
      switch(type){
          case "cakes": 
        totalprice = 15*amount;    
       
         break;
          case "cookies" :
            totalprice = 5*amount;    
        break;
          case "cupcakes" :
          totalprice = 3*amount;
           break;

      }
    return totalprice;  
      
      
      
  } 
    
    
    
    
    
    
    
    
    
    
    
    
}
