package sort;

public class Sorter {
	
	public static int[] sort(int[] toBeSorted) {
		
		int counter;
		for (int i = 0; i<toBeSorted.length; i++) {
			counter = indexOfMin(toBeSorted, i);
			
			swap(toBeSorted, i, counter);
		}
		return toBeSorted;
	
	}

	private static void swap(int[] toBeSorted, int firstIndex, int secondIndex) {
		int temp = toBeSorted[firstIndex];
		toBeSorted[firstIndex] = toBeSorted[secondIndex];
		toBeSorted[secondIndex] = temp;
	}
	
	
	private static int indexOfMin(int[] toBeSorted, int startIndex) {
		int minVal = toBeSorted[startIndex];
		int minIndex = startIndex;
		
		for(int i = minIndex + 1; i < toBeSorted.length; i++) {
	        if(toBeSorted[i] < minVal) {
	            minIndex = i;
	            minVal = toBeSorted[i];
	        }
	    } 
	    return minIndex;
	}
	
	
	
	
	
	
}
