package Linkedlist;

public class Reverselist {
	
	@SuppressWarnings("unused")
	private static Node head;
	 
	public void addToTheLast(Node node) {
		if(head== null) {
			head=node;
		}else {
			Node temp=head;
			while(temp.next!= null) {
				temp=temp.next;
				temp.next=node;
			}
		}
	}
	public void printlist(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
			
		}
	}
	public static Node reverseLinkedlist(Node CurrentNode) {
		Node previousNode=null;
		Node nextNode;
		while(CurrentNode!=null) {
			nextNode=CurrentNode.next;
			CurrentNode.next=previousNode;
			previousNode= CurrentNode;
			CurrentNode=nextNode;
		}return previousNode;
	}

	public static void main(String[] args) {
		Reverselist list= new Reverselist();
		list.addToTheLast(head);
		list.addToTheLast(new Node(4));
		list.addToTheLast(new Node(0));
		list.addToTheLast(new Node(3));
		list.addToTheLast(new Node(9));
		
		list.printlist(head);
		Node reversehead= reverseLinkedlist(head);
		list.printlist(reversehead);
	}

}
