/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    Scanner scan= new Scanner(System.in); 
    double x= scan.nextDouble(); 
    if(x<0 || x>99){
      System.out.println("You entered a digit outside the range."); 
      return;
    }
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   if((100-x)/100==0.93){  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
   }
    else if((100-x)/100==0.59){//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    }
    else if((100-x)/100==0.86){//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    }
    else if((100-x)/100==0.67){//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    }
    else if((100-x)/100==0.4){//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
   }

}
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *
 * First, I deleted the "double percent;" line because it adds no value to the program 
 * Second, I fixed the scanner by telling it to accept doubles properly. 
 * Next, I changed all the values inside the if statements to say "100-x" instead of 1-x because 1-x does not yield the correct
 * output. 
 * Finally, I put "()" around the 100-x to look like "(100-x)" so that the statement would get evaluated before the division
 * I also added "{}" for every if or else if because I like the formatting of this style better and it is easier for me to view 
 * Unacceptable inputs would be any input type besides integers and doubles because all other types would cause a compiler error 
 * Any number that is not 7, 41, 14, 33 or 60 does not produce the right answer. 
 */
