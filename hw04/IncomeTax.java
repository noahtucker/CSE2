//Noah Tucker 
//9/23/14
//CSE02 

//This program will calculate the income tax from a dollar amount that the user inputs 

import java.util.Scanner; //Importing the scanner class 

public class IncomeTax{ 
    public static void main(String[] args){
        Scanner myScanner; //Declaring an instance 
        myScanner= new Scanner (System.in); //Calling the scanner constructor 
        System.out.print("Enter an int giving the number of thousands: "); 
        int thousands= myScanner.nextInt(); //Tells the scanenr to accept an int value
         

        int moneyValue= thousands*1000; //Multiplies the user entry by 1000
        //<20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%
        boolean fivePercent= thousands<20; //Declaring a boolean 
        boolean sevenPercent= thousands>=20 && thousands <40; //Declaring a boolean
        boolean twelvePercent= thousands>=40 && thousands <78; //Declaring a boolean
        boolean fourteenPercent= thousands>=78; //Declaring a boolean
        boolean notInt= thousands<=0; //Decalring a boolean 
       
   
         if(notInt){
            System.out.println("Please enter an integer that is greater than zero."); //Tells the user to enter a proper integer
            return; 
        }
        
        if(fivePercent){
            double amountOwed= moneyValue*0.05; //Calculates the tax at 5%
            System.out.println("The tax rate on $"+ moneyValue+ " is 5%, and the tax is $"+ amountOwed); //Prints out the income tax
        }
        else if(sevenPercent){
            double amount7Owed= moneyValue*0.07;  //Calculates the tax at 7%
            System.out.println("The tax rate on $"+ moneyValue+ " is 7%, and the tax is $"+ amount7Owed); //Prints out the income tax
            }
        else if(twelvePercent){
            double amount12Owed= moneyValue*0.12; //Calculates the tax at 12%
             System.out.println("The tax rate on $"+ moneyValue+ " is 12%, and the tax is $"+ amount12Owed); //Prints out the income tax
            }
        else if(fourteenPercent){
            double amount14Owed= moneyValue*0.14; //Calculates the tax at 14% 
             System.out.println("The tax rate on $"+ moneyValue+ " is 14%, and the tax is $"+ amount14Owed); //Prints out the income tax
            }
       
     
        
        
        
        }
}
        
        