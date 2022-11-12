
public class LinkedBasedStack<T> implements Stack<T> {
	
	private Node<T> head;
	private static final int MAX_SIZE = 30;
	private int size;
	
	public LinkedBasedStack() {
		head = null;
		size = 0;
	}
	

	@Override
	public boolean isEmpty() {
		
		return (size == 0);
	}

	@Override
	public boolean isFull() {
		
		return (size == MAX_SIZE);
	}

	@Override
	public void push(T itm) {
		
		if(isFull()) {
			throw new RuntimeException("Stack overflow");
		}
		
		Node<T> newNode = new Node<T>(itm);
		if(head == null) {
			head = newNode;
			size++;
			return;
		}
		
		Node<T> walk = head;
		while(walk != null) {
			if(walk.getNext() == null) {
				walk.setNext(newNode);
				size++;
				break;
			}
			walk = walk.getNext();
		}
		
		
	}

	@Override
	public T pop() {
		
		if(isEmpty()) {
			throw new RuntimeException("Stack underflow");
		}
		Node<T> walk = head;
		Node<T> prev = null;
		
		if(head.getNext() == null) {
			T data = head.getData();
			head = null;
			size--;
			return data;
		}
		
		while(walk != null) {
			if(walk.getNext() == null) {
				T data = walk.getData();
				prev.setNext(null);
				size--;
				return data;
			}
			prev = walk;
			walk = walk.getNext();
		}
		
		return null;
	}

	@Override
	public T peek() {
		
		if(isEmpty()) {
			throw new RuntimeException("Stack underflow");
		}
		Node<T> walk = head;
		while(walk != null) {
			if(walk.getNext() == null) {
				return walk.getData();
			}
			walk = walk.getNext();
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		
		String str = "¯¯¯¯¯";
		Node<T> walk = head;
		
		while(walk != null) {
			str = "| " + walk.getData() + " |" + "\n" + str;
			walk = walk.getNext();
		}
		
		
		return str;
		
	}

}
