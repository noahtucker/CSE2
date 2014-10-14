//Noah Tucker 
//10/10/14
//CSE2

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   //print out the proportion remaining for select percentages
   if(1-x/100==0.93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(1-x/100==0.59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(1-x/100==0.86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(1-x/100==0.67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(1-x/100==0.4)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
   }
}

//I eliminated the line "System.out.println("You entered "+x+"%");" because the program is 
//only supposed to convert the number into a percentage, not display the percentage.
