/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayslab12;

import java.util.Scanner;
public class Arrayslab12 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] array = new int [2][2];
        int zero = 0;
        
        
        for(int i=0; i<2;i++){
            for(int j=0; j<2;j++){
                System.out.print("enter vaulue for [" + i + "][" + j +"]: ");
                array[i][j] = input.nextInt();
                
                if(array[i][j]==0){
                    zero++;
                }
            }
        }
        
        System.out.println("Number of zeros: " + zero);
     
        
    }
    
}
