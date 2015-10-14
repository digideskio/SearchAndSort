import sort.Sorter;
import binarysearch.BinarySearch;

public class TestSorter {

	public static void main(String[] args) {
		int[] testArray1 = {7, 4, 5, 2, 3, 6, 1, 8, 10, 9};

		int[] testArray2 = {50, 32, 34, 33, 23, 100, 39, 10, 51, 55, 55};
		
		Sorter.sort(testArray1);
		Sorter.sort(testArray2);
		
		for (int i=0; i<testArray1.length; i++) {
			System.out.print(testArray1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(BinarySearch.searcher(testArray1, 4));
		System.out.println();
		
		for (int j=0; j<testArray2.length; j++) {
			System.out.print(testArray2[j] + " ");
		}
		
		System.out.println();
		
		System.out.println(BinarySearch.searcher(testArray2, 33));
		System.out.println(BinarySearch.searcher(testArray2, 2));
		
		
	}

}
