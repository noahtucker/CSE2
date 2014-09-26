//Noah Tucker 
//9/25/14 
//CSE 02 

//This program will  uses the Scanner class to obtain from the user
//one of three choices for a game of chance: (1) Roulette; (2) Craps; or
//(3) Picking a card from a deck of playing cards. 
//The program will then prompt the user to play each game and it will run the games through. 

import java.util.Scanner; //Importing the scanner class
public class RandomGames{
    public static void main(String[] args){ 
        Scanner myScanner; //Declaring a variable 
        myScanner= new Scanner (System.in);//Calling the constructor 
        System.out.print(" Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");//Prompts the user to enter data 
        String input1 = myScanner.next(); 
        
       
        String R="R", r= "r";//Declares a String vairable
        String P="P", p="p";//Declares a String vairable
        String C= "C", c="c";//Declares a String vairable
        
        //Here is the output for roulette
        if(input1.equals(R) ||input1.equals(r)){//Tells the program that if r or R is entered, run this code 
        double roulette = (Math.random()*37); //Creates a random number generator with range [0, 37]
        int roulette2= (int) roulette;//Casts the answer into an integer
        int roulette1=0;//Initializes a value for roulette
       
        switch(roulette2){//Creates a statement that be switched out depending on the output
            case 37://When the output is 37...
                roulette1= 00;//Change the value of roulette1 to 00
                break;//End the program 
            default://If the output is any number but 37, 
                roulette1= roulette2;//set roulette1 equal to the output of the random number generator
          System.out.println("Roulette: "+ roulette1);//Print this
          break;//End the program 
        }
        
        return;
        }
        //Here is the output for the card game
       
        else if(input1.equals(P) || input1.equals(p)){//If the user enters P or p, run this code
        String card1= "a";//Initializes a String variable
        String suit1= "b";//Initializes a String variable 
        double random=((Math.random()*4)+1);//Creates a range of doubles from 1-4
        int suit= (int) random;//Creates a range of [1-4) of ints
        
        switch(suit){ //This tells the program that if a number is 
        //outputted by the equation above "this" if the value of 
        //the case is the answer.
            case 1://If the output is 1,
                suit1= "spades";//Change the value to this
            case 2: //If the output is 2
                suit1= "diamonds";//Change the value to this 
            case 3://If the output is 3,
                suit1= "clubs";// Change the value to this 
            case 4://If the output is 4,
                suit1= "hearts";// Change the value to this 
        }
        int card= (int)(Math.random()*13)+1; //Creates a range from [1-14]
        //The switch case takes the value of a card (integer between 1 and 14), and that value is assigned to different playing cards. 
        switch(card){
            case 1:
                card1= "Ace";
                break; 
            case 2:
                card1= "2";
                break; 
            case 3:
                card1= "3"; 
                break; 
            case 4: 
                card1= "4";
                break; 
            case 5:
                card1= "5";
                break; 
            case 6:
                card1="6";
                break; 
            case 7:
                card1= "7"; 
                break; 
            case 8: 
                card1= "8";
                break; 
            case 9:
                card1="9";
                break; 
            case 10:
                card1="10";
                break; 
            case 11:
                card1= "Jack";
                break; 
            case 12:
                card1= "Queen";
                break; 
            case 13:
                card1= "King";
                break; 
        }
        System.out.println(card1 + " of " + suit1);//prints out a statement about the random card drawn 
        return;
        }
        else if(input1.equals(C) || input1.equals(c)){
            double dice1= (Math.random()*6)+1; //Creating a range of [1-6] for the roll of a die
            double dice2= (Math.random()*6)+1; //Creating a second die 
            int dice1$= (int) dice1; //Casting to an int
            int dice2$= (int) dice2; 
            int diceTotal= dice1$+dice2$; //Getting a total value for the dice 
            System.out.println("Craps: " + dice1$ + " + " + dice2$ + " = " + diceTotal);//Prints out this statement
            return;
        }
        else{
            System.out.println("Please enter R,r,P,p or C,c");//Prints out this statement
            return;
        }
    }

}