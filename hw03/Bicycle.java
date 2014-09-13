// Noah Tucker 
// 9/13/14
// hw03 Bicycle.java 

// This program will take user inputs of number of counts of a Cyclometer 
// and the number of seconds during which the counts occur. 
// It will then output the total distance, time it took to cover that distance
// and the MPH. 




import java.util.Scanner; 
public class Bicycle{
    public static void main(String [] args){
        Scanner myScanner; // Declaring an instance 
        myScanner = new Scanner (System.in); // Calling the scanner constructor 
        System.out.print("Enter the number of counts on the cyclometer (enter an integer >0: "); // Prompts the user to enter a value for counts
        int nCounts= myScanner.nextInt(); //Tells the scanner to accept an integer value
        
        System.out.print("Enter the number of seconds during which the counts occurred (enter an integer >0: "); // Prompts the user to enter a value for seconds traveled
        int nSecondsTraveled= myScanner.nextInt(); //Tells the scanner to accept an integer value
        
        //The output will now be calculated.
        //The output of the program will calculate the distance traveled, the time in minutes and the MPH. 
        
        double wheelDiameter=27.0; //Declares the diameter of the wheel to be 27 inches. 
        double PI=3.14159; //pi to the fifth digit 
        double feetPerMile=5280; //how many feet are in 1 mile
        double inchesPerFoot=12; //how many inches are in a foot
        double secondsPerMinute=60; //how many seconds are in one minute 
        
        //Calculate the distance of the trip 
        double distanceTraveled=nCounts*wheelDiameter*PI; //distance of trip 1 in inches
        distanceTraveled/=inchesPerFoot*feetPerMile; //equation of calculating distance traveled in miles 
        
        //Calculate the number of minutes travelled. 
        double minutesTraveled= nSecondsTraveled/60; //Changes the time from seconds to minutes 
        int minutesTraveled$= (int)minutesTraveled*100; //Casting minutes traveled to a int 
        minutesTraveled= (double) minutesTraveled$/100; //Casting minutes traveled back to a double 
        
        //Calculate the MPH 
        
        double hoursTaveled= minutesTraveled/60; //Calculates the number of hours traveled 
        double MPH= distanceTraveled/hoursTaveled; //Caclutes the MPH of the bike ride 
        int MPH$= (int) (MPH*100); //Casting miles per hour into an int
        MPH= (double) MPH$/100.0; //Casting MPH back to a double 
        
        int distanceTraveled$= (int) (distanceTraveled*100); //Casting distance traveled into an int
        distanceTraveled= (double) distanceTraveled$/100; //Casting distance traveled back to a double with 2 numbers after the decimal place
        
        System.out.println("The distance was "+ distanceTraveled+ " and took "+ minutesTraveled+ " minutes."); //Prints out the distance and time (in minutes) of the journey. 
        System.out.println("The average Miles per Hour was "+ MPH+ "."); //Prints out the MPH of the journey. 
          
        
    }
}