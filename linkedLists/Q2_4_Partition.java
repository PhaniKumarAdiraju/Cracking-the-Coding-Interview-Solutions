package linkedLists;

public class Q2_4_Partition {
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
	
	public void partition(int k){
		Node temp = head;
		Q2_4_Partition list1 = new Q2_4_Partition();
		Q2_4_Partition list2 = new Q2_4_Partition();
		
		while(temp.next!=null){
			if(temp.data<k){
				list1.push(temp.data);
			}else{
				list2.push(temp.data);
			}
			temp = temp.next;
		}
		if(temp.data<k){
			list1.push(temp.data);
		}else{
			list2.push(temp.data);
		}
		
		System.out.println("partition done");
		while(list1.head!=null){
			System.out.print("-> "+ list1.head.data);
			list1.head = list1.head.next;
		}
		list1.head = list2.head;
		while(list1.head!=null){
			System.out.print("-> "+ list1.head.data);
			list1.head = list1.head.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q2_4_Partition list = new Q2_4_Partition();
		list.push(1);list.push(2);list.push(10);list.push(5);
		list.push(8);list.push(5);list.push(3);

		list.partition(5);
	}

}
