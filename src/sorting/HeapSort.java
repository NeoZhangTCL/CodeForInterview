package sorting;

import dataStructure.Heap;

public class HeapSort {
	
	public static Heap<Integer> heap;
	
	public HeapSort(Integer[] data) {
		heap = new Heap<Integer>(data);
	}
	
	public void heapSort(){
		while (!heap.isEmpty()){
			System.out.println(heap.extractMin());
		}
	}
	
	public static void main(String[] args) {
		Integer[] data = new Integer[]{3, 7, 3, 1, 6, 9, 234, 2, 7652, 0, 3, 21123};
		HeapSort hs = new HeapSort(data);
		hs.heapSort();
	}

}
