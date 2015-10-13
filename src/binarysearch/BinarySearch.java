package binarysearch;

public class BinarySearch {
	
	public static int searcher(int[] toBeSearched, int toBeFound) {
		int min = 0;
		int max = toBeSearched.length -1;
		int index = -1;
		for (int i = 0; i<toBeSearched.length; i++) {
			int halfArray = (int) (min+max)/2;
			if (toBeFound < toBeSearched[halfArray]) {
				max = toBeSearched[halfArray];
			} else if (toBeFound > toBeSearched[halfArray]) {
				min = toBeSearched[halfArray];
			} else {
				index = toBeSearched[halfArray];
			}
			
		}
		return index;
		
	}
}
