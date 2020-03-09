
public class ListNode<Type> {

	//Instance Variables
	private Type value;
	private ListNode<Type> next;
	
	//Constructors
	public ListNode(Type initObj, ListNode<Type> initNext) {
		value = initObj;
		next = initNext;
	} //End First Constructor
	
	public Type getValue() {
		return value;
	} //End get Value
	
	public ListNode<Type> getNext() {
		return next;
	} //End getNext
	
	public void setValue(Type newValue) {
		value = newValue;
	} //End setValue
	
	public void setNext(ListNode<Type> newNext) {
		next = newNext;
	} //End setNext
	
} //End ListNode Class
