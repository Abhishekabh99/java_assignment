package gfg_basic;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,temp;
		System.out.println("Enter 3 numbers :");
	     Scanner sc = new Scanner(System.in);
	     a= sc.nextInt();
	     b=sc.nextInt();
	     c= sc.nextInt();
	     
	     if (a>b && a>c)
	     {
	    	 System.out.println("a is largest");
	     }
	     else if(b>a && b>c) 
	     {
	    	 System.out.println("b is largest");
	    	 
	     }
	     else {
	    	 System.out.println("c is largets");
	     }

	}

}
