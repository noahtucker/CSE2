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
        
        
        if(EnterMonth== 1 ||EnterMonth== 3 ||EnterMonth== 5 ||EnterMonth== 7 ||EnterMonth== 8 ||EnterMonth== 10 ||EnterMonth== 12){
            System.out.println("This month has 31 days."); 
        }
        else if(EnterMonth== 2){
            System.out.print("Enter an int giving the year: ");
            int Year= myScanner.nextInt(); 
            
            if(Year%4==0 && Year%400==0){
                System.out.println("This month has 29 days."); 
            }
            else{
                System.out.println("This month has 28 days."); 
            }
            
        }
        else if(EnterMonth== 4 || EnterMonth==6 || EnterMonth== 9 ||EnterMonth==11){
            System.out.println("This month has 30 days."); 
        }
        else if(EnterMonth>12){
            System.out.println("Please enter an integer between 1-12."); 
            return;
        }
        else if(EnterMonth<1){
            System.out.println("Please enter an integer between 1-12."); 
            return;
        }
    }
}
        
    