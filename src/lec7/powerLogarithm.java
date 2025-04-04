package lec7;

import java.util.*;

public class powerLogarithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int x = scn.nextInt();
	    int n = scn.nextInt();
	    
	    System.out.println(powerlog(x,n));
	}
	
	public static int powerlog(int x,int n) {
		if(n == 0) {
			return 1;
		}
		
		int xpnby2 = powerlog(x,n/2);
		int xpn = xpnby2 * xpnby2;
		if(n%2 != 0) {
			xpn *= x;
		}
		
		return xpn;
	}

}
