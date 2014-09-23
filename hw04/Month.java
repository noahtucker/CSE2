//Noah Tucker 
//9/23/14
//CSE 2 

//This program will prompt the user to enter an integer for the month (1 for January, 2 for February, etc.) 
//and then displays the number of days in the month). 
//If the number 2 is entered (February) the user is then asked to enter the year.

import java.util.Scanner;
public class Month{ 
    public static void main(String[] args){ 
        Scanner myScanner; //Declares the variable 
        myScanner= new Scanner (System.in);//Calls the scanner constructor
        System.out.print("Enter an int giving the number of the month (1-12)- "); //Tells the user to enter data
        int EnterMonth= myScanner.nextInt();//Tells the scanner to accept an int
        
        
        if(EnterMonth== 1 ||EnterMonth== 3 ||EnterMonth== 5 ||EnterMonth== 7 ||EnterMonth== 8 ||EnterMonth== 10 ||EnterMonth== 12){// If the user enters any of these digits...
            System.out.println("This month has 31 days."); //Print this out if the above statement is true
        }
        else if(EnterMonth== 2){//If above statement is false, perform these tasks 
            System.out.print("Enter an int giving the year: ");//Print this out 
            int Year= myScanner.nextInt(); //Tells the scanner to accept an integer 
            
            if(Year==1700 || Year==1800 || Year==1900){//If the "else if" statement above is true, and this is true continue onward
                System.out.println("This month has 28 days.");//Print this out if all requirements are met 
                return;//Leave the program after running these lines of code 
            }
            if(Year%4==0){//if the year divided by4's remainder is zero...
                System.out.println("This month has 29 days."); //Print this out 
            }

            else{//If not...
                System.out.println("This month has 28 days."); //Print this out 
            }
            
        }
        else if(EnterMonth== 4 || EnterMonth==6 || EnterMonth== 9 ||EnterMonth==11){//If the user enters any of these numbers 
            System.out.println("This month has 30 days."); //Print this out 
        }
        else if(EnterMonth>12){ //If the user enters a number greater than 12,
            System.out.println("Please enter an integer between 1-12."); //Print this 
            return;
        }
        else if(EnterMonth<1){ //If the user enters an integer less than 1, 
            System.out.println("Please enter an integer between 1-12."); //Print this 
            return; //Leave the program 
        }
    }
}
        
    