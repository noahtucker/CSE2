import java.util.Scanner;
public class Trial{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
    input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }
  public static char getInput(Scanner scan, String c, String d){
     while(true){
          System.out.print(c + "\n" + "Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
      scan= new Scanner (System.in); 
       d= scan.next(); 
          for(d.length();d.length()>1;){
              System.out.print("Please enter only one character " + "\n" + c + "\n" + "Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
              scan= new Scanner (System.in); 
              d=scan.next();
               
          }
          if(d.equals("0") || d.equals("1") || d.equals("2") || d.equals("3") || d.equals("4") || d.equals("5") || d.equals("6") || d.equals("7") || d.equals("8") || d.equals("9")){
              return d.charAt(0); 
              
          }
          else{
              System.out.print("You did not enter an acceptable character " +  "\n" + c + "\n" ); 
              continue; 
              } 
          }
           
     
  }

}

