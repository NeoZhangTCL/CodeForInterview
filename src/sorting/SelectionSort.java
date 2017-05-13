package sorting;

public class SelectionSort {

	public static void selectionSort(int[] data){
		for (int i=0; i<data.length; i++) {
			int smallest = data[i];
			int smallestPtr = i;
			for (int j=i+1; j<data.length; j++) {
				if (data[j] < smallest){
					smallest = data[j]; 
					smallestPtr = j;
				}
			}
			int temp = data[i];
			data[i] = smallest;
			data[smallestPtr] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[]{3,1,23,8,4,6,7,776,879,29,3,434,56,878,9};
		selectionSort(data);
		for (int i: data) {
			System.out.println(i);
		}
	}

}
