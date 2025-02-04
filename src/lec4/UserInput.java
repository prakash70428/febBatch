package lec4;
import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        //user input
        for(int i=0;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
//        arr[0] = scn.nextInt();
//        arr[1] = scn.nextInt();
//        arr[2] = scn.nextInt();
//        arr[3] = scn.nextInt();
        
        //user output
        for(int i=0;i < n;i++) {
        	System.out.println(arr[i]);
        }
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        
	}

}
