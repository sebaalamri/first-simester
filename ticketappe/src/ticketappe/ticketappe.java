
package ticketappe;


import java.util.Scanner;
public class ticketappe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int child = 0;
        int teen = 0;
        int adult = 0;
        
        System.out.print("Enter the number of visitors: ");
        int visitors = input.nextInt();
        
        
        for(int i = 1; i<= visitors; i++){
            System.out.print("Enter the age of visitor" + i + ": ");
            int age = input.nextInt();
            
            if(age>= 1 && age<= 12)
            child++;
            
            else if (age>=13 && age <= 17)
                teen++;
            
            else if (age>=18)
                adult++;    
            }
                
            System.out.println("Child tickets : " + child);
            System.out.println("teen tickets : " + teen);
            System.out.println("adult tickets: " + adult);
            
       
    }
    
}


