//Donterrius Walker
//November 3, 2015
//hw 10 - Shuffling

import java.util.Scanner;

public class Shuffling{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
String[] cards = new String[52];
String[] hand = new String[5];
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13];
  System.out.print(cards[i]+" ");
}
printArray(cards);
shuffle(cards);
System.out.println("Shuffled");
printArray(cards);
hand = randomizeHand(cards);
System.out.println("Randomized Hand!");
printArray(hand);
  }

public static void printArray(String[] x){
    for (int i = 0; i < x.length; i++){
        System.out.print(x[i] + " ");
    }
    System.out.println();
}

public static void shuffle(String[] y){
    for (int i = 0; i < 100; i++){
        int c = (int) ((Math.random()*(51-1))+1);
        String temp=y[0];
        y[0] = y[c];
        y[c]=temp;
        
    }
}

public static String[] randomizeHand(String[] z){
    
    String[] hand =new String[5];
    String[] remove=new String[5];
    
    
    for(int x=0; x<5; x++) {
        remove[x]=" ";
    }
    
    
    for (int i = 0; i < 5; i++){
        int n = (int) (Math.random()*(z.length));
        hand[i]=z[n];
        
        for(int j=0; j<5; j++) {
            if (remove[j].equals(hand[i])) {
                i--;
                continue;
            }
        }
        remove[i]=hand[i];
        
    }
    
    return hand;
    
}
}