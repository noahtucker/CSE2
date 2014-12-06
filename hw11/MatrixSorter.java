
    //Noah Tucker 
//12/5/14
//CSE2

//This homework gives you practice in manipulating arrays and multidimensional arrays, 
//in writing methods that have array parameters, and in searching and sorting arrays.


/* 
The main method calls 4 different methods, all of which invole multidimensional arrays. 
buildMat3d() creates an array 
show() prints out the array 
findMin() finds the smallest value in the printed array 
sort() puts the array in order by row, and sets the first value of each row in order 
*/
import java.util.Scanner; 
public class MatrixSorter{
    public static void main(String[] args){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
    
   }
   public static int[][][] buildMat3d(){
       int[][][] ragged= new int[3][7][9]; 
       for(int i=0; i<3;i++){
           for(int k=0; k<3+2*i;k++){
               for(int y=0; y<=i+k;y++){
                   ragged[i][k][y]=(int)((Math.random()*99)+1);
               }
           }
       }
       return ragged; 
   }
   //Prints out the ragged array 
   public static void show(int[][][] a){
              for(int i=0; i<3;i++){
                 
           for(int k=0; k<3+2*i;k++){
               for(int y=0; y<=i+k;y++){
                   System.out.print(a[i][k][y]);
                   System.out.print(" "); 
               }
              System.out.println();
           }
           System.out.println();
       }
   }
   //Finds the minimum value of the array created in the above method 
   
   public static int findMin(int[][][] a){ 
       int[][][] temp= new int[10][10][10]; 
       int min=a[0][0][0]; 
        for(int i=0; i<3;i++){
           for(int k=0; k<3+2*i;k++){
               for(int y=0; y<i+k;y++){
                   if(min>a[i][k][y]){
                       min=a[i][k][y]; 
                   }
               }
           }
       }
       return min; 
   }
   //Puts the array in order by row and by the first column 
   public static int[][] sort(int[][]a){

     a[0]=sort(a[0],3); 
     a[1]=sort(a[1],4);
     a[2]=sort(a[2],5);
     a[3]=sort(a[3],6);
     a[4]=sort(a[4],7);
     a[5]=sort(a[5],8);
     a[6]=sort(a[6],9);
   
       
      //insertion sort 
    for(int i=1;i<7;i++){
        int temp=a[i][0];
        int j=i-1;
        
        
        while(j>=0 && a[j][0]>temp){
            int[] hold= new int[10];
            hold=a[j+1];
            a[j+1]=a[j];
            a[j]=hold; 
            j--;
        }
        a[j+1][0]=temp;
        
    }
   
     return a;
   
}
//Overloaded method called for putting individual rows in order 
public static int[] sort(int[] a, int b){
    
    int min=0;
    int index=0;
    for(int i=0;i<b;i++){
        min=a[i];
        index=i; 
        for(int k=i+1;k<b;k++){
            if(min>a[k]){
                min=a[k];
                index=k;
            }
        }
        a[index]=a[i];
        a[i]=min; 
    }
    
    
    return a;
}
   
}


