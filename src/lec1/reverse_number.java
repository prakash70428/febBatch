package lec1;

import java.util.*;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		while(n != 0) {
			int rem = n % 10;
			System.out.println(rem);
			n = n / 10;     
		}
	}

}
