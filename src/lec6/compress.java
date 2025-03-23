package lec6;

import java.util.Scanner;

public class compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		System.out.println(compress1(str));
		System.out.println(compress2(str));
	}
	
	public static String compress1(String str) {
		String ans = "";
		ans += str.charAt(0);
		
		for(int i=1;i < str.length();i++) {
			if(str.charAt(i) != ans.charAt(ans.length()-1)) {
				ans += str.charAt(i);
			}
		}
		
		return ans;
	}
	
	public static String compress2(String str) {
		String ans = "";
		ans += str.charAt(0);
		int count = 1;
		
		for(int i=1;i < str.length();i++) {
			if(str.charAt(i) == ans.charAt(ans.length()-1)) {
				count++;
			}else {
				if(count > 1) {
					ans += count;					
				}
				ans += str.charAt(i);
				count = 1; //reset
			}
		}
		
		if(count > 1) {
			ans += count;					
		}
		
		return ans;
	}

}
