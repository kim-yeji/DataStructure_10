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

		this.swap(pivot, right);  //�� ������ ��ġ�� �Ǻ��� �ڽ��� ���� �ڸ��� ã�ư�����(�� �Ǻ��� �������� ����, ������ ������ �� ������)
		
		return right;
	}

	public void swap(int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public boolean add(int data) {
		if(this.size >= maxSize) { //���� ���س��� max������ Ŭ ��� false�� ��ȯ�Ѵ�.
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
	
	public void init() { //print�� �� ������ i�� �ʱ�ȭ �����ش�(�ε��� 0���� ����ϰ�)
		i = 0;
	}
}
