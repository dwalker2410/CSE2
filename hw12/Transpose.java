//Donterrius Walker
//November 14, 2015
//CSE02 - Transpose

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Transpose {
  
  public static void main(String[] args) {
	int w = -1;
  	int h = -1;
  	
	//Here we will have the input of the user along with implementing the certain restraints
	System.out.println("Please provide a width and height for your matrix: ");
	System.out.println("");
	
	while(w == -1){ 
	    w = askForValue("width");
	    System.out.println("");
	}
	while(h == -1){ 
	    h = askForValue("height");
	    System.out.println("");
	}
	
	System.out.println("You are going to use the matrix with " + w + " row(s) and " + h + " column(s)");
	System.out.println("");

	int[][] matrix = initialMatrix(w, h);
	
	System.out.println("Original matrix:");
	System.out.println("");
	
	printMatrix(matrix);
	
	System.out.println("Transposed matrix:");
	System.out.println("");
	
	printMatrix(transposedMatrix(matrix));

  }
  
  public static int[][] initialMatrix(int w, int h) {
	  //inserting random values for the matrix that we are creating
	  Random yo = new Random();
	  int[][] m = new int [w][h];
	  for (int r=0; r< m.length; r++) {
	      
	  	for (int c=0; c < m[r].length; c++) {
      		m[r][c] = randomInt(yo.nextInt());
		}
  	  }
	  return m;
  }
  
  public static int[][] transposedMatrix(int [][] m) {
	 if(m.length > 0){
		 int[][] n = new int [m[0].length][m.length];
		
		 //r are the rows of transposed matrix 
		 for (int r=0; r < m[0].length; r++) {
			//c are the columns of the transposed matrix
			for (int c=0; c < m.length; c++) {
				n[r][c] = m[c][r];
			}
		 }
		 return n;
		 
	} else { 
	    System.out.println("This is empty... beep boop... not able to transpose... bop bop"); 
	    
	    return m;
	    
	}
  }
  
  public static void printMatrix(int[][] b) {
	if(b.length > 0){
		if(b.length == b[0].length) {
		    System.out.println("This matrix is not a rectangle, it is a square");
		    
		}
		for (int r = 0; r < b.length; r++) {
		    //System.out.print("{");
			for (int c = 0; c < b[r].length; c++) {
				System.out.print(b[r][c] + " " +" "+" ");
				
			}
			System.out.println("");
			System.out.println("");
		}
		//System.out.print("}");
	} 
	else { 
	    System.out.println("This matrix is empty");
	    
	}
  }
  
  public static int randomInt(int x) {
	  //The random int has to be between -10 and 10; 
	  //random = a positive value so we will have to pass another random int 
	  //if it's odd then we'll use the negative of the generated int. 
	 
  	  
  	  Random show = new Random();
   	  
   	  int i = show.nextInt(10);
   	  
   	  if(x % 2 != 0) { 
   	      i = - i; 
   	      
   	  }
   	  return i;
  }
  
  public static int askForValue(String some) {
	
	System.out.print("Enter " + some + ": ");
	
	int input_val = -1;
	
	Scanner no = new Scanner(System.in);
	
	if(no.hasNextInt()){
		input_val = no.nextInt();
	} 
	else {
		System.out.println("only interger inputs are excepted");
		return input_val;
	}

	//restricting w and/or h between 0 to 100
	if(input_val < 0 || input_val > 100) {
		System.out.println("uhhh... it should be 0 and a 100.... not what you input");
		return -1;
	}
	return input_val;
	}
  
}