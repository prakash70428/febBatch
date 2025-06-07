package lec11;
import java.util.*;
public class lec11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> st = new Stack<>();
        
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
        while(st.size() != 0) {
        	System.out.println(st.pop());
        }
	}

}
