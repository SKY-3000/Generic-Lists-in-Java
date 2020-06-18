// Name: Tian Yuan
//
// NetID: tyuan7
//
// UIC Email: tyuan7@uic.edu
//
// Project 1: Generic Lists to implement Stack data structure


public class GenericStack<I> extends GenericList<I> {
	
	// constructor
	// set the new node with value as head node
	GenericStack (I value) {
		Node<I> head = new Node<I>(value);
		setHead(head); 
		setLength(getLength() + 1);
	}
	
	// add the value to the front of the list
	public void add(I data) {
		Node<I> new_node = new Node<I>(data);
		// if the list is null, set the new node as the head
		if (getHead() == null) {		
			setHead(new_node);
			setLength(getLength() + 1);
		}
		// if the list is not null, add the new node as head of the list 
		else {
			new_node.next = getHead();
			setHead(new_node);
			setLength(getLength() + 1);
		}
	}
	
	// push the element on the top of the stack
	public void push(I data) {
		add(data);
	}
	
	// pop the top element on the top of the stack
	public I pop() {
		return delete();
	}


}