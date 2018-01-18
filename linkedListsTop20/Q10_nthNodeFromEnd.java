package linkedListsTop20;

import linkedListsTop20.Q7_ReverseLinkedListInGroups.Node;

public class Q10_nthNodeFromEnd {
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
		System.out.println();
	}
	
	public int nThNodeFromEnd(Node node, int k){
		int len =0;
		Node temp = node;
		while(temp!=null){
			temp = temp.next;
			len++;
		}
		int index=0;
		while(node!=null){
			if(index==len-k){
				return node.data;
			}
			node = node.next;
			index++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q10_nthNodeFromEnd list = new Q10_nthNodeFromEnd();
		for(int i=9;i>0;i--){
			list.push(i);
		}
		print(list.head);
		System.out.println(list.nThNodeFromEnd(list.head, 1));
	}

}
