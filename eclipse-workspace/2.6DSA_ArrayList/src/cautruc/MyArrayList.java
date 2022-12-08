package cautruc;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	public static final float LOAD_FACTOR = 0.75f;
	private E[] elements;
	private int size;

	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
	}

	// Returns the number of elements in this list.
	public int size() {
		return size;
	}
	public int length() {
		return elements.length;
	}
	// Returns whether the list is empty.
	public boolean isEmpty() {
		return size == 0;
	}

	// Returns (but does not remove) the element at index i.
	public E get(int i) throws IndexOutOfBoundsException {
		if(i>=size) throw new IndexOutOfBoundsException();	
		return elements[i];
	}

	// Replaces the element at index i with e, and returns the replaced element. 
	public E set(int i, E e) throws IndexOutOfBoundsException {
		E oldValue = elements[i];
		elements[i] = e;
		return oldValue;
	}

	// It is used to append the specified element at the end of a list.
	public boolean add(E e) {
			size++;
			elements[size-1] = e;
			if(size > (LOAD_FACTOR*elements.length) && size != 0) {
				E[] temp = (E[]) new Object[elements.length + ((int) (0.5*size))];
				System.arraycopy(elements, 0, temp, 0, elements.length);
				elements = temp;
			}
		return true;
	}

	// Inserts element e to be at index i, shifting all subsequent elements later.

	public void add(int i, E e) throws IndexOutOfBoundsException {
		size++;
		 if(size > (LOAD_FACTOR*elements.length) && size != 0) {
				E[] temp = (E[]) new Object[elements.length + ((int) (0.5*size))];
				System.arraycopy(elements, 0, temp, 0, elements.length);
				elements = temp;
		} 
		 for(int k = size-1;k>i;k--) {
			 elements[k] = elements[k-1];
		 }
		 elements[i]=e;
	}

	// Removes/returns the element at index i, shifting subsequent elements earlier.
	public E remove(int i) throws IndexOutOfBoundsException {
		for(;i<size;i++) {
			elements[i] = elements[i+1];
		}
		size--;
		
		return elements[i];
	}

	public String toString() {
		String result = "[";
		for(int i=0;i<size;i++) {
			result+= get(i);
			if(i!=size-1) {
				result+=", ";
			}else result+="]";
		}
		return result;
	}
}
