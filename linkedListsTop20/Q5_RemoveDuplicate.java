package linkedListsTop20;

import java.util.HashSet;
import java.util.Set;

public class Q5_RemoveDuplicate {

	Node head;
	class Node{
		Node next;
		int data;
		public Node(int d){
			data =d;
		}
	}
	
	public void push(int d){
		Node n = new Node(d);
		n.next = head;
		head = n;
	}
	
	public void removeDuplicate(){
		Set<Integer> s = new HashSet<>();
		Node curr = head;
		Node prev = null;
		while(curr!=null){
			if(s.contains(curr.data)){
				prev.next = curr.next;
			}else{
				s.add(curr.data);
				prev = curr;
			}
			curr = curr.next;
		}
	}
	
	public void removeDuplicate2(){
		Node ptr1 = head;
		while(ptr1!=null && ptr1.next!=null){
			if(ptr1.data == ptr1.next.data){
				ptr1.next = ptr1.next.next;
			}else{
				ptr1 = ptr1.next;
			}
		}
	}
	
	public void print(){
		System.out.println("Printing list: ");
		Node curr = head;
		Node prev = null;
		while(curr!=null){
			prev = curr;
			System.out.print("->"+curr.data);
			curr = curr.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q5_RemoveDuplicate list = new Q5_RemoveDuplicate();
		list.push(2);list.push(2);list.push(2);list.push(2);
		list.push(2);list.push(2);list.push(2);
		list.print();
		list.removeDuplicate2();
		list.print();

	}

}
