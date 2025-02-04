package lec3;

import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        
        int nf = 1;
        for(int i=1;i <= n;i++) {
        	nf = nf * i;
        }
        
        int rf = 1;
        for(int i=1;i <= r;i++) {
        	rf = rf * i;
        }
        
        int nmrf = 1;
        for(int i=1;i <= n - r;i++) {
        	nmrf = nmrf * i;
        }
        
        int ans = nf / (nmrf * rf);
        System.out.println(ans);
	}

}
