#### Array Copy

자바에서 배열의 복사에는 다양한 방법이 있습니다. 배열이 참조 타입인 경우, 얕은 복사(shallow copy)가 됩니다. 원본 배열과 복사본 배열이 같은 객체를 참조하게 됩니다. 배열의 내부 객체가 변경되면 원본과 복사본 모두 영향을 받게 됩니다.

1. for 루프로 배열 요소 복사

```
for (int i = 0; i < sourceArray.length; i++) {
	targetArray[i] = sourceArray[i];
}
```

2. System.arraycopy() 메서드 사용

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