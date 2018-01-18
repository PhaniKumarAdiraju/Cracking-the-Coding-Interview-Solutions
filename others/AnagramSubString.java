package others;

public class AnagramSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "BACDGABCDA";
        String pat = "ABCD";
        search(txt,pat);
	}
	
	public static void search(String txt, String pat){
		int[] p = new int[128];
		int[] t = new int[128];
		
		for(int i=0;i<pat.length();i++){
			int a = pat.charAt(i);
			int b = txt.charAt(i);
			p[a]++;
			t[b]++;
		}
		
		for(int i =pat.length();i<txt.length();i++){
			if(compare(t,p))
				System.out.println("found at: "+(i-pat.length()));
			
			int b = txt.charAt(i);
			t[b]++;
			int a = txt.charAt(i-pat.length());
			t[a]--;
		}
		if(compare(t,p))
			System.out.println("found at: "+(txt.length()-pat.length()));
		
	}
	public static boolean compare(int[] t, int[]p){
		for(int i=0;i<t.length;i++){
			if(t[i]!=p[i])
				return false;
		}
		return true;
	}

}
