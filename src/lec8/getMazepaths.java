package lec8;
import java.util.*;
public class getMazepaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        System.out.println(getMazePaths(0,0,n-1,m-1));
	}
	
	public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc){
		if(sr > dr || sc > dc) {
			ArrayList<String> bans = new ArrayList<>();
			return bans;
		}
		if(sr == dr && sc == dc) {
			ArrayList<String> bans = new ArrayList<>();
			bans.add("");
			return bans;
		}
		
		ArrayList<String> rr1 = getMazePaths(sr,sc+1,dr,dc);
		ArrayList<String> rr2 = getMazePaths(sr+1,sc,dr,dc);
		
		ArrayList<String> mr = new ArrayList<>();
		for(int i=0;i < rr1.size();i++) {
			mr.add("H" + rr1.get(i));
		}
		for(int i=0;i < rr2.size();i++) {
			mr.add("V" + rr2.get(i));
		}
		
		return mr;
	}

}
