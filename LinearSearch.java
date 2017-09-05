package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {
	int search(String[] a, String target) {
		for (int i=0; i<a.length; i++) {
			if (a[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String searchName() {
		return "LinearSearch";
	}

	@Override
	public int search(int[] arr, int target) {
		return 0;
	}
}
