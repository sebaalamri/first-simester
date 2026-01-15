
package javaapplication61;

import java.util.Scanner;
import java.lang.Math;
public class JavaApplication61 {
    static Scanner input = new Scanner(System.in);
public static void modifylist(String[] BOOKNAMES,int index){
for(int i=0;i<BOOKNAMES.length;i++){
if(i== index){
  System.out.print("\nThe new name for "+ BOOKNAMES[i]+"is: ");  
    BOOKNAMES[i]= input.next();
}    
}

    
}

public static void modifylist (int[] CHAPTERS){
for(int i=0;i<CHAPTERS.length;i++){
 System.out.print("\nChapters for "+i+": ");
 CHAPTERS[i]=10+(int)(Math.random()*(50-10+1));
}    
}
public static void modifylist (int[] CHAPTERS,String[]BOOKNAMES){
    System.out.print("\nName\tchapters");
    for(int i=0;i<CHAPTERS.length;i++){
     System.out.printf("\n%s\t%d",BOOKNAMES[i],CHAPTERS[i]);    
    }
}
public static void inertiedlinealingmethod(int row){
    for(int i=0;i>=row;i++){
        for(int j=0;j>=row;i--){
         System.out.print("*");   
        }
        System.out.println();
    }
}
    
    

    
    public static void main(String[] args) {
     String[] BOOKNAMES ={"Wonder","Math","Giver","Hamlet","Alice","Wish"};
     int[] CHAPTERS = new int[BOOKNAMES.length] ;
     int choice;
     do{
     System.out.println("-----MINU----");
         System.out.print("1-Modify a book name.\n2-Modify number of chapters for all books.\n3-Print books list with prices\n4-exit\n");
         System.out.print("enter your choice: ");
         choice=input.nextInt();
         switch(choice){
             case 1: 
            System.out.print("\nEnter book index number: ");
            int index =input.nextInt();
            if(index>=0&&index<=5){
                modifylist(BOOKNAMES,index);
            }
            else{ 
           do{
            System.out.print("\n it has to be between 0 and 5 try again!");
            index =input.nextInt();
           } while(index<0||index>5);
           modifylist(BOOKNAMES,index);
            }
           break;
             case 2:
             modifylist (CHAPTERS);    
           break;
             case 3:
             modifylist ( CHAPTERS,BOOKNAMES);    
            break;
             case 4 :
                 break;
          
             default:
              System.out.print("\ninvalid choice\n");     
         }
         
     }while(choice!=4);
    
       System.out.print("\n would you like to print a pattern? ");
       String u =input.next();
       if(u.equals("yes")){
        System.out.print("\n enter numbers of row: ");  
        int row = input.nextInt();
           inertiedlinealingmethod(row);   
       }
       
    }
    
}
