import sort.Sorter;
import binarysearch.BinarySearch;

public class TestSorter {

	public static void main(String[] args) {
		int[] testArray = {7, 4, 5, 2, 3, 6, 1};

		Sorter.sort(testArray);
		
		for (int i=0; i<testArray.length; i++) {
			System.out.print(testArray[i] + " ");
			
		}
		System.out.println();
		System.out.println(BinarySearch.searcher(Sorter.sort(testArray), 2));
		
		
	}

}
