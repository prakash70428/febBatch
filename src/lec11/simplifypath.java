package lec11;
import java.util.*;
public class simplifypath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		for(int i=0;i < st.size();i++) {
			System.out.println(st.get(i));
		}
	}

}
