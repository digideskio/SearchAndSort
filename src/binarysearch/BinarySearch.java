package binarysearch;

public class BinarySearch {
	
	public static int searcher(int[] toBeSearched, int toBeFound) {
		int min = 0;
		int max = toBeSearched.length -1;
		int index = -1;
		for (int i = 0; i<toBeSearched.length; i++) {
			int halfArray = (int) (min+max)/2;
			if (toBeFound < toBeSearched[halfArray]) {
				max = halfArray-1;
			} else if (toBeFound > toBeSearched[halfArray]) {
				min = halfArray+1;
			} else {
				index = halfArray;
			}
		}
		return index;
		
	}
}
