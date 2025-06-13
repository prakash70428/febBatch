package lec11;
import java.util.*;
public class infixConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		Stack<String> st1 = new Stack<>(); //prefix 
		Stack<Character> st2 = new Stack<>(); //operators
		Stack<String> st3 = new Stack<>(); //postfix 
		
		for(int i=0;i < str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				st1.push(ch + "");
				st3.push(ch + "");
			}
			else if(ch == '(') {
				st2.push(ch);
			}
			else if(ch == ')') {
				while(st2.peek() != '(') {
					char oprtr = st2.pop();
					String op2 = st1.pop();
					String op1 = st1.pop();
					st1.push(oprtr + op1 + op2);
					
					String o2 = st3.pop();
					String o1 = st3.pop();
					st3.push(o1 + o2 + oprtr);
				}
				st2.pop(); //pop the opening bracket also
			}
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				while(st2.size() > 0 && precedence(st2.peek()) >= precedence(ch)) {
					char oprtr = st2.pop();
					String op2 = st1.pop();
					String op1 = st1.pop();
					st1.push(oprtr + op1 + op2);
					
					String o2 = st3.pop();
					String o1 = st3.pop();
					st3.push(o1 + o2 + oprtr);
				}
				st2.push(ch);
			}
		}
		
		while(st2.size() != 0) {
			char oprtr = st2.pop();
			String op2 = st1.pop();
			String op1 = st1.pop();
			st1.push(oprtr + op1 + op2);
			
			String o2 = st3.pop();
			String o1 = st3.pop();
			st3.push(o1 + o2 + oprtr);
		}
		
		System.out.println("prefix:" + st1.pop());
		System.out.println("postfix:" + st3.pop());
		
	}
	
	public static int precedence(char ch) {
		if(ch == '+' || ch == '-') {
			return 1;
		}
		else if(ch == '*' || ch == '/') {
			return 2;
		}
		else {
			return 0;
		}
	}

}
