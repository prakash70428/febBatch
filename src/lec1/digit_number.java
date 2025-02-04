package lec1;

import java.util.Scanner;

public class digit_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int nod = 0;
        int num = n;
        while(num != 0) {
        	num = num / 10;
        	nod = nod + 1;
        }
        
        int div = (int)Math.pow(10,nod - 1);
        
        while(div != 0) {
        	int q = n / div;
            int r = n % div;
            System.out.println(q);
            n = r;
            div = div / 10;
        }
	}

}
