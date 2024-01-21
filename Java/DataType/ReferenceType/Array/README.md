### 배열 타입

자바에서 배열은 동일한 데이터 타입의 여러 값을 저장하는 데 사용되는 자료 구조입니다. 고정된 크기를 가지고, 인덱스를 통해 각 요소에 접근할 수 있습니다. 인덱스의 번호는 0번부터 시작합니다.

1. 배열의 선언

배열을 사용하기 위해 데이터타입[] 변수이름; 데이터타입 변수[]; 형식으로 선언합니다.
```
int[] numbers1;
```
```
int numbers2[];
```

2. 배열의 생성

배열은 참조 변수로 배열 변수는 스택 영역에 생성되고 힙 영역에 생성되는 배열 객체를 참조합니다. 배열의 생성은 배열 리터럴과 new 연산자를 통해서 생성합니다.

배열 리터럴을 사용하면 배열을 생성하고 값을 할당하는 작업을 한 줄로 간편하게 수행할 수 있습니다.
```
int[] numbers = {1, 2, 3, 4, 5};
```
배열 변수를 먼저 선언한 후, 배열 리터럴로 생성하는 것은 컴파일 에러를 발생시킵니다.
```
String[] names2;
names = {"code"}; // Array constants can only be used in initializers
```

new 키워드를 사용하면 배열을 힙 영역에 동적으로 생성하고 해당 배열에 대한 메모리가 할당됩니다. 배열을 생성 시 배열의 타입과 크기를 지정합니다.
```
int[] numbers = new int[5];
```

3. 배열의 초기화

값을 할당하여 배열을 초기화할 수 있습니다. 배열을 선언하면서 동시에 값을 할당하는 방법입니다. 배열 리터럴을 사용하면 생성과 동시에 초기화합니다.
```
int[] numbers3 = {1, 2, 3, 4, 5};
```

new 연산자와 { }를 사용해서 생성과 동시에 초기화합니다.
```
Stringp[] names = new String[]{"codeomni", "tistory"};
```

null로 초기화해서 어떤 객체도 참조하지 않을 수 있습니다.
```
int[] nullArray1 = null;
```
```
int[] nullArray2 = new int[3];
nullArray2 = null;
```

4. 배열의 요소 

자바에서 배열의 요소에 접근은 변수이름[인덱스 번호]입니다. 배열의 인덱스는 0부터 시작하고 배열의 길이보다 작습니다. 특정 요소의 값 변경은 해당 요소의 인덱스를 사용해서 새 값을 할당하면 됩니다.
```
numbers[2] = 7;
```

5. 배열의 길이

자바에서 배열의 길이는 length 속성을 사용하면 구할 수 있습니다. 생성 시 배열의 크기를 지정하면 length 속성은 해당 배열의 크기를 가집니다.
```
int[] numbers = new int[3];
int length = numbers.length;
System.out.println("배열의 길이: " + length);
```
배열이 null인 경우에 length 속성을 사용하면 NullPointerException이 발생합니다.
```
int[] nullArray = null;
int length = nullArray.length;
System.out.println(length); // NullPointerException 발생
```