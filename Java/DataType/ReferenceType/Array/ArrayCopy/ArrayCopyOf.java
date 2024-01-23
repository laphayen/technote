package test;

import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
		int[] sourceArray = {1, 2, 3};
		
		int[] targetArray = Arrays.copyOf(sourceArray, sourceArray.length);
		
		for (int value : targetArray) {
			System.out.print(value + " ");
		}
	}
}