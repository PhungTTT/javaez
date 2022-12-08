package singly_linkedList;

public class TestSinglyLinkedList {
	public static void main(String[] args) {
		MySinglyLinkedList<Integer> singlyLL = new MySinglyLinkedList<>();
		singlyLL.add(1);
		singlyLL.add(2);
		singlyLL.add(3);
		singlyLL.add(4);
		System.out.println(singlyLL.toString());
		singlyLL.addFirst(9);
		singlyLL.addLast(0);
		System.out.println(singlyLL.toString());
		System.out.println("first: "+singlyLL.first());
		System.out.println("last: "+singlyLL.last());
		System.out.println("Remove first: ");
		singlyLL.removeFirst();
		System.out.println("Remove last: ");
		singlyLL.removeLast();
		System.out.println(singlyLL.toString());
		
	}
}
