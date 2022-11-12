
public class Node<T> {
	
	private T data;
	private Node<T> next;
	
	
	public Node() {
		next = null;
	}
	
	public Node(T itm) {
		this.data = itm;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	

}
