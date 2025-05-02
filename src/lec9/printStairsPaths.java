package lec9;

import java.util.*;

public class printStairsPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        PrintStairPaths(n,"");
	}
	
	public static void PrintStairPaths(int n,String asf) {
		if(n < 0) {
			return;
		}
		if(n == 0) {
			System.out.println(asf);
			return;
		}
		
		PrintStairPaths(n-1,asf + "1");
		PrintStairPaths(n-2,asf + "2");
		PrintStairPaths(n-3,asf + "3");
	}

}
