// Donterrius Walker
// September 18, 2015
// CSE02 - Card Generator


import java.util.Scanner;

public class CardGenerator{
    // main method is required for every java program
  public static void main(String [] args){
 
 // int number1 = (int) (Math.random()*13)+1;
 // int number2 = (int) (Math.random()*26)+14;
 // int number3 = (int) (Math.random()*39)+26;
 int number = (int) ((Math.random()*52)+1);
 
 // to classify the different suits
 String typeSuit; 
 
 // to classify the different identities
 String typeIdentity;

 
 
 if (number >= 1 && number <= 13) // allow the program know that numbers 1-13 are diamonds
 {
    typeSuit = "Diamonds";
 }
 else if (number >= 14 && number <= 26) // allow the program know that numbers 14-26 are clubs
 {
    typeSuit = "Clubs";
 }
 else if (number >= 27 && number <= 39) // allow the program know that numbers 27-39 are hearts
 {
     typeSuit = "Hearts";
 }
 else // allow the program know that numbers 40-52 are spades
 {
     typeSuit = "Spades";
 }
 
 
 switch (number)
{
    case 1:
    case 14:
    case 27:
    case 40:
    typeIdentity = "Ace";
    
    break;
    
    case 2:
    case 15:
    case 28:
    case 41:
    typeIdentity = "2";
    
    break;
    
    case 3:
    case 16:
    case 29:
    case 42:
    typeIdentity = "3";
    
    break;
    
    case 4:
    case 17:
    case 30:
    case 43:
    typeIdentity = "4";
    
    break;
    
    case 5:
    case 18:
    case 31:
    case 44:
    typeIdentity = "5";
    
    break;
    
    case 6:
    case 19:
    case 32:
    case 45:
    typeIdentity = "6";
    
    break;
    
    case 7:
    case 20:
    case 33:
    case 46:
    typeIdentity = "7";
    
    break;
    
    case 8:
    case 21:
    case 34:
    case 47:
    typeIdentity = "8";
    
    break;
    
    case 9:
    case 22:
    case 35:
    case 48:
    typeIdentity = "9";
    
    break;
    
    case 10:
    case 23:
    case 36:
    case 49:
    typeIdentity = "10";
    
    break;
    
    case 11:
    case 24:
    case 37:
    case 50:
    typeIdentity = "Jack";
   
    break;
   
    case 12:
    case 25:
    case 38:
    case 51:
    typeIdentity = "Queen";
    
    break;
    
    case 13:
    case 26:
    case 39:
    case 52:
    typeIdentity = "King";
    
    break;

    default:
    typeIdentity = "";

}
 
 System.out.println("You picked the " + typeIdentity + " of " + typeSuit);
 
 

  }
}