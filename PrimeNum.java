package gfg_basic;
import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int l,h;
		System.out.println("enter lower integer and higher integer :");
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		h = sc.nextInt();
		for (int n=l;n<=h;n++)
		{
			int count =0;
			
		
		for (int div =2;div*div<=n;div++)
		{
			if (n%div ==0){
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(n);
		}
	}

}
}
