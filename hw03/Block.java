// Donterrius Walker
// September 13, 2015
// CSE02 - Block


 import java.util.Scanner;
    
public class Block{
    // main method is required for every java program
  public static void main(String [] args){
      Scanner myScanner = new Scanner(System.in);
      
      System.out.print("Enter the length of the block ");
      
      double blockLength = myScanner.nextDouble();
      
      System.out.print("Enter the width of the block ");
      
      double blockWidth = myScanner.nextDouble();
    
      System.out.print("Enter the height of the block ");
      
      double blockHeight = myScanner.nextDouble();
      
      double blockVol;
      double blockSurArea;
      
      blockVol = blockLength * blockWidth * blockHeight;
      blockSurArea = 2*blockLength*blockWidth + 2*blockWidth*blockHeight + 2*blockLength*blockHeight;
      
      
      System.out.println("The volume of the block of dimensions " + blockLength + " x " + blockWidth + " x " + blockHeight + " is " + blockVol); 
      
      System.out.println("The surface area of the block is " + blockSurArea);
      
      
      
      
      
      
      
      
      
      
      
      
      
     
      
      
  }     
}