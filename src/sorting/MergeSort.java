package sorting;

public class MergeSort {

	public static int[] mergeSort(int[] data) {
		int pivot = data.length / 2 + 1;
		int[] left = Arrays.copyOfRange(data, 0, pivot);
		int[] right = Arrays.copyOfRange(data, pivot, data.length);
		while(left.length > 1) { left=mergeSort(left); }
		while(right.length > 1) { right=mergeSort(right); }
		return merge(data, left, right);
	}

	public static int[] merge(int[] data, int[] left, int[] right) {
		int ptr, i, j;
		ptr = i = j = 0;
		while(left.length != i || right.length != j){
			if (left[i]<=right[j]) data[ptr++] = left[i++];
			else data[ptr++] = right[j++];
		}
		while (i<left.length){ data[ptr++] = left[i++]; }
		while (j<right.length){ data[ptr++] = right[j++]; }
	}

	public static void main(String[] args) {
		int[] data = new int[]{3,1,23,8,4,6,7,776,879,29,3,434,56,878,9};
		mergeSort(data);
		for (int i: data) {
			System.out.println(i);
		}
	}
}
