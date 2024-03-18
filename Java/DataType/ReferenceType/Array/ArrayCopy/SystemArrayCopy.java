package test;

public class Example {
	public static void main(String[] args) {
		int[] originalArray = {1, 2, 3};
		int[] copiedArray = new int[5];
		
		System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
		
		System.out.println("복사된 배열:");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.println("copiedArray[" + i + "] = " + copiedArray[i]);
        }
	}
}

public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
// src: 복사할 원본 배열
// srcPos: 원본 배열에서 복사를 시작할 위치(인덱스)
// dest: 복사된 요소들을 저장할 대상 배열
// destPos: 대상 배열에서 복사를 시작할 위치(인덱스)
// length: 복사할 요소의 개수