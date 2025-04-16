package lec8;

import java.util.*;

public class getKPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		System.out.println(getkpc(str));
	}
	
	static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static ArrayList<String> getkpc(String str){
		if(str.length() == 0) {
			ArrayList<String> bans = new ArrayList<>();
			bans.add("");
			return bans;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getkpc(ros);
		
		ArrayList<String> mr = new ArrayList<>();
		String code = arr[ch - '0'];
		for(int i=0;i < code.length();i++) {
			char c = code.charAt(i);
			for(int j=0;j < rr.size();j++) {
				mr.add(c + rr.get(j));
			}
			
		}
		return mr;	
	}

}
