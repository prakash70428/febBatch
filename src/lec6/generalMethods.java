package lec6;
import java.util.*;
public class generalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "NEWSPAPER";
        char ch = str.charAt(4);
        int len = str.length();
        String s1 =  str.substring(2,6);
        String s2 = str.substring(3);
        
        String s6 = str.substring(5,5); //empty string
        String s7 = str.substring(5,2); //error(stirng index out of bound)
        
//        String s3 = "prakash";
//        String s4 = "kumar";
//        String s5 = s3 + s4; //"prakashKumar"
        
        System.out.println(s6);
	}

}
