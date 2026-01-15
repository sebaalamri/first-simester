/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication63;

/**
 *
 * @author hp
 */
public class JavaApplication63 {
import java.util.*;
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        
        System.out.print("\n would you like to print a pattern? ");
       String u =input.next();
       if(u.equals("yes")){
        System.out.print("\n enter numbers of row: ");  
        int row = input.nextInt();
           inertiedlinealingmethod(row);  
    }
    
}
