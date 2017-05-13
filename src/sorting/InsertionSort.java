package sorting;

public class InsertionSort {

	public static void insertionSort(int[] data) {
		for (int i=1; i<data.length; i++) {
			int curr = data[i];
			for (int j=i-1; j>=0; j--) {
				if (data[j]>curr){ 
					data[j+1]=data[j];
					if (j==0) data[0] = curr;
				}
				else { 
					data[j+1]=curr;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[]{3,1,23,8,4,6,7,776,879,29,3,434,56,878,9};
		insertionSort(data);
		for (int i: data) {
			System.out.println(i);
		}
	}

}
