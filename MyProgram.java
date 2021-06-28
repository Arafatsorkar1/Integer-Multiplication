/*
Integer Multiplication (recursivs , general) of N-digit values
 */
package cse0214;
import java.util.*;

////////////////////////////

class Multiply
{   int counter=0;

    
    long IntegerMul(long x, long y, int n)
    {
        counter++;
        
        int m;
        
        if (n==1) return x*y;
        
        if (n%2 == 0) 
                m = n/2;
        else
                m = (n+1)/2 ;
        
       long a,b,c,d, e, f,g,h, result;
        
       long powerM =(long) Math.pow(10,m);
       a= x/powerM;
       b= x%powerM;
       c= y/powerM;
       d= y%powerM;
       
       e = IntegerMul(a,c,m);
       f= IntegerMul(a,d,m);
       g = IntegerMul(b,c,m);
       h = IntegerMul(b,d,m);
       
       result = e*(long)Math.pow(10, 2*m) + (f+g)*(long)Math.pow(10,m) + h ;
       return result; 
    }
    

    
}
////////////////////////////




public class MyProgram {


    public static void main(String[] args) {
       
        Scanner s1 = new Scanner(System.in);
        long x, y;
        int n1, n2, n;
        long result;
        
        System.out.println("Enter 1st number");
        x = s1.nextLong();
        System.out.println("Enter 2nd number");
        y = s1.nextLong(); 
        
        n1 = (int)Math.log10(x) + 1;
        n2 = (int)Math.log10(y) + 1;
        n = Math.min(n1, n2);
        
       Multiply m = new Multiply();
       result = m.IntegerMul(x, y, n);
       System.out.println("Multiplication value = " + result);
       System.out.println("Number of recursive call = "+ m.counter); 
    }
    
}