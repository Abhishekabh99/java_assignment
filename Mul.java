package gfg_basic;
import java.util.Scanner;
public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,r;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first float number :");
		a = sc.nextFloat();
		System.out.println("Enter second float number :");
		b = sc.nextFloat();
		r = a*b;
		System.out.println("result after multiplication : "+r);
	}

}
