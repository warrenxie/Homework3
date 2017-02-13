
public class LinkedDeque <T> implements DequeInterface<T> {
	private DLNode node1;
	private DLNode node2;
	
	public LinkedDeque(){
		node1 = null;
		node2 = null;
		
	}

	
	
	public void addToBack(T newEntry){
		DLNode newNode = new DLNode (newEntry, node2,null);
		if(isEmpty())
			node1 = newNode;
		else
			node2.setNextNode(newNode);
		node2= newNode;
	}
	
	public void addToFront(T newEntry){
		
		DLNode newNode = new DLNode(newEntry, null, node1);
		
		if(isEmpty()){
			node2 = node1;
		}
		else{
			node1.setPreviousNode(newNode);
		}
		node1 = newNode;
	}
	
	public T removeFront(){
		T front = getFront();
		 assert node1 != null;
		 node1= node1.getNextNode();
		 
		 if(node1 == null)
			 node2 = null;
		 else
			 node1.setPreviousNode(null);
		 return front;
	}
	public T removeBack(){
		T back = getBack();
		assert node2 != null;
		node2.getPreviousNode();
		
		if(node2==null)
			node1 = null;
		else
			node2.setNextNode(null);
		return back;
	}
	public T getBack(){
		if(isEmpty())
			throw new IllegalStateException();
		else
			return node2.getData();
	}
	public T getFront(){
		if(isEmpty())
			throw new IllegalStateException();
		else
			return node1.getData();
	}
	public void clear(){
		while(!isEmpty())
			removeBack();
			removeFront();
	}
	public boolean isEmpty(){
		return(node1 == null) && (node2==null);
	}
	
	
	private class DLNode{
		private T data;
		private DLNode next;
		private DLNode previous;
		
		private DLNode( T dataPortion){
			this(dataPortion ,null, null);
		}
		
		private DLNode( T dataPortion, DLNode nextNode, DLNode previousNode){
			data = dataPortion;
			next = nextNode;
			previous = previousNode;
		}
		private T getData(){
			return data;
		}
		private void setData( T newData){
			data = newData;
		}
		private DLNode getNextNode(){
			return next;
		}
		private void setNextNode(DLNode nextNode){
			next = nextNode;
		}
		private DLNode getPreviousNode(){
			return previous;
		}
		private void setPreviousNode(DLNode previousNode){
			previous = previousNode;
		}
	}






}
