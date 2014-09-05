// Noah Tucker 
// 9/5/2104
// Cyclometer program
// CSE2 lab02
// Program will measure Print minutes, print number counts, print distance for one and two trips

public class Cyclometer{
    
    public static void main(String[] args){
        int secsTrip1=480;  //time it takes to complete trip 1
        int secsTrip2=3220; //time it takes to complete trip 2
        int countsTrip1=1561; //number of counts in trip 1
        int countsTrip2=9037; //number of counts in trip 2
        
        double wheelDiameter=27.0,  //Diamter of the wheel of the bike
        PI=3.14159, //pi to the fifth digit 
        feetPerMile=5280, //how many feet are in 1 mile
        inchesPerFoot=12, //how many inches are in a foot
        secondsPerMinute=60; //how many seconds are in one minute
        double distanceTrip1, distanceTrip2, totalDistance; //establishing variables of distance
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts."); //how long it took for trip 1 in minutes plus counts
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+ " minutes and had "+ countsTrip2+" counts."); //time in minutes and counts for trip 2
        
        distanceTrip1=countsTrip1*wheelDiameter*PI; //distance of trip 1 in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; //equation of calculating distance for trip 1
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //equation for calculating distance of trip 2
        totalDistance=distanceTrip1+distanceTrip2;
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); //output of Trip 1 distance in miles 
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); //output of Trip 2 distance in miles
        System.out.println("The total distance was "+totalDistance+" miles"); //output of total distance of the trip 
    }
}