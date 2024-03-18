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

package test;

import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
		int[] originalArray = {1, 2, 3};
		int[] copiedArray = new int[5];
		
		for (int i = 0; i < originalArray.length; i++) {
			copiedArray[i] = originalArray[i];
		}
		
		System.out.println("복사된 배열:");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.println("copiedArray[" + i + "] = " + copiedArray[i]);
        }
	}
}