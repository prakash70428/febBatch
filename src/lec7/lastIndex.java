package lec7;

import java.util.*;

public class lastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i < n;i++) {
			arr[i] = scn.nextInt();
		}
		
		int x = scn.nextInt();
		System.out.println(li(arr,0,x));
	}
	
	public static int li(int[] arr,int idx,int x) {
	    if(idx == arr.length) {
	    	return -1;
	    }
		
		int rr = li(arr,idx+1,x);
		if(rr == -1) {
			if(arr[idx] == x) {
				return idx;
			}else {
				return -1;
			}
		}else {
			return rr;
		}
	}

}
