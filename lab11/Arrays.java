//Noah Tucker 
//12/3/14
//CSE2

//For this lab session you will get practice with elementary array operations.


import java.util.Scanner; 
public class Arrays{
    public static void main(String[] args){ 
        int []ner= new int[10];
        int [] hold= new int[10]; 
        int [] reverse= new int[10]; 
       
        //Prompts the user to enter 10 integers 
        Scanner scan= new Scanner(System.in); 
        System.out.print("Please enter 10 integers: "); 
        int i=0; 
        //sets the values of the array to the inputted value 
        for(i=0; i<ner.length; i++){
            ner[i]=scan.nextInt(); 
        }
        //copies the contents into another array called hold 
        for(int f=0; f<hold.length; f++){
            hold[f]=ner[f]; 
        }
        //finds the lowest value by comparing all the values to the first one
        //if the value is less than the first one, switch the values 
        for(int k=0; k<ner.length; k++){
            if(ner[k]<=ner[0]){
                ner[0]=ner[k];
            }
        }
        System.out.println("The lowest entry is " +ner[0]);
        
        //finds the highest value by comparing all the values to the first one
        //if the value is more than the first one, switch the values 
        for(int j=0; j<ner.length; j++){
            if(ner[j]>=ner[1]){
                ner[1]=ner[j];
            }
        }
        System.out.println("The highest entry is "+ner[1]); 
        
        //Finds the sum by adding all the values of the array 
        int sum=0;
        for(int h=0; h<ner.length; h++){
            sum+=hold[h]; 
        }
        System.out.println("The sum of all the values in the array is: "+ sum); 
        
       //Sets reverse[] to the reverse values of hold 
        reverse[9]=hold[0]; 
        reverse[8]=hold[1]; 
        reverse[7]=hold[2]; 
        reverse[6]=hold[3]; 
        reverse[5]=hold[4]; 
        reverse[4]=hold[5]; 
        reverse[3]=hold[6]; 
        reverse[2]=hold[7]; 
        reverse[1]=hold[8]; 
        reverse[0]=hold[9]; 
        
        
        for(int hg=0; hg<reverse.length; hg++){
        System.out.println(hold[hg]+"\t"+reverse[hg]); 
        
        }
        
    }
}