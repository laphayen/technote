package test;

public class Example {
	public static void main(String[] args) {
		int[] array = { 7, 2, 4, 5, 1, 6, 3 };
		
		System.out.println("Original Array: ");
		printArray(array);
		
		insertionSort(array);
		
		System.out.println("Sorted Array: ");
		printArray(array);
	}
	
	static void insertionSort(int[] arr) {
		int n = arr.length;
		
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}