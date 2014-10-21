  
import java.util.Scanner; 
public class Trial{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in); 
        System.out.print("Please enter an integer between 1 and 9: "); 
        
        int input= myScanner.nextInt(); 
     int i=1;        
do{
    int x=0; 
    do{
       int g=0;
        do{
            System.out.print(" ");
            g++; 
        }while(g<=9-i);
        int h=0; 
        do{                    
            System.out.print(i);
            h++; 
        }while(h<2*i-1);
        System.out.print("\n");
        x++;
    }while(x<i);
    int q=0;
    do{
        System.out.print(" ");
        q++;
    }while(q<=9-i);
    int y=0; 
    do{
        System.out.print("-");
        y++;        
    }while(y<2*i-1);
    System.out.print("\n");
    i++;
}while(i<=input); 

          
    }
}