//Donterrius Walker
//October 30, 2015
//lab 10 - Arrays

import java.util.Scanner;

public class Arrays{
    // main method is required for every java program
  public static void main(String [] args){
      Scanner stuScanner = new Scanner(System.in); //declaring a scanner
    
      int d = (int) (Math.random()*(10-5)+5); // having a range in between 5-10
      
      System.out.println("May you please enter " + d + " names:");
      
      String[] students = new String[d];
      
      String student = "";
      for (int i = 0; i < d; i++ ){
          student = stuScanner.next();
          students[i] = student;
      }
      
      
      System.out.println("The results are in and these are the " + d + " students and their grades:");
      
      int[] midterm;
      
      midterm = new int[d];
      for (int i = 0; i < d; i++){
          
      int v = (int) ((Math.random()*100)+1);    
       midterm[i] = v;
       
      }
      
      for (int i = 0; i < d; i++){
       System.out.println(students[i] + ":" + " " + midterm[i]);   
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
  }
}