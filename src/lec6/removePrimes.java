package lec6;
import java.util.*;
public class removePrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i < n;i++) {
			al.add(scn.nextInt());
		}
		
		RemovePrimes(al);
		System.out.println(al);
	}
	public static void RemovePrimes(ArrayList<Integer> al) {
		for(int i=0;i < al.size();) {
			if(isPrime(al.get(i)) == true) {
				al.remove(i);
			}else {
				i++;
			}
		}
		
		//alternative
//		for(int i=al.size()-1;i >= 0;i--) {
//			if(isPrime(al.get(i)) == true) {
//				al.remove(i);
//			}
//		}
	}
	public static boolean isPrime(int n) {
		for(int div=2;div*div <= n;div++) {
			if(n % div == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
