// Donterrius Walker
// October 19, 2015
// CSE02 - Area

import java.util.Scanner;

public class Area{ //this is the class
    
    //the method that gives the area of a rectangle
    public static double recArea(double length, double width){
        double d = length*width;
        return d;
    }
    //the method that gives the area of a triangle
    public static double triArea(double base, double height){
        double g = (base*height)/2;
        return g;
    }
    //the method that gives the area of a circle
    public static double cirArea(double radius){
        double n = Math.PI*(radius*radius);
        return n;
    }
    //the method that make sure the beginning input is valid
    public static boolean validInput(String pain){
        if (pain.equals("rectangle")){
            return true;
        }
        else if (pain.equals("triangle")){
            return true;
        }
        else if (pain.equals("circle")){
            return true;
        }
        
        return false;    
    }
    
    public static void main(String[] args){ //this is the main method
     
     //what will be presented in the beginning before any input
     System.out.println("Finally!!!! Now, you can find the area of a certain shape ");
     System.out.println("");
     System.out.println("Your choices are: ");
     System.out.print("'rectangle'  ");
     System.out.print("'triangle'  ");
     System.out.println("'circle'");
     System.out.println(" ");
     System.out.println("Now which shape would you like to find the area of?");
     System.out.print(": ");
     
     Scanner weScanner = new Scanner(System.in); //declaring a scanner
     
     String finest = weScanner.next();
     
     //boolean expressions that will be used later in the programs
     boolean pop = false;
     boolean lock = false;
     boolean drop = false;
     boolean stop = false;
     boolean paradise = false;
     
     //will instruct the user to input the valid choices if they do not at first
     while (validInput(finest) == false){
         System.out.println("May you please type in one of the following: ");
         System.out.print("'rectangle'  ");
         System.out.print("'triangle'  ");
         System.out.println("'circle'");
         System.out.print(": ");
         finest = weScanner.next();
     }
     //the step it will take when "rectangle" is the input
     if (finest.equals("rectangle")){
         System.out.println("Can you please provide me a.. ");
         System.out.print("Length: "); //prompts the user to give a double
         double wow = 0;
         
         while(!pop){ //using the "pop variable"
            while(!weScanner.hasNextDouble()){ //making sure the the characters inserted were double
          // the text that will be typed if it is not a double
           System.out.println("  Error: please type in an double");
           System.out.print("Input your desired Length: ");
           weScanner.next(); //when the double is stored in
           pop = true;
         }
          wow = weScanner.nextDouble(); // allowing the double that is typed in to be known as "wow"
            pop = true; // stopping the loop
         }
         
         System.out.print("Width: ");//prompts the user to give a double
         double now = 0;
         
         while(!lock){ //using the "lock variable"
            while(!weScanner.hasNextDouble()){ //making sure the the characters inserted were double
          // the text that will be typed if it is not a double
           System.out.println("  Error: please type in an double");
           System.out.print("Input your desired Width: ");
           weScanner.next(); //when the double is stored in
           lock = true;
         }
          now = weScanner.nextDouble(); // allowing the double that is typed in to be known as "wow"
            lock = true; // stopping the loop
         }
         
         double area1 = recArea(wow, now);
         System.out.println("The area of the rectangle (based on your inputs) came out to be");
         System.out.println(": " + area1);
     }
     //the step it will take when "triangle" is the input
     else if (finest.equals("triangle")){
         System.out.println("Can you please provide me a.. ");
         System.out.print("Length of the Base: ");//prompts the user to give a double
         double lost = 0;
         
         while(!drop){ //using the "drop variable"
            while(!weScanner.hasNextDouble()){ //making sure the the characters inserted were double
          // the text that will be typed if it is not a double
           System.out.println("  Error: please type in an double");
           System.out.print("Input your desired Length of the Base: ");
           weScanner.next(); //when the double is stored in
           drop = true;
         }
          lost = weScanner.nextDouble(); // allowing the double that is typed in to be known as "wow"
            drop = true; // stopping the loop
         }
         
         System.out.print("Length of the Height: ");//prompts the user to give a double
         double host = 0;
         
         while(!stop){ //using the "stop variable"
            while(!weScanner.hasNextDouble()){ //making sure the the characters inserted were double
          // the text that will be typed if it is not a double
           System.out.println("  Error: please type in an double");
           System.out.print("Input your desired Length of the Height: ");
           weScanner.next(); //when the double is stored in
           stop = true;
         }
          host = weScanner.nextDouble(); // allowing the double that is typed in to be known as "wow"
            stop = true; // stopping the loop
         }
         
         double area2 = triArea(lost, host);
         System.out.println("The area of the triangle (based on your inputs) came out to be");
         System.out.println(": " + area2);
     }
     //the step it will take when "circle" is the input
     else if (finest.equals("circle")){
         System.out.println("Can you please provide me a.. ");
         System.out.print("Radius: ");//prompts the user to give a double
         double she = 0;
         
         while(!paradise){ //using the "paradise variable"
            while(!weScanner.hasNextDouble()){ //making sure the the characters inserted were double
          // the text that will be typed if it is not a double
           System.out.println("  Error: please type in an double");
           System.out.print("Input your desired Radius: ");
           weScanner.next(); //when the double is stored in
           paradise = true;
         }
          she = weScanner.nextDouble(); // allowing the double that is typed in to be known as "wow"
            paradise = true; // stopping the loop
         }
         
         double area3 = cirArea(she);
         System.out.println("The area of the circle (based on you input) came out to be");
         System.out.println(": " + area3);
         
     }
     
    }
}// end of the program