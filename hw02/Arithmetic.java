// Donterrius Walker
// September 5, 2015
// CSE02 - Arithmetic


public class Arithmetic{
    // main method is required for every java program
  public static void main(String [] args){
  // input data
 // '$' is part of the variable name (Cost$)
    int nShorts=5;  //this displays the total amount of shorts that I will be buying
    double shortsCost$=11.87; //displays the cost of each pair of shorts
    int nShirts=4;  //this displays the total amount of shirts that I will be buying
    double shirtsCost$=3.58; //displays the cost of each shirt
    int nSocks=2;  //this displays the total pair of socks I will be buying
    double socksCost$=4.64; //displays the cost of each pair of socks
   
    
  //These are constant variables and/or used for storing purposes)
    double taxPercent=0.06;
    double totalShortsCost$, salesTaxShorts, totalShirtsCost$, salesTaxShirts, 
    totalSocksCost$, salesTaxSocks, PretotalCost$, 
    salesTaxTotal, TotalCost$;
        // above recognize that the values of each will have multiple digits
 
    System.out.println("I am going to buy: ");
    System.out.println(nShorts+" "+"pairs of shorts costing"+" "+shortsCost$+" "+
    "each"); 
    System.out.println(nShirts+" "+"pairs of shirts costing"+" "+shirtsCost$+" "+
    "each");
    System.out.println("And");
    System.out.println(nSocks+" "+"pairs of socks costing"+" "+socksCost$+" "+
    "each"+".");

           
  //Running the calculations and storing the values
    // I will be calculating the total cost of each item, the sales tax of each item, 
        //the total cost without tax, the total sales tax, and the total cost

    totalShortsCost$=nShorts*shortsCost$;
    salesTaxShorts=totalShortsCost$*taxPercent;
        // Above gives the cost and the sale tax of the shorts

    totalShirtsCost$=nShirts*shirtsCost$;
    salesTaxShirts=totalShirtsCost$*taxPercent;
       // Above gives the cost and the sale tax of the shirts

    totalSocksCost$=nSocks*socksCost$;
    salesTaxSocks=totalSocksCost$*taxPercent;
      // Above gives the cost and the sale tax of the socks 

    System.out.println("Based on calculations: ");
    System.out.println("The shorts will cost"+" "+totalShortsCost$+" "+
    "without tax and the sales tax for it will be"+" "+salesTaxShorts);
    System.out.println("The shirts will cost"+" "+totalShirtsCost$+" "+
    "without tax and the sales tax for it will be"+" "+salesTaxShirts);
    System.out.println("And");
    System.out.println("The socks will cost "+" "+totalSocksCost$+" "+
    "without tax and the sales tax for it will be"+" "+salesTaxSocks+".");

        
    PretotalCost$=totalShortsCost$+totalShirtsCost$+totalSocksCost$; // total before tax
    salesTaxTotal=PretotalCost$*taxPercent; // the tax of the whole total
    TotalCost$=PretotalCost$+salesTaxTotal;

    System.out.println("Based on more calculations: ");
    System.out.println("The total before the tax will be "+PretotalCost$);
    System.out.println("And");
    System.out.println("The sales tax of that total will be "+salesTaxTotal);
    System.out.println("Therefore,");
    System.out.println("The grand total cost will be "+TotalCost$+".");
  
      
  } // end of method
}// end of class