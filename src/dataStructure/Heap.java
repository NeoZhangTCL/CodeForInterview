package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Heap<T> {
	
	ArrayList<T> data;
	
	public Heap(){
		this.data = new ArrayList<T>();
	}
	
	public Heap(T[] data){
		this.data = new ArrayList<T>(Arrays.asList(data));
		int index = data.length/2;
		while(index != -1){
			heapify(index--);
		}
	}
	
	public boolean isEmpty(){
		return (data.size()==0);
	}
	
	public int size() {
		return data.size();
	}
		
	public T extractMin() {
		T rst = data.get(0);
		Collections.swap(data, 0, data.size()-1);
		data.remove(data.size()-1);
		if (!this.isEmpty()) heapify(0);
		return rst;
	}
	
	private void heapify(int index) {
		int left = index*2+1;
		int right = index*2+2;
		int smallest = index;
		if (left<data.size() && compareTo(data.get(smallest), data.get(left)) == 1) smallest = left;
		if (right<data.size() && compareTo(data.get(smallest), data.get(right)) == 1) smallest = right;
		Collections.swap(data, index, smallest);
		if (smallest != index) heapify(smallest); 
	}
	
	private int compareTo(T a, T b){
		if ((int)a < (int)b) return -1;
		if ((int)a > (int)b) return 1;
		return 0;
	}
}


