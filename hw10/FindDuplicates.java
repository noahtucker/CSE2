//Noah Tucker 
//11/17/14
//CSE2 

//This homework gives you practice in manipulating arrays and in writing methods that have array parameters.


import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10]; //Creates an array with 10 input values 
    String answer="";
    //The do while statement is used to tell the user to enter 10 ints and then check to see
    //if there are duplicates, and if there is only one duplicate. 
    do{
        //Tells the user to enter 10 ints and stores those values in the array 
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      //Formats the array and outputs whether or not the array has any duplicates. If it has duplicates,
      //it will print out whether or not it has only one duplicate. 
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      //Asks the user if they want to go again 
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
    
  }

  
//This method takes an array as an input and returns a string. This is used to format the array 
//to look like {a,b,c,d}. 

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  //This method uses a set of nested for loops and if statements to check if the entered values are 
  //duplicates. This method takes an array as an input and returns a Boolean. 
  public static Boolean hasDups(int[] h){
      for(int i=0; i<h.length; i++){
          for(int j=i+1; j<h.length;j++){
             if(h[i]==h[j]){
                 return true; //Return true if there is duplicates 
             } 
          }
          
      }
      return false; //Return false if there are no duplicates 
  }
  
  //This method checks to see if there is only one duplicate. It does this by using 4 nested loops 
  //to check the values of all positions of the array against each other. If there are more than two
  //of the same number or there are more than two pairs of numbers, the program returns false to the main method. 
  public static Boolean exactlyOneDup(int[] j){  
      for(int i=0; i<j.length; i++){
          for(int z=i+1; z<j.length;z++){ 
                if(j[i]==j[z]){
                    for(int k=z+1; k<j.length; k++){
                        for(int y=k+1; y<j.length; y++){
                            if(j[i]==j[k]){
                                return false; 
                            }
                            else if(j[i]==j[z] && j[k]==j[y]){
                                return false; 
                            }
                    }
                    }
                    return true;
             } 
          }
          
      }
      return false; 
}
} 

