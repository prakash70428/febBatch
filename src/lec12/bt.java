package lec12;
import java.util.*;

public class bt {
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	public static class Pair{
		Node node;
		int state;
		
		public Pair(Node node,int state) {
			this.node = node;
			this.state = state;
		}
	}

	public static Node Construct(Integer[] arr) {
		Stack<Pair> st = new Stack<>();
		Node root = new Node(arr[0]);
		
		st.push(new Pair(root,0));
		
		for(int i=1;i < arr.length;i++) {
			Pair tos = st.peek();
			if(arr[i] == null) {
				tos.state++;
				if(tos.state == 2) {
					st.pop();
				}
			}
			else {
				Node n = new Node(arr[i]);
				if(tos.state == 0) {
					tos.node.left = n;
					tos.state++;
				}else {
					tos.node.right = n;
					st.pop();
				}
			    st.push(new Pair(n,0));	
			}
		}
		
		return root;
	}
	
	public static void display(Node node) {
		if(node == null) {
			return;
		}
		
		String str = "";
		str += node.left == null ? "." : node.left.data + " ";
		str += "<-" + node.data + "->";
		str += node.right == null ? "." : node.right.data + " ";
		System.out.println(str);
		
		display(node.left);
		display(node.right);
		
	}
	
	public static int size(Node node) {
		if(node == null) {
			return 0;
		}
		
		int lans = size(node.left);
		int rans = size(node.right);
		int ans = lans + rans + 1;
		return ans;
	}
	
	public static int sum(Node node) {
		if(node == null) {
			return 0;
		}
		
		int lans = sum(node.left);
		int rans = sum(node.right);
		int ans = lans + rans + node.data;
		return ans;
	}
	
	public static int max(Node node) {
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		
		int lmax = max(node.left);
		int rmax = max(node.right);
		int max = Math.max(node.data,Math.max(lmax, rmax));
		return max;
	}
	
	public static int height(Node node) {
		if(node == null) {
			return -1;
		}
		
		int lh = height(node.left);
		int rh = height(node.right);
		int ht = Math.max(lh, rh) + 1;
		return ht;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] arr = {10,20,40,null,null,50,60,null,null,null,30,70,null,80,null,null,90,null,null};
        
        Node root = Construct(arr);
//        display(root);
        System.out.println(size(root));
        System.out.println(sum(root));
	}

}
