package javaapplication62;

import java.util.*;
public class JavaApplication62 {
static Scanner input = new Scanner(System.in);
 
public static void inertiedlinealingmethod(int row){
    for(int i =0; i<row; i++){
        for(int j = 0; j < (row-i); j++){
            System.out.print("*");
        }
        System.out.println();
    }
}   

public static void main(String[] args) {
    System.out.print("\nWould you like to print a pattern? ");
    String u = input.next();
    
    if(u.equals("yes")){
        System.out.print("\nEnter number of rows: ");  
        int row = input.nextInt();
        inertiedlinealingmethod(row);  
    }
}
}
