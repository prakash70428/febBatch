package lec9;
import java.util.*;
public class printSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        PrintSS(str,"");
	}
	
	public static void PrintSS(String str,String asf) {
		if(str.length() == 0) {
			System.out.println(asf);
			return;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		//no
		PrintSS(ros,asf);
		//yes
		PrintSS(ros,asf + ch);
	}

}
