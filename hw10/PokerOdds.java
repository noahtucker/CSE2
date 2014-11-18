//Noah Tucker 
//11/17/14
//CSE2 

//This homework gives you practice in manipulating arrays and in writing methods that have array parameters.



import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
 //   simulateOdds();
  }
  //This method generates a poker hand of five cards. It does this 
  //using a series of arrays, for loops and a switch statement. It 
  //then asks the user if they would like another hand. 
  public static void showHands(){
    int counter=0; 
      int duplicate=0;
      int hand[]= new int[5];
while(true){ //Creates an infinite loop to keep going while the user wants to 
      String cardName="";
      int fullDeck[]= new int[52]; 
      for(int i=0; i<fullDeck.length;i++){
          fullDeck[i]=i; 
      }
      
      
      for(int k=0; k<hand.length;k++){
          hand[k]=-1; 
      }
      int x = 0;
      //Takes the last value of the deck and eliminates it. 
      //It also sets the value of hand to a card in the deck. 
      for(int q=51;q>46;q--){
            int card=(int) (Math.random()*52);
            fullDeck[card]=fullDeck[q];
            fullDeck[q]=-1;
            hand[x]= card; 
            x++;
      }
      
      for (int y = 0; y < hand.length; y ++){
         //Creates a way to print out what the user's hand is 
      switch(hand[y]){
        case 0: cardName="Ace of clubs"; 
                break;
        case 1: cardName="King of clubs"; 
                break; 
        case 2: cardName="Queen of clubs";
                break;
        case 3: cardName="Jack of clubs";
                break;
        case 4: cardName="10 of clubs";
                break;
        case 5: cardName="9 of clubs";
                break; 
        case 6: cardName="8 of clubs";
                break; 
        case 7: cardName="7 of clubs"; 
                break; 
        case 8: cardName="6 of clubs"; 
                break; 
        case 9: cardName="5 of clubs";
                break; 
        case 10: cardName="4 of clubs";
                break; 
        case 11: cardName="3 of clubs";
                break; 
        case 12: cardName="2 of clubs";
                break; 
        case 13: cardName="Ace of Diamonds";
                    break; 
        case 14: cardName="King of Diamonds";
                    break;  
        case 15: cardName="Queen of Diamonds";
                    break; 
        case 16: cardName="Jack of Diamonds";
                    break; 
        case 17: cardName="10 of Diamonds";
                    break; 
        case 18: cardName="9 of Diamonds";
                    break; 
        case 19: cardName="8 of Diamonds";
                    break; 
        case 20: cardName="7 of Diamonds";
                    break; 
        case 21: cardName="6 of Diamonds";
                    break; 
        case 22: cardName="5 of Diamonds";
                    break; 
        case 23: cardName="4 of Diamonds";
                    break; 
        case 24: cardName="3 of Diamonds";
                    break; 
        case 25: cardName="2 of Diamonds";
                    break;
        case 26: cardName="Ace of hearts";
                    break; 
        case 27: cardName="King of hearts";
                    break; 
        case 28: cardName="Queen of hearts";
                    break; 
        case 29: cardName="Jack of hearts";
                    break; 
        case 30: cardName="10 of hearts";
                    break; 
        case 31: cardName="9 of hearts";
                    break; 
        case 32: cardName="8 of hearts";
                    break;
        case 33: cardName="7 of hearts";
                    break;
        case 34: cardName="6 of hearts";
                    break;
        case 35: cardName="5 of hearts";
                    break;
        case 36: cardName="4 of hearts";
                    break;
        case 37: cardName="3 of hearts";
                    break;
        case 38: cardName="2 of hearts";
                    break;
        case 39: cardName="Ace of spades";
                    break;
        case 40: cardName="King of spades";
                    break;
        case 41: cardName="Queen of spades";
                    break;
        case 42: cardName="Jack of spades";
                    break;
        case 43: cardName="10 of spades";
                    break;
        case 44: cardName="9 of spades";
                    break;
        case 45: cardName="8 of spades";
                    break;
        case 46: cardName="7 of spades";
                    break;
        case 47: cardName="6 of spades";
                    break;
        case 48: cardName="5 of spades";
                    break;
        case 49: cardName="4 of spades";
                    break;
        case 50: cardName="3 of spades";
                    break;
        case 51: cardName="2 of spades";
                    break;
      }
        
         
      System.out.println(cardName);
      }
      //Checks to see if the user wants to continue
     Scanner scan=new Scanner(System.in); 
     System.out.print("Enter 'y' or 'Y' to continue, anything else to quit: "); 
     String ender= scan.next(); 
    if(ender.equals("y") || ender.equals("Y")){
        continue;
    }
    else{
        break; 
    }
}
 
  }
/*  public static void simulateOdds(){
      int counter=0; 
      int duplicate=0; 
      int[] counter1= new int[13]; 
      for(int r=0; r<counter1.length; r++){
          counter1[r]=0; 
      }
      while(counter<10000){
          for(int f=0; f<5; f++){
              System.out.println(hand[f]); 
              //assume array has been passed through somehow
              hand[f]=hand[f]%13; 
              
          }
          if(FindDuplicates.exactlyOneDup(hand[])){
                  
              } 
          counter++;
      }
}


