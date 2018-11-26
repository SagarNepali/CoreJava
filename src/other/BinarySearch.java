package other;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String... args){
		int [] array ={11,234,115,90,74,22};
		
		int searchKey = 220;
		
		Arrays.sort(array);
		
		System.out.println(Arrays.binarySearch(array, searchKey));
		
		binarySearch(array,searchKey);
		
	}

	private static void binarySearch(int [] sortedArray, int searchKey) {

		int firstIndex =0;
		int lastIndex = sortedArray.length-1;
		int mid = (firstIndex+lastIndex)/2;
		
		while(lastIndex>=firstIndex){
			
			if(sortedArray[mid]==searchKey){
				System.out.println(searchKey+" found at position : "+mid);
				break;
				
			}else if(sortedArray[mid]<searchKey){
				firstIndex = mid+1;
				
			}else{
				lastIndex = mid -1;
			}
			mid = (firstIndex+lastIndex)/2;
		}
		if(firstIndex>lastIndex){
			System.out.println(searchKey+" Not found");
		}
	}

}
