//Noah Tucker 
//10/10/14 
//CSE2 

//Practice with debugging 

import java.util.Scanner; //Imports the scanner 
public class Enigma0{
  public static void main(String arg []){
    Scanner scan=new Scanner(System.in);//Declares and constructs a scanner variable 
    System.out.print("Enter an int- ");// Prompts the user to enter data
    int n=scan.nextInt();//Tells the scanner to accept an integer 
    if(n>=0||n<0){ //if n is an integer...
      System.out.println("You entered "+n); //Print this
    }

    
    int k=4,p=6,q=7,r=8;//Declaring variables 
    switch(k+p+q+r){//Take the addition of the variables above, switch in the sum
      case 24: 
      case 25: System.out.println("sum is 25");//if 24 or 25 is the answer pint this
      default:
        System.out.println("To repeat, you entered "+n);//if the answer is any integer, print this 
    }
  }
}
//I moved the "int n=scan.nextInt();" line to outside the scope of the if statement
//That allows the variable n to be used throughout the rest of the program 

//I, then, eliminated the else statement from the first if statement because a variable n was being changed to a value of 4
//when in reality the variable n had already been entered by the user. 

//I eliminated the n from the end of the line of ints being initialized in line 17 

//Lastly, I changed line 12 to a statement that says if n is any integer 



