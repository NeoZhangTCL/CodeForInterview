package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] data) {
		int pivot = data.length / 2;
		int[] left = Arrays.copyOfRange(data, 0, pivot);
		int[] right = Arrays.copyOfRange(data, pivot, data.length);
		if(left.length > 1) { mergeSort(left); }
		if(right.length > 1) { mergeSort(right); }
		merge(data, left, right);
	}

	public static void merge(int[] data, int[] left, int[] right) {
		int ptr, i, j;
		ptr = i = j = 0;
		while(left.length != i && right.length != j){
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
