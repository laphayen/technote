package test;

public class Example {
	public static void main(String[] args) {
		int[] sourceArray = {1, 2, 3};
		int[] targetArray = new int[sourceArray.length];
		
		System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
		
		for (int value : targetArray) {
			System.out.print(value + " ");
		}
	}
}