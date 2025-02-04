package lec4;

import java.util.*;

public class sumOftwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i < n1;i++) {
        	arr1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i < n2;i++) {
        	arr2[i] = scn.nextInt();
        }
        
        int sz = Math.max(n1, n2) + 1;
        int[] ans = new int[sz];
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;
        int carry = 0;
        
        while(k >= 0) {
        	int sum = carry;
        	if(i >= 0) {
        		sum = sum + arr1[i];
        	}
        	if(j >= 0) {
        		sum = sum + arr2[j];
        	}
        	
        	if(sum < 10) {
        		carry = 0;
        	}else {
        		sum = sum - 10;
        		carry = 1;
        	}
        	ans[k] = sum;
        	
        	i--;
        	j--;
        	k--;
        }
        
        for(i=0;i < ans.length;i++) {
        	if(i == 0 && ans[0] == 0) {
        		//do nothing
        	}else {
        		System.out.println(ans[i]);
        	}
        }
	}

}
