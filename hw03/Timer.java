// Donterrius Walker
// September 13, 2015
// CSE02 - Timer


 import java.util.Scanner;
    
public class Timer{
    // main method is required for every java program
  public static void main(String [] args){
      Scanner myScanner = new Scanner(System.in);
      
      System.out.print("Enter the current time: ");
      
      int currentTime = myScanner.nextInt();
      
      System.out.print("Enter the time that you will be eating dinner: ");
      
      int eatingTime = myScanner.nextInt();
      
      int hour1;
      int minute1;
      int hour2;
      int minute2;
      int newHour;
      int newMinute;
      
      hour1 = currentTime /100;
      minute1 = currentTime %100;
      
      hour2 = eatingTime /100;
      minute2 = eatingTime %100;
      
      if (minute1 > minute2) 
      {
         newHour = hour2 - hour1 - 1;
         newMinute = minute2 - minute1 + 60;
      }
      else
      {
         newHour = hour2 - hour1;
         newMinute = minute2 - minute1;
      }
      
      System.out.println("You have " + newHour + " hour " + newMinute + " minutes until dinner ");
      
      
      
      
      
      
      
      
      
     
      
  }     
}