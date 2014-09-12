// Noah Tucker
// 9/12/14
// Lab03 BigMac 

// This program will compute the cost of buying some big macs.
// It will use the Scanner Class to obtain from the user how many 
// Big Macs, the cost per Big Mac, and the percentage tax. 
// It will then display total cost. 

import java.util.Scanner; 

public class BigMac{                        // Adding a class
    public static void main(String[] args){ // Adding a main method 
        
        Scanner myScanner; // Declare instance of the Scanner 
         myScanner = new Scanner (System.in); // Calling the scanner constructor 
         System.out.print("Enter the number of Big Macs (as an integer >0):" ); //Number of Big Macs that will be purchased 
         int nBigMacs= myScanner.nextInt(); //Telling the scanner to accept an integer value
         
         System.out.print("Enter the cost per Big Mac as"+ " a double (in the form xx.xx):" ); //Entering the number of Big Macs as a double 
         double bigMac$= myScanner.nextDouble(); //Telling the Scanner to accept a double value
         
         System.out.print("Enter the percent tax as a whole number:" ); // Entering sales tax
             double taxRate= myScanner.nextDouble(); //Telling the scanner to accept a double value of sales tax
             
             taxRate/=100; //Changes value into a proportion 
             //Input is now finished.
             // I will now enter the output for the program. 
            
             double cost$; //Declaring a variable cost$ 
             int dollars, //for storing digits to the right of the decimal point 
             dimes, pennies; //for the cost$ variable 
             cost$=nBigMacs*bigMac$*(1+taxRate); //calculating the cost of the purchase
             dollars= (int) cost$; //Calculating the number of dollars in the purchase by dropping decimal fraction 
             dimes=(int) (cost$*10)%10; // calculates the number of dimes, dropping the decimal, mod operator gives back the remainder
             pennies=(int)(cost$*10)%10; // calculates the number of dimes, dropping the decimal, mod operator gives back the remainder
             System.out.println("The total cost of "+nBigMacs +" Big Macs, at $"+bigMac$ + " per Big Mac, with a sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);// Prints out my output values 
             
             
             
    }
}