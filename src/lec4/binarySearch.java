package lec4;

import java.util.*;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		//user input
		for(int i=0;i < n;i++) {
			arr[i] =scn.nextInt();
		}
		int data = scn.nextInt();
		
		int ans = binary_Search(arr,data);
		System.out.println(ans);
	}
	
	public static int binary_Search(int[] arr,int data) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] == data) {
				return mid;
			}
			else if(arr[mid] > data) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		
		return -1;//signifies that element is not present in the array
	}

}
