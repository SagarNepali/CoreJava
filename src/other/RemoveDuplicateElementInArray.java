package other;

import java.util.Arrays;

public class RemoveDuplicateElementInArray {

	
	public static void main(String [] args){
		int [] array ={11,234,115,90,22,22};
		
		Arrays.sort(array);
		
		int length = removeDuplicateElementFromArray(array);
		for(int i=0;i<length;i++){
			System.out.println(array[i]);
		}
		
	}

	private static int removeDuplicateElementFromArray(int[] array) {

		int length = array.length;
		int [] tempArray= new int[length];
		
		
		if(length==0 || length==1){
			return length;
		}
		
		int j = 0;
		for(int i =0;i<length-1;i++){
			
			if(array[i]!=array[i+1]){
				tempArray[j++] = array[i];
				
			}
		}
		tempArray[j++] = array[length-1];
		
		for(int i =0 ; i<j;i++){
			array[i]=tempArray[i];
		}
		
		return j;
				
	}
}
