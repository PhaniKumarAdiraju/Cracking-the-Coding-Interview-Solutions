package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Q4_3_ListOfDepths {
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int d){
			data =d;
			left = right = null;
		}
	}
	
	void levelOrder(){
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			Node n = q.poll();
			System.out.println("n : "+n.data);
			if(n.left !=null){
				q.add(n.left);
			}
			if(n.right !=null){
				q.add(n.right);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4_3_ListOfDepths tree_level = new Q4_3_ListOfDepths();
		tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        
        tree_level.levelOrder();
	}

}
