// Noah Tucker
// 9/16/14
//CSE hw03 
//Four Digits 

//This program will prompt the user to enter a double 
//and then print out the first four digits to the right of the decimal point.

import java.util.Scanner; //Importing the scanner function from java 
public class FourDigits{
    public static void main(String[] args){
        Scanner myScanner; //Declares a variable for scanner
        myScanner= new Scanner (System.in); //Calling the scanner constructor 
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");//Prompts the user to enter a double 
        double nFourDigits= myScanner.nextDouble(); //Tells the scanner to accept a double 
        
        int tempDigitHolder= (int) nFourDigits;//Casting the number into an integer 
        double bigNumber= nFourDigits-tempDigitHolder; //I am eliminating the number before the deicmal point
         
         //Here I will pull the first digit out of the inputted number 
        double bigNumber1= bigNumber*10;// Pulls out the first digit
        int digitCatcher4= (int)bigNumber1; //Changes number to integer to get the first digit 
        
        //Here I will pull the second digit out of the inputted number. 
        //I will do this by multiplying the double created above by ten. 
        //Then, subtracting out the integer value of the previous number.
        //I will then multiply the new double by 10 and create an int. 
        //This successfully pulls out the correct integer I need. 
        double Eliminate4= (bigNumber*10);// Working to eliminate the first digit after the decimal point
        double Eliminate4$= Eliminate4-digitCatcher4;
        double bigNumber2= Eliminate4$*10;// Pulls out the first digit
        int digitCatcher3= (int)bigNumber2; //Changes number to integer to get the first digit 
        
        //Here I will pull the second digit out of the inputted number. 
        //I will do this by multiplying the double created above by ten. 
        //Then, subtracting out the integer value of the previous number.
        //I will then multiply the new double by 10 and create an int. 
        //This successfully pulls out the correct integer I need. 
        double Eliminate3= (Eliminate4$*10); 
        double Eliminate3$= Eliminate3-digitCatcher3;
        double bigNumber3= Eliminate3$*10;
        int digitCatcher2= (int) bigNumber3; 
        
        
        //Here I will pull the last digit out of the inputted number. 
        //I will do this by multiplying the double created above by 100. 
        //Then, subtracting out the integer value of the previous number.
        //I will then multiply the new double by 10 and create an int. 
        //This successfully pulls out the correct integer I need. 
       
        double Eliminate2= (Eliminate3$*100);// Working to eliminate rounding errors created by Java
        double Eliminate2$= Eliminate2/10; //Working to eliminate rounding errors created by java 
        
        double Eliminate2$$= Eliminate2$-digitCatcher2;
        double bigNumber4= Eliminate2$$*10;
        int digitCatcher1= (int) bigNumber4; 

        System.out.println("The first four digits after the decimal place is: " + digitCatcher4 + digitCatcher3 + digitCatcher2 + digitCatcher1);
        
        
    }
}