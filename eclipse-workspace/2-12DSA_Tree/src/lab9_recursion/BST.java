package lab9_recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class BST<E extends Comparable<E>> {
	private BNode<E> root;

	public BST() {
		this.root = null;
	}

	// Add element e into BST
	public void add(E e) {
		if(root == null) {
			this.root = new BNode<E>(e);
		}else {
			this.root.add(e);
		}
	}

	// Add a collection of elements col into BST
	public void add(Collection<E> col) {
		
	}

	// compute the depth of a node in BST
	public int depth(E node) {
		int count =1;
		if(node.compareTo(root.getData()) == 0) {
			return 0;
		}else if(root != node) {
			if(node.compareTo(root.getData()) < 0){
				return root.getLeft().depth(node,count);
			}else if(node.compareTo(root.getData()) > 0) {
				return root.getRight().depth(node,count);
			}
		}
		return -1;
	}

	// compute the height of BST
	public int height() {
		if(root == null) return 0;
		else {
			int count = 0;
			return root.height(count);
		}
	}

	// Compute total nodes in BST
	public int size() {
		if(root==null) return 0;
		else{
			int count =1;
			return root.size(count);
		}
	}

	// Check whether element e is in BST
	public boolean contains(E e) {
		if(root != null) {
			return root.contains(e);
		}
		return false;
	}

	// Find the minimum element in BST
	public E findMin() {
		if(root != null){
			return root.findMin();
		}
		return null;
	}

	// Find the maximum element in BST
	public E findMax() {
		if(root != null){
			return root.findMax();
		}
		return null;
	}

	// Remove element e from BST
	public boolean remove(E e) {
		if(root == null) return false;
		return root.remove(e);
	}

	// get the descendants of a node: con chau cua data
	public List<E> descendants(E data) {
		List<E> re = new LinkedList<>();
		BNode<E> node = root.findNode(data);
		if(node == null) return null;
		return node.descendants(re);
	}

	// get the ancestors of a node: to tien cua data
	public List<E> ancestors(E data) {
		List<E> re = new LinkedList<>();
		if(root.contains(data)) {
			return root.ancestors(data,re);
		}
		return null;
	}
	// display BST using inorder approach
	public void inorder() {
		root.inorder();
		System.out.println();
	}
	// display BST using preorder approach
	public void preorder() {
		root.preorder();
		System.out.println();
	}
	// display BST using postorder approach
	public void postorder() {
		root.postorder();
		System.out.println();
	}
}
