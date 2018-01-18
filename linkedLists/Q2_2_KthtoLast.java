package linkedLists;

public class Q2_2_KthtoLast {

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
	
	public void kthToLast(int k){
		System.out.println("in method: "+ k);
		int len=0;
		Node temp =head;
		while(temp.next!=null){
			len = len+1;
			temp = temp.next;
		}
		System.out.println("len: "+len);
		if(len<k)
			return;
		temp = head;
		for(int i=0;i<k;i++){
			temp = temp.next;
		}
		
		while(temp.next!=null){
			System.out.println("req: "+ temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q2_2_KthtoLast list = new Q2_2_KthtoLast();
		list.push(20);
		list.push(4);
		list.push(15);
        list.push(35);
        
        list.kthToLast(0);
        
	}

}
