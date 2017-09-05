package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search{
	int search(String[] a, String target) {
		int min = 0;
		int max = a.length + 1;
		int mid;
		
		while (min < max) {
			mid = (min+max)/2;
			if (a[mid].equals(target)) {
				return mid;
			}
			
			if (a[mid].compareTo(target) < 0) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		
		return -1;
	}

	@Override
	public String searchName() {
		return "BinaryIterativeSearch";
	}

	@Override
	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		return 0;
	}
}
