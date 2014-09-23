//Noah Tucker 
//9/23/14 
//CSE 2 

//This program will have the user enter a
//positive integer giving the number of seconds
//that have passed during the day and it will then 
//displays the time in conventional form. 

import java.util.Scanner; //Imports the scanner 
public class TimePadding{
    public static void main(String[] args){
        Scanner myScanner;// Declares the scanner variable 
        myScanner=new Scanner (System.in); //Calls the scanner constructor 
        System.out.print("Enter a positive integer for the time in seconds: ");//Prompts the user to enter a time in seconds
        int time= myScanner.nextInt(); //Tells the scanner to accept an int 
        
        //Calculates the hours for the output
        int hours= time/3600;//Divides the seconds entered into hours
        int standardHours= hours%100; //Pulls out the digits neccessary for hours
        
        int hoursIntoSeconds= standardHours*3600; //Changing hours back into seconds
        int minutesInSeconds= time- hoursIntoSeconds; //Subtracting original entered value from the number of seconds the hours have
        int minutes= minutesInSeconds/60; //Calculates the number of minutes 
        String paddedMinutes= String.format("%02d", minutes); //Puts an extra zero in the front if neccessary 
        
        int minutesIntoSeconds= minutes*60; //Changes the minutes back to seconds
        int seconds= time-(hoursIntoSeconds+minutesIntoSeconds); //Calculates the seconds by subtracting the number of secodns in minutes and hours  
        String paddedSeconds= String.format("%02d", seconds);//Adds extra zeros if neccessary  
        
        if(time>86400 || time<0){
            System.out.println("Please enter a value with {0, 86400} (one day)");
            return;
        }
        
        System.out.println(standardHours + ":" + paddedMinutes + ":" + paddedSeconds); 
       
       
    

        
}
}