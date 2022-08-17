package june;


public class CLL{
	Node head;
	
	public void insertAtend( int val) {
		
		Node node= new Node(val);
		node.data=val;
		node.next= null;
		if(head== null) {
			head= node;
		}else
		{
			Node n= head;
			while(n.next!=null) {
				n=n.next;
				
			}
			n.next=node;
		}
		
	}
	
	public void insertAtstart(int data) {
		Node node= new Node(data) ;
		node.data= data;
		node.next= null;
		node.next=head;
		head=node;
		}
	
	public void insertAtindex(int pos,int data) {
		 //Node node= new Node();
		 Node node = new Node(data);
			node.data = data;
			node.next = null;
			
			if(pos==0)
			{
				insertAtstart(data);
			}
			else{
			Node n = head;
			for(int i=0;i<pos-1;i++)
			{
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
			}
	}
	public void show() {
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	}
	
