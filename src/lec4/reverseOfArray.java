package lec4;

import java.util.*;

public class reverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     int[] arr = new int[n];
	     for(int i=0;i < n;i++) {
	        arr[i] = scn.nextInt();
	     }
	     
	     reverse(arr);
	     display(arr);
	}
	
	public static void reverse(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
	}
	
	public static void display(int[] arr) {
		int n = arr.length;
		for(int i=0;i < n;i++) {
	        System.out.println(arr[i]);
	     }
	}

}
