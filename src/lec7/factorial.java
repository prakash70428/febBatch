package lec7;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    
	    System.out.println(factorial(n));
	}
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		int nm1f = factorial(n - 1);
		int nf = n * nm1f;
		return nf;
	}

}
