//Noah Tucker 
//10/10/14 
//CSE2 
 import java.util.Scanner;
 
public class LoopTheLoop{
    public static void main(String[] args){
     while(true){    
        Scanner myScanner; 
        myScanner= new Scanner (System.in); 
        int nStars=0;       
        System.out.print("Please enter an int between 1 and 15: ");

              
	   while(!myScanner.hasNextInt()){
        myScanner.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter an int; try again- ");
        }
           
         nStars= myScanner.nextInt();
    
        int counter2=1;
        int counter= 1; 
        
        while(nStars<1 || nStars>15){
            System.out.println("Int is out the range of [1,15]"); 
            return;
        }

        
        while(counter2<=nStars){
       counter=1;
        while(counter<=counter2){
            System.out.print("*");
             counter++;
        }
         counter2++; 
       System.out.println("");
            }
             
    System.out.print("Type Y or y if you would like to continue: "); 
    String last= myScanner.next();
    while(!last.equals('Y') || !last.equals('y')){
        break; 
    }
        
 }
    }
}
