package arrays;

import java.util.HashMap;
import java.util.Map;

public class Q1_6_StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabcccccaaa";
		Q1_6_StringCompression sc = new Q1_6_StringCompression();
		System.out.println(sc.compress(input));
	}

	public String compress(String input){
		char t1 = input.charAt(0);
		int count =0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<input.length();i++){
			char t2 = input.charAt(i);
			if(t1==t2){
				count++;
			}else{
				sb.append(t1);
				sb.append(count);
				count=1;
				t1=t2;
			}
			if(i==input.length()-1){
				sb.append(t1);
				sb.append(count);
			}
		}
		if(sb.toString().length()<input.length()){
			return sb.toString();
		}
		return input;
	}
	
	public String compress2(String input){
		
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<input.length();i++){
			if(map.containsKey(input.charAt(i))){
				map.put(input.charAt(i), map.get(input.charAt(i))+1);
			}else{
				map.put(input.charAt(i), 1);
			}
		}
	
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Character, Integer> item : map.entrySet()){
			sb.append(item.getKey());
			sb.append(item.getValue());
		}
		
		if(sb.toString().length()<=input.length()){
			return sb.toString();
		}
		return input;
	}
}
