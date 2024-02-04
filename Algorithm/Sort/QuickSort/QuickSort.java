package test;

public class Example {
	public static void main(String[] args) {
		int[] array = { 7, 2, 4, 5, 1, 6, 3 };
		
		System.out.println("Original Array: ");
		printArray(array);
		
		quickSort(array, 0, array.length - 1);
		
		System.out.println("Sorted Array: ");
		printArray(array);
	}
	
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(arr, low, high);
			
			quickSort(arr, low, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, high);
		}
	}
	
	static int partition (int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		
		swap(arr, i + 1, high);
		
		return i + 1;
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}