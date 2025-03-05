package lec5;
import java.util.*;
public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//no. of rows
        int m = scn.nextInt(); //no. of columns
        int[][] arr = new int[n][m];
        //user input
        for(int i=0;i < n;i++) {
        	for(int j=0;j < m;j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
        
        //display
        for(int i=0;i < n;i++) {
        	for(int j=0;j < m;j++) {
        		System.out.print(arr[i][j] + " ");
        	}
        	System.out.println();
        }
	}

}
