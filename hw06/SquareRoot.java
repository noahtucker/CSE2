//Noah Tucker 
//10/14/14 
//CSE 2

//This program will find the square root of a double (x.xx) entered by a user. 

import java.util.Scanner;
public class SquareRoot{
    public static void main(String[] args){
        //Setting up, declaring and constructing the scanner 
        Scanner myScanner; 
        myScanner= new Scanner (System.in);
        System.out.print("Please enter a double that is greater than zero: ");
        double x= myScanner.nextDouble();  
        
        if(x<0){//Creates a range of [0,infiniti] 
            System.out.println("Error: Please enter a double that is greater than zero");
            return;
        }

        
        
        //initializing variables for use later in the program 
        double low=0;
        double high= 1+x; 
        double middle= 0; 
       double squareMiddle=0; 
        
        while(high-low>0.0000001*(1+x)){//Run this code when high-low>0.0000001(1-x)
        middle=(high+low)/2; //Creates a middle value between high and low 
         squareMiddle=middle*middle;//Squares the middle value 
        if(squareMiddle>x){ //If the square of the middle is greater than the inputted value...
            high=middle; //Change high to the value of middle 
        }
        else{//If not...
            low=middle;//Change low to the value of middle 
        }


        }
  
        System.out.println("The square root of "+x+ " is "+high);  

    
  
    }
}