
package javaapplication64;

import java.util.*;
public class JavaApplication64 {  
static Scanner input = new Scanner(System.in);



public static void printLetters( char[] letters){
   for(int i=0;i<letters.length;i++){
       System.out.print(letters[i]);
   }   
}
public static void replaceLetters( char[] letters,int index){
 for(int i=0;i<letters.length;i++){
     if(index==i){
         letters[i]='*';
     }
 }    
}
public static int countLetters( char[] letters,int index2){
    int count=0;
    for(int i=0;i<letters.length;i++){
        if(letters[i]==letters[index2]){
            count++;
        }
    }
    return count;
}

    
    public static void main(String[] args) {
    int choice;
    char[] letters = new char[5];    
       System.out.println("Welcome to the educaional game");
      System.out.println("please enter five letters: ");
      for(int i=0;i<letters.length;i++){
          letters[i]=input.next().charAt(0);
          System.out.println();
      }
    do{
      System.out.println("\nWhat would you like to do: \n1.print all letters\n2.replace a letter with asterisk\n3.count occurrence of a letter\n4.exit");
      System.out.println("your choice is:" );
      choice=input.nextInt();
      
      
      switch(choice){
          case 1:
              printLetters(letters);
          break;
          case 2:
          System.out.print("Enter the index of the letter you need to change: "); 
          int index =input.nextInt();
          replaceLetters( letters, index);
          break;
          case 3:
         System.out.print("Enter the index of the letter you need to count: ");  
         int index2 =input.nextInt();
         System.out.println("this letter appears in the array "+countLetters(  letters, index2)+" times");
         break;
          default:
             
              if(choice!=4){
                  System.out.println("choose from the minu, try again");
                  choice=input.nextInt(); }
             
            
      
    }while(choice!=4); 
    System.out.println("Thank you");    
        
        
        
        
         
        
        
        
    }
    
}
