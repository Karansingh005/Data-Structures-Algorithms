import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    Quadratic  obj=new Quadratic();
		    int a,b,c;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    obj.quadraticRoots(a,b,c);
		    System.out.println();
		}
		
	}
}
class Quadratic 
{
    public void quadraticRoots(int a,int b,int c)
    {
        //Your code here
        double root1=0,root2=0;
        if (Math.pow(b,2)>= 4 * a * c)
        {
            root1 = (-b + Math.pow(Math.pow(b,2)-4*a*c,0.5))/(2*a);
            root2 = (-b - Math.pow(Math.pow(b,2)-4*a*c,0.5))/(2*a);
            System.out.println((int)root1 + " " + (int)root2);
        }
        else if (Math.pow(b,2)== 4*a*c){
            root1=root2= -b/(2*a);
            System.out.println((int)root1 + " " + (int)root2);
        }
        else
        {
            System.out.println("Imaginary");
        }
    }
}
