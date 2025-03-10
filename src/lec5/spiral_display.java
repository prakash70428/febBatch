package lec5;

import java.util.*;

public class spiral_display {

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
        
        int rmin = 0;
        int cmin = 0;
        int rmax = arr.length - 1;
        int cmax = arr[0].length - 1;
        int counter = 0;
        
        while(counter < n*m) {
        	//left boundary
        	for(int row=rmin;row <= rmax && counter < n*m;row++) {
        		System.out.println(arr[row][cmin]);
        		counter++;
        	}
        	cmin++;
        	//bottom boundary
        	for(int col=cmin;col <= cmax && counter < n*m;col++) {
        		System.out.println(arr[rmax][col]);
        		counter++;
        	}
        	rmax--;
        	//right boundary
        	for(int row=rmax;row >= rmin && counter < n*m;row--) {
        		System.out.println(arr[row][cmax]);
        		counter++;
        	}
        	cmax--;
        	//top boundary
        	for(int col=cmax;col >= cmin && counter < n*m;col--) {
        		System.out.println(arr[rmin][col]);
        		counter++;
        	}
        	rmin++;
        }
	}

}
