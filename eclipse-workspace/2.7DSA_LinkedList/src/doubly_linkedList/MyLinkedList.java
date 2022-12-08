package doubly_linkedList;

//Doubly Linked List
public class MyLinkedList<E> {
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;

	public MyLinkedList() {
		header = new Node<>(null, null, null); // create header
		trailer = new Node<>(null, header, null); // trailer is preceded by header
		header.setNext(trailer); // header is followed by trailer
	}

	// Returns the number of elements in the list.
	public int size() {
		return size;
	}

	// Returns true if the list is empty, and false otherwise.
	public boolean isEmpty() {
		return size == 0;//or head == null
	}

	// Returns (but does not remove) the first element in the list.
	public E first() {
		return  header.getData();
	}

	// Returns (but does not remove) the last element in the list.
	public E last() {
		return trailer.getData();
	}

	// Adds a new element to the front of the list.
	public void addFirst(E e) {
		if(isEmpty()) {
			header = trailer = new Node<>(e, null, null);
		}else {
			header.setPrev(new Node<>(e,null,header));
			header = header.getPrev();
		}
		size++;
	}

	// Adds a new element to the end of the list.
	public void addLast(E e) {
		if(isEmpty()) {
			header = trailer = new Node<E>(e, null, null);
		}else {
			trailer.setNext(new Node<E>(e, trailer, null));
			trailer = trailer.getNext();
		}
		size++;
	}
	// Removes and returns the first element of the list.
	public E removeFirst() {
		Node temp = new Node(header);
		if(!isEmpty()) {
			header = header.getNext();
			header.setPrev(null);
		}
		return (E) temp;
	}

	// Removes and returns the last element of the list.
	public E removeLast() {
		Node temp = new Node(trailer);
		if(!isEmpty()) {
			trailer = trailer.getPrev();
			trailer.setNext(null);
		}
		return (E) temp;
	}

	public String toString() {
		if(isEmpty()) return "[]";
		else {
			StringBuilder sb = new StringBuilder(size);
			sb.append("[");
			
			Node<E> currentNode = header;
			while(currentNode != null) {
				sb.append(currentNode.getData());
				if(currentNode.getNext() != null) {
					sb.append(", ");
				}
				currentNode = currentNode.getNext();
			}
			sb.append("]");
			return sb.toString();
		}
	}
}
