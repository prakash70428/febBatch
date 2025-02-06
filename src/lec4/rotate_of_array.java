package lec4;

import java.util.Scanner;

public class rotate_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     int[] arr = new int[n];
	     for(int i=0;i < n;i++) {
	        arr[i] = scn.nextInt();
	     }
	     int k = scn.nextInt();
	     rotate(arr,k);
	     display(arr);
	}
	
	public static void rotate(int[] arr,int k) {
		k = k % arr.length;
		if(k < 0) {
			k = k + arr.length;
		}
		
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
	}
	
	public static void reverse(int[] arr,int left,int right) {
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
