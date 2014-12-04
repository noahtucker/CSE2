//Noah Tucker 
//12/3/14
//CSE2

//This lab session gives you practice with elementary array operations and passing arrays to and from methods.

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  //This method displays the array in the form {int,int,int} 
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  //This method checks to see if the length of the arrays are equal. If they are not, return false. 
  //If they are equal, check to see if each value at the same index is equal. If they are, return true.
  //Otherwise, return false. 
 public static Boolean equals(double[] a, double[] b){
   boolean equal = false;
    if(a.length !=b.length)
        equal = false;
        else{
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                    equal = false;
                    break;
                }
                equal = true;
            }
      
     }
        return equal;
 }
 
 
//This method takes two arrays and adds them together. If one is bigger than the other,
//make the returned array equal in size to the bigger one and input the values of the bigger 
//array into the slots after the smaller one has run out of room. 
 public static double[] addArrays(double [] c, double[] d){
     
     if(c.length<d.length){
         double[] yes= new double[d.length]; 
         for(int i=0; i<c.length; i++){
             yes[i]=c[i]; 
         }
         for(int jk=c.length; jk<yes.length; jk++){
             yes[jk]=0; 
         }
         double[] net= new double[d.length]; 
         for(int h=0; h<net.length; h++){
             net[h]=yes[h]+d[h]; 
         }
              return net; 
     }

     else if(c.length>d.length){
         double[] yea= new double[c.length]; 
         for(int i=0; i<d.length; i++){
             yea[i]=d[i]; 
         }
         for(int hty=d.length; hty<yea.length; hty++){
             yea[hty]=0; 
         }
 
         double[] nes= new double[c.length]; 
         for(int h=0; h<d.length; h++){
             nes[h]=c[h]+d[h]; 
         }
         for(int yui=d.length; yui<nes.length; yui++){
             nes[yui]=c[yui];
         }
         return nes; 
     }
     else{
         double[] neq= new double[c.length]; 
         for(int hgf=0; hgf<c.length; hgf++){
             neq[hgf]=c[hgf]+d[hgf];
         }
         return neq;
     }
   
     }
 
}