//Noah Tucker 
//10/31/14 
//CSE2 

//This program gives help with writing methods and using methods to call other methods. 

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3); //Calls a method addDigit 
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b); //Calls a method join 
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    //This method takes a digit and adds it to a number. Ex: addDigit(45, 3) outputs 345. 
    public static int addDigit(int number, int digit){ 
       if(digit<0 || digit>9){ //Checks to see if digit is within range 
          return number;
       }
      if(number>0){ 
       String number1= String.valueOf(number); //Converts a number to a string 
       int getLength= number1.length(); //Creates an integer for the length of a string 
     
       double power= Math.pow(10.0, getLength);  //Takes  10 to the power of the length of the string. This creates a placeholder
       //for the added digit. ex: if number= 789, the digit will need to hold the thousands place 
       
       int place= digit * (int)(power);  //Multiplies the digit added to the front by the holder of place. ex: 1, 10 100, 1000 etc. 
       int last= place + number; //Adds the placeholder with the number to get the output 
       return last; //Returns the output 
      }
      else{ 
        int absolut=  Math.abs(number); //takes the absolute value of the number entered 
        String number2= String.valueOf(absolut);
       int getLength1= number2.length(); 
       double power1= Math.pow(10.0, getLength1); 
       int place1= digit * (int)(power1); 
       int summation= place1 + absolut;
       int last1= summation *-1; //Multiplies the final product by negative one to return the negative 
       return last1;
        }
    }
    //This method takes a value and adds digits to the end. Ex: join(435, 86) outputs 43586 
    public static int join(int value, int addedDigit){ 
        addedDigit= addDigit(addedDigit, 0); //Calls the addDigit method from above 
        
        if((value<0 && addedDigit<0) || (value>0 && addedDigit>0)){  //If both have the same sign... 
            int absValue= Math.abs(value); //Takes the absolute value of a number 
            int absDigit= Math.abs(addedDigit); 
            String sAdded1= String.valueOf(absDigit); //Creates a string out of an int ex: int 45 becomes string "45" 
            String sValue1= String.valueOf(absValue); 
            String complete1 = sValue1 + sAdded1; //Adds the two strings together to create the final product 
            int final11 = Integer.parseInt(complete1); //Casts from a string to an int 
            return final11;
             }
        else{ //If they opposite signs... 
            int absValue= Math.abs(value);
            int absDigit= Math.abs(addedDigit); 
            String sAdded= String.valueOf(absDigit);
            String sValue= String.valueOf(absValue); 
            String complete = sValue + sAdded; 
            int final1 = Integer.parseInt(complete);
            int negative1= final1 *-1; //Multiplies the result by negative one to keep the negative sign in front
            return negative1;                
    }
}
}
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/