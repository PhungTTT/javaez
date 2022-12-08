package doubly_linkedList;

public class TestMyLinkedList {
	public static void main(String[] args) {
		MyLinkedList<Integer> linkedList = new MyLinkedList<>();
		linkedList.addFirst(1);
		linkedList.addFirst(2);
		linkedList.addFirst(3);
		linkedList.addLast(9);
		linkedList.addLast(8);
		linkedList.addLast(7);
		System.out.println(linkedList.toString());
		System.out.println("first: "+linkedList.first());
		System.out.println("last: "+linkedList.last());
		System.out.println("Xoa phan tu dau: "+linkedList.removeFirst());
		System.out.println("Xoa phan tu cuoi: "+linkedList.removeLast());
		System.out.println(linkedList.toString());
	}
}
