// Name: Tian Yuan
//
// NetID: tyuan7
//
// UIC Email: tyuan7@uic.edu
//
// Project 1: Generic Lists to implement stack and queue data structure, this structure will 
// be a linked list with node, and have some operations that support to stack and queue works

import java.util.ArrayList;
import java.util.Iterator;


public abstract class GenericList<I> implements CreateIterator<I>{
	private Node<I> head;
	private int length;
	

	// print the list
	public void print() {
		// if there is no list, print Empty List
		if ( length == 0) {
			System.out.println("Empty List");
		}
		// else print the list 
		else {
			Node<I> temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			} // end while loop
			
		} // end else statement
		
	} // end print() function
	
	
	
	// add the value to the list
	 abstract void add(I data); // end add() function
	
	// delete the first node and return value of the node, if it is null return null.
	public I delete() {
		
		if (head == null) {
			return null;
		}
		else {
			Node<I> temp = head;
			head = head.next;
			temp.next = null;
			length--;
			return temp.data;
		}
		
	} // end delete() function
	
	// store all value in Generic list into a new list, and delete Generic list and return the new list
	public ArrayList<I> dumpList(){
		
		ArrayList<I> dList = new ArrayList<I>();
		
		while ( head != null) {
			dList.add(head.data);
			head = head.next;
		}
		
		length = 0;
		return dList;
	} // end dumpList() function
	
	// getLength() setLength() getHead() setHead()
	public int getLength() {
		return length;
	}
	
	// set the length of the list
	public void setLength(int l) {
		length = l;
	}
	
	// get the head node of the list
	public Node<I> getHead() {
		return head;
	}
	
	// set the node as head node 
	public void setHead(Node<I> d) {
		head = d;
	}
	
	// create Iterator
	public Iterator<I> createIterator(){
		Iterator<I> listIterator = new GLIterator<I>(head);
		return listIterator;
	}
	
	// create node structure
	public class Node<T>{
		public T data;
		public Node<T> next;
		
		public Node(T d){
			data = d;
			next = null;
		}
	}
	
	
	
}