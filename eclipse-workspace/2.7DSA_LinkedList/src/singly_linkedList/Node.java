package singly_linkedList;

public class Node<E>{
	private E element;    
	private Node<E> next;    
      
  public Node() {    
      this.element = null;    
      this.next = null;    
  }
  
  public Node(E e) {    
      this.element = e;    
      this.next = null;    
  }
  //getter and setter

public E getElement() {
	return element;
}

public void setElement(E element) {
	this.element = element;
}

public Node<E> getNext() {
	return next;
}

public void setNext(Node<E> next) {
	this.next = next;
}
  
}
