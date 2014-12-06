/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=61;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
          
    }
    System.out.println("i" + n + " " + k);
    // n=13 k=53
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    System.out.println("Ip" + n + " " + k); 
    //n=45 and k=53 
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
      default:
        n-=3;
        k-=5;
    }
   
        System.out.println("Id" + n + " " + k); 
        //n=6 and k=0
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * The error occurs with the combination of the switch statement and the line "out+=1/n + 1/k" 
 * because the switch statement evaluates k to be zero, so dividing by zero causes a runtime error. 
 * If you comment out the switch statement, the code runs and returns an 
 * ouput without any errors. I was able to determine this by using a series of System.out.println() statements to determine the 
 * values of k and n. In order to fix the code, one would either need to comment out the switch statement, 
 * change the initial value of k, or fix the  "out+=1/n + 1/k" to not have a runtime error. 
 */

