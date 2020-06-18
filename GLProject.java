// Name: Tian Yuan
//
// NetID: tyuan7
//
// UIC Email: tyuan7@uic.edu

import java.util.ArrayList;
import java.util.Iterator;

public class GLProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello generic lists");
		
		GenericQueue<Integer> queue = new GenericQueue<Integer>(1);

		GenericStack<Integer> stack = new GenericStack<Integer>(1);

		
		System.out.println("Queue: ");
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		Iterator<Integer> Iqueue = queue.createIterator();
		for (int i = 0; i <queue.getLength(); i++) {
			if (Iqueue.hasNext() != false) {
				System.out.println(Iqueue.next());
			}
		}
		
		System.out.println("Stack: ");
		stack.push(2);		
		stack.push(3);
		stack.push(4);
		Iterator<Integer> Istack = stack.createIterator();
		for (int i = 0; i <stack.getLength(); i++) {
			if (Istack.hasNext() != false) {
				System.out.println(Istack.next());
			}
		}
	}



	
	
}
