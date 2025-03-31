package lec6;
import java.util.*;
public class arrayListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(2));
        al.set(2,500);
        System.out.println(al);
        al.add(2,1000);
        System.out.println(al);
        al.remove(2);
        al.remove(2);
        System.out.println(al);
	}

}
