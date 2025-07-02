package lec12;

public class basicsll {
	public static class Node{
		int data;
		Node next;
	}
	public static class LinkedList{
		Node head;
		Node tail;
		int size;
		
		public void addLast(int val) {
			Node nn = new Node();
			nn.data = val;
			
			if(size == 0) {
				head = tail = nn;
			}else {
				tail.next = nn;
				tail = nn;
			}
			size++;
		}
		
		public void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
		
		public void addFirst(int val) {
			Node nn = new Node();
			nn.data = val;
			
			if(size == 0) {
				head = tail = nn;
			}else {
				nn.next = head;
				head = nn;
			}
			size++;
		}
		
		public void addAt(int idx,int val) {
			if(idx < 0 || idx > size) {
				System.out.println("Invalid Arguments");
			}
			else if(idx == 0) {
				addFirst(val);
			}
			else if(idx == size) {
				addLast(val);
			}
			else {
				Node temp = head;
				for(int i=0;i < idx - 1;i++) {
					temp = temp.next;
				}
				
				Node nn = new Node();
				nn.data = val;
				nn.next = temp.next;
				temp.next = nn;
				size++;
			}
		}

		public void removeLast() {
			if(size == 0) {
				System.out.println("List is empty");
			}
			else if(size == 1) {
				head = tail = null;
			}
			else {
				Node temp = head;
				for(int i=0;i < size - 2;i++) {
					temp = temp.next;
				}
				temp.next = null;
				tail = temp;
				size--;
				
			}
		}
		
		public int kthFromLast(int k) {
			Node slow = head;
			Node fast = head;
			
			for(int i=1;i <= k ;i++) {
				fast = fast.next;
			}
			
			//uniform race
			while(fast != tail) {
				fast = fast.next;
				slow = slow.next;
			}
			
			return slow.data;
		}
		
		public int mid() {
			Node slow = head;
			Node fast = head;
			
			while(fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			
			return slow.data;
		}
		
		public Node getNodeAt(int idx) {
			Node temp = head;
			for(int i=0;i < idx;i++) {
				temp = temp.next;
			}
			
			return temp;
		}
		public void reverseDI() {
			int left = 0;
			int right = size - 1;
			
			while(left < right) {
				Node lnode = getNodeAt(left);
				Node rnode = getNodeAt(right);
				
				//swap
				int temp = lnode.data;
				lnode.data = rnode.data;
				rnode.data = temp;
				
				left++;
				right--;
			}
		}
		
		public void reversePI() {
			Node prev = null;
			Node curr = head;
			
			while(curr != null) {
				Node next = curr.next;
				curr.next = prev;
				
				prev = curr;
				curr = next;
			}
			
			//swap head and tail also
			Node temp = head;
			head = tail;
			tail = temp;
		}
		
		public void displayReverseHelper(Node node) {
		    if(node == null) {
		    	return;
		    }
			
			displayReverseHelper(node.next);
			System.out.println(node.data + " ");
		}
		
		public void displayReverse() {
			displayReverseHelper(head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);;
		
//		ll.display();
//		ll.addFirst(100);
//		ll.display();
//		ll.addAt(3, 50);
//		ll.display();
//		ll.removeLast();
//		ll.display();
//		System.out.println(ll.kthFromLast(2));
//		System.out.println(ll.mid());
		ll.display();
//		ll.reverseDI();
//		ll.reversePI();
		ll.displayReverse();
//		ll.display();
	}

}
