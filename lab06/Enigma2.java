//Noah Tucker 
//10/31/14
//CSE2 

//This lab helps with debugging 


import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
try{
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;

     
    }
        System.out.println(out);
}

  catch(ArithmeticException e){				
	System.out.println("arithmetic error.");
}
finally
{

	return;
	
}
}
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * When using the java.lang exception, a try statement, a catch statement and a finally statement are added. 
 * A try statement is added around the switch statement and the other two are added at the bottom of the main method. 
 * The arithmetic error is caught this way and return a statement that prints "arithmetic error." 
 * 
 * 
 */

