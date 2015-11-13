//Donterrius Walker
//November 8, 2015
// hw 11 - CSE2 Linear

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class CSE2Linear {
  public static void main(String[] arguments) {
	int[] gradeArray = new int[15]; //arrays spaces start from 0-14
	
	for(int k=0; k<gradeArray.length; k++){
	    gradeArray[k]= -1; 
	    
	} //initialize a variable for right now

	//this is where the user insert their inputs
	System.out.println("Please provide 15 integers for final grades in CSE2: ");
	
	for(int i=0; i<gradeArray.length; i++){
		int pauly_d = 0;
		
		if (i!= 0) { 
		    pauly_d = i -1; 
		    
		}
		
		int grade = AskForInputGrade(i, gradeArray[pauly_d]);
		
		if(grade == -1){
			i = i - 1;
		} 
		
		else {
			gradeArray[i] = grade;
		}
    }
    
    //Print array - sorted by definition (not allowing user to input lesser value than prior)
    PrintOutArray(gradeArray, "You provided these grades:");

    //(First time) Ask user for search grade, keep asking until valid input
    int search_grade = -1;
    
    while(search_grade == -1){ 
        search_grade = AskForAGradeToSearch(); 
        
    }

    //Search unscrambled words
    LinearSearch(gradeArray,search_grade);

    //Scramble & print
    int[] rnd_arrGrades = ScrambleArray(gradeArray);
    PrintOutArray(rnd_arrGrades, "Scrambled: ");

    //(2nd time) Ask for another grade to search, and loop again until there is a valid input
    search_grade = -1;
    
    while(search_grade == -1){ 
        search_grade = AskForAGradeToSearch(); 
        
    }

    //Search scrambled words
    LinearSearch(rnd_arrGrades,search_grade);

    //Sort & print
    Arrays.sort( rnd_arrGrades );
    PrintOutArray(rnd_arrGrades, "Here it is back in order: ");
  }
  
  public static int[] ScrambleArray(int[] array){
	Random pac = new Random();
	for (int i=0; i<array.length; i++) {
		int randomPoPo = pac.nextInt(array.length);
		int temp = array[i];
		array[i] = array[randomPoPo];
		array[randomPoPo] = temp;
	}

	return array;
  }
  
  public static void LinearSearch(int[] fleeGrades, int search_grade) {
	boolean found = false;
	for(int i=0; i<fleeGrades.length; i++){
		if(fleeGrades[i] == search_grade){
			System.out.print(search_grade + " was found after " + i + " iterations");
			found = true;
			break;
		}
	}
	
	if(!found) { 
	    System.out.print(search_grade + " was not found"); 
	    
	}
  }
  
  public static int AskForAGradeToSearch() {
	System.out.print("Enter a grade to search: ");
	
	int input_val = -1;
	
	Scanner why = new Scanner(System.in);
	
	//Check if it is actually a number
	if(why.hasNextInt()){
		input_val = why.nextInt();
	} else {
		System.out.print("this is not a number, ");
		return input_val;
	}

	//Check if it is between 0-100
	if(input_val < 0 || input_val > 100) {
		System.out.print("the grade must be between 0 and 100, ");
		return -1;
	}
	return input_val;
  }
  
  public static int AskForInputGrade(int i, int prior_input) {
		int input_val = -1; //if it stays as -1 this means that the user did not have a correct input
		
		Scanner sc = new Scanner(System.in);
		
		if(i == 0)
			System.out.print("your 1st grade: ");
		else if (i == 1)
			System.out.print("your 2nd grade: ");
		else if (i == 2)
			System.out.print("your 3rd grade: ");
		else
			System.out.print("your " + (i+1) + "th grade: ");

		//Check if it is actually a number or not
		if(sc.hasNextInt()){
			input_val = sc.nextInt();
		} else {
			System.out.println("Can you stop playing this is not a number... ");
			return input_val;
		}

		//Check if it is between 0-100
		if(input_val < 0 || input_val > 100) {
			System.out.println("It has to be between 0 and 100... ");
			return -1;
		}

		//Check if this input is greater or equal to the previous input
		if(input_val < prior_input) {
			System.out.println("The grade must be greater or equal to the previous grade, ");
			return -1;
		}

		return input_val;
  }
  
  public static void PrintOutArray(int[] floGrades, String text) {
	System.out.println(" ");
	
	System.out.println(text);
	
	for(int i=0; i<floGrades.length; i++){
		System.out.print(" " + floGrades[i] + " ");
	}
	System.out.println();
  }
}
// I hope that I did do too much, i bet there was a much simplier way to do this.