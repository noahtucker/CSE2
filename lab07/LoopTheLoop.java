//Noah Tucker 
//10/10/14 
//CSE2 

//This program gives practice with nested loops. It will ask the user to enter a value, check if the value is valid,
//and then run to completion using loops. At the end, it will ask the user if they wish to continue. If not, the 
//infinite loop is quit and the program will be completed. 

 import java.util.Scanner;
 
public class LoopTheLoop{
    public static void main(String[] args){
     while(true){   //Creates an infinite loop that runs as long as there is no break 
        Scanner myScanner; 
        myScanner= new Scanner (System.in); 
        int nStars=0;       
        System.out.print("Please enter an int between 1 and 15: ");//Prompts the user to enter a value between 1 and 15

              
	   while(!myScanner.hasNextInt()){ //Checks to see if the entered value is an int 
        myScanner.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter an int; try again- ");
        }
           
         nStars= myScanner.nextInt();//Tells the scanner to accept integers 
    
        int counter2=1;
        int counter= 1; 
        
        while(nStars<1 || nStars>15){ //Checks the range of 1 to 15 
            System.out.println("Int is out the range of [1,15]"); 
            return;
        }

        //Creates a loop that puts a certain number of stars on the corresponding row
        //Ex: Enter a digit: 5 
        //Output: *
        //        **
        //        ***
        //        ****
        //        *****
        while(counter2<=nStars){
       counter=1;
        while(counter<=counter2){
            System.out.print("*");
             counter++;
        }
         counter2++; 
       System.out.println("");
            }
    
    System.out.print("Type Y or y if you would like to continue: "); //Asks the user if they wish to run the program again 
    String last= myScanner.next();
    if(last.equals("Y") || last.equals("y")){
      continue;
    }
    else{//If the user enters something other than Y or y, the program quits 
        break;
    }
    
        
 }
    }
}
