package lec4;

import java.util.*;

public class subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < arr.length;i++) {
        	arr[i] = scn.nextInt();
        }
        
        PrintSubsets(arr);
	}
	
	public static void PrintSubsets(int[] arr) {
		int tns = (int)Math.pow(2,arr.length);
		for(int i=0 ;i < tns;i++) {
			int bn = dtobin(i,2);
			int div = (int)Math.pow(10,arr.length-1);
			for(int j=0;j < arr.length;j++) {
				int q = bn / div;
				int r = bn % div;
				if(q == 1) {
					System.out.print(arr[j]+" ");
				}else {
					System.out.print("-" + " ");
				}
				
				bn = r;
				div = div / 10;
			}
			System.out.println();
		}
	}
	
	public static int dtobin(int n,int b) {
		int ans = 0;
		int power = 1;
		
		while(n != 0) {
			int r = n % b;
			n = n / b;
			
			ans = ans + (r * power);
			power = power * 10;
		}
		
		return ans;
	}

}
