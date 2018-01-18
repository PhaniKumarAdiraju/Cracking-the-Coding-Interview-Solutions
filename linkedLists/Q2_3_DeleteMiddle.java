package linkedLists;

import linkedLists.Q2_2_KthtoLast.Node;

public class Q2_3_DeleteMiddle {
	
	Node head;
	class Node{
		Node next;
		int data;
		public Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void push(int newData){
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	
	public void deleteMiddle(int k){
		Node curr = head;
		Node prev = null;
		while(curr!=null){
			if(curr.data==k){
				prev.next = curr.next;
			}
			prev = curr;
			curr = curr.next;
		}
		while(head!=null){
			System.out.print("->"+head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q2_3_DeleteMiddle list = new Q2_3_DeleteMiddle();
		for(int i=1;i<=5;i++){
			list.push(i);
		}
		list.deleteMiddle(1);
	}

}
