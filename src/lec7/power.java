package lec7;

import java.util.*;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int x = scn.nextInt();
	    int n = scn.nextInt();
	    
	    System.out.println(power(x,n));
	}
	
	public static int power(int x,int n) {
		if(n == 0) {
			return 1;
		}
		
		int xpnm1 = power(x,n-1);
		int xpn = xpnm1 * x;
		return xpn;
	}

}
