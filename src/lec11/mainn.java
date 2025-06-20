package lec11;

public class mainn {
	public static class CustomQueue{
		int[] data;
		int front;
		int size;
		
		public CustomQueue(int cap) {
			data = new int[cap];
			front = 0;
			size = 0;
		}
		
		public int size() {
			return size;
		}
		public void add(int val) {
			if(size == data.length) {
				System.out.println("Queue Overflow");
				return;
			}
			
			int rear = (front + size) % data.length;
			data[rear] = val;
			size++;
		}
		public int remove() {
			if(size == 0) {
				System.out.println("Queue Underflow");
				return -1;
			}
			
			int rv = data[front] ;
			front = (front + 1) % data.length ;
			size--;
			return rv;
		}
		public int peek() {
			if(size == 0) {
				System.out.println("Queue Underflow");
				return -1;
			}
			
			return data[front];
		}
		public void display() {
			for(int i=0;i < size;i++) {
				System.out.print(data[(front + i) % data.length] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque
		CustomQueue q = new CustomQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        
        q.remove();
        
        q.display();
	}

}
