
package methodpractice4;

import java.util.Scanner;
public class Methodpractice4 {
    static double CB = 0;
    static double AMOUNT =0;
    static int CHOICE=0;
    public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    
         System.out.println("1.deposit \n2.withdraw \n3.exit \nenter your choice: ");
          CHOICE = input.nextInt();
   
    
   if(CHOICE==1){
    System.out.println("Enter amount to deposit: ");
    AMOUNT = input.nextDouble();
         if(AMOUNT<=0){
               while(AMOUNT<=0) { 
                   System.out.println("error! enter a vaild amount");
                   AMOUNT = input.nextDouble(); }
         }
         System.out.printf("Deposit successful. current balance: %.1f \n", deposit(AMOUNT));
          System.out.println("1.deposit \n2.withdraw \n3.exit \nenter your choice: ");
          CHOICE = input.nextInt();
   }
           
if(CHOICE==2){
    System.out.println("Enter amount to withdraw: ");
    AMOUNT = input.nextDouble();
         if(AMOUNT<=0||AMOUNT>CB ){
               while(AMOUNT<=0||AMOUNT>CB) { 
                   System.out.println("error! enter a vaild amount");
                   AMOUNT = input.nextDouble(); }
         }
         System.out.printf("withdraw successful. current balance: %.1f \n", withdraw(AMOUNT));
          System.out.println("1.deposit \n2.withdraw \n3.exit \nenter your choice: ");
          CHOICE = input.nextInt();
   }
    
if(CHOICE==3){   
    System.out.println("thank you for using the banking system");
}
    
    
    
    
    
    }

public static double deposit(double a){
    CB +=AMOUNT;
    return CB;
    
}

public static double withdraw (double a){
    CB -=AMOUNT;
    return CB;
    
}


}