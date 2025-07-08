package Session_8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		added acess elements in collection
		
		
		/*
		 * list-->Duplicate allowed
		 * set-->Duplicate will not  be added
		 * 
		 * 
		 * 
		 * syntax
		 */
		List<String> list=new ArrayList<>();  //interface  with class
		
		ArrayList<String> arrlist=new  ArrayList<>();  //class
		
		LinkedList<String> linklist=new LinkedList<>(); //class
		
		
		//adding  the data
		list.add("java");
		list.add("python");
		list.add("Node Js");
		list.add("Nextjs");
		list.add("java"); //duplicate allowed 
		
		//accessing the data
		System.out.println("list info"+list);;
		
		//interface            class 
		Set<String> set=new HashSet<>();
		
		TreeSet<String> treeset=new TreeSet<>();
		
		//adding data
		set.add("TVS");
		set.add("Yamaha");
		set.add("Honda");
		set.add("Yamaha");//duplicate will not be allowed
		
		
		//acessing data
		
		System.out.println("set info "+set);
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
		
		/*
		 * pure object oriented example
		 */
		
		
		
		//adding data
		map.put(1, "Html");
		map.put(2, "Css3");
		map.put(3,"Bootstrap");
		System.out.println(" befor Map update:"+map);
		map.put(1, "Reactjs"); //based on key value will be updated
		//accessing data
		System.out.println("after Map update:"+map);
		
		

	}

}
