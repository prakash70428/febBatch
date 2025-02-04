package lec3;

import java.util.*;

public class factorial_fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int r = scn.nextInt();
	        
	        int nf = factorial(n);
	        int rf = factorial(r);
	        int nmrf = factorial(n - r);
	        
	        int ans = nf / (nmrf * rf);
	        System.out.println(ans);
	}
	
	public static int factorial(int x) {
		int xf = 1;
        for(int i=1;i <= x;i++) {
        	xf = xf * i;
        }
        
        return xf;
	}

}
