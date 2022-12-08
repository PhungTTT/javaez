package lab9_recursion;

import java.util.List;

public class BNode<E extends Comparable<E>> {
	private E data;
	private BNode<E> left;
	private BNode<E> right;

	public BNode(E data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public BNode(E data, BNode<E> left, BNode<E> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public BNode<E> getLeft() {
		return left;
	}

	public void setLeft(BNode<E> left) {
		this.left = left;
	}

	public BNode<E> getRight() {
		return right;
	}

	public void setRight(BNode<E> right) {
		this.right = right;
	}

	public void add(E e) {
		int comp = e.compareTo(data);
		BNode<E> newNode = new BNode<E>(e);
		if (comp == 0) {
			this.data = e;
		} else if (comp < 0) {
			if (this.left == null)
				this.left = newNode;
			else
				left.add(e);
		} else if (this.right == null)
			this.right = newNode;
		else
			right.add(e);
	}

	public int depth(E e, int count) {
		if (e.compareTo(data) == 0) {
			return count;
		} else if (e.compareTo(data) < 0) {
			count++;
			if (left != null) {
				return left.depth(e, count);
			} else
				return -1;
		} else {
			count++;
			if (right != null) {
				return right.depth(e, count);
			} else
				return -1;
		}
	}

	public int height(int count) {
		if(left == null && right == null) return count;
		else {
			if (left == null) {
				count++;
				return right.height(count);
			} else if (right == null) {
				count++;
				return left.height(count);
			} else {
				count++;
				if(right.height(count) > left.height(count)) {
					return right.height(count);
				}else return left.height(count);
			}
		}
	}

	public int size(int count) {
		if(left == null && right == null) return count;
		else {
			if (left == null) {
				count++;
				return right.size(count);
			} else if (right == null) {
				count++;
				return left.size(count);
			} else {
				int temp =1;
				return count + right.size(temp)+left.size(temp);
			}
		}
	}

	public boolean contains(E e) {
		if(e.compareTo(this.data) == 0) {
			return true;
		}else if(e.compareTo(this.data) < 0) {
			if(left == null) return false;
			else return left.contains(e);
		}else {
			if(right == null) return false;
			else return right.contains(e);
		}
	}

	public E findMin() {
		if(this.left == null) {
			return this.getData();
		}else 
			return left.findMin();
	}

	public E findMax() {
		if(this.right == null) {
			return this.getData();
		}else 
			return right.findMax();
	}

	public boolean remove(E e) {
		
		
		
		if(e.compareTo(this.left.data) == 0) {
			
		}
		
		
		return true;
	}

	public void inorder() {
		 if (this == null)
	            return;
		  	
	        /* first recur on left child */
		 	if(left != null)
		 	this.left.inorder();
	        /* then print the data of node */
	        System.out.print(this.data + " ");
	        /* now recur on right child */
	        if(right != null)
	        this.right.inorder();
	}
	
	public void preorder() {
		 if (this == null)
			 return;
	 
        /* first print data of node */
	 	System.out.print(this.data + " ");
        /* then recur on left subtree */
        if(left != null)
        this.left.preorder();
        /* now recur on right subtree */
        if(right != null)
        this.right.preorder();
	 
	}

	public void postorder() {

        if (this == null)
            return;
 
        // first recur on left subtree
	 	if(left != null)
        this.left.postorder();
 
        // then recur on right subtree
	 	if(right != null)
        this.right.postorder();
 
        // now deal with the this
        System.out.print(this.data + " ");
	}
	//descendants
	public List<E> descendants(List<E> re) {
			if(this.left != null) {
				re.add(this.left.getData());
				this.left.descendants(re);
			}
			if(this.right != null) {
				re.add(this.right.getData());
				this.right.descendants(re);
			}
		return re;
	}
	//findNode
	public BNode<E> findNode(E data)	{
		if(data.compareTo(this.getData()) == 0) {
			return this;
		}else if(data.compareTo(this.getData()) < 0) {
			if(left != null) return this.left.findNode(data);
		}else {
			if(right != null) return this.right.findNode(data);
		}
		return null;
	}
	
	//ancestors
	public List<E> ancestors(E data,List<E> re) {
			if(data.compareTo(this.getData()) == 0) {
				return re;
			}else if(data.compareTo(this.getData()) < 0) {
				re.add(this.data);
				this.left.ancestors(data, re);
			}else {
				re.add(this.data);
				this.right.ancestors(data, re);
			}
		return re;
	}
}
