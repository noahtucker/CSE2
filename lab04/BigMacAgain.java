// Noah Tucker
// 9/19/14
//CSE 2

//This program will use the Scanner class to obtain, from users, how many Big Macs they want
//and whether they want an order of fries. It will print out the total cost of the meal. 
//Big Macs still cost $2.22 each,  and an order of fries costs $2.15. 

import java.util.Scanner; 

public class BigMacAgain{
    public static void main(String[] args){ 
        Scanner myScanner; 
        myScanner= new Scanner (System.in); 
        System.out.print("Enter the number of Big Macs: ");//Prints out the number the user entered
        
        
        double bigMacPrice= 2.22; //Telling the program that big macs cost 2.22
        double friesPrice= 2.15; //Telling the program that fries cost 2.15
        
      
        
        if(myScanner.hasNextInt()){// If the user entered an int, continue with the program 
       
        }
        else {
            System.out.println("You did not enter an int"); //Tells the user that they entered the wrong data 
            return; //Leaves the program 
        } 
        
             int BigMacs= myScanner.nextInt(); //tells the scanner to accept an int
             double costOfBigMacs= BigMacs*bigMacPrice; //Calculates the price of Big Macs
             
        if(BigMacs<0){// If the user did not enter a positive int, an error message will appear
            System.out.println("Please enter an integer greater than zero."); // Tells the user to enter the correct data
            return; //Leaves the program  
        }
        else{
            
        }
    
       System.out.print("Do you want fries with that (Y/N/y/n): "); //Prompting the user to input data 
       char answer= myScanner.next().charAt(0); //Tells the scanner to accept strings 
       
       if (answer=='Y'||answer== 'y') {
            double costOfMeal= friesPrice+ costOfBigMacs; //Calculates the total cost of the meal with fries
            System.out.println("Your total is: "+costOfMeal); //Prints out the value 
       }
       else if(answer=='N'||answer=='n'){
            System.out.println("Your total is:"+ costOfBigMacs); //Calculates the total cost without fries
       }
        else{
            System.out.println("Please enter Y,y,N or n.");
        }

        }
}
