//Noah Tucker 
//10/24/14
//CSE2 

//This program will help with practicing creating and calling methods. It will contain a main method and three additional 
//methods to be created.  


import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){ //Main method 
	Scanner scan=new Scanner(System.in); //Decalres and constructs the scanner 
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan); //Calls the getInt method which is created below 
	b=getInt(scan);
	c=getInt(scan);
    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b)); //calls the larger method  
    System.out.println("The larger of "+a+", "+b+", and "+c+" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+ ", and "+c+" are in ascending order");//calls the ascending method 
  }
  //getInt method tells the scanner to accept only integers 
  public static int getInt(Scanner scan){ 
      int x= scan.nextInt(); 
      return x; 
      
  }
  //ascending checks to see if the values entered are increasing as they are entered: returns true or false 
  public static boolean ascending(int d,int e,int f){
      if(d<e && d<f && e<f){

        return true; 
         
      }
      else{
          return false; 
           
      }
      
  }
  //larger method tells the user which number they entered is larger 
  public static int larger(int small, int large){
      if(large>small){
          return large;
      }
      else{
          return small; 
      }
  }
 
}