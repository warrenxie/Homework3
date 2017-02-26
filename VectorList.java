import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class VectorList <T> implements ListInterface<T>{
	private Vector<T> list;
	private int numberOfItems;
	private boolean initialized =false;
	private static final int DEFAULT_CAPACITY = 10;
	private static final int MAX = 10000;
	
	public VectorList(){
		this(DEFAULT_CAPACITY);
	}
	
	public VectorList(int initialCapacity){
		if( initialCapacity < DEFAULT_CAPACITY)
			initialCapacity = DEFAULT_CAPACITY;
		else
			checkCapacity(initialCapacity);
			list = new Vector<>(initialCapacity);
			initialized = true;
	}
	   private void checkCapacity(int initialCapacity){
	    	if(initialCapacity > MAX)
	    		throw new IllegalStateException("Attempt to create a list " +
	                                            "whose capacity exceeds " +
	                                            "allowed maximum.");
	    }
	    private void checkInitialization()
	    {
	        if (!initialized)
	             throw new SecurityException("List object is not initialized " +
	                                        "properly.");
	   }
	        public void add( T newItem){
	        checkInitialization();
	    	list.add(numberOfItems +1 , newItem);
	    }
	    

	    public void add( int newPosition, T newItem){
	    	checkInitialization();
	    	if((newPosition >=1) && ( newPosition <= numberOfItems +1)){
	    		if( newPosition <= numberOfItems)
	    			list.add(newPosition,newItem);
	    		else
	    			throw new IndexOutOfBoundsException(" Given position is out of bounds");
	    	}
	    }
	    public T remove(int position){
	    	checkInitialization();
	    	if((position >=1) && (position <= numberOfItems)){
	    		assert!isEmpty();
	    		return list.remove(position);
	    	}
	    	else throw new IndexOutOfBoundsException("illegal position");
			
	    }
	    public T replace(int position, T newItem){
	    	checkInitialization();
	    	if((position >= 1) && (position <= numberOfItems)){
	    		assert !isEmpty();
	    		return list.set(position, newItem);
	    	}
	    	else
	    		throw new IndexOutOfBoundsException("Illegal position");
	    }
	    
	    public T getItem( int position){
	    	checkInitialization();
	    	if((position >= 1) && (position <= numberOfItems)){
	    	assert !isEmpty();
	    	return list.get(position);
	    	}
	    	else
	    		throw new IndexOutOfBoundsException("Illegal position");
	    }
	    public boolean contains(T anItem){
	    	checkInitialization();
	    	boolean found = false;
	    	int i = 1;
	    	while(!found&& ( i <= numberOfItems)){
	    		if(anItem.equals(list.elementAt(i)))
	    			found = true;
	    		i++;
	    	}
	    	return found;
	    }

	
		public void clear() {
			list.clear();
			
		}

		
		@SuppressWarnings("unchecked")
		public T[] toArray() {
			
			Set set = new HashSet(Arrays.asList(list));
			Object [] array = new Object[list.size()];
			array = (T[]) set.toArray(array);
			return (T[]) array;
		}

		
		public int getLength() {
			
			return list.size();
		}


		public boolean isEmpty() {
			boolean found = false;
			if (list.isEmpty()){
				return found = true;
			}
			else
			return found;
		}
	    
	    
	
}
