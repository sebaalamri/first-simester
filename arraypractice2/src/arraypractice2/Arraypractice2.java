
package arraypractice2;

import java.util.Scanner;
public class Arraypractice2 {

   static double[] GRADES = new double[10];
   static Scanner input = new Scanner(System.in);
   
    
   
   
   public static void main(String[] args) {
    System.out.println("Welcome to the grade book for");   
    System.out.println("CS101 introdction to java programming");  
     
   READGRADES(GRADES);
   double avarge = AVARGE(GRADES);
   System.out.printf("Class avarge is : %.2f \n", avarge );
   
   double minmum = MIN(GRADES);
   System.out.printf("lowest grade is : %.2f \n", minmum);
   
   double maxmum = MAX(GRADES);
   System.out.printf("highest grade is : %.2f \n", maxmum);
   
   


        
      
    }

public static void READGRADES(double[] GRADES){
    
    System.out.print(" The grades are: ");
    
    for(int j=0;j<GRADES.length ;j++) {
      System.out.print("\nstudent "+ (j+1) + " : ");  
      GRADES[j] = input.nextDouble(); }
                                              } 

public static double AVARGE (double[] GRADES){
             double total =0;
     for(int i=0;i<GRADES.length ;i++) {
         total+=GRADES[i];    
     }
     double avarge = total/GRADES.length;
     return avarge;
                                             }

public static double MAX (double[] GRADES){
   double max = GRADES[0];
  for(int s=1;s<GRADES.length ;s++) {
      if(GRADES[s]>max){
          max = GRADES[s];
      }}
  return max; }
    
public static double MIN (double[] GRADES){
   double min = GRADES[0];
  for(int d=1;d<GRADES.length ;d++) {
      if(GRADES[d]<min){
          min = GRADES[d];
      }}
  return min; }    
    
    
    
    
    
    
}

    
    
    
    
    
    
    
    
    

