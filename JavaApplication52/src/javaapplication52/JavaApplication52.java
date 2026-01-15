
package javaapplication52;
import java.io.PrintStream;
import java.util.*;
public class JavaApplication52 {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.print("Enter the size of the array: ");
    int size = input.nextInt();
    
    int[] ARRAY = new int[size];
    
    for(int i=0;i<ARRAY.length;i++){
     System.out.print("\nEnter the element in the index "+(i+1)+": "); 
     ARRAY[i]=input.nextInt();
    }
    System.out.print("\nchoose an opreation to preform from the menu: "); 
    int choice;
    do{
        
    System.out.println("\n1.sum elemnts\n2.sum even elements\n3.count odd elements\n4.increase by\n5.search elemnts\n6.display\n7.exit\n");
     choice =input.nextInt();
    
    
    

    
    switch(choice){
    
        case 1 : 
            System.out.print("\nThe sum of the elemts in the array is " + sum(ARRAY));
            break;
        case 2:
            System.out.print("\nThe sum of the even elemts in the array is " + sumEVEN(ARRAY));
            break;
        case 3:
            System.out.print("\nThe count of odd elemts in the array is " + countODD(ARRAY));
            break;
        case 4:
            System.out.println("\nEnter the wanted number to increace by: "); 
            int num=input.nextInt();
            System.out.println("\nthe array after incresing:" );
            increacedBY(ARRAY,num);
            break;
        case 5:
            printARRAY(ARRAY);
            break;
        case 6:
            System.out.println("\nEnter the wanted number you searching for: ");
            int SRCH=input.nextInt();
            
            if(searchELEMNTS(ARRAY,SRCH)==-1){
            System.out.print("\nnot found"+searchELEMNTS(ARRAY,SRCH));    
            } 
             else{
        System.out.print("\n the numbers you are searcing for is at index:" + searchELEMNTS(ARRAY,SRCH) );     
             }
        
                    
    
    
    }  }while(choice!=7);
    
    
    

    }
    
  
public static int sum(int[]ARRAY){
    int total =0;    
    for(int i=0;i<ARRAY.length;i++){
    total+=ARRAY[i];    
    }
return total;    
    }
    
    
     public static int sumEVEN(int[]ARRAY){
      int total =0;   
    for(int i=0;i<ARRAY.length;i++){
    if(ARRAY[i]%2==0){
        total+=ARRAY[i];     
    }   
    }
return total;    
    }
     
     public static int countODD(int[]ARRAY){
      int total =0;   
    for(int i=0;i<ARRAY.length;i++){
    if(ARRAY[i]%2!=0){
        total++;    
    }   
    }
return total;    
    }
     
    public static void increacedBY(int[]ARRAY,int num){
       
    for(int n : ARRAY){    
    System.out.print((n+num)+" ");
 
    }
   
    }
    
    public static void printARRAY(int[]ARRAY){
       
    for(int n : ARRAY){    
    System.out.print(n+" ");
 
    }
   
    }
    public static int searchELEMNTS(int[]ARRAY,int SRCH){
  
       
    for(int i=0;i<ARRAY.length;i++){
    if(ARRAY[i]==SRCH){
    return i;
   
     }
       }
    return -1;
 
       
        


} }  
