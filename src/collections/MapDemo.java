package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class MapDemo {

	
	public static void main(String...args){
		java.util.Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "a");map.put(2, "ab");map.put(13, "abc");
		map.put(null,"asdasd");
		map.put(123,null);
		map.put(1232,null);
		for(Map.Entry m:map.entrySet()){
			System.out.println(m);
		}
		

		LinkedHashMap<Integer,String> map1 = new LinkedHashMap<Integer,String>(map);
		System.out.println(map1);
	}
}
