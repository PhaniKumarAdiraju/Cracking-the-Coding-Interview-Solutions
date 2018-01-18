package bloomberg;

public class MaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 9, 5, 6, 3, 2};
        int size = arr.length;
        maxDiff(arr);
	}
	
	public static void maxDiff(int[] arr){
		int min = Integer.MAX_VALUE;
		int maxDiff = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
			if((arr[i]-min)>maxDiff){
				maxDiff = (arr[i]-min);
			}
		}
		System.out.println("maxDiff: "+maxDiff);
		
	}

}
