package gfg_basic;
import java.util.*;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("Enter Integer :");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
if ((n % 400 == 0)
        || ((n % 4 == 0) && (n % 100 != 0))) {
       
        // Both conditions true- Print leap year
        System.out.println(n + " : Leap Year");
    }

    else {
        // Any condition fails- Print Non-leaps year
        System.out.println(n + " : Non - Leap Year");
    }

	}

}
