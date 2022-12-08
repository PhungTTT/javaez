package lab9_recursion;

public class Test{
	public static void main(String[] args) {
		BST<Integer> bst = new BST<>();
		
		//add
		bst.add(3);bst.add(1);bst.add(2);
		bst.add(6);bst.add(4);bst.add(9);
		bst.add(7);bst.add(10);
		
		//depth
		System.out.println("depth 3: "+bst.depth(3));
		System.out.println("depth 4: "+bst.depth(4));
		System.out.println("depth 7: "+bst.depth(7));
		//height
		System.out.println("height: "+bst.height());
		//size
		System.out.println("size: "+bst.size());
		//contains
		System.out.println("contains 4: "+bst.contains(4));
		System.out.println("contains -1: "+bst.contains(-1));
		//findMin
		System.out.println("findMin: "+bst.findMin());
		//findMin
		System.out.println("findMax: "+bst.findMax());
		//descendants
		System.out.println("descendants 6: "+bst.descendants(6));
		System.out.println("descendants 7: "+bst.descendants(-6));
		//ancestors
		System.out.println("ancestors 6: "+bst.ancestors(9));
		System.out.println("ancestors 7: "+bst.ancestors(7));
		System.out.println("--------Display BSTree--------- ");
		//
		bst.inorder();
		//
		bst.preorder();
		//
		bst.postorder();
		
	}
}
