package gfg_basic;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		System.out.println("Enter 2 numbers :");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Numbers before swapping are :"+a+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Numbers after swapping are :" +a+b);
		

		
		
	}

}
