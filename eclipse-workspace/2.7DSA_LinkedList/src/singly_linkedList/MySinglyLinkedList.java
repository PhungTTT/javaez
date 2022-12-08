package singly_linkedList;

public class MySinglyLinkedList<E> {
	private Node<E> head = null;    
	private Node<E> tail = null;    
	private int size =0;
	
	public MySinglyLinkedList() {}
	
	public int size() {
		return size;
	}
	//
	public boolean isEmpty() {
		return size == 0;
	}
	//first
	public E first() {
		return head.getElement();
	}
	//last
		public E last() {
			return tail.getElement();
		}
	//add
	public void add(E e) {
		addLast(e);
	}
	//addFirst
	public void addFirst(E e) {
		Node<E> temp = new Node<>(e);
		temp.setNext(head);
		head = temp;
		size++;
	}
	//addLast
	public void addLast(E e) {
		Node<E> temp = new Node<>(e);
		if(isEmpty()) {
			head = temp;
		}else {
			tail = head;
			while(tail.getNext() != null) {
				tail = tail.getNext();
			}
			tail.setNext(temp);
			tail = tail.getNext();
		}
		size++;
	}
	//removeFirst,removeLast,addAt...
	public void removeFirst() {
		if(!isEmpty()) {
			head = head.getNext();
		}
		size--;
	}
	//removeLast
	public void removeLast() {
		if(!isEmpty()) {
			Node<E> temp = head;
			int i = 0;
			while (temp != null && i<=size-2) {
				temp = temp.getNext();
				i++;
			}
			temp.setNext(null);
		}
		size--;
	}
	
	//toString
	public String toString() {
		Node<E> temp = head;
		String result = "[";
		for(int i = 0;i<size;i++) {
			result += temp.getElement();
			temp = temp.getNext();
			if(i != size-1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
    
}
