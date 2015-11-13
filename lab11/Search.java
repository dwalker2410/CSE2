//Donterrius Walker
//November 6, 2015
// lab 11 - Search


import java.util.Scanner;
import java.util.Random;

public class Search{
    // main method is required for every java program
  public static void main(String [] args){
      
      int f = 5000;
      
      int [] array1 = new int[f];
      
      int [] array2 = new int[f];
      
      int max = array1[0];
      
      int min = Integer.MAX_VALUE;

      int position = 0;
      
      for (int i = 0; i < f; i++){
       int d = (int) (Math.random()*(100000)+1); // having a range in between 0-100000    
       
       array1[i] = d;
      }
       
      for (int c = 1; c < array1.length; c++){
        if (array1[c] > max) {
            max = array1[c];
            position = c;
          }
        else if (min > array1[c]){
            min = array1[c];
            position = c;
        }
       }

   
   
   
   
  }
}
        