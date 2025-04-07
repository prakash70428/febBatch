package lec7;

import java.util.*;

public class maxinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i < n;i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println(maxinArray(arr,0));
	}
	
	public static int maxinArray(int[] arr,int idx) {
		if(idx == arr.length) {
			return Integer.MIN_VALUE;
		}
		
		int f1 = maxinArray(arr,idx+1);
		int max = Math.max(f1,arr[idx]);
		return max;
	}

}
