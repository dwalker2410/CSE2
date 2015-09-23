// Donterrius Walker
// September 21, 2015
// CSE02 - PokerHandCheck


import java.util.Scanner;

public class PokerHandCheck{
    // main method is required for every java program
  public static void main(String [] args){
 
    int deck1 = (int) ((Math.random()*52)+1);
    int deck2 = (int) ((Math.random()*52)+1);
    int deck3 = (int) ((Math.random()*52)+1);
    int deck4 = (int) ((Math.random()*52)+1);
    int deck5 = (int) ((Math.random()*52)+1);
 
    String cardType1 = "This"; // can be either Diamonds, Clubs, Hearts, Spades
    String cardType2 = "is";
    String cardType3 = "alot";
    String cardType4 = "of";
    String cardType5 = "work";
    
    //deck 1
    if (deck1 >= 1 && deck1 <= 13)
    {
        cardType1 = "Diamonds";
    }
    else if (deck1 >= 14 && deck1 <= 26)
    {
        cardType1 = "Clubs";
    }
    else if (deck1 >= 27 && deck1 <= 39)
    {
        cardType1 = "Hearts";
    }
    else
    {
        cardType1 = "Spades";
    }
 
    
    //deck 2
    if (deck2 >= 1 && deck2 <= 13)
    {
        cardType2 = "Diamonds";
    }
    else if (deck2 >= 14 && deck2 <= 26)
    {
        cardType2 = "Clubs";
    }
    else if (deck2 >= 27 && deck2 <= 39)
    {
        cardType2 = "Hearts";
    }
    else
    {
        cardType2 = "Spades";
    }
    
    //deck 3
    if (deck3 >= 1 && deck3 <= 13)
    {
        cardType3 = "Diamonds";
    }
    else if (deck3 >= 14 && deck3 <= 26)
    {
        cardType3 = "Clubs";
    }
    else if (deck3 >= 27 && deck3 <= 39)
    {
        cardType3 = "Hearts";
    }
    else
    {
        cardType3 = "Spades";
    }
    
    //deck 4
    if (deck4 >= 1 && deck4 <= 13)
    {
        cardType4 = "Diamonds";
    }
    else if (deck4 >= 14 && deck4 <= 26)
    {
        cardType4 = "Clubs";
    }
    else if (deck4 >= 27 && deck4 <= 39)
    {
        cardType4 = "Hearts";
    }
    else
    {
        cardType4 = "Spades";
    }
    
    //deck 5
    if (deck5 >= 1 && deck5 <= 13)
    {
        cardType5 = "Diamonds";
    }
    else if (deck5 >= 14 && deck5 <= 26)
    {
        cardType5 = "Clubs";
    }
    else if (deck5 >= 27 && deck5 <= 39)
    {
        cardType5 = "Hearts";
    }
    else
    {
        cardType5 = "Spades";
    }
    
    // classifying the identity 
     
    String theIdentity1;
    String theIdentity2;
    String theIdentity3;
    String theIdentity4;
    String theIdentity5;
    
    // keeps count of how many identity shows up randomly
    int countAce=0;
    int count2=0;
    int count3=0;
    int count4=0;
    int count5=0;
    int count6=0;
    int count7=0;
    int count8=0;
    int count9=0;
    int count10=0;
    int countJack=0;
    int countQueen=0;
    int countKing=0;
    
    // % gives you the remainder and therefore gives you the better chance to classify the identity 
    switch (deck1%13) 
    {
        case 1: theIdentity1 = "Ace"; countAce+=1;
        break;
        
        case 2: theIdentity1 = "2"; count2+=1;
        break;
        
        case 3: theIdentity1 = "3"; count3+=1;
        break;
        
        case 4: theIdentity1 = "4"; count4+=1;
        break;
        
        case 5: theIdentity1 = "5"; count5+=1;
        break;
        
        case 6: theIdentity1 = "6"; count6+=1;
        break;
        
        case 7: theIdentity1 = "7"; count7+=1;
        break;
        
        case 8: theIdentity1 = "8"; count8+=1;
        break;
        
        case 9: theIdentity1 = "9"; count9+=1;
        break;
        
        case 10: theIdentity1 = "10"; count10+=1;
        break;
        
        case 11: theIdentity1 = "Jack"; countJack+=1;
        break;
        
        case 12: theIdentity1 = "Queen"; countQueen+=1;
        break;
        
        default: theIdentity1 = "King"; countKing+=1;
        
        
    }
    switch (deck2%13)
    {
        case 1: theIdentity2 = "Ace"; countAce+=1;
        break;
        
        case 2: theIdentity2 = "2"; count2+=1;
        break;
        
        case 3: theIdentity2 = "3"; count3+=1;
        break;
        
        case 4: theIdentity2 = "4"; count4+=1;
        break;
        
        case 5: theIdentity2 = "5"; count5+=1;
        break;
        
        case 6: theIdentity2 = "6"; count6+=1;
        break;
        
        case 7: theIdentity2 = "7"; count7+=1;
        break;
        
        case 8: theIdentity2 = "8"; count8+=1;
        break;
        
        case 9: theIdentity2 = "9"; count9+=1;
        break;
        
        case 10: theIdentity2 = "10"; count10+=1;
        break;
        
        case 11: theIdentity2 = "Jack"; countJack+=1;
        break;
        
        case 12: theIdentity2 = "Queen"; countQueen+=1;
        break;
        
        default: theIdentity2 = "King"; countKing+=1;
    }
    switch (deck3%13)
    {
        case 1: theIdentity3 = "Ace"; countAce+=1;
        break;
        
        case 2: theIdentity3 = "2"; count2+=1;
        break;
        
        case 3: theIdentity3 = "3"; count3+=1;
        break;
        
        case 4: theIdentity3 = "4"; count4+=1;
        break;
        
        case 5: theIdentity3 = "5"; count5+=1;
        break;
        
        case 6: theIdentity3 = "6"; count6+=1;
        break;
        
        case 7: theIdentity3 = "7"; count7+=1;
        break;
        
        case 8: theIdentity3 = "8"; count8+=1;
        break;
        
        case 9: theIdentity3 = "9"; count9+=1;
        break;
        
        case 10: theIdentity3 = "10"; count10+=1;
        break;
        
        case 11: theIdentity3 = "Jack"; countJack+=1;
        break;
        
        case 12: theIdentity3 = "Queen"; countQueen+=1;
        break;
        
        default: theIdentity3 = "King"; countKing+=1;
    }
    switch (deck4%13)
    {
        case 1: theIdentity4 = "Ace"; countAce+=1;
        break;
        
        case 2: theIdentity4 = "2"; count2+=1;
        break;
        
        case 3: theIdentity4 = "3"; count3+=1;
        break;
        
        case 4: theIdentity4 = "4"; count4+=1;
        break;
        
        case 5: theIdentity4 = "5"; count5+=1;
        break;
        
        case 6: theIdentity4 = "6"; count6+=1;
        break;
        
        case 7: theIdentity4 = "7"; count7+=1;
        break;
        
        case 8: theIdentity4 = "8"; count8+=1;
        break;
        
        case 9: theIdentity4 = "9"; count9+=1;
        break;
        
        case 10: theIdentity4 = "10"; count10+=1;
        break;
        
        case 11: theIdentity4 = "Jack"; countJack+=1;
        break;
        
        case 12: theIdentity4 = "Queen"; countQueen+=1;
        break;
        
        default: theIdentity4 = "King"; countKing+=1;
    }
    switch (deck5%13)
    {
        case 1: theIdentity5 = "Ace"; countAce+=1;
        break;
        
        case 2: theIdentity5 = "2"; count2+=1;
        break;
        
        case 3: theIdentity5 = "3"; count3+=1;
        break;
        
        case 4: theIdentity5 = "4"; count4+=1;
        break;
        
        case 5: theIdentity5 = "5"; count5+=1;
        break;
        
        case 6: theIdentity5 = "6"; count6+=1;
        break;
        
        case 7: theIdentity5 = "7"; count7+=1;
        break;
        
        case 8: theIdentity5 = "8"; count8+=1;
        break;
        
        case 9: theIdentity5 = "9"; count9+=1;
        break;
        
        case 10: theIdentity5 = "10"; count10+=1;
        break;
        
        case 11: theIdentity5 = "Jack"; countJack+=1;
        break;
        
        case 12: theIdentity5 = "Queen"; countQueen+=1;
        break;
        
        default: theIdentity5 = "King"; countKing+=1;
    }
 
    //giving pair, triple, quadruple, quintuple a value
    int pair = 0;
    int triple = 0;
    int quadruple = 0;
    int quintuple = 0;
 
    //Calculating whether we have a pair, a triple, both, quadruple, quintuple or neither
    if (countAce >=2)
    {
        if (countAce == 2)
        {
            pair+=1;
        }
        else if (countAce == 3)
        {
            triple+=1;
        }
        else if (countAce == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (count2 >=2)
    {
        if (count2 == 2)
        {
            pair+=1;
        }
        else if (count2 == 3)
        {
            triple+=1;
        }
        else if (count2 == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (count3 >=2)
    {
        if (count3 == 2)
        {
            pair+=1;
        }
        else if (count3 == 3)
        {
            triple+=1;
        }
        else if (count3 == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (count4 >=2)
    {
        if (count4 == 2)
        {
            pair+=1;
        }
        else if (count4 == 3)
        {
            triple+=1;
        }
        else if (count4 == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (count5 >=2)
    {
        if (count5 == 2)
        {
            pair+=1;
        }
        else if (count5 == 3)
        {
            triple+=1;
        }
        else if (count5 == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (count6 >=2)
    {
        if (count6 == 2)
        {
            pair+=1;
        }
        else if (count6 == 3)
        {
            triple+=1;
        }
        else if (count6 == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (count7 >=2)
    {
        if (count7 == 2)
        {
            pair+=1;
        }
        else if (count7 == 3)
        {
            triple+=1;
        }
        else if (count7 == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (count8 >=2)
    {
        if (count8 == 2)
        {
            pair+=1;
        }
        else if (count8 == 3)
        {
            triple+=1;
        }
        else if (count8 == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (count9 >=2)
    {
        if (count9 == 2)
        {
            pair+=1;
        }
        else if (count9 == 3)
        {
            triple+=1;
        }
        else if (count9 == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (count10 >=2)
    {
        if (count10 == 2)
        {
            pair+=1;
        }
        else if (count10 == 3)
        {
            triple+=1;
        }
        else if (count10 == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (countJack >=2)
    {
        if (countJack == 2)
        {
            pair+=1;
        }
        else if (countJack == 3)
        {
            triple+=1;
        }
        else if (countJack == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (countQueen >=2)
    {
        if (countQueen == 2)
        {
            pair+=1;
        }
        else if (countQueen == 3)
        {
            triple+=1;
        }
        else if (countQueen == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    if (countKing >=2)
    {
        if (countKing == 2)
        {
            pair+=1;
        }
        else if (countKing == 3)
        {
            triple+=1;
        }
        else if (countKing == 4)
        {
            quadruple+=1;
        }
        else
        {
            quintuple+=1;
        }
    }
    else
    {
        pair+=0;
    }
 
    
    // Printing
    
    System.out.println("Your randomly chosen cards are....");
    System.out.println("");
    System.out.println("" + theIdentity1 + " of " + cardType1);
    System.out.println("" + theIdentity2 + " of " + cardType2);
    System.out.println("" + theIdentity3 + " of " + cardType3);
    System.out.println("" + theIdentity4 + " of " + cardType4);
    System.out.println("" + theIdentity5 + " of " + cardType5);
    System.out.println("");
 
    if (pair>0)
    {
        if (pair>1)
        {
            System.out.println("You got a double pair..");
        }
        else
        {
            System.out.println("You got a pair..");
        }
    }
    else if (triple>0)
    {
        System.out.println("You got a triple..");
    }
    else if (quadruple>0)
    {
        System.out.println("You got a quadruple...");
    }
    else if (quintuple>0)
    {
        System.out.println("You got a quintuple");
    }
    else
    {
        System.out.println("You have an empty hand...");
    }
 
 
 
 
      
  }
}