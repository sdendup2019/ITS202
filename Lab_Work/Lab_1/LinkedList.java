public class linklist {
	Node head;
	Node tail;
	int size;
	
	//Constructor
	public linklist() {
		head = null;
		tail = null;
		size = 0;
	}
	//1. size( ): Returns the number of elements in the list.
	public int size() {
		return size;
	}
	//2. isEmpty( ): Returns true if the list is empty, and false otherwise.
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	//3. first( ): Returns (but does not remove) the first element in the list.
	public int first() {
		return head.getElement();
	}
	//4. last( ): Returns (but does not remove) the last element in the list.
	public int last() {
		return tail.getElement();
	}
	//5. addFirst(e): Adds a new element to the front of the list.
	public void addFirst(int n) {
		Node newest = new Node(n, null);
		if(size == 0) {
			head = newest;
			tail = newest;
		}
		else {
			newest.setNext(head);
			head = newest;
		}
		size += 1;
	}
	//6. addLast(e): Adds a new element to the end of the list.
	public void addLast(int n) {
		Node newest = new Node(n,null);
		if(size == 0) {
			head = newest;
			tail = newest;
		}
		else {
			tail.setNext(newest);
			tail = newest;
		}
		size += 1;
	}
	//7. removeFirst( ): Removes and returns the first element of the list.
	public int removeFirst() {
		int deletedElement = head.getElement();
		if(size == 0) {
			return 0;
		}
		else {
			head = head.getNext();
			size -= 1;
		}
		return deletedElement;
	}
}
class Node{
	//Variable declaration
	private int element;
	private Node next;
	//constructor
	public Node(int element, Node next) {
		this.element = element;
		this.next = next;
	}
	//getElement
	public int getElement() {
		return element;
	}
	//getNext
	public Node getNext() {
		return next;
	}
	//setElement
	public void setElement(int n) {
		element = n;
	}
	//setNext
	public void setNext(Node n) {
		next = n;
	}
}
