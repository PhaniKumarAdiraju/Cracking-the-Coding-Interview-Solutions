package linkedListsTop20;

import linkedListsTop20.Q5_RemoveDuplicate.Node;

public class Q6_Add1ToNumber {

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
	
	public Node reverse(Node node){
		Node prev = null;
		Node curr = node;
		Node next = null;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		node = prev;
		return node;
		
	}
	
	public void add1(){
		Q6_Add1ToNumber list1 = new Q6_Add1ToNumber();
		
		Node curr = head;
		while(curr!=null){
			list1.push(curr.data);
			curr = curr.next;
		}
		
		curr = list1.head;
		int sum = curr.data+1;
		int carry=0;;
		while(curr!=null){
			System.out.println("sum: "+sum);
			System.out.println("c: "+carry);
			sum = (curr.data+carry);
			if(curr==list1.head){
				sum = sum+1;
			}
			System.out.println("sum2: "+sum);
			carry = sum/10;
			System.out.println("c2: "+carry);
			curr.data = sum%10;
			curr = curr.next;
			
		}
		curr = reverse(list1.head);
		System.out.println("rev: ");
		while(curr!=null){
			System.out.print(curr.data);
			curr= curr.next;
		}
		list1.print();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q6_Add1ToNumber list = new Q6_Add1ToNumber();
		list.push(9);list.push(9);list.push(9);list.push(1);
		
		list.print();
		list.add1();
		

	}

}
