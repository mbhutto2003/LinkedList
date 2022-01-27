
public class UseNodeClass 
{
	public static void main(String[] args)  
	{   
		// CREATING LINKED LIST 1ST WAY
//		Node start = new Node(22);
//		start.next = new Node (33);
//		start.next.next = new Node(44);
//		start.next.next.next = new Node(55);
		
		// CREATING LINKED LIST 2ND WAY
//		Node start = new Node(22);
//		Node p = start;
//		p.next = new Node(33);
//		p = p.next;
//		p.next = new Node(44);
//		p = p.next;
//		p.next = new Node(55);
		
		// CREATING LINKED LIST 3RD WAY
		Node start = new Node(22);
		Node p = start;
		for(int i=0; i<3; i++)
		{
			p.next = new Node(33 + 11*i);
			p=p.next;
		}
		
		// TRAVERSING LINKED LIST BEFORE CALLING INSERT FUNCTION
		System.out.println("TRAVERSING LINKED LIST BEFORE CALLING INSERT FUNCTION");	
		for(Node i=start; i!=null; i=i.next)
		{
			System.out.println(i.data);	
		}
        
		start = Node.insert(start, 77); // CALLING INSERT FUNCTION & STORING RETURNED IN SAME PASSED start
		
		// TRAVERSING LINKED LIST AFTER CALLING INSERT FUNCTION
		System.out.println("TRAVERSING LINKED LIST AFTER CALLING INSERT FUNCTION");	
		for(Node i=start; i!=null; i=i.next)
		{
			System.out.println(i.data);	
		}
		
	    start = Node.insertInAscending(start, 25); // CALLING insertInAscending FUNCTION & STORING RETURNED IN SAME PASSED start
		
		// TRAVERSING LINKED LIST AFTER CALLING insertInAscending FUNCTION
		System.out.println("TRAVERSING LINKED LIST AFTER CALLING insertInAscending FUNCTION");	
		for(Node i=start; i!=null; i=i.next)
		{
			System.out.println(i.data);	
		}
		
		start = Node.delete(start, 55); // CALLING DELETE FUNCTION & STORING RETURNED IN SAME PASSED start
		
		// TRAVERSING LINKED LIST AFTER CALLING DELETE FUNCTION
		System.out.println("TRAVERSING LINKED LIST AFTER CALLING DELETE FUNCTION");	
		for(Node i=start; i!=null; i=i.next)
		{
			System.out.println(i.data);	
		}
		
		// CREATING NEW LINKED LIST start1
		Node start1 = new Node(88);
		Node p1 = start1;
		for(int i=0; i<3; i++)
		{
			p1.next = new Node(99 + 11*i);
			p1=p1.next;
		}
		
		// CREATING NEW LINKED LIST start2
		Node start2 = new Node(220);
		Node p2 = start2;
		for(int i=0; i<3; i++)
		{
			p2.next = new Node(231 + 11*i);
			p2=p2.next;
		}
		
		// TRAVERSING LINKED LIST start1
		System.out.println("TRAVERSING LINKED LIST start1");	
		for(Node i=start1; i!=null; i=i.next)
		{
			System.out.println(i.data);	
		}
		
		// TRAVERSING LINKED LIST start2
		System.out.println("TRAVERSING LINKED LIST start2");	
		for(Node i=start2; i!=null; i=i.next)
		{
			System.out.println(i.data);	
		}
		
		start1 = Node.merge(start1, start2); // CALLING MERGE METHOD & STORING RETURNED IN start1
		
	    // TRAVERSING LINKED LIST start1 AFTER CALLING merge(start1, start2) METHOD & STORING RETURNED IN start1
		System.out.println("TRAVERSING LINKED LIST start1 AFTER CALLING merge(start1, start2) METHOD & STORING RETURNED IN start1");	
		for(Node i=start1; i!=null; i=i.next)
		{
			System.out.println(i.data);	
		}
		
		int sum = Node.sum(start); // CALLING sum METHOD AND PASSING start THAT WILL RETURN SUM OF AND ELEMENTS OF start1 AND STORING in sum VARIABLE
		
		System.out.println("PRINTING SUM OF ALL ELEMENTS OF start THAT WE HAVE GOT USING sum METHOD");
		System.out.println("THE SUM IS: " + sum);
		
		start = Node.clone(start1); // CALLING clone METHOD , PASSING start1 AS ARGUMENT & STORING RETURNED IN start
		
		// TRAVERSING LINKED LIST start AFTER CALLING clone METHOD & STORING RETURNED IN start
		System.out.println("TRAVERSING LINKED LIST start AFTER CALLING clone METHOD & STORING RETURNED IN start");	
		for(Node i=start; i!=null; i=i.next)
		{
			System.out.println(i.data);	
		}
		
		int size = Node.getSize(start); // CALLING getsize METHOD THAT WILL RETURN SIZE OF LINKED LIST & STORING RETURNED IN size VARIABLE
		
		System.out.println("PRINTING SIZE OF start THAT WE HAVE GOT USING getSize METHOD");
		System.out.println("THE SIZE IS: " + size);
		
		start = Node.deleteLast(start); //  CALLING deleteLast METHOD THAT WILL DELETE LAST ELEMENT OF PASSED start LINKED LIST & STORING RETURNED IN SAME PASSED start  
		
		// TRAVERSING LINKED LIST start AFTER CALLING deleteLast METHOD THAT WILL DELETE ITS LAST ELEMENT & STORING RETURNED IN start
		System.out.println("TRAVERSING LINKED LIST start AFTER CALLING deleteLast METHOD THAT WILL DELETE ITS LAST ELEMENT");	
		for(Node i=start; i!=null; i=i.next)
		{
			System.out.println(i.data);	
		}
		
		boolean isFound = Node.search(start, 44); // CALLING search METHOD THAT WILL RETURN TRUE IF PASSED ELEMENT IS FOUND IN PASSED LINKED LIST OTHERWISE FALSE
		
		// PRINTING THE RESULT OF search METHOD.
		System.out.println("PRINTING THE RESULT OF search METHOD.");
		System.out.println("Element found: " + isFound);
		
        int highest = Node.findHighest(start); // CALLING findHighest METHOD THAT WILL RETURN HIGHEST ELEMENT OF PASSED LINKED LIST 
		
		// PRINTING THE RESULT OF search findHighest.
		System.out.println("PRINTING THE RESULT OF findHighest METHOD.");
		System.out.println("Highest element is: " + highest);
		
		start = Node.replace(start, 3, 111); // CALLING replace METHOD THAT WILL REPLACE THE ELEMENT AT PASSED POSITION BY PASSED VALUE
		
		// TRAVERSING LINKED LIST start AFTER CALLING replace METHOD THAT WILL REPLACE THE ELEMENT AT PASSED POSITION BY PASSED VALUE
		System.out.println("TRAVERSING LINKED LIST start AFTER CALLING replace METHOD THAT WILL REPLACE THE ELEMENT AT PASSED POSITION BY PASSED VALUE");	
		for(Node i=start; i!=null; i=i.next)
		{
			System.out.println(i.data);	
		}
		
		
		
		
	}
	
}
