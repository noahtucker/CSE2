//Noah Tucker 
//10/28/11
//CSE2 

// This homework has the objective of giving you practice in writing methods, overloading methods, and in forcing the user to enter good input. 

import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc"); //Calls the getInput method that accepts a scanner and a string 
	System.out.println("You entered '"+input+"'"); //Takes the value returned from the method and prints it here 
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //Calls a method getInput that accepts a scanner, a string and an integer. It will give up after 5 attempts. 
	if(input!=' '){
   	System.out.println("You entered '"+input+"'"); //Takes the value returned from the method and prints it here unless ' ' is returned 
	}
	
	input=getInput(scan,"Choose a digit.","0123456789"); //Calls a getInput method that accepts a scanner, a string and a second string 
	System.out.println("You entered '"+input+"'"); //Takes the value returned from the method and prints it here 
  }  
  
  //This method accepts a scanner and an integer and returns a char 
   public static char getInput(Scanner scan, String a){
      while(true){ //Creates an infinite loop unless a valued is returned to the main method 
          a= scan.next();  //Tells the scanner to accept strings 
          
          for(a.length();a.length()>1;){ //Checks to see if the input was more than one character 
              System.out.print("Please enter either C or c only: "); 
              scan= new Scanner (System.in); 
              a=scan.next();
               
          }
          if(a.equals("C") || a.equals("c")){ //If the correct input is entered, return the value 
              return a.charAt(0); 
              
          }
          else{ //If the input is incorrect, print this and run it again 
              System.out.print("Please enter C or c: "); 
              continue; 
              } 
          }
    }
    
    //This method accepts a scanner, a string and an integer and returns a char. 
      public static char getInput(Scanner scan, String b, int n){
       
      for(int i=0; i<n; i++){ //Allows the program to run five times 
        b= scan.next(); 
          for(b.length();b.length()>1;){ //Checks to see if the value entered is 1 character 
              System.out.print("Please enter either Y,y,n or n only: ");
              scan= new Scanner (System.in); 
              b=scan.next();
          }
          
          if(b.equals("Y") || b.equals("y") || b.equals("N") || b.equals("n")){ //If the input is correct, return the input 
              return b.charAt(0);
          }
          else{ //If the input is incorrect, prints this and continue running 
              System.out.print("Please enter Y,y,n or n: "); 
              continue; 
              }
            
      }
      System.out.print("\n"); //Prints a new line to display the line below by itself 
      System.out.println("You failed 5 times"); 
      return ' '; //Returns an empty char to the main method which is used in an if statement 
      
  }
  //This method accepts a scanner and two different strings. 
public static char getInput(Scanner scan, String c, String d){
     while(true){ //Creates an infinite loop unless a value is returned to the main method
          System.out.print(c + "\n" + "Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- "); //c = Choose a digit 
          scan= new Scanner (System.in); 
          d= scan.next(); //Scanner accepts strings 
       
          for(d.length();d.length()>1;){ //Checks for length to be less than one 
              System.out.print("Please enter only one character " + "\n" + c + "\n" + "Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
              scan= new Scanner (System.in); 
              d=scan.next();
               
          }
          //Returns the correct value if it is inputted 
          if(d.equals("0") || d.equals("1") || d.equals("2") || d.equals("3") || d.equals("4") || d.equals("5") || d.equals("6") || d.equals("7") || d.equals("8") || d.equals("9")){
              return d.charAt(0); 
              
          }
          //Prints the statement below and continues running through the program 
          else{
              System.out.print("You did not enter an acceptable character " +  "\n" ); 
              continue; 
              } 
          }
           
     
  }
}