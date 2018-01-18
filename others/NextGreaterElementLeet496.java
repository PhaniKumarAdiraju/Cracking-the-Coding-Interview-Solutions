package others;

public class NextGreaterElementLeet496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1 = {2,4};
		int[] n2 = {1,2,3,4};
		nextGElement(n1, n2);
	}

	public static void nextGElement(int[] n1, int[]n2){
		for(int i =0;i<n1.length;i++){
			int k = findElement(n1[i], n2);
			if(k!=-1)
				System.out.println( findNGElement(k,n2));
		}
	}
	
	private static int findNGElement(int k, int[] n2) {
		// TODO Auto-generated method stub
		for(int i=k+1;i<n2.length;i++){
			if(n2[i]>n2[k])
				return n2[i];
		}
		
		return -1;
	}

	public static int findElement(int k, int[]n2){
		for(int i=0;i<n2.length;i++){
			if(k==n2[i])
				return i;
		}
		return -1;
	}
	
	
}
