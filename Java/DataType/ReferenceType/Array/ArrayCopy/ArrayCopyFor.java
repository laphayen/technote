package test;

public class Example {
	public static void main(String[] args) {
		int[] sourceArray = {1, 2, 3};
		int[] targetArray = new int[sourceArray.length];
		
		for (int i = 0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
		}
		
		for (int value : targetArray) {
			System.out.print(value + " ");
		}
	}
}