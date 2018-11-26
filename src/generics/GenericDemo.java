package generics;
import java.util.*;

public class GenericDemo {

	
	public static void main(String...args){
		//List<Integer>[] array = new ArrayList<Integer>[10]; // Generic arrays could not be created;
		
		
		
		//List<Integer>[] arrays = new List<Integer>[10];  //Generic array not supported
		
		//List<Number> number = new ArrayList<Integer>(); //Doesnot support sub typing
		
		List<Number> numbers = new ArrayList<Number>(); 
		List<Integer> integers = new ArrayList<Integer>();
		
		integers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5}));
		numbers.addAll(integers);
		numbers.addAll(Arrays.asList(new Double[]{0.1,0.2,0.3}));
		System.out.println(integers);
		System.out.println(numbers);
		
	}
}
