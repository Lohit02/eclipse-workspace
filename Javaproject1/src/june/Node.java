package june;

public class Node {
   public int data;
   public  Node next;
   public Node prev;
   public Node(int value) {
	   this.data= value;
   }
   public Node(int val, Node next, Node prev) {
	   this.data= val;
	   this.next=null;
			   this.prev=prev;
	   
   }

}

