package lec11;
import java.util.*;
public class NextGreaterElementtoright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i < n;i++) {
			arr[i] = scn.nextInt();
		}
		
		int[] sol = NGETR(arr);
		for(int i=0;i < sol.length;i++) {
			System.out.println(sol[i]);
		}
		
	}
	
	public static int[] NGETR(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=arr.length-1 ; i >= 0 ;i--) {
			//1. pop all smaller elements
			while(st.size() > 0 && st.peek() < arr[i]) {
				st.pop();
			}
			//2.update ans
			if(st.size() == 0) {
				ans[i] = -1;
			}else {
				ans[i] = st.peek();
			}
			
			//3. push current element in the stack
			st.push(arr[i]);
		}
		
		return ans;
	}

}
