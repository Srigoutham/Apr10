package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> td=new HashMap<>();
			td.put("Tim", 12345);
			td.put("Tim", 12345);
			td.put("Tim", 12345);
			td.put("Tim", 12345);
			for(Map.Entry m:td.entrySet()){
				System.out.println(m.getKey()+""+m.getValue());
			}
	
	}
}
