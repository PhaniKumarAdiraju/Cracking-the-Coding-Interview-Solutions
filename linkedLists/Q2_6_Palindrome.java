package linkedLists;

public class Q2_6_Palindrome {
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
	
	public void palindrom(){
		
		Node curr = head;
		Q2_6_Palindrome list2 = new Q2_6_Palindrome();
		//System.out.println("list: ");
		curr = head;
		while(curr!=null){
			//System.out.print("->"+curr.data);
			list2.push(curr.data);
			curr = curr.next;
		}
		
		Node n1 = head;
		Node n2 = list2.head;
		
		while(n1!=null && n2!=null){
			if(n1.data != n2.data){
				System.out.println("fail");
				return;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		System.out.println("pass");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2_6_Palindrome list = new Q2_6_Palindrome();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(3);
		list.push(2);
		list.push(1);
		
		list.palindrom();
	}

}
