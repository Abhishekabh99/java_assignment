package gfg_basic;
import java.util.Scanner;
public class ReadNum {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Enter any integer :");
 Scanner sc = new Scanner(System.in);
 ReadNum a = new ReadNum();
 a.n = sc.nextInt(); 
System.out.println("here is number : "+a.n);
	}

}