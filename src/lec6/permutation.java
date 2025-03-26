package lec6;

import java.util.*;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	     String str = scn.nextLine();
	        
	     StringPermutation(str);
	}

	public static void StringPermutation(String str) {
		int n = str.length();
		int nf = 1;
		for(int i=1;i <= n;i++) {
			nf *= i;
		}
		
		for(int i=0;i < nf;i++) {
			StringBuilder sb = new StringBuilder(str);
			for(int div=n,dvd=i; div > 0 ;div--) {
				int r = dvd % div;
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				dvd = dvd / div;
			}
			System.out.println();
		}
	}
}
