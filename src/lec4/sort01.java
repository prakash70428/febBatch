package lec4;

import java.util.*;

public class sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		//user input
		for(int i=0;i < n;i++) {
			arr[i] =scn.nextInt();
		}
		
		Sort01(arr);
		display(arr);
	}
	public static void Sort01(int[] arr) {
		int i=0,j=0;
		while(i < arr.length) {
			if(arr[i] == 0) {
				swap(arr,i,j);
				i++;
				j++;
			}else {
				i++;
			}
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void display(int[] arr) {
		for(int i=0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
