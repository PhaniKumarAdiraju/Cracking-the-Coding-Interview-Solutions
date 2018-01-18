package arrays;

public class Q1_4_IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malayalam";
		System.out.println(isPalin(s));
	}
	public static String isPalin(String s){
		for(int i=0,k=s.length()-1; i<k ; i++,k--){
			if(s.charAt(i)!=s.charAt(k))
				return "Not Palindrome";
		}
		return "Palindrome";
	}

}
