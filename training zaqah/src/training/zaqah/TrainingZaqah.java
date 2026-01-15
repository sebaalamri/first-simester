
package training.zaqah;

import java.util.Scanner;

public class TrainingZaqah {

    public static void main(String[] args) {

        string h = "hello";
        double hi = 27.9999;
                
        System.out.printf(" your book is%s your price is %.2f", h,hi);
        
        
        
Scanner input= new Scanner(System.in);

System.out.println("Welcome to GZCA");
System.out.print("Enter the gold wieght in grams:");

int goldWieght = input.nextInt();
final int GW = 200;
final double ZA = 0.025;
int gold_worth = goldWieght*GW;
double Zakat = gold_worth * ZA;

if (gold_worth>=3000){

    System.out.printf("The zakat is: %.0f Riyals" , Zakat );}
    
else {
    System.out.println("There is No Zakat");}
    
        
           
    }
    
}
