//Noah Tucker 
//10/10/14 
//CSE2 

public class LoopTheLoop{
    public static void main(String[] args){
        int nStars = 10; 
        int counter= 0; 
        while(counter<nStars){
            counter++; 
            while(counter==1){
                System.out.println("*");
                break; 
            }
        }
        System.out.println(counter); 
    }
}
