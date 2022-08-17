package Linkedlist;

public class LK {
	public Node head;

	public static void main(String[] args) {
		LK ll = new LK();
		ll.append(7);
		ll.append(5);
		ll.append(3);
		ll.append(1);
		
		ll.printList();

	}
	 public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null)
	        {
	            System.out.print(tnode.data+" ");
	            tnode = tnode.next;
	        }
	    }
	
	public void append(int data) {
		Node node= new Node(data);
		node.next=head;
		head= node;
		
	}

}
