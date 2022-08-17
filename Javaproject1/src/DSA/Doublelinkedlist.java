package DSA;

import june.Node;

public class Doublelinkedlist {
	private Node head;
	
	public void insertFirst(int val) {
		Node node= new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev= node;
		}head=node;
	}
	public void display() {
		Node node=head;
		Node  last=null;
		while(node!=null) {
			System.out.println(node.data+"->");
			last= node;
			node=node.next;
		}
		System.out.println("END");
		System.out.println("Print in Reverse");
		while(last!=null);{
			System.out.println(last.data+"->");
			last=last.prev;		
		}
		System.out.println("START");
	}
	public void insert

}
