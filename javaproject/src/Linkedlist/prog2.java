package Linkedlist;



public class prog2 {
	public Node head;

	public static void main(String[] args) {
		prog2 r =new prog2();
		r.add(4);
		r.add(5);
		r.printlist();

	}
	public void add(int data) {
		
		Node node=new Node(data);
		node.next=head;
		head=node;
		
	}
	public void addend(int data) {
		
	}
	
	public void printlist() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
