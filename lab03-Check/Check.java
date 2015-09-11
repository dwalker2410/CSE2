// Donterrius Walker
// September 11, 2015
// CSE02 - Cyclometer


    import java.util.Scanner;
    
public class Check{
    // main method is required for every java program
  public static void main(String [] args){
      Scanner myScanner = new Scanner(System.in);
      
      System.out.print("Enter the original cost of the check in the form xx.xx: ");

      double checkCost = myScanner.nextDouble();
      
      System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):");

    double tipPercent = myScanner.nextDouble();
    
    tipPercent /=100; //We want to convert the percentage into a decimal value
    
    System.out.print("Enter the number of people who went out to dinner: ");
    int numPeople = myScanner.nextInt();  

    double totalCost;
    
    double costPerPerson;
    
    int dollars;   //whole dollar amount of cost 
    int dimes; 
    int pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 

    totalCost = checkCost * (1 + tipPercent);

    costPerPerson = totalCost / numPeople;
    //get the whole amount, dropping decimal fraction

    dollars=(int)costPerPerson;
    
    //get dimes and pennies amount, e.g., 

    //  the % (mod) operator returns the remainder

    
    dimes=(int)(costPerPerson * 10) % 10;
    
    pennies=(int)(costPerPerson * 100) % 10;
    
    //System.out.println("Each person in the group owes $” + dollars + "." + dimes + pennies);
    System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);  
      
      
    
      
      
      
      
      
     
  }//end of main method
}//end of class