package sorting;

public class QuickSort {

	public static void quickSort(int[] data) {
		quickSort(data, 0, data.length-1);
	}

	public static void quickSort(int[] data, int left, int right) {
		int i = hoarePartition(data, left, right);
		if(i-1>left) quickSort(data, left, i-1);
		if(i+1<right) quickSort(data, i+1, right);
	}
	
	public static int lomutoPartition(int[] data, int left, int right) {
	    int pivot = data[right];
	    int i = left - 1;    
	    for (int j=left; j<right; j++) {
	    	if (data[j]<=pivot) {
	    		i = i + 1;
	    		if (i != j){
		    	    swap(data, i, j);
	    		}
	    	}	
	    }
	    swap(data,++i,right);
	    return i;
	}
	
	public static int hoarePartition(int[] data, int left, int right) {
		int pivot = data[left];
		int i = left+1;
		int j = right;
		while (true) {
			while(i<=right && data[i]<pivot){ i++; } 
			while(j>=left+1 && data[j]>pivot){ j--; }
			if(i>=j){ 
				swap(data, left, j);
				return j; 
			}
			swap(data, i, j);
		}
	}

	public static void swap(int[] data, int i, int j){
	    int temp = data[i];
	    data[i] = data[j];
	    data[j] = temp;
	} 
	
	public static void main(String[] args) {
		int[] data = new int[]{3,1,23,8,4,6,7,776,879,29,3,434,56,878,9};
		quickSort(data);
		for (int i: data) {
			System.out.println(i);
		}
	}


}
