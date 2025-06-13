package lec11;
import java.util.*;
public class infixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		InfixEvaluation(str);
	}
	
	public static void InfixEvaluation(String str) {
		Stack<Integer> st1 = new Stack<>(); //operands
		Stack<Character> st2 = new Stack<>(); //operators
		
		for(int i=0;i < str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9') {
				st1.push(ch - '0');
			}
			else if(ch == '(') {
				st2.push(ch);
			}
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				while(st2.size() > 0 && precedence(st2.peek()) >=  precedence(ch)) {
					char oprtr = st2.pop();
					int op2 = st1.pop();
					int op1 = st1.pop();
					int result = solve(op1,op2,oprtr);
					st1.push(result);
				}
				st2.push(ch);
			}
			else if(ch == ')') {
				while(st2.peek() != '(') {
					char oprtr = st2.pop();
					int op2 = st1.pop();
					int op1 = st1.pop();
					int result = solve(op1,op2,oprtr);
					st1.push(result);
				}
				st2.pop(); //pop the opening bracket
			}
		}
		
		while(st2.size() != 0) {
			char oprtr = st2.pop();
			int op2 = st1.pop();
			int op1 = st1.pop();
			int result = solve(op1,op2,oprtr);
			st1.push(result);
		}
		
		System.out.println(st1.pop());
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
	
	public static int solve(int op1,int op2,char oprtr) {
		if(oprtr == '+') {
			return op1 + op2;
		}
		else if(oprtr == '-') {
			return op1 - op2;
		}
		else if(oprtr == '*') {
			return op1 * op2;
		}
		else {
			return op1 / op2;
		}
	}

}
