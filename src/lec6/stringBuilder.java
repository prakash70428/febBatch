package lec6;

public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        String str = "hello";
//        long start = System.currentTimeMillis();
//        for(int i=1;i <= 1000000;i++) {
//        	str += 'e';
//        }
//        long end = System.currentTimeMillis();
//        
//        long duration = end - start;
//        System.out.println(duration);
        
        StringBuilder sb = new StringBuilder("hello");
        long start = System.currentTimeMillis();
        for(int i=1;i <= 1000000;i++) {
        	sb.append('e');
        }
        long end = System.currentTimeMillis();
        
        long duration = end - start;
        System.out.println(duration);
	}

}
