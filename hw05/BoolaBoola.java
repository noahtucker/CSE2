//Noah Tucker 
//9/30/14 
//CSE2 

//This program will have three boolean variables to each of which the value of true 
//or false is randomly assigned. Then, at random, combine the three variables with 
//random choices of && and || and stores the result. The program should then present 
//the expression to the user and ask the user to state the result of of the expression.


import java.util.Scanner; 
public class BoolaBoola{
    public static void main(String[] args){ 
        Scanner myScanner; 
        myScanner= new Scanner (System.in); 
        
        
       double random= (Math.random()*32)+1;//Creating a random number range from (1,32.9999)
       int caseNumber= (int) random; //Changes the range to (1,32)
        caseNumber= 25; 
           
       //Take the random number generated and put into the switch statement
       switch (caseNumber){
           case 1: //If the number generated equals 1...
               System.out.print("Does false || true && false have the value true(t/T) or false(f/F)?");
               //^^Prompts the user to enter data based on 1 out of 32 different equations 
               String input1= myScanner.next(); //Tells the scanner to accept Strings
               boolean have1= false || true && false; //Creates 1 out of 32 expressions
               if(input1.equals("f")||input1.equals("F")){ //If the user enters the correct string, print this
                   System.out.println("Correct");
                   return;
               }
               else{ //If the user enters the wrong string, print this 
                   System.out.println("Wrong; try again");
                   return; 
               }
               //Based on the value generated from the random number generator, follow the same comments as CASE 1
           case 2: 
                System.out.print("Does false || true || false have the value true(t/T) or false(f/F)? ");
                String input2= myScanner.next(); 
               boolean have2= false || true || false; 
               if(input2.equals("t")||input2.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
                 }
          case 3:
                System.out.print("Does false && true || false have the value true(t/T) or false(f/F)? ");
                String input3= myScanner.next(); 
               boolean have3= false && true || false; 
               if(input3.equals("f")||input3.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
                 }
            case 4:
                System.out.print("Does false && true && false have the value true(t/T) or false(f/F)? ");
                String input4= myScanner.next(); 
               boolean have4= false && true && false; 
               if(input4.equals("f")||input4.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
                 }
           case 5:
               System.out.print("Does false || false && false have the value true(t/T) or false(f/F)?");
               String input5= myScanner.next(); 
               boolean have5= false || false && false; 
               if(input5.equals("f")||input5.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 6:
               System.out.print("Does false || false || false have the value true(t/T) or false(f/F)?");
               String input6= myScanner.next(); 
               boolean have6= false || false || false; 
               if(input6.equals("f")||input6.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 7:
               System.out.print("Does false && false || false have the value true(t/T) or false(f/F)?");
               String input7= myScanner.next(); 
               boolean have7= false && false || false; 
               if(input7.equals("f")||input7.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 8:
               System.out.print("Does false && false && false have the value true(t/T) or false(f/F)?");
               String input8= myScanner.next(); 
               boolean have8= false && false && false; 
               if(input8.equals("f")||input8.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 9:
               System.out.print("Does true || true && true have the value true(t/T) or false(f/F)?");
               String input9= myScanner.next(); 
               boolean have9= true || true && true; 
               if(input9.equals("t")||input9.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 10:
               System.out.print("Does true || true || true have the value true(t/T) or false(f/F)?");
               String input10= myScanner.next(); 
               boolean have10= true || true || true; 
               if(input10.equals("t")||input10.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 11:
               System.out.print("Does true && true || true have the value true(t/T) or false(f/F)?");
               String input11= myScanner.next(); 
               boolean have11= true && true || true; 
               if(input11.equals("t")||input11.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 12:
               System.out.print("Does true && true && true have the value true(t/T) or false(f/F)?");
               String input12= myScanner.next(); 
               boolean have12= true && true && true; 
               if(input12.equals("t")||input12.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 13:
               System.out.print("Does false || true && true have the value true(t/T) or false(f/F)?");
               String input13= myScanner.next(); 
               boolean have13= false || true && true;
               if(input13.equals("t")||input13.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 14:
               System.out.print("Does false || true || true have the value true(t/T) or false(f/F)?");
               String input14= myScanner.next(); 
               boolean have14= false || true || true;
               if(input14.equals("t")||input14.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 15:
               System.out.print("Does false && true || true have the value true(t/T) or false(f/F)?");
               String input15= myScanner.next(); 
               boolean have15= false && true || true;
               if(input15.equals("t")||input15.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 16:
               System.out.print("Does false && true && true have the value true(t/T) or false(f/F)?");
               String input16= myScanner.next(); 
               boolean have16= false && true && true;
               if(input16.equals("f")||input16.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 17:
               System.out.print("Does true || false && false have the value true(t/T) or false(f/F)?");
               String input17= myScanner.next(); 
               boolean have17= true || false && false;
               if(input17.equals("t")||input17.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 18:
               System.out.print("Does true || false || false have the value true(t/T) or false(f/F)?");
               String input18= myScanner.next(); 
               boolean have18= true || false || false;
               if(input18.equals("t")||input18.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 19:
               System.out.print("Does true && false || false have the value true(t/T) or false(f/F)?");
               String input19= myScanner.next(); 
               boolean have19= true && false || false;
               if(input19.equals("f")||input19.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 20:
               System.out.print("Does true && false && false have the value true(t/T) or false(f/F)?");
               String input20= myScanner.next(); 
               boolean have20= true && false && false;
               if(input20.equals("f")||input20.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 21:
               System.out.print("Does true || true && false have the value true(t/T) or false(f/F)?");
               String input21= myScanner.next(); 
               if(input21.equals("t")||input21.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 22:
               System.out.print("Does true || true || false have the value true(t/T) or false(f/F)?");
               String input22= myScanner.next(); 
               boolean have22= true || true || false;
               if(input22.equals("t")||input22.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 23:
               System.out.print("Does true && true || false have the value true(t/T) or false(f/F)?");
               String input23= myScanner.next(); 
               boolean have23= true && true || false; 
               if(input23.equals("t")||input23.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 24:
               System.out.print("Does true && true && false have the value true(t/T) or false(f/F)?");
               String input24= myScanner.next(); 
               boolean have24= true && true && false;
               if(input24.equals("f")||input24.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 25:
               System.out.print("Does true || false && true have the value true(t/T) or false(f/F)?");
               String input25= myScanner.next(); 
               boolean have25= ((true || false) && true);
               if(input25.equals("t")||input25.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 26:
               System.out.print("Does true || false || true have the value true(t/T) or false(f/F)?");
               String input26= myScanner.next(); 
               if(input26.equals("t")||input26.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 27:
               System.out.print("Does true && false || true have the value true(t/T) or false(f/F)?");
               String input27= myScanner.next(); 
               boolean have27= true && false || true;
               if(input27.equals("t")||input27.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 28:
               System.out.print("Does true && false && true have the value true(t/T) or false(f/F)?");
               String input28= myScanner.next(); 
               boolean have28= true && false && true;
               if(input28.equals("f")||input28.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 29:
               System.out.print("Does false || false && true have the value true(t/T) or false(f/F)?");
               String input29= myScanner.next(); 
               boolean have29= false || false && true;
               if(input29.equals("f")||input29.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 30:
               System.out.print("Does false || false || true have the value true(t/T) or false(f/F)?");
               String input30= myScanner.next(); 
               boolean have30= false || false || true;
               if(input30.equals("t")||input30.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 31:
               System.out.print("Does false && false || true have the value true(t/T) or false(f/F)?");
               String input31= myScanner.next(); 
               boolean have31= false && false || true;
               if(input31.equals("t")||input31.equals("T")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
           case 32:
               System.out.print("Does false && false && true have the value true(t/T) or false(f/F)?");
               String input32= myScanner.next(); 
               boolean have32= false && false && true;
               if(input32.equals("f")||input32.equals("F")){
                   System.out.println("Correct");
                   return;
               }
               else{
                   System.out.println("Wrong; try again");
                   return; 
               }
       }
            
        
    }
}