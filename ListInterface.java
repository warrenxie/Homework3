
public interface ListInterface {

public interface ListInterface<T> {
	/**
	 * Adds a new item to the end of the list. 
	 * Other objects are not affected in the list and the size is increased by 1
	 * @param newItem  The object that is added as a new item or entry
	 */
	public void add(T newItem);
	/**Adds new objects newItem at the given position within the list.
	 * Other items originally at and above the position are higher now.
	 * the size is increased by one
	 * @param newPosition the integer that indicated the desired location of the new item
	 * @param newItem the object of the new entry
	 * @throws indexoutofboundsexception if either position < 1 or position >getLength() + 1
	 */
	public void add(int newPosition, T newItem);
	
	/**remove items at the given position from the list.
	 * Items at the positions higher than the given position re at the next lower position within
	 * the list. 
	 * the list size is decreased by 1
	 * @param position the integer that indicates the location of the item being removed
	 * @return refers to the removed item
	 * @throws indexoutofboundsexception if either position < 1 or position > getLength()
	 */
	public T remove(int position);
	
	/**
	 * removes all items/objects in the list
	 */
	public void clear();
	
	/**
	 * replaces the item at the given position in the list
	 * @param position The integer that indicated the location of the item to be replaced
	 * @param newItem  The object that will replace the item at the given position
	 * @return the original entry that was replaced
	 * @throws indexoutofboundsexception if either position < 1 or position > getLength()
	 */
	public T replace(int position, T newItem);
	
	
	/**Gets object at the given location in the list
	 * 
	 * @param positon The integer that indicates the position of the entry
	 * @return A reference to the indicated entry
	 * @throws ndexoutofboundsexception if either position < 1 or position > getLength()
	 */
	public T getItem(int positon);
	
	/**gets all the items that in the list in the order in they occur
	 * 
	 * @returnA new array of all items in the list. if it is empty the return is empty
	 */
	public T[] toArray();
	
	/**looks if  the list have a given item
	 * 
	 * @param anItem the object that is the desired entry
	 * @return True if the list does indeed contain the item. if not then false
	 */
	public boolean contains(T anItem);
	
	/**
	 * Gets the length of the list
	 * @return the int number of the list
	 */
	public int getLength();
	
	/**
	 * sees if the list is empty
	 * @return true if the list is empty, false if not
	 */
	public boolean isEmpty();
}

}
