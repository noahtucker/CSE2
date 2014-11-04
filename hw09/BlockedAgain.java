//Noah Tucker
//11/3/14 
//CSE2 

//This homework is designed to give you practice designing a nested 
//sequence of method calls that divide a larger problem into subproblems.   

import java.util.Scanner;
public class BlockedAgain{
public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);
}
//Method getInt() takes no inputs and returns an integer in the range 1-9. It does this by calling the methods
//checkInt() and checkRange() to make sure that the entered value is an integer and it is between 1 and 9. 
public static int getInt(){
   
   Scanner scan= new Scanner(System.in); 
   System.out.print("Please enter an integer between 1 and 9: "); 
   Boolean tr= checkInt(scan); 
   if(tr==true){
       int scan1= scan.nextInt(); 
       int y= checkRange(scan1); 
       return y; 
   }
   return 0; 
}
/*checkInt takes the entered value as an input and returs true if the value entered is an integer 
If it is not an integer, the method stores the value in a String, and prompts the user to enter another value. 
It then proceeds to check if the new value is an int 
*/
public static Boolean checkInt(Scanner scan){ 
    if(scan.hasNextInt()==true){
        return true; }
    else{
        String bad= scan.next(); 
        System.out.print("Please enter an integer: "); 
        return checkInt(scan); 
    }
}
/*checkRange takes an integer as an input, which is the value entered by the user 
(the program already checked to make sure it was an integer) 
if the number is within the range, the number gets returned to getInt
If it is not in the range, the method prompts the user to enter a new value
It then checks if that new value is an integer and within the range. Finally, it returns the new value if it is correct. 
*/
public static int checkRange(int check){ 
        //checkInt(scan);
            
            if(check>=1 && check<=9){
                return check;  
        }
        else{
            Scanner scan= new Scanner(System.in); 
            System.out.print(" Please enter within the range of [1,9]: ");
            if(checkInt(scan)==true){
            int gf= scan.nextInt();
            return checkRange(gf); 
            }
             
            
        }
        return 0;

}
//calls upon another method named block()
public static void allBlocks(int accepted){ 
    block(accepted); 
 //   line(); 
}
//block takes the value inputted by the user as an input to itself 
public static void block(int accepted){
    for(int i=1; i<=accepted; i++){//Puts each number on its own line 
            for(int x=0; x<i;x++){//Prints out the rows Ex: Will print two rows of 2, three rows of 3 etc.  
            for(int g=0; g<=9-i; g++){//Creates the spacing neccesary to print out the correct output: Puts 8 spaces in front of 1, 7 in front of 2 etc. 
                System.out.print(" ");
            }    
            for(int h=0; h<(2*i-1); h++){//Prints out the amount of numbers per line: Ex: Print three 2's, five 3's etc. on the same line 
                System.out.print(i);

            }
            line(i); 

                }
}
}
//line takes the value of i created in block() 
public static void line(int i){
            System.out.print("\n"); //Creates a new line 
            
            for(int q=0; q<=9-i; q++){//Creates the spacing needed for the dashes 
                System.out.print(" ");
            }
            for(int y=0; y<(2*i-1); y++){//Places the amount of dashes: Print three -'s after the 2's are printed etc. 
                     System.out.print("-");
            }
            

            
            System.out.print("\n");//Prints a new line 
}
} 