package sorting;

import java.util.Arrays;

public class CountingSort {
	
	public static void countingSort(int[] A, int[] B, int r) {
		// A for input, B for output, r for range
		int len = A.length;
		
		int[] temp = new int[r];
		Arrays.fill(temp,0);
		for (int i = 1; i<len; i++) {
			temp[A[i]] = temp[A[i]] + 1;
		}
		for (int j=1; j<r; j++) {
			temp[j] = temp[j] + temp[j-1];
		}
		for (int i = len-1; i>=1; i--) {
			B[temp[A[i]]] = A[i];
			temp[A[i]] = temp[A[i]] - 1;
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {123,5,235,6,65,22,92,10};
		int[] B = {0,0,0,0,0,0,0,0};
		countingSort(A, B, 300);
		for (int b: B) {
			System.out.println(b);
		}
	}

}
