package lec4;

import java.util.*;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        
        int ans = linearSearch(arr,data);
        System.out.println(ans);
	}
	public static int linearSearch(int[] arr,int data) {
		for(int i=0;i < arr.length;i++) {
			if(arr[i] == data) {
				return i;
			}
		}
		
		return -1;
	}
}
