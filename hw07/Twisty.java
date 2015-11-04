// Donterrius Walker
// October 13, 2015
// CSE02 - Twisty


 import java.util.Scanner;
    
public class Twisty{
    // main method is required for every java program
  public static void main(String [] args){
      Scanner theScanner = new Scanner(System.in); //declaring a scanner
      
      System.out.print("Input your desired length: "); //able to type something in for length
      
      boolean acceptable = false; // creating a variable to be true/false
      int myLength = 0; // giving the variable myLength a value
      
       while(!acceptable){ //using the "acceptable variable"
        while(!theScanner.hasNextInt()){ //making sure the the characters inserted were integers
          // the text that will be typed if it is not a integer
           System.out.println("  Error: please type in an integer");
           System.out.print("Input your desired length: ");
           theScanner.next(); //when the integer is stored in
           acceptable = true;
         }
          myLength = theScanner.nextInt(); // allowing the integer that is typed in to be known as "myLength"
            acceptable = true; // stopping the loop
       }
      
      System.out.print("Input your desired width: "); //able to type something in for width
      int myWidth = 0; // giving the variable myLength a value
      
        while(acceptable){ //using the "acceptable variable", but in this instance acceptable is true
            // the text that will be typed if it is not a integer
            while(!theScanner.hasNextInt()){ 
           System.out.println("  Error: please type in an integer");
           System.out.print("Input your desired width: ");
           theScanner.next(); //when the integer is stored in
          }
          myWidth = theScanner.nextInt(); // allowing the integer that is typed in to be known as "myWidth"
    
         if (myLength > myWidth){ // making sure tha the integer typed in for width is less than length a
             acceptable = false; //makes the loop stop
          }
          else{
              // the text that will be typed if it is not less than the width
             System.out.println("  Error: Please input an integer smaller than the length");
             System.out.print("Input your desired width: ");
          }
        }
      
      
      for (int i = 1; i <= myWidth; i++){
          for(int z = 1; z <= myLength; z++) {
             if (i == z%(2*(myWidth))){
                 //prints out odd down-right 
                 System.out.print("#");
             }
             else if (i == z%((myWidth))){
                 //prints out even down-right
                 System.out.print("\\");
             }
             else if (((z+i)-1)%(2*myWidth) == 0){
                 //prints out even up-right
                 System.out.print("#");
             }
             else if (((z+i)-1)%(myWidth) == 0 ){
                 //prints out odd up-right
                 System.out.print("/");
             }
             else {
                 // prints out spaces to make the shape clearer
                 System.out.print(" ");
          }
      }
       // goes to the next line
       System.out.println();  
      }
      int x=3, b=5;
  } 
}
// end of the program