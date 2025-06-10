package lec11;

import java.util.*;

public class largestAreaHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i < n;i++) {
			arr[i] = scn.nextInt();
		}
		
		int[] nsl = new int[n];
		int[] nsr = new int[n];
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i < arr.length;i++) {
			//pop all greater element
			while(st.size()>0 && arr[st.peek()] >= arr[i]) {
				st.pop();
			}
			//update answer
			if(st.size() == 0) {
				nsl[i] = -1;
			}else {
				nsl[i] = st.peek();
			}
			
			//push current index in the stack
			st.push(i);
		}
		
		
		st = new Stack<>();
		
		for(int i=n-1;i >= 0;i--) {
			//pop all greater element
			while(st.size()>0 && arr[st.peek()] >= arr[i]) {
				st.pop();
			}
			//update answer
			if(st.size() == 0) {
				nsr[i] = n;
			}else {
				nsr[i] = st.peek();
			}
			
			//push current index in the stack
			st.push(i);
		}
		
		int ans = 0;
		for(int i=0;i < n;i++) {
			ans = Math.max(ans,arr[i]*(nsr[i]-nsl[i]-1));
		}
		
		System.out.println(ans);
	}

}
