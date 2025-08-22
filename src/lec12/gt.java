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
	
	public static void levelOrder(Node node) {
		Queue<Node> q = new ArrayDeque<>();
		q.add(node);
		
		while(q.size() != 0) {
			Node rn = q.remove();
			System.out.print(rn.data + " ");
			for(Node child : rn.children) {
				q.add(child);
			}
		}
		System.out.println();
	}
	
	public static void traversals(Node node) {
		//pre area
		System.out.println("Node pre " + node.data);
		for(Node child : node.children) {
			System.out.println("Edge pre " + node.data+ "->" + child.data); 
			traversals(child);
			System.out.println("Edge post " + node.data + "->" + child.data); 
        }
		//post area
		System.out.println("Node post " + node.data);
	}
	
	public static void levelOrderLinewise(Node node) {
		Queue<Node> mq = new ArrayDeque<>();
		mq.add(node);
		
		Queue<Node> cq = new ArrayDeque<>();
		
		while(mq.size() > 0) {
			node = mq.remove();
			System.out.print(node.data + " ");
			
			for(Node child : node.children) {
				cq.add(child);
			}
			
			if(mq.size() == 0) {
				mq = cq;
				cq = new ArrayDeque<>();
				System.out.println();
			}
		}
	}
	
	public static void mirror(Node node) {
		for(Node child : node.children) {
			 mirror(child);
		}
		
		int left = 0;
		int right = node.children.size() - 1;
		while(left < right) {
			Node ln = node.children.get(left);
			Node rn = node.children.get(right);
			node.children.set(left,rn);
			node.children.set(right,ln);
			left++;
			right--;
		}
	}
	
	public static void removeLeafes(Node node) {
		for(int i=0;i < node.children.size();i++) {
			Node child = node.children.get(i);
			if(child.children.size() == 0) {
				node.children.remove(i);
				i--;
			}
		}

		for(Node child : node.children) {
			removeLeafes(child);
		}
	}
	public static Node getTail(Node node) {
		if(node.children.size() > 0) {
			Node rr = getTail(node.children.get(0));
			return rr;
		}else {
			return node;
		}
	}
	public static void linearize(Node node) {
		for(Node child : node.children) {
			linearize(child);
		}
		
		while(node.children.size() > 1) {
			Node slkitail = getTail(node.children.get(node.children.size() - 2));
			slkitail.children.add(node.children.get(node.children.size() - 1));
			node.children.remove(node.children.size() - 1);
		}
	}
	
	public static boolean find(Node node,int data) {
		if(node.data == data) {
			return true;
		}
		
		for(Node child : node.children) {
			boolean finc = find(child,data);
			if(finc == true) {
				return true;
			}
		}
		
		return false;
	}
	
	public static ArrayList<Integer> nodeToRootPath(Node node,int data){
		if(node.data == data) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(node.data);
			return list;
		}
		
		for(Node child : node.children) {
			ArrayList<Integer> ptc = nodeToRootPath(child,data);
			if(ptc.size() > 0) {
				ptc.add(node.data);
				return ptc;
			}
		}
		
		return new ArrayList<>();
	}
	
	public static int lca(Node node,int d1,int d2) {
		ArrayList<Integer> al1 = nodeToRootPath(node,d1);
		ArrayList<Integer> al2 = nodeToRootPath(node,d2);
		
		int i = al1.size() - 1;
		int j = al2.size() - 1;
		
		while(i >= 0 && j >= 0 && al1.get(i) == al2.get(j)) {
			i--;
			j--;
		}
		
		i++;
		j++;
		
		return al1.get(i);
		
	}
	
	public static boolean areSimilar(Node n1,Node n2) {
		if(n1.children.size() != n2.children.size()) {
			return false;
		}
		
		for(int i=0;i < n1.children.size();i++) {
			Node c1 = n1.children.get(i);
			Node c2 = n2.children.get(i);
			boolean cans = areSimilar(c1,c2);
			if(cans == false) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int distanceBetweenTwoNodes(Node node,int d1,int d2) {
		int dist = 0;
		ArrayList<Integer> al1 = nodeToRootPath(node,d1);
		ArrayList<Integer> al2 = nodeToRootPath(node,d2);
		
		int i = al1.size() - 1;
		int j = al2.size() - 1;
		
		while(i >= 0 && j >= 0 && al1.get(i) == al2.get(j)) {
			i--;
			j--;
		}
		i++;
		j++;
		
		return i+j;
	}
	
	public static class Pair{
		int sum;
		int mss = Integer.MIN_VALUE;
		Node mssnode;
	}
	public static Pair MaximumSubtreeSum(Node node) {
		Pair mp = new Pair();
		mp.sum += node.data;
		
		for(Node child : node.children) {
			Pair cp = MaximumSubtreeSum(child);
			mp.sum += cp.sum;
			if(cp.mss > mp.mss) {
				mp.mss = cp.mss;
				mp.mssnode = cp.mssnode;
			}
		}
		
		if(mp.sum > mp.mss) {
			mp.mss = mp.sum;
			mp.mssnode = node;
		}
		
		return mp;
	}
	
	public static class DPair{
		int ht;
		int dia;
	}
	public static DPair diameter(Node node) {
		int maxh = -1;
		int smaxh = -1;
		int dia = 0;
		
		for(Node child : node.children) {
			DPair cp = diameter(child);
			if(cp.ht > maxh) {
				smaxh = maxh;
				maxh = cp.ht;
			}
			else if(cp.ht > smaxh) {
				smaxh = cp.ht; 
			}
			dia = Math.max(dia,cp.dia);
		}
		
		DPair mp = new DPair();
		mp.ht = maxh + 1;
		mp.dia = Math.max(dia, maxh + smaxh + 1);
		
		return mp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = { 10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1 };
        Node root = Construct(arr);
//        display(root);
//        System.out.println(size(root));
//        System.out.println(height(root));
//        levelOrder(root);
//        traversals(root); 
//        levelOrderLinewise(root);
//        mirror(root);
//        removeLeafes(root);
//        linearize(root);
//        System.out.println(find(root,500));
//        ArrayList<Integer> ans = nodeToRootPath(root,500);
//        System.out.println(ans);
//        display(root);
        
//          System.out.println(lca(root,110,90));       
//        System.out.println(distanceBetweenTwoNodes(root,120,100));
//        Pair ansp = MaximumSubtreeSum(root);
//        System.out.println(ansp.mssnode.data + "@" + ansp.mss);
        
        DPair ans = diameter(root);
        System.out.println(ans.dia);
	}

}
