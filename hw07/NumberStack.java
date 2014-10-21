//Noah Tucker
//10/21/14 
//CSE2

//This program will forces the user to enter an integer between 1 and 9, 
//inclusive, and then prints out displays that depend on the value entered and look like the following: 
//Enter an int between 1 and 9: 4 
//    1
//    -
//   222
//   222
//   ---
//  33333
//  33333
//  33333
//  -----
// 4444444
// 4444444
// 4444444
// 4444444
// -------

import java.util.Scanner; 
public class NumberStack{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in); 
        System.out.print("Please enter an integer between 1 and 9: "); 
        
        int input= myScanner.nextInt(); 
  
        
        
        System.out.println("Using for loops:");

        for(int i=1; i<=input; i++){//Puts each number on its own line 
            for(int x=0; x<i;x++){//Prints out the rows Ex: Will print two rows of 2, three rows of 3 etc.  
            for(int g=0; g<=9-i; g++){//Creates the spacing neccesary to print out the correct output: Puts 8 spaces in front of 1, 7 in front of 2 etc. 
                System.out.print(" ");
            }    
            for(int h=0; h<(2*i-1); h++){//Prints out the amount of numbers per line: Ex: Print three 2's, five 3's etc. on the same line 
                System.out.print(i);

            }
            System.out.print("\n"); //Creates a new line 
            }
            for(int q=0; q<=9-i; q++){//Creates the spacing needed for the dashes 
                System.out.print(" ");
            }
            for(int y=0; y<(2*i-1); y++){//Places the amount of dashes: Print three -'s after the 2's are printed etc. 
                     System.out.print("-");
            }
            

            
            System.out.print("\n");//Prints a new line 
                }
        
System.out.println("Using only while loops:");    
    
        int i=1;
        while(i<=input){ //Puts each number on its own line 
            int x=0;
            while(x<i){//Prints out the number of rows 
                int g=0;
                while(g<=9-i){//Creates the spacing for where the numbers will be printed 
                    System.out.print(" ");
                    g++;
                }
                int h=0;
                while(h<2*i-1){//Creates the amount of numbers that will be printed per line 
                    System.out.print(i);
                    h++; 
                }
            System.out.print("\n");//New line 
            x++;
            }
            int q=0;
            while(q<=9-i){//Creates the spacing for the dashes 
                System.out.print(" ");
                q++;
            }
            int y=0;
            while(y<2*i-1){//Prints the proper amount of dashes 
                System.out.print("-");
                y++;
            }
            System.out.print("\n");//New line 
            i++;
        }
System.out.println("Using only do-while statements:"); 
      i=1;        
do{
    int x=0; 
    do{
       int g=0;
        do{
            System.out.print(" ");
            g++; 
        }while(g<=9-i);//Creates the spacing for where the number will be printed 
        int h=0; 
        do{                    
            System.out.print(i);
            h++; 
        }while(h<2*i-1);//Prints out the correct amount of numbers 
        System.out.print("\n");
        x++;
    }while(x<i);//Prints out the number of rows 
    int q=0;
    do{
        System.out.print(" ");
        q++;
    }while(q<=9-i);//Creates the spacing for where the dashes will be printed 
    int y=0; 
    do{
        System.out.print("-");
        y++;        
    }while(y<2*i-1); //Prints out the proper number of dashes  
    System.out.print("\n");
    i++;
}while(i<=input); //Prints each number on its own line 

          
          
    }
}
