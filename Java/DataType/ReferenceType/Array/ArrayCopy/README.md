#### Array Copy

배열은 자료구조 특성상 크기가 고정되어 있으므로 확장할 경우 새로운 공간을 추가하고 기존에 있던 항목들을 가져와야합니다.

자바에서 배열의 복사에는 다양한 방법이 있습니다. 배열이 참조 타입인 경우, 얕은 복사(shallow copy)가 됩니다. 원본 배열과 복사본 배열이 같은 객체를 참조하게 됩니다. 배열의 내부 객체가 변경되면 원본과 복사본 모두 영향을 받게 됩니다.

1. for 루프로 배열 요소 복사

원본 배열과 복사한 배열의 인덱스로 접근해서 원소를 복사하는 방법입니다.

```
for (int i = 0; i < sourceArray.length; i++) {
	targetArray[i] = sourceArray[i];
}
```

2. System.arraycopy() 메서드 사용

배열의 특정 범위의 요소들을 다른 배열로 복사할 때 유용합니다.

```
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

// src: 복사할 원본 배열
// srcPos: 원본 배열에서 복사를 시작할 위치(인덱스)
// dest: 복사된 요소들을 저장할 대상 배열
// destPos: 대상 배열에서 복사를 시작할 위치(인덱스)
// length: 복사할 요소의 개수
```

System.arraycopy() 메소드를 사용하는 방법과 주요 매개변수입니다.

```
System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
```

3. Arrays.copyOf() 메서드 사용

```
int[] targetArray = Arrays.copyOf(sourceArray, sourceArray.length);
```

4. clone() 메서드 사용

```
int[] targetArray = sourceArray.clone();
```