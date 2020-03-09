
public class LinkedList1<Type extends Comparable<Type>> {

	private ListNode<Type> first, last;
	private int size = 0;
	private ListNode<Type> tempFirst;
	private ListNode<Type> currentTemp;
	
	//Running Time = O(n)
	public boolean add(Type obj) {
		
		ListNode<Type> newNode = new ListNode<Type>(obj, null);
		ListNode<Type> current;
		
		if (first == null) {
			first = newNode;
		} else {
			current = first;
			
			while(current.getNext() != null) {
				current = current.getNext();
			}
			
			current.setNext(newNode);
		} //Ends If-Else
		size++;
		return true;
	} //Ends Add 
	
	//Running Time = O(n)
	public void print() {
		
		ListNode<Type> current = first;
		
		while(current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		} // End While
		
	} //End Print
	
	//Running Time = O(1)
	public void addFirst(Type obj) {
		
		ListNode<Type> newNode = new ListNode<Type>(obj, null);
		
		if (first == null) {
			first = newNode;
		} else {
			newNode.setNext(first);
			first = newNode;
		}
		
		size++;
		
	} //End addFirst
	
	//Running Time = O(1)
	public int size() {
		return size;
	} //End size()
	
	//Running Time = O(n)
	public void add(int i, Type obj) {
		
		if (i < 0 || i > size) {
			throw new IndexOutOfBoundsException("i >= 0 && i <= size");
		}
		
		if (i == 0) {
			addFirst(obj);
		} else {
			ListNode<Type> newNode = new ListNode<Type>(obj, null);
			ListNode<Type> previous = first;
			ListNode<Type> current = first;
			int index = 0;
			
			while (index < i) {
				previous = current;
				current = current.getNext();
					index++;
			} //End While Loop
			
			newNode.setNext(current);
			previous.setNext(newNode);
			size++;	
		}
		
	} //End add
	
	//Running Time = O(n)
	public Type get(int index) {
		
		if (index < 0 || index >= size) { //Test Q: Only get >= size (Ex Last index 6 size 7 throw >= size because there is no 7 to get
			throw new IndexOutOfBoundsException("Index > 0 && Index < Size");
		}
		
		ListNode<Type> current = (ListNode<Type>) first;
		int i = 0;
		
		while (i < index) {
			current = current.getNext();
			i++;
		}
		
		return current.getValue();
		
	} //End get
	
	//Running Time = O(n)
	public Type remove(int index) {
		
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index > 0 && Index < Size");
		}
		
		int i = 0;
		ListNode<Type> current = first;
		ListNode<Type> previous = null;
		
		while (i < index) {
			previous = current;
			current = current.getNext();
			i++;
		}
		
		Type temp = current.getValue();
		
		if (current == first) {
			first = first.getNext();
		} else {
			previous.setNext(current.getNext());
		}
		
		return temp;
		
	} //End remove
	
	//Running Time = O(n)
	public String toString() {
		
		String result = "";
		ListNode<Type> current = first;
		
		while (current != null) {
			result += current.getValue();
			if (current.getNext() != null) {
				result += ", "/*"\n"*/;
			}
			current = current.getNext();
		}
		
		return /*"List: " +*/ result + "\n";
	}
	
	//Running Time = 
	public Type set(int index, Type obj) {
		
		ListNode<Type> current = first;
		ListNode<Type> previous = null;
		
		for (int i = 0; i < index; i++) {
			if (current.getNext() != null) {
				current = current.getNext();
			} else {
				current.setValue(obj);;				
			}
		}
		
		
		current.setValue(obj);
		return current.getValue();
		
	}
	
	public boolean remove(Type obj) {
		
		ListNode<Type> current = first;
		ListNode<Type> previous = null;
		
		if (obj == null) {
			System.out.println("Cannot remove Nothing");
			return false;
		} else {
			
			while (!obj.equals(current.getValue())) {
				previous = current;
				
				if (current.getNext() == null) {
					return false;
				} else {
					current = current.getNext();
				}
			}
			
			if (current == first) {
				first = first.getNext();
			} else {
				previous.setNext(current.getNext());
			}
			
			return true;
			
		}
		
	}
	
	public Type removeFirst() {
		
		ListNode<Type> temp = first;
		first = first.getNext();
		size--;
		
		return temp.getValue();
		
	}
	
	public Type removeLast() {
		
		ListNode<Type> current = first;
		ListNode<Type> previous = null;
		
		while (current.getNext() != null) {
			previous = current;
			current = current.getNext();
		}
		
		ListNode<Type> temp = last;
		last = previous;
		
		last.setNext(null);
		
		size--;
		
		return last.getValue();
		
	}
	
	public void printRecursiveBackwards() {
		
		if (first != null) {
			printRecursiveHelperBackwards(first);
		}
		
	}
	
	private void printRecursiveHelperBackwards(ListNode<Type> current) {
		
		if (current != null) {
			printRecursiveHelperBackwards(current.getNext());
			System.out.println(current.getValue());
		}
		
	}
	
	public void printRecursiveForward() {
		
		if (first != null) {
			printRecursiveHelperForward(first);
		}
		
	}
	
	private void printRecursiveHelperForward(ListNode<Type> current) {
		
		if (current != null) {
			System.out.println(current.getValue());
			printRecursiveHelperForward(current.getNext());
		}
		
	}
	
	public void reverseList() {
		
		if (first != null) {
			reverseListHelper(first);
		} else {
			System.out.println("List is empty");
		}
		
		first = tempFirst;
		
	}
	
	private void reverseListHelper(ListNode<Type> current) {
		
		if (current.getNext() != null) {
			reverseListHelper(current.getNext());
		}
		
		if (current.getNext() == null) {
			tempFirst = current;
			currentTemp = current;
		} else {
			currentTemp.setNext(current);
			currentTemp = current;
		}
		
		if (current == first) {
			current.setNext(null);
		}
		
	}
	
} //End LinkedList1
