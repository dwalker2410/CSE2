// Donterrius Walker
// September 4, 2013
// CSE02 - Cyclometer


public class Cyclometer{
    // main method is required for every java program
  public static void main(String [] args){
  // input data
    int secsTrip1=480;  //this displays the total seconds it took on the first trip
    int secsTrip2=3220;  //this displays the total seconds it took on the second trip
    int countsTrip1=1561;  //displays the rotation of trip1
    int countsTrip2=9037; //displays the rotation of trip2
    
  //These are constant variables (also for storing purposes)
    double wheelDiameter=27.0, //the wheel diameter has to be accounted for in the countsTrips
      PI=3.14159, //
         feetPerMile=5280,  //recongize how many feet are in 1 mile
         inchesPerFoot=12,   //recongize how many inches in 1 foot
         secondsPerMinute=60;  //recognize how many sec in 1 min
    double distanceTrip1, distanceTrip2,totalDistance; 
        // above recognize that the values of each will have multiple digits
 
    System.out.println("Trip 1 took "+
           (secsTrip1/secondsPerMinute)+" minutes and had "+
           countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
           (secsTrip2/secondsPerMinute)+" minutes and had "+
           countsTrip2+" counts.");
           
  //Running the calculations and storing the values
    // I will be calculating the distance of trip 1 & 2 and the total distance
    distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
  
      
  } // end of method
}// end of class
