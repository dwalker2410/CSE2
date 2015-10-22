// Donterrius Walker
// October 16, 2015
// CSE02 - Stats


import java.util.Scanner;

public class Stats {
    public static double fiveMean(double A1, double A2, double A3, double A4, double A5) {
        double n = (A1 + A2 + A3 + A4 + A5);
        double fiveAvg = n / 2;
        return fiveAvg;
    }
    public static double fiveMedian(double a1, double a2, double a3, double a4, double a5) {
        return a3;
    }
    public static void main(String[] args) {
        
        Scanner ourScanner = new Scanner(System.in);
        
        boolean kobe = false;
        boolean music = false;
        boolean sheila = false;
        boolean table = false;
        
        System.out.print("Type in a number: ");
        
        double input1 = 0;
        
        input1 = ourScanner.nextDouble();
        
        System.out.print("Type in a number greater than the previous: ");
        
        double input2 = 0;
        
        while (!kobe) {
            input2 = ourScanner.nextDouble();
            if (input2 > input1){
            kobe = true;
            }
            else{
                System.out.print("Please type in a number greater than the previous: ");
                
            }
        }
        
        System.out.print("Type in a number greater than the previous: ");
        
        double input3 = 0;
        
        while (!music) {
            input3 = ourScanner.nextDouble();
            if (input3 > input2){
            music = true;
            }
            else{
                System.out.print("Please type in a number greater than the previous: ");
                
            }
        }
        
        
        System.out.print("Type in a number greater than the previous: ");
        
        double input4 = 0;
        
        while (!sheila) {
            input4 = ourScanner.nextDouble();
            if (input4 > input3){
            sheila = true;
            }
            else{
                System.out.print("Please type in a number greater than the previous: ");
                
            }
        }
        
        
        System.out.print("Type in a number greater than the previous: ");
        
        double input5 = 0;
        
        while (!table) {
            input5 = ourScanner.nextDouble();
            if (input5 > input4){
            table = true;
            }
            else{
                System.out.print("Please type in a number greater than the previous: ");
                
            }
        }
        
        double Mean = fiveMean(input1, input2, input3, input4, input5);
        double Median = fiveMedian(input1, input2, input3, input4, input5);
        
        System.out.println("The mean of your input came out to be: " + Mean);
        System.out.println("The median of you input came out to be: " + Median);
    }
}