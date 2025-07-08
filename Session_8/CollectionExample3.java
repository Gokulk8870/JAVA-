package Session_8;

import java.util.HashMap;
import java.util.Map;

public class CollectionExample3 {
public static void main(String[] args) {
	
	//iterating for hashmap
	HashMap<Integer,String> codes=new HashMap<Integer,String>();
	
	codes.put(1, "java");
	codes.put(2, "python");
	
	for(Map.Entry<Integer,String> entry:codes.entrySet()) {
		System.out.println("key :"+entry.getKey()+", value: "+entry.getValue());
	}
}
}
