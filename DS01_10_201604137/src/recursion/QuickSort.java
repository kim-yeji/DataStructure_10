package recursion;

import java.util.Arrays;

public class QuickSort {
	private int[] array;
	private int size=0,i=0;
	private int maxSize;

	public QuickSort(int size) {
		this.maxSize = size;
		this.array = new int[maxSize];
	}

	public void sorting() {
		this.quickSortRecursively(0, maxSize - 1);
	}

	public void quickSortRecursively(int left, int right) {
		if (left < right) {
			int mid = partition(left, right);
			this.quickSortRecursively(left, mid-1);
			this.quickSortRecursively(mid+1, right);
		}
	}

	public int partition(int left, int right) {
		int pivot = left;
		int data = this.array[pivot];
		right++;
		do {
			while (array[--right] > data) {}

			while (array[left] <= data && left < right) {
				left++;
			}
			
            swap(left, right);

		} while (left < right);

		this.swap(pivot, right);  //이 구간을 거치면 피봇은 자신의 순서 자리를 찾아간것임(그 피봇을 기준으로 왼쪽, 오른쪽 구간을 또 나눈다)
		
		return right;
	}

	public void swap(int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public boolean add(int data) {
		if(this.size >= maxSize) { //내가 정해놓은 max값보다 클 경우 false를 반환한다.
			return false;
		}
		else {
			array[size++]=data;
			return true;
		}
	}
	
    public int getFirst() {
        return array[0];
    }

    public int getNext() {
        return array[++i];
    }

	public int size() {
		return this.size;
	}
	
	public void init() { //print를 할 때마다 i를 초기화 시켜준다(인덱스 0부터 출력하게)
		i = 0;
	}
}
