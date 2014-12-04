//Noah Tucker 
//12/4/14
//CSE2

// This lab session gives you practice with elementary array operations, with ragged arrays, and with sorting. 

public class RaggedArray{
    public static void main(String[] args){ 
        //Creates a two dimensional array
        int[][] ragged= new int[5][17];
       
       //Initializes the values of the array to a random integer between 0 and 39 
        for(int k=0;k<5;k++){
            for(int i=0;i<3*k+5;i++){
                ragged[k][i]=(int)(Math.random()*40); 
            
            }
           
        
    }
    //Prints the unsorted array 
     System.out.println("Unsorted Array");
    for(int q=0; q<5;q++){
        System.out.print("{");
        for(int y=0; y<3*q+5;y++){
            System.out.print(ragged[q][y]);
            System.out.print(", ");
            
        }
        System.out.print("}");
        System.out.println();
    }
    /*Puts the array in ascending order by use of inner for loops 
    The first loop controls the row 
    The second for loop goes over every value and the third for loop is the
    Comparison loop for the second. If a value in the array is less than the previous minimum, 
    swap the values. */
    int min=0;
    int index=0; 
    for(int r=0;r<5;r++){
       for(int a=0;a<3*r+5;a++){ 
           min=ragged[r][a]; 
           index=a; 
            for(int w=a+1; w<3*r+5;w++){
                if(min>ragged[r][w]){
                    min=ragged[r][w]; 
                    index=w; 
                }
            }
            ragged[r][index]=ragged[r][a]; 
            ragged[r][a]=min;
       }
    }
    
    
   
    //Prints the sorted array 
     System.out.println("Sorted Array");
    for(int t=0; t<5;t++){
        System.out.print("{");
        for(int b=0; b<3*t+5;b++){
            System.out.print(ragged[t][b]);
            System.out.print(", ");
        }
        System.out.print("}");
        System.out.println();
    }
    }
    }
