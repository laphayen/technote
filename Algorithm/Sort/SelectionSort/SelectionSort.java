package test;

public class Example {
	public static void main(String[] args) {
		int[] array = { 7, 2, 4, 5, 1, 6, 3 };
		
		System.out.println("Original Array: ");
		printArray(array);
		
		selectionSort(array);
		
		System.out.println("Sorted Array: ");
		printArray(array);
	}
	
	static void selectionSort(int[] arr) {
		int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
			int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
		}
		
	}
	
	static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}