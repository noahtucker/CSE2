//Noah Tucker 
//10/14/14 
//CSE 2

public class Roulette{
    public static void main(String[] args){
         double hold= (Math.random()*38); //Creates a random number 
        int myNumber= (int) hold;//Casts the number into an int
        
        //Decalring variables to be used in the program 
        int j=0; //initializes the variable to be used in the while loop 
        int n=0; //initializes the variable to be used in the while loop 
        int finalWinnings=0; //Total winnings made in the end 
        int lose=0; //Out of 100 spins, the amount of times the spinner does not land on my number 
        int win=0; //Amount of times the spinner lands on my number 
        int nothing=0; //Out of 100 spins, amount of times it lands on my number less than 3
        int profit=0; //Out of 100 spins, amount of times a profit was made 
        
      
      
      while(j<1000){ //Creates a program that runs until j is >= 1000
        while(n<100){//Creates a program that runs until n>=100
            double hold1= (Math.random()*38); //Creates a random number 
            int Random= (int) hold1;//Casts the number into an int
            if(myNumber==Random){//If the number I chose is equal to the number roulette gives,
                //finalWinnings= 36 + finalWinnings; //Add 36 to finalWinnings
                win= win +1; //Amount of times the spinner lands on my number 
            }
        
            n++;//Add one to n 
        }
        n=0;//Make n zero to allow the 1000 loop to run 
        
            if(win>=3){
                    profit++; 
                }
                else if(win==0){
                    lose++; 
                }
                else{
                    nothing++; 
                }
                
            
             //Add one to n after the program has been run
             
             j++;
             win = 0; //Reset win to zero in order to run the program 1000 times correctly 
        }
      
        finalWinnings = (36*profit) - (36*lose)-(100-(36*nothing));//Calculates the total earnings from the game 
        System.out.println("You lost all your money "+lose+ " times.");
        System.out.println("You made a profit "+ profit+" times.");
        System.out.println("In total, you made $"+finalWinnings);
        System.out.println("You made some money back "+nothing+ " times");
  
        

      }

         
    }