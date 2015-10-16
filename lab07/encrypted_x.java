// Donterrius Walker
// October 13, 2015
// CSE02 - Encrypted X

import java.util.Scanner;
    
public class encrypted_x{
    // main method is required for every java program
  public static void main(String [] args){
      Scanner myScanner = new Scanner(System.in);
      
      System.out.print("Input a number between 1-100: ");
      
      //int myInput = myScanner.nextInt();
      
      //boolean acceptable = false;
      
      //System.out.print("Input a number between 1-100: ");
      //while( !acceptable ) {
            //if ( myScanner.hasNextInt() ) {
              //  acceptable = true;

         // else {
             // System.out.println("  Error: need a int between 1-100");
             // System.out.print("Input a number between 1-100: ");
            // myScanner.next();
      
      boolean acceptable =false;
      
      int myInput = 0;
      
      while(!acceptable){
      
      while(!myScanner.hasNextInt()){
          System.out.println("  Error: need a int between 1-100");
          System.out.print("Input a number between 1-100: ");
          myScanner.next();
          
      }
      
      myInput = myScanner.nextInt();
      
      
        if (myInput > 0 && myInput < 101){
            acceptable = true; 
         }
         else{
            System.out.println("  Error: need a int between 1-100");
            System.out.print("Input a number between 1-100: ");
         }
      }
      
      int z = myInput - 1;
      int x = 0;
      
      for (int i = 0; i < myInput; i++){
          for (int d = 0; d < myInput; d++){
              
              if (i == x && d==z){
                    System.out.print(" ");
              }
              else if (i == d){
                  System.out.print(" ");
              }
              
              else {
                System.out.print("*");
              }
          }
          System.out.println();
          z--;
          x++;
      }
      
      
      
      
      
     /* 
     for(int rows = 1; rows <= myInput; rows++){
         for(int cols = 1; cols < myInput; cols++){
             if (rows == cols || cols==(myInput + 1) - rows){
                 System.out.print("*");
             }
             else {
                 System.out.print(" ");
             }
             System.out.println();
         }
     }
      */
      
      
      
      
      
      
      
      
      
      
      
      
  }
}