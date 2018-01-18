package linkedLists;

import linkedLists.Q2_4_Partition.Node;

public class Q2_5_SumLists {
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
	
	public void sum(Q2_5_SumLists list1,Q2_5_SumLists list2){
		Node head1 = list1.head;
		Node head2 = list2.head;
		Q2_5_SumLists result = new Q2_5_SumLists();
		int sum = head1.data+head2.data;
		int digit = sum;
		int carry = 0;
		while(head1!=null && head2!=null){
			sum = head1.data+head2.data+carry;
			digit = sum;
			carry = 0;
			if(sum>9){
				digit = sum-10;
				carry =1; 
			}
			result.push(digit);
			System.out.println("d: "+digit);
			head1 = head1.next;
			head2 = head2.next;
		}
		if(carry!=0){
			result.push(carry);
		}
		
		
		//print lists
		while(head1!=null){
			System.out.print(head1.data+"->");
			head1 = head1.next;
		}
		System.out.println();
		while(head2!=null){
			System.out.print(head2.data+"->");
			head2 = head2.next;
		}
		System.out.println("\nresult: ");
		while(result.head!=null){
			System.out.print(result.head.data+"->");
			result.head = result.head.next;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2_5_SumLists list1 = new Q2_5_SumLists();
		list1.push(5);
		list1.push(6);
		list1.push(3);
		
		Q2_5_SumLists list2 = new Q2_5_SumLists();
		list2.push(8);
		list2.push(4);
		list2.push(2);
		
		list1.sum(list1, list2);
		
	}

}
