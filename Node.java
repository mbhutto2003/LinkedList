public class Node 
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
	}
	
	public Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	
	public static Node insert(Node start , int data) // insert new element at the end
	{   
		if(start == null)
		{
			start = new Node(data);
			return start;
		}
		for(Node p=start; p!=null; p=p.next)
		{
			if(p.next == null)
			{
				p.next = new Node(data);
				return start;
			}
		}
		return start;
	}
	
	public static Node insertInAscending(Node start , int data) // insert new element at the end
	{   
		if(start == null || start.data > data)
		{
			start = new Node(data);
			return start;
		}
		for(Node p=start; p.next!=null; p=p.next)
		{   
			if(p.next.data < data && p.next.next == null)
			{
				p.next.next = new Node(data);
			}
			if(p.next.data > data)
			{
				p.next = new Node(data,p.next);
				break;
			}
		}
		return start;
	}
	

	public static Node delete(Node start, int x) // passed linked list must be sorted 
	{
		if(start==null || start.data>x)   return start;
		
		if(start.data==x)    return start.next;
		
		for(Node p=start; p.next!=null; p=p.next)
		{
			if(p.next.data>x) break;
			
			if(p.next.data==x)
			{
				p.next = p.next.next;
				break;
			}
		}
		
		return start;
	} 
	
	public static Node deleteLast(Node start) // passed linked list must be sorted 
	{   
		Node p = start;
		if(start==null)   return start;
			
		for(p=start; p!=null; p=p.next)
		{
			if(p.next == null) return p = null ;
			if(p.next.next == null) 
			{
				p.next = null;
			}
		}
		
		return start;
	} 
	
	public static Node merge(Node start1, Node start2) //merge two passed node in first one 
	{   
		Node p;
		for(p=start1; p.next!=null; p=p.next)
		{
			
		}
		p.next = start2;
		
		return start1;
	}
	
	
	public static int sum(Node start) // sum() method that returns the sum of all numbers in the linked list
	{
		int sum=0;
		for(Node i=start; i!=null; i=i.next) 
		{
			sum+=i.data;
		}
		return sum;
	}
	
	public static Node clone(Node start) // clone method that makes & returns same linled list as passed to it. 
	{
		if(start == null )
		{
			return null;
		}
		if(start != null) 
		{
			Node s = new Node(start.data);
			for(Node p=start; p.next!=null; p=p.next)
			{
				s.next = p.next;
				s.next = s.next.next;
			}
			return start;
		}
		return null;
	}
	
	public static int getSize(Node start) //getSize method that returns the size of linked list
	{
		int count=0;
		for(Node i=start;i!=null;i=i.next) 
		{
			count++;
		}
		return count;
	}
	
	public static boolean search(Node node,int target)
	{
		Node n=node;
		
		while(n!=null)
		{
			if(n.data==target) 
			{
				return true;
			}
			n=n.next;
		}
		return false;
	}
	
	public static int findHighest(Node start) // findHighest function that will find largest element from unsorted linked list.
	{   
		int highest = 0;
		if(start != null)
		{
			for(Node p=start; p!=null; p=p.next)
			{
				if(p.data > highest)
				highest = p.data;	
			}
		}
		return highest;
		
	}
	
	public static Node replace(Node start, int pos, int x) // replace function that will replace the element at given position by given value
	{   
		int count = 1;
		if(start != null)
		{
			for(Node p=start; p!=null; p=p.next)
			{
				if(count == pos)
				{
					p.data = x;	
					break;
				}
				count++;
			}
		}
		return start;
		
	}
	
	
		
}
