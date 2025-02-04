package lec3;

import java.util.*;

public class anybasetoanybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int b1 = scn.nextInt();
	    int b2 = scn.nextInt();
	    
	    int decno = anybasetoD(n,b1);
	    int ans = dtoanybase(decno,b2);
	    System.out.println(ans);
	}
	public static int anybasetoD(int n,int b) {
		int ans = 0;
		int power = 1;
		
		while(n != 0) {
			int ld = n % 10;
			n = n / 10;
			
			ans += (ld*power);
			power *= b;
		}
		
		return ans;
	}
	public static int dtoanybase(int n,int b) {
		int ans = 0;
		int power = 1;
		
		while(n != 0) {
			int r = n % b;
			n = n / b;
			
			ans = ans + (r * power);
			power = power * 10;
		}
		
		return ans;
	}

}
