//Noah Tucker 
//9/30/14
//CSE2 

//This program will prompts the user to enter a choice of a burger, a soda, or fries.
//Then the program prompts the users for details of their choices.

import java.util.Scanner; //Calls the scanner 
public class BurgerKing{ 
    public static void main(String [] args){
        Scanner myScanner; 
        myScanner= new Scanner (System.in); 
        System.out.print("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), Fries (F or f)): "); 
        String userData= myScanner.next(); //Tells the scanner to accept Strings 
        
        String B= "B", b="b", S="S", s="s",F="F",f="f"; //Creates variables for all values entered 
        
        //Gives values for if the user enters burger 
        if(userData.equals(B)||userData.equals(b)){
            System.out.print("Enter A or a for all the fixins, C or c for cheese, N or n for none of the above: "); 
            String toppings= myScanner.next(); 
            
            //If the user enters b for Burgers, the program will then ask if they want any toppings
            //This proccess occurs below. 
            if(toppings.equals("A")||toppings.equals("a")){
                System.out.println("You ordered a burger with all toppings.");
                return; 
            }
            else if(toppings.equals("C")||toppings.equals("c")){
                System.out.println("You ordered a burger with cheese."); 
                return; 
            }
            else if(toppings.equals("N")||toppings.equals("n")){
                System.out.println("You ordered a burger with no toppings."); 
                return; 
            }
            else{
                System.out.println("Please enter A,a,C,c,N or n."); 
                return; 
            }
        }
        //End of burger output  
        
        //Beginning of Fries output 
        else if(userData.equals(F)||userData.equals(f)){
            System.out.print("Do you want a large or small order of fries (l,L,s, or S)?"); 
            String friesSize= myScanner.next(); 
            
            //If the user enters F for fries, the program will ak
            //if they want a large or small. This output is produced here. 
            if(friesSize.equals("L")||friesSize.equals("l")){
                System.out.println("You ordered large fries."); 
                return; 
            }
            else if(friesSize.equals("S")||friesSize.equals("s")){
                System.out.println("You ordered small fries."); 
                return; 
            }
            else{
                System.out.println("Please enter l,L,s or S.");
                return; 
            }
         }
         //End of fries output 
         
         //Beginning of Soda output 
         else if(userData.equals(S)||userData.equals(s)){
             System.out.print("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m) "); 
             String soda = myScanner.next(); 
             
             //If the user enters S for soda, the program will
             //ask the user which type of soda it wants.
             //The output is produces here. 
             if(soda.equals("P")||soda.equals("p")){ 
                 System.out.println("You ordered a pepsi."); 
                 return;
            }
            else if(soda.equals("C")||soda.equals("c")){ 
                System.out.println("You ordered a coke."); 
                return; 
            }
            else if(soda.equals("S")||soda.equals("s")){ 
                System.out.println("You ordered a sprite."); 
                return;
            }
            else if(soda.equals("M")||soda.equals("m")){ 
                System.out.println("You ordered a mountain dew."); 
                return; 
            }
            else{
                System.out.println("Please enter P,p,C,c,S,s,M or m.");
                return;
            }
         }
         //End of soda output 
         
         
         //If the user does enter proper data, the program 
         //will tell the user that an error occurred.
         else{
             System.out.println("Please enter B,b,S,s,F or f.");
         }
         
        
 
        
    }
}