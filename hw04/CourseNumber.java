//Noah Tucker 
//9/23/14 
//CSE 2 

//This program will reads in a 6 digit number, and then prints out the semester and year.
//The first four digits give the year, and the last two digits give the semester:
//10 spring, 20 summer 1, 30 summer 2, and 40 fall. 

import java.util.Scanner;// Calls the scanner class
public class CourseNumber{ 
    public static void main(String[] args){ 
        Scanner myScanner; //Declaring an instance
        myScanner= new Scanner (System.in);//Calls the scanner constructor
        System.out.print("Enter a six digit integer giving the course semester- "); //Prompts the user to enter an int
        int numberForCourse= myScanner.nextInt();//Tells the scanner to accept an int value 
        
        if(numberForCourse<186510 || numberForCourse>201440){ //If the value entered is outside this range,
            System.out.println("The number was outside the range [186510,201440]");// Print this 
            return; //Leave the program 
        }
        boolean Spring= numberForCourse%100==10; //Decalres a boolean 
        boolean Fall = numberForCourse%100==40;//Decalres a boolean 
        boolean Summer1= numberForCourse%100==20;//Decalres a boolean 
        boolean Summer2= numberForCourse%100==30;//Decalres a boolean 
        
        double holdForYear= numberForCourse/100; //Calculates the year entered by the user
        int year= (int) holdForYear; //Casts the year calculated into an integer
        
        
        
        if(Spring){//If variable is correct,
            System.out.println("The course was offered in the Spring semester of "+year);//Print this out
            return;
        }
        else if(Summer1){//If other variables are not correct,
             System.out.println("The course was offered in the Summer 1 semester of "+year);//Print this out 
            return;
            }
        else if(Summer2){//If other variables are not correct,
              System.out.println("The course was offered in the Summer 2 semester of "+year);//Print this out
            return;
        }
        else if(Fall){//If other variables are not correct, 
              System.out.println("The course was offered in the Fall semester of "+year);//Print this out
            return;
        }
        else{//If other variables are not correct, 
            System.out.println("This is not a legitmate semester.");//Print this out
        }
        
        }
    }
    
        
        
        
            
        

        