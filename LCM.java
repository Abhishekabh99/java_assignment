package gfg_basic;
import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,r;
		System.out.println("Enter two numbers to find LCM :");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b= sc.nextInt();
	
		if (a>b)
		{
			r =a;
		}
		else {
			r =b;
		}
		
		while(true)
		{
			if(r%a==0&&r%b==0)
			{
				System.out.println("LCM of a and b is :"+r);
				break;
			}
		
			++r;
		}

	}

}
