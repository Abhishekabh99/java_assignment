package gfg_basic;
import java.util.Scanner;
public class BinaryString {

	static String addBinary(String x, String y)
	{
		  int num1 = Integer.parseInt(x,2);
	        //converting binary string into integer(decimal number)
	       
	        int num2 = Integer.parseInt(y,2);
	        //converting binary string into integer(decimal number)
	       
	       
	        int sum = num1 + num2;
	        // Adding those two decimal numbers and storing in sum
	         
	        String result = Integer.toBinaryString(sum);
	        //Converting that resultant decimal into binary string
	 
	        return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x,y,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first binary string :");
		x= sc.next();
		System.out.println("ENter second binary string :");
		y= sc.next();
//String x = "101";
//String y= "101";
		r = addBinary(x,y);
System.out.println(" Here is the addition of both binary :"+r);
		
	}

}
