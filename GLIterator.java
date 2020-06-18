import java.util.Iterator;

//Name: Tian Yuan
//
//NetID: tyuan7
//
//UIC Email: tyuan7@uic.edu
//
// project 1


// to create a specific Iterator for the GL which has hasNext() function and Next() function
public class GLIterator<I> implements Iterator<I>{
	
	// set a node that connect to the head of the list 
	GenericList<I>.Node<I> current;
	
	// constructor
	GLIterator(GenericList<I>.Node<I> head){
		current = head;
	}

	// check if the list is empty
	public boolean hasNext() {
		return current != null;
	}
	
	// check the value of the current node
	public I next() {
		// if the current node is not null, return the element in the node, and move to next node
		if (current != null) {
			I data = current.data;
			current = current.next;
			return data;
		}
		// if the current node is null, return null
		else {
			return null;
		}
	}
	
	
	
}