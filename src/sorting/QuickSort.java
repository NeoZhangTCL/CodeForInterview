package sorting;

public class QuickSort {

	public static void quickSort(int[] data) {
		quickSort(data, 0, data.length-1);
	}

	public static void quickSort(int[] data, int i, int j) {
		int pivot = data[0];
		i++;
		while (i<j) {
			int left = data[i];
			int right = data[j];
			if (right<pivot && left>pivot){
				int temp = right;
				right = left;
				left = temp;
			}
			if (left<pivot) i++;
			if (right>pivot) j--;
		}
		quickSort(data, 1, i-1);
		quickSort(data, j+1, data.length-1);
	}

	public static void main(String[] args) {
		int[] data = new int[]{3,1,23,8,4,6,7,776,879,29,3,434,56,878,9};
		quickSort(data);
		for (int i: data) {
			System.out.println(i);
		}
	}


}
