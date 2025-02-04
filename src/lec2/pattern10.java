package lec2;

import java.util.*;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		int space = n - 1;
		int star = 1;
		
		
		while(row <= n) {
			//space 
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i = i + 1;
			}
			//star
			int val = 1;
			int j = 1;
			while(j <= star) {
				System.out.print(val + " ");
				if(j < star/2 + 1) {
					val = val + 1;
				}else {
					val = val - 1;
				}
				
				j = j + 1;
			}
			
			//next row prepration
			space = space - 1;
			star = star + 2;
			
			row = row + 1;
			System.out.println();
		}
	}

}
