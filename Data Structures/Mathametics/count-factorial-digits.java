import java.io.*;
import java.util.*; 

class abc{
      public int digitsInFactorial(int N)
    {
        //Your code here
        double sum=0;
        while(N>=2){
            sum = sum + Math.log10(N);
            N = N - 1;
        }
        return (int)(Math.floor(sum))+1;
    }
    public static void main (String args[])
    { 
      Scanner Sc = new Scanner(System.in);
      int T = sc.nextInt();
      System.out.println("Number of digits of factorial are: " + digitsInFactorial(T));
     
    }
}
