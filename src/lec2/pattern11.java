package lec2;

import java.util.*;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		int space = n - 1;
		int star = 1;
		int val = 1;
		
		while(row <= 2*n - 1) {
			//space
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i = i + 1;
			}
			//star
			int j = 1;
			int p = val;
			while(j <= star) {
				System.out.print(p+" ");
				if(j < star/2 + 1) {
					p = p + 1;
				}else {
					p = p - 1;
				}
				
				j = j + 1;
			}
			//next row prepration
			//mirror concept
			if(row < n) {
				space = space - 1;
				star = star + 2;
				val = val + 1;
			}else {
				space = space + 1;
				star = star - 2;
				val = val - 1;
			}
			
			row = row + 1;
			System.out.println();
		}
	}

}
