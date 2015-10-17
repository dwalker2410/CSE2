// Donterrius Walker
// October 9, 2015
// CSE02 - Encrypted X

import java.util.Scanner;
    
public class encrypted_x{
    // main method is required for every java program
  public static void main(String [] args){
      Scanner myScanner = new Scanner(System.in); //declaring a scanner
      
      System.out.print("Input a number between 1-100: "); //Prints out the following command
      
      
      boolean acceptable =false; // declaring something to be false, will later be used for a loop
      
      int myInput = 0; //declaring that "myInput will equal zero"
      
      //the loop that will determine that an integer between 1-100 is typed in or not
      while(!acceptable){
      
      while(!myScanner.hasNextInt()){
          System.out.println("  Error: need a int between 1-100");
          System.out.print("Input a number between 1-100: ");
          myScanner.next();
          
      }
      
      myInput = myScanner.nextInt(); //declaring that the integer that will be typed in will be "myInput"
      
      
        if (myInput > 0 && myInput < 101){
            acceptable = true; 
         }
         else{
            System.out.println("  Error: need a int between 1-100");
            System.out.print("Input a number between 1-100: ");
         }
      }
      
      //where we make sure that the shape of an "X" is printed out
      int z = myInput - 1;
      int x = 0;
      
      for (int i = 0; i < myInput; i++){
          for (int d = 0; d < myInput; d++){
              
              if (i == x && d==z){
                    System.out.print(" "); //spaces from bottom left to top right
              }
              else if (i == d){
                  System.out.print(" "); //spaces from top left to bottom right
              }
              
              else {
                System.out.print("*");
              }
          }
          System.out.println();
          z--; //decreases the value of "z"
          x++; //increases the value of "x"
      }
      
  }
}// end of program