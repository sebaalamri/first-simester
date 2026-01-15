
package methodpractice5;

import java.util.Scanner;
public class Methodpractice5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to larger program.");
        int CHOICE = 0;
        
        do{
        System.out.println("please enter your choice\n1 for comparing two intgeres\n2 for comparing two doubles\n3 for comapring two characters\n-1 to exit the program");
        CHOICE = input.nextInt();
        
        switch(CHOICE){
            case 1:
             System.out.print("please Enter two intgers: "); 
             int num1 = input.nextInt();
             int num2 = input.nextInt();
             int maxmum1 = larger(num1,num2);
             System.out.println("the larger is: " + maxmum1); 
             break;
            case 2 :
             System.out.print("please Enter two doubles : ");   
             double dou1 = input.nextDouble();
             double dou2 = input.nextDouble();
             double maxmum2 = larger(dou1,dou2);
             System.out.println("the larger is: " + maxmum2); 
             break;
             
            case 3 :
              System.out.print("please Enter two characters : "); 
              char ch1 = input.next().charAt(0);
             char ch2 = input.next().charAt(0);
             char maxmum3 = larger(ch1,ch2);
             System.out.println("the larger is: " + maxmum3);
              break; } } while(CHOICE != -1);
        

   
    }
    
public static int larger (int num1,int num2){
    int max = num1;
    if(num2>num1){
        max=num2;
    }
    return max;
}
public static double larger (double dou1,double dou2){
    double max2 = dou1;
    if(dou2>dou1){
        max2=dou2;
    }
    return max2;
}

public static char larger (char ch1,char ch2){
    char max3 = ch1;
    if(ch2>ch1){
        max3=ch2;
    }
    return max3;
}













}
