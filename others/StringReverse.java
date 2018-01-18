package others;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcde";
		reverse(s);
	}
	public static void reverse(String s){
		char[] str = s.toCharArray();
		for(int i=0,j=s.length()-1;i<j;i++,j--){
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
		}
		System.out.println(str);
	}

}
