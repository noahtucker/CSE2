//Noah Tucker 
//12/4/14 
//CSE2 

// This homework gives you practice in manipulating arrays and multidimensional arrays, 
//in writing methods that have array parameters, and in searching and sorting arrays.

import java.util.Scanner; 
public class PokerHands{
/*
This method asks the user to enter 5 cards that they wish to selct 
for their hand. If a nonexsistent value is entered, the program will alert the user.
*/
    public static void main(String[] args){ 
     while(true){  
        Scanner scan=new Scanner(System.in); 
        System.out.print("Please enter 'y' or 'Y' to get a(nother) hand: "); 
        String x=scan.next(); 
        int[] hand= new int[5]; 
        int[] ranks= new int[13]; 
        int hold=0; 
        
        if(x.equals("y")||x.equals("Y")){
             
        }
        else{
            return; 
        }
        /*
        A loop is used to store each card in the hand. An infinite loop will run until
        the user enters 5 correct cards. The suits are entered first by the user followed 
        by the card type ex: 2,Q,A,4 etc. When a suit is chosen, a value for the variable 
        hold is given to that suit. When the card is selected, the value of hold is adjusted
        to equal that specific card. The number of the card is then stored in an array which gets
        passed to the method showOneHand() which prints it out. 
        */
        for(int i=0; i<hand.length; i++){
        scan=new Scanner(System.in);
    while(true){    
        System.out.print("Enter the suit: 'c', 'd', 'h', or 's':  "); 
        String y= scan.next(); 
        
        if(y.equals("c")||y.equals("C")){
            hold=0; 
            break;
        }
        else if(y.equals("d")||y.equals("D")){
            hold=13; 
            break;
        }
        else if(y.equals("h")||y.equals("h")){
            hold=26;
            break;
        }
        else if(y.equals("s")||y.equals("S")){
            hold=39; 
            break;
        }
        else{
            System.out.println("You did not enter a valid input."); 
            continue;
    }
    }
    while(true){
        System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2': "); 
if(scan.hasNextInt()){
            int hold$=scan.nextInt(); 
            if(hold$>10||hold$<2){
                return; 
            }
            else{
            hold+=(14-hold$);
            break;

            }
        }  
else{
        String f=scan.next(); 
                for(int v=0; v<i; v++){
                 
                    if(hand[v]==hold){
                System.out.println("You already chose that card.");
                return;
            }
            continue; 
        }


        
         if(f.equals("a")||f.equals("A")){
            hold+=0;
            break;
        }
        else if(f.equals("k")||f.equals("K")){
            hold+=1;
            break;
             
        }
        else if(f.equals("q")||f.equals("Q")){
            hold+=2;
            break;
        }
        else if(f.equals("j")||f.equals("J")){
            hold+=3;
            break;
        }
        else{
            System.out.println("You did not enter a valid input.");
            continue; 
        }

}
    }
        hand[i]=hold;
        }
/*
This tells the user what type of hand they have chosen ex: straight, flush, full house etc.
This is done by either comparing the actual number or letter on the cards, or by comparing the suit or both.
*/
        
        int pair=0; 
        int suitPair=0; 
        for(int s=0; s<hand.length;s++){
            for(int z=s+1; z<hand.length; z++){
                if(hand[s]%13==hand[z]%13){
                    pair++;
                }
                if(hand[s]/13==hand[z]/13){
                    suitPair++;
                    
                }
            }
        }
/*
In order to see if the cards entered were a straight (and only a straight),
I created a new array called holder to store the values of hand, and then sort 
them in ascending order. This allowed me to compare the actual card number or letter
in order to ensure if it was a straight or not. 
*/
        int[] holder= new int[hand.length]; 
                for(int ui=0;ui<hand.length;ui++){
            holder[ui]=14-hand[ui]%13;
        }
            

            for(int u=0;u<holder.length;u++){
                int min= holder[u];
                int minIndex=u; 
                    for(int e=u+1;e<holder.length;e++){
                        if(min>holder[e]){
                            min=holder[e];
                            minIndex=e; 
                            }
                    }
            holder[minIndex]=holder[u];
            holder[u]=min;
             
            }


            System.out.println();
            showOneHand(hand);
            
        if(holder[0]%13==holder[1]%13-1 && holder[0]%13==holder[2]%13-2 && holder[0]%13==holder[3]%13-3 && holder[0]%13==holder[4]%13-4){
            System.out.println("This is a straight.");
        }
        if(pair==0 && suitPair==10){
            System.out.println("This is a flush.");
        }
        
        if(pair==1){
            System.out.println("This is a pair.");
        }
        else if(pair==2){
            System.out.println("This is two pair.");
        }
        else if(pair==3){
            System.out.println("This is a three of a kind.");
        }
        else if(pair==4){
            System.out.println("This is a full house.");
        }
        else if(pair==6){
            System.out.println("This is a four of a kind.");
        }
        if(pair==0 && suitPair!=10 && !(holder[0]%13==holder[1]%13-1 || holder[0]%13==holder[2]%13-2 || holder[0]%13==holder[3]%13-3 || holder[0]%13==holder[4]%13-4)){
            System.out.println("This is a high card hand.");
        }
        if((holder[0]%13==holder[1]%13-1 && holder[0]%13==holder[2]%13-2 && holder[0]%13==holder[3]%13-3 && holder[0]%13==holder[4]%13-4)&&pair==0 && suitPair==10){
            System.out.println("This is a straight flush."); 
        }

        

     

}
}



//This method takes the array of your chosen hand and displays the cards that have been 
//chosen by the user. 
public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }

}

