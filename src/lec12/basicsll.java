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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		
		ll.display();
		ll.addFirst(100);
		ll.display();
		ll.addAt(3, 50);
		ll.display();
	}

}
