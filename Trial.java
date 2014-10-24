  
import java.util.Scanner; 
public class Trial{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in); 
    System.out.print("Type Y or y if you would like to continue: "); 
    String last= myScanner.next();
    if(last.equals("Y") || last.equals("y")){
        System.out.println("You entered Y or y"); 
    }

    }
}