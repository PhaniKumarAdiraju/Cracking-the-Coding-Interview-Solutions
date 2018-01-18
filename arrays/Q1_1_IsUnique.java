package arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * 1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 *
 */
public class Q1_1_IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "CTCI";
		Q1_1_IsUnique i = new Q1_1_IsUnique();
		System.out.println(i.isUnique(str));
		
	}
	
	public String isUnique(String str){
		boolean[] res = new boolean[128]; //128 since ascii character range
		for(int index=0;index<str.length();index++){
			int val = str.charAt(index);
			if(res[val]) return "Repeating characters";
			res[val] = true;
		}
		return "No Repeating characters";
	}
	
	public String isUnique2(String str){
		//O(n) run time with another data structure
		Map<Character,Integer> res = new HashMap<>();
		for(int index=0;index<str.length();index++){
			if(res.containsKey(str.charAt(index))){
				res.put(str.charAt(index), res.get(str.charAt(index))+1);
			}else{
				res.put(str.charAt(index), 1);
			}
		}
		for(Map.Entry<Character, Integer> item : res.entrySet()){
			if(item.getValue()>1){
				return "Repeating characters";
			}
		}
		return "No repeating characters";

	}
	
	public String isUnique3(String str){
		//O(n*n) run time with single data structure
		for(int index=0;index<str.length();index++){
			for(int index2=index+1;index2<str.length();index2++){
				if(str.charAt(index2) == str.charAt(index)){
					return "Repeating characters";
				}
			}
		}
		return "No Repeating characters";
	}

}
