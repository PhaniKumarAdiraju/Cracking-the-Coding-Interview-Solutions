package linkedListsTop20;

public class Q7_ReverseLinkedListInGroups {
	Node head;
	class Node{
		Node next;
		int data;
		public Node(int d){
			data = d;
		}
	}
	public void push(int d){
		Node n = new Node(d);
		n.next = head;
		head = n;
	}
	public static void print(Node n){
		System.out.println("\nPrinting List: ");
		while(n!=null){
			System.out.print("->"+n.data);
			n = n.next;
		}
	}
	public Node reverse(Node n){
		Node next = null;
		Node curr = n;
		Node prev = null;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		n = prev;
		return n;
	}
	
	
	
	public Node reverseInGroup(Node node, int k){
		int index =0;
		Node prev = null;
		Node curr = node;
		Node next = null;
		while(node!=null){
			while(index<k){
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				index++;
			}
			index=0;
			node = prev;
		}
		return node;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q7_ReverseLinkedListInGroups list = new Q7_ReverseLinkedListInGroups();
		for(int i=8;i>0;i--){
			list.push(i);
		}
		list.print(list.head);
		list.print(list.reverse(list.head));
		list.print(list.reverseInGroup(list.head, 4));
	}
	

}
