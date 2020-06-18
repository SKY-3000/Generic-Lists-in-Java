// Name: Tian Yuan
//
// NetID: tyuan7
//
// UIC Email: tyuan7@uic.edu
//
// Project 1: Generic Lists to implement queue data structure


public class GenericQueue<I> extends GenericList<I> {
	
	// constructor
	// to set the head node for queue
	GenericQueue (I value) {
		Node<I> head = new Node<I>(value);
		setHead(head);
		setLength(getLength() + 1);
	}
	
	// add the value to the back of the list
	public void add(I data) {
		Node<I> new_node = new Node<I>(data);
		
		// if the list is null, set the new node as the head 
		if (getHead() == null) {		
			setHead(new_node);
			setLength(getLength() + 1);
		}
		// if the list is not null, add the node to the back of the list
		else {
			Node<I> temp = getHead();
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
			setLength(getLength() + 1);
		}
	}
	
	// add the element implement add function
	public void enqueue(I data) {
		add(data);
	}
	
	// delete the element implement the delete function
	public I dequeue() {
		return delete();
	}
	
}