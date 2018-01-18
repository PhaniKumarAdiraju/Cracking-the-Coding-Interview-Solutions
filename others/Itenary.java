package others;

import java.util.HashMap;
import java.util.Map;

public class Itenary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dataSet = new HashMap<String, String>();
        dataSet.put("Chennai", "Banglore");
        dataSet.put("Bombay", "Delhi");
        dataSet.put("Goa", "Chennai");
        dataSet.put("Delhi", "Goa");
 
        printResult(dataSet);
	}

	private static void printResult(Map<String, String> dataSet) {
		// TODO Auto-generated method stub
		String start ="" ;
		Map<String,String> reverse = new HashMap<>();
		for(Map.Entry<String, String> item : dataSet.entrySet()){
				reverse.put(item.getValue(), item.getKey());	
		}
		for(Map.Entry<String, String> item : dataSet.entrySet()){
			if(!reverse.containsKey(item.getKey())){
				start = item.getKey();
			}
		}
		System.out.println("Start: "+start);
		
		String to = dataSet.get(start);
		while(to!=null){
			System.out.println(to);
			to = dataSet.get(to);
		}
		
	}

}
