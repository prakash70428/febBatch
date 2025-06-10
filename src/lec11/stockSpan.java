package lec11;
import java.util.*;
public class stockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i < n;i++) {
			arr[i] = scn.nextInt();
		}
		
		int[] sol = StockSpan(arr);
		for(int i=0;i < sol.length;i++) {
			System.out.println(sol[i]);
		}
	}
	
	public static int[] StockSpan(int[] arr){
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i < arr.length;i++) {
			//1. pop all smaller element
			while(st.size() > 0 && arr[st.peek()] < arr[i]) {
				st.pop();
			}
			
			//2. update answer
			if(st.size() == 0) {
				ans[i] = i - (-1);
			}else {
				ans[i] = i - st.peek();
			}
			
			//3. push current index in the stack
			st.push(i);
		}
		
		return ans;
	}

}
