//Noah Tucker 
//10/10/14 
//CSE2 
 import java.util.Scanner;
 
public class LoopTheLoop{
    public static void main(String[] args){
        
        Scanner myScanner; 
        myScanner= new Scanner (System.in); 
        System.out.print("Please enter an int between 1 and 15 ");
        int nStars= myScanner.next();
        while(nStars>15 || nStars<1){
            System.out.println("Int is out the range of [1,15]"); 
            break;
        }
        while(myScanner.!nextint()){
            System.out.println("Please print an int with the range");
            break;
        }
        int counter2=1;
    
        int counter= 1; 
        
        while(counter2<=nStars){
           
       counter=1;
        while(counter<=counter2){
            
            System.out.print("*");
             counter++;
        }
         counter2++; 
         
       System.out.println("");
            }
       
        
    }
}
