import javax.swing.plaf.synth.SynthSpinnerUI;

public class LinkedListDriver2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList1<String> list=new LinkedList1<String>();
		
		list.add("Missouri");
		list.add("New Jersey");
		list.add("New York");
		list.add("California");
		list.add("Montanna");
		list.add("Nevada");
		list.add("Florida");
		System.out.println("*** Testing add(obj) *** \n" + list);
		list.addFirst("Washington");
		list.addFirst("Maryland");
		list.addFirst("Delaware");
		list.addFirst("Rhode Island");
		System.out.println("*** Testing the addFirst(obj) **** \n" + list);
		System.out.println(list);
		System.out.println("*** Testing get(i) and size() **** \n");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("*******************");
		System.out.println("********************");
			
		
		System.out.println("\n**** Print using toString\n" + list);
		
		
		System.out.println("\n****Printing out the list as we remove each element from the front");
		while(list.size() > 0)
		{
			System.out.println(list.removeFirst());
		}
		System.out.println("\n****** Starting the insert *******");
		list.addFirst("Belmar");
		list.add(0, "Long Branch");
		list.add(0, "Asbury Park");
		list.add(0, "Red Bank");
		list.add("Old Bridge");
		list.add(2, "Newark");
		list.add(4, "Sayreville");
		list.add(list.size(), "Point Pleasant");
		list.add(6, "Freehold");
		
		list.print();
		
		
		System.out.println("\n****** Starting remove(i) *******");
		try{
			System.out.println(list.remove(list.size()));
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println(list.remove(list.size() - 1));
		System.out.println(list.remove(0));
		System.out.println(list.remove(2));
		System.out.println(list.remove(4));
		System.out.println(list.remove(1));
		
		System.out.println("******* Testing Set ******\n"+list);
		list.set(0, "Namath");
		System.out.println("Setting 0: " + list);
		list.set(3,"Sauer");
		System.out.println("Setting 3: " + list);
		list.set(list.size() - 1, "Maynard");
		System.out.println("Setting list.size() - 1: " + list);
		
		try {
			list.set(list.size(), "Namath");
		} catch(IndexOutOfBoundsException e) {	
			System.out.println(e);
		}
		list.printRecursiveForward();
		System.out.println("Testing toString");
		System.out.println(list);

	}

}
/*
*** Testing add(obj) *** 
[ Missouri New Jersey New York California Montanna Nevada Florida ]
*** Testing the addFirst(obj) **** 
[ Rhode Island Delaware Maryland Washington Missouri New Jersey New York California Montanna Nevada Florida ]
[ Rhode Island Delaware Maryland Washington Missouri New Jersey New York California Montanna Nevada Florida ]
*** Testing get(i) and size() **** 

Rhode Island
Delaware
Maryland
Washington
Missouri
New Jersey
New York
California
Montanna
Nevada
Florida
*******************
********************

**** Print using toString
[ Rhode Island Delaware Maryland Washington Missouri New Jersey New York California Montanna Nevada Florida ]

****Printing out the list as we remove each element from the front
Rhode Island
Delaware
Maryland
Washington
Missouri
New Jersey
New York
California
Montanna
Nevada
Florida

****** Starting the insert *******
Red Bank
Asbury Park
Newark
Long Branch
Sayreville
Belmar
Freehold
Old Bridge
Point Pleasant

****** Starting remove(i) *******
java.lang.IndexOutOfBoundsException: i must be >=0 and < size. Note that it cannot be equal to size
Point Pleasant
Red Bank
Long Branch
Freehold
Newark
******* Testing Set ******
[ Asbury Park Sayreville Belmar Old Bridge ]
Asbury Park*****
Old Bridge*****
Sauer*****
java.lang.IndexOutOfBoundsException: index must be >=0 and < size. Size must also be greater thatn zer0. Note that it cannot be equal to size
Namath
Sayreville
Belmar
Maynard
Testing toString
[ Namath Sayreville Belmar Maynard ]

*********** My Output *************

*** Testing add(obj) *** 
Missouri, New Jersey, New York, California, Montanna, Nevada, Florida

*** Testing the addFirst(obj) **** 
Rhode Island, Delaware, Maryland, Washington, Missouri, New Jersey, New York, California, Montanna, Nevada, Florida

Rhode Island, Delaware, Maryland, Washington, Missouri, New Jersey, New York, California, Montanna, Nevada, Florida

*** Testing get(i) and size() **** 

Rhode Island
Delaware
Maryland
Washington
Missouri
New Jersey
New York
California
Montanna
Nevada
Florida
*******************
********************

**** Print using toString
Rhode Island, Delaware, Maryland, Washington, Missouri, New Jersey, New York, California, Montanna, Nevada, Florida


****Printing out the list as we remove each element from the front
Rhode Island
Delaware
Maryland
Washington
Missouri
New Jersey
New York
California
Montanna
Nevada
Florida

****** Starting the insert *******
Red Bank
Asbury Park
Newark
Long Branch
Sayreville
Belmar
Freehold
Old Bridge
Point Pleasant

****** Starting remove(i) *******
java.lang.IndexOutOfBoundsException: Index > 0 && Index < Size
Point Pleasant
Red Bank
Long Branch
Freehold
Newark
******* Testing Set ******
Asbury Park, Sayreville, Belmar, Old Bridge

Setting 0: Namath, Sayreville, Belmar, Old Bridge

Setting 3: Namath, Sayreville, Belmar, Sauer

Setting list.size() - 1: Namath, Sayreville, Belmar, Maynard

Namath
Sayreville
Belmar
Namath
Testing toString
Namath, Sayreville, Belmar, Namath

*/
