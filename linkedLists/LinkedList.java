package linkedLists;

public class LinkedList {
	static Node head;
	static class Node{
		Node next;
		char data;
		
		public Node(char data){
			this.data = data;
		}
	}
	
	static void removeDuplicate(Node n){
		Node ptr1=head , ptr2=null;
		while(ptr1!= null && ptr1.next!=null){
			ptr2=ptr1;
			while(ptr2.next!=null){
				if(ptr1.data == ptr2.next.data){
					ptr2.next = ptr2.next.next;
				}else{
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}
	
	 static void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.head = new Node('f');
		list.head.next = new Node('o');
		list.head.next.next= new Node('l');
		list.head.next.next.next = new Node('l');
		list.head.next.next.next.next = new Node('o');
		list.head.next.next.next.next.next = new Node('w');
		
		printList(head);
		System.out.println();
		removeDuplicate(head);
		printList(head);
		

	}

}
