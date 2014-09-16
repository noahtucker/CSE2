// Noah Tucker 
// 9/13/14
// hw03 Bicycle.java 

//This program will calculate the cube root of a number. 
import java.util.Scanner; //Importing the scanner function 

public class Root{
    public static void main(String[] args){
        Scanner myScanner; //Declares a variable for scanner 
        myScanner= new Scanner (System.in); //Calling the scanner constructor 
        System.out.print("Enter a number: "); //Prompts the user to enter a number 
        double cubedRoot= myScanner.nextDouble(); //Tells the scanner to accept a double 
        
        //Calculating the cube root of a number
        double guess= cubedRoot/3; //First guess of a cubed root 
        double guess2= (2*guess*guess*guess+cubedRoot)/(3*guess*guess); //First improved guess of a cubed root 
        double guess3= (2*guess2*guess2*guess2+cubedRoot)/(3*guess2*guess2); //Second improved guess 
        double guess4= (2*guess3*guess3*guess3+cubedRoot)/(3*guess3*guess3); //Third improved guess for calculating the cubed root of a number. 
        double guess5= (2*guess4*guess4*guess4+cubedRoot)/(3*guess4*guess4);//Fourth improved guess for cubed root
        double guess6= (2*guess5*guess5*guess5+cubedRoot)/(3*guess5*guess5); //Fifth improved guess
        double guess7= (2*guess6*guess6*guess6+cubedRoot)/(3*guess6*guess6); //Sixth and final improvement on the guess for the cubed root of a number
        
        System.out.println("The cube root is " +guess7); //Prints out the answer to the cubed root of a number
        double answer= guess7*guess7*guess7;  
        System.out.println(guess7 + "*" + guess7 + "*" + guess7 + "=" + answer);
    
    }
}