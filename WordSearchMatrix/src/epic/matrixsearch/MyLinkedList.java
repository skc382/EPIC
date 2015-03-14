package epic.matrixsearch;

public class MyLinkedList {
	
	private Node head;
	private int size;
	
	MyLinkedList()
	{
		head = new Node(null);
		size = 0;
	}
	
	public void add(Object value)
	{
		Node newValue = new Node(value);
		Node currentNode = head;
		
		while(currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(newValue);
		size++;
	}
	
	public Node getFirstElement()
	{
		return this.head.getNext();
	}
	
	
	
	public class Node
	{
		private Object data;
		private Node next;
		
		Node(Object value)
		{
			this.data = value;
			next = null;
		}
		
		public Node getNext()
		{
			return next;
		}
		
		public void setNext(Node nextValue)
		{
			next = nextValue;
		}
		
		public Object getData() 
		{
			return this.data;
		}
	}

}
