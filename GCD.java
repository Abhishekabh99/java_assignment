package gfg_basic;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,r;
		System.out.println("Enter 2 numbers to find GCD or HCF :");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b= sc.nextInt();
		if (a>b)
		{
			r=b;
		}
		else 
		{
			r=a;
		}
		while(r>0)
		{
			if (a%r==0&&b%r==0)
			{
				break;
			}
			r--;
		}
		System.out.println("GCD or HCF will be :"+r);
	}

}
