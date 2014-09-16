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
        

        double digit= nFourDigits*10000; //Attempting to extract digits by moving them across the decimal place
       
        int digit1= (int) digit; //Casting to an int to eliminate extraneous numbers 
        double digit4= digit1%10; //Gets the fourth digit out 
       
       
        double digit4$= digit1/10; //Divides the original number to help access the third digit 
        int digit3= (int) digit4$; //Gets rid of the fourth digit after the decimal place
        double digit3$= digit3%10; //Gets the thrid digit out 
        int digit3Final= (int) digit3$; //Casts the third digit into an int. This will be printed out later. 
        
        double digit3$$= digit4$/10; // Divides the number that was just printed to the other side of the decimal place
        double digit2= (int) digit3$$; //Cast to an int to eliminate used digits
        double digit2$= digit3$$%10; //Gets the second digit
        int digit2Final= (int) digit2$; //Casts the second digit into an int. This will be printed out. 
        
        double digit2$$= digit3$$/10; //Divides the second digit across the decimal place 
        double digit01= (int) digit2$$; //Eliminates the second digit by casting to an int
        double digit01$= digit2$$%10; //Gets the last digit 
        int digit01Final= (int) digit01$; //Casts the last digit into an int from a double 
        
        System.out.println("The first four digits after the decimal place is: "+ digit01Final +digit2Final+ digit3Final+ digit4); //Prints out the final answer!
        

        
    }
}