package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {
	int search(String[] a, String target, int min, int max) {
		min = 0;
		max = a.length -1;
		int mid = (min + max)/2;
		
		if (a[mid].equals(target)) {
			return mid;
		}
		
		if (a[mid].compareTo(target) < 0) {
			return search(a, target, min, mid-1);
		} else {
			return search(a, target, mid+1, max);
		}
	}

	@Override
	public String searchName() {
		return "BinaryRecursiveSearch";
	}

	@Override
	public int search(int[] arr, int target) {
		return 0;
	}
}
