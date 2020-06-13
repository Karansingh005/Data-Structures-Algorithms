import java.io.*;
import java.util.*; 

class abc
{
    double cToF(int C)
    {
        return (9*C/5)+32;
    }
    public static void main (String args[])
    { 
      Scanner Sc = new Scanner(System.in);
      double T = sc.nextDouble();
      System.out.println("Temperature in Fahrenheit is: " + digitsInFactorial(T));
     
    }
}
