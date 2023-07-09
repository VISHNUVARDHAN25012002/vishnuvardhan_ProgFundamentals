package BasePower;

import java.util.Scanner;

public class Basepower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base number X:");
		int x=sc.nextInt();
		System.out.print("Enter the power N =");
		int n=sc.nextInt();
		 int result = power(x, n);
		    System.out.println( "X power N is : " + result);
		  }

	
	public static int power(int x ,int n) {
		if (n==0) {
			return 1;
		}
		else {
		      return x * power(x, n - 1);
		
	}

}
}
