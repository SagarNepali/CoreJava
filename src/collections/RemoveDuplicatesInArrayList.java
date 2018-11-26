package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArrayList {

	
	
	
	
	
	public static void main(String...args){
		List<String> list = Arrays.asList(new String[]{"RAM","SHYAM","HARI","HAARI","HARI"});
		List<String> secondList = Arrays.asList(new String[]{"RAM","SITA","HARRY"});

		Set<String> listToSet = list.stream().collect(Collectors.toSet());
		Set<String> directToSet = new HashSet<>(list);

		System.out.println("List elements: "+list);
		System.out.println("List to Set: "+directToSet);
		System.out.println("List to Set using Stream: "+listToSet);
		listToSet.remove("HAARI");
		System.out.println("Set remove : "+listToSet);
		
		
		list = listToSet.stream().collect(Collectors.toList());
		System.out.println("Set to list using Stream: "+list);
		
		System.out.println("====================");
		
		System.out.println("Second list elements: "+secondList);
		Collections.reverse(secondList);
		System.out.println("Reversed List: "+secondList);
		
		Iterator<String> itr = secondList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}
	
	
}
