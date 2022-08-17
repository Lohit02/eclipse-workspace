package Linkedlist;

public class Deletion {
	Node head;
	Node tail;
	int size;
	class Node{
		
		private Node next;
		private int value;
		Node(int value){
			this.value=value;
		 }
		Node(int value,Node next){
			this.value=value;
			this.next=next;
		}
	}
	public void push(int new_data) {
		Node new_node= new Node(new_data);
		new_node.next=head;
		head=new_node;
	
		if (tail==null) {
			tail=head;
		}
		
		size++;
		
	} 
	public void append(int new_data) {
		if(tail==null) {
			push(new_data);
			return;
		}
		Node new_node= new Node(new_data);
		tail.next=new_node;
		tail=new_node;
		size++;
		
	}
	public void insert(int val, int index) {
		if(index==0) {
			push(val);
			return;
			}
		if(index==size) {
			append(val);
		return;
		}
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		Node new_node= new Node(val,temp.next);
		temp.next=new_node;
		
	}
	public void insertRec(int val,int index) {
		head=insertRec(val,index,head);
	}
	public Node insertRec(int val,int index,Node node) {
		if(index==0) {
			Node temp= new Node(val,node);
			size++;
			return temp;
		}
		node.next=insertRec(val,index-1,node.next);
		return node;
	}
	public int deleteFirst() {
		int val=head.value;
		head= head.next;
		if(head==null) {
			tail=null;
		}size--;
		return val;
	}
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondLast=get(size-2);
		int val= tail.value;
		tail= secondLast;
		tail.next=null;
		size--;
		return val;
		
		
	}
	public void deletenode(int pos) {
		if(head==null) {
			return;			
		}
		Node temp= head;
		if(pos==0) {
			head=temp.next;
			return;	
		}
		for(int i=0;temp!= null && i<pos-1;i++) {
			temp=temp.next;
		}
		if(temp==null || temp.next==null)
			return;
		
		Node node=temp.next.next;
		temp.next=node;
	}
	
	
	  public int deleteLasst() {
	        if (size <= 1) {
	            return deleteFirst();
	        }

	        Node secondLast = get(size - 2);
	        int val = tail.value;
	        tail = secondLast;
	        tail.next = null;
	        size--;
	        return val;
	    }
	
	
	
	public Node get(int index) {
	Node temp= head;
	for(int i=0;i<index;i++) {
		temp=temp.next;
	}
		
		
		return temp;
		
	}
	 public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.value + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("END");
	    }
	   public static void main(String[] args) {
		   Deletion first = new Deletion();
	        Deletion second = new Deletion();

	       first.append(3);
	       first.append(1);
	       first.append(4);
	       first.append(6);
	       first.append(9);
	     first.display();
	     first.deleteLasst();
	     first.display();
	   }

}
