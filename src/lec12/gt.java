package lec12;
import java.util.*;
public class gt {

	public static class Node{
		int data;
		ArrayList<Node> children;
		
		public Node(int data) {
			this.data = data;
			children = new ArrayList<>();
		}
	}
	//root of the generic tree
	public static Node Construct(int[] arr) {
		Stack<Node> st = new Stack<>();
		Node root = new Node(10);
		st.push(root);
		
		for(int i=1;i < arr.length;i++) {
			if(arr[i] == -1) {
				st.pop();
			}else {
				Node nn = new Node(arr[i]);
				st.peek().children.add(nn);
				st.push(nn);
			}
		}
		
		return root;
	}
	//display
	public static void display(Node node) {
		String str = node.data + "->";
		for(Node child : node.children) {
			str += child.data + ",";
		}
		str += '.';
		System.out.println(str);
		
		for(Node child : node.children) {
			display(child);              
		}
		
//        for(int i=0;i < node.children.size();i++) {
//        	Node child = node.children.get(i);
//        	display(child);
//		}
	}
	
	public static int size(Node node) {
		int sz = 1;
		for(Node child : node.children) {
			sz += size(child);
		}
		
		return sz;
	}
	
	public static int height(Node node) {
		int ht = -1;
		
		for(Node child : node.children) {
			ht = Math.max(ht,height(child));
		}
		
		return ht + 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = { 10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1 };
        Node root = Construct(arr);
//        display(root);
        System.out.println(size(root));
        System.out.println(height(root));
	}

}
