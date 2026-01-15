
package finallab7;

import java.util.*;
public class Finallab7 {
  public static void deduct(int[] salary){
  System.out.print("\nEnter the index of the empolyee you want to deduct "); 
  int index=input.nextInt();
  System.out.println("\nEnter the deduction amount: ");
  int amount=input.nextInt();
  if(amount>salary[index]){
      do{
      System.out.print("\ninvalid amount"); 
        System.out.println("\nEnter the deduction amount: ");
        amount=input.nextInt();
      }while(amount>salary[index]);
    salary[index]=salary[index]-amount;
  }
  
  } 
 public static void lowest(int[] salary){ 
int min=salary[0];
for(int i=1;i<salary.length;i++){
    if(salary[i]<min){
        min=salary[i];
    }
System.out.println("The lowest salary is: "+min);
}}
public static void dob_salary(int[] salary){

  for(int i=0;i<salary.length;i++){ 
salary[i]*=2;
 System.out.println("emplyee`s salary#"+(i+1)+salary[i]);
  }
  
}
  
    
    
    
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("How many employee`s salary will you enter?");
    int size = input.nextInt();    
    int[] salary = new int[size];    
    for(int i=0;i<salary.length;i++){   
    System.out.print("\nemployee`s salary "+(i+1)+" : ");  
            salary[i]=input.nextInt();
    }
    System.out.println("----------------------------------");
    int choice; 
    do{
    System.out.print("\nwhat would you like to do\n1.deduct the salary\n2.print the lowest salary\n3.double the salary\n4.exit\nyour choice is: "); 
    choice=input.nextInt();
    
    switch(choice){
        case 1:
        deduct(salary);  
      break;
        case 2:
        lowest(salary);
        break;
        case 3:
        dob_salary(salary);
         break;
        default:
    System.out.print("\n end of program.........thank you");        
    }
    
    } while(choice!=4);
    
    
    
    }
    
}
