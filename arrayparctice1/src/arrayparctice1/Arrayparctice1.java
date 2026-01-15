
package arrayparctice1;

import java.util.Scanner;
public class Arrayparctice1 {
   static double AVARGE =0;
    static double TOTAL =0;
   
   
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
        
        double[] STUDENTSGRADES = new double[10];
        
        for( int j=0; j<STUDENTSGRADES.length ; j++){
         System.out.println("Enter the score of the " +(j+1)+" student: ");
         STUDENTSGRADES[j] = input.nextDouble();
         TOTAL+= STUDENTSGRADES[j];
         
        }
         
        AVARGE = TOTAL/STUDENTSGRADES.length;

 System.out.printf("The avarge of the students grades is: %.2f " , AVARGE );

 double MAX = STUDENTSGRADES[0];
for( int i=1; i<STUDENTSGRADES.length ; i++){
    if(STUDENTSGRADES[i]>MAX){
        MAX = STUDENTSGRADES[i];
    } }
    
    System.out.printf(" \n The maximum grade is: %.2f " , MAX );
    
    
double MIN = STUDENTSGRADES[0]; 
    
    for( int s=1; s<STUDENTSGRADES.length ; s++){
    if(STUDENTSGRADES[s]<MIN){
        MIN = STUDENTSGRADES[s];
    } }
    System.out.printf(" \n The minmum grade is: %.2f " , MIN );
    
   
    
    
    
    
     
 }



         
    }
    
    
