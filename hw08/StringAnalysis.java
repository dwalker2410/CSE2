// Donterrius Walker
// October 19, 2015
// CSE02 - String Analysis

import java.util.Scanner;

public class StringAnalysis{
    
    public static void main(String[] args){ // this is the main method
    System.out.print("Enter a String: "); //what will be presented before any input
    
    Scanner heScanner = new Scanner(System.in); // declaring a scanner
    
    String both = heScanner.next();
    
    //where the user can choose to look at the whole input or just a range of the input
    System.out.println("");
    System.out.println("Now let's examine all of the characters or just a certain range...");
    System.out.println(" ");
    System.out.println("Type in 'allchar' to examine all the characters in a string or ");
    System.out.println("'anumber' to examine the certain first sets of the word: ");
    System.out.print(" ");
    
    String play = heScanner.next();
    
    //the steps that will occur if "allchar" is typed in
    if (play.equals("allchar")){
        //if a number is found within the input
        if (examineAllstring(both) == true){
            System.out.println("");
            System.out.println("There was indeed a number/multiple numbers found in what you you typed in...");   
        }
        //if a number isn't found within the input
        else{
            System.out.println("");
            System.out.println("There was not a number found in what you have typed in...");
        }
    }
    //the steps that will occur if "anumber" is typed in
    else {
        System.out.println("");
        System.out.print("Up to the what letter do you want me to check: ");
        int hang = heScanner.nextInt();
        //make sure the the user do not input a value that is greater than the length of their input
        if (hang != both.length() && hang > both.length()){
            while (hang != both.length() || hang > both.length()){
                System.out.println("");
                System.out.print("Please type in a number that is within the same length of " +"("+ both +")" + ": ");
                hang = heScanner.nextInt();
            }
        }
        else {
                System.out.println("");
            }
            //if a number is found within the range of the given input
        if (examineAllstring(both, hang) == true){
            System.out.println("");
            System.out.println("There was indeed a number/multiple numbers found what you you typed in...");
        }
        //if a number isn't found within the range of the given input
        else{
            System.out.println("");
            System.out.println("There was not any number found in what you have typed in...");
        }
        }
    }
    //this is a class that determines whether or 
    // not a number is in what was typed in a word,
    public static boolean examineAllstring(String chara1){
     for (int i = 0; i < chara1.length(); i++){
         if (Character.isLetter(chara1.charAt(i)) == false) {
             return true;
         }
     }
     
     return false;
     
 }
    //this is a class that determines whether or 
    // not a number is in what was typed in a word, given a specific range
    public static boolean examineAllstring(String chara2, int myput1){
        for (int i = 0; i < myput1; i++){
         if (Character.isLetter(chara2.charAt(i)) == false) {
             return true;
         }
     }
     
     return false;
    }
}//end of the program

