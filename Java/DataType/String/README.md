### String 타입

자바에서 문자열은 String 데이터 타입으로 사용합니다. 내장 클래스로 java.lang 패키지에 포함되어 있습니다.

1. String 생성

문자열 변수의 생성은 String 클래스를 사용합니다.
```
String name;
```

2. String 문자열 대입

생성한 String 변수에 ""(큰따옴표)를 사용해서 문자 리터럴을 넣습니다. 이 때 주의할 것은 원하는 이름으로 지정한 변수는 스택 영역에 생성되고 ""(큰따옴표)으로 된 문자열 리터럴은 힙 영역에 String 객체로 생성됩니다. 스택영역의 변수가 힙 영역의 String 객체를 참조하고 있습니다.
```
String name = "codeomni";
```

3. String 생성과 동시에 참조

String 변수도 생성과 동시에 객체를 참조할 수 있습니다.
```
String name = "codeomni";
```

4. new 연산자 객체 

new 연산자를 사용해서 String 객체를 생성할 수 있습니다.
```
String name = new String("codeomni");
```

5. 문자열 비교

동일한 문자열 리터럴을 = 을 사용해서 생성하면 힙(heap) 영역에 있는 같은 String 객체를 참조하게됩니다. 반면에, new 연산자로 동일한 문자열 리터럴을 생성하는 경우는 힙 영역에 String 객체를 추가로 생성하게됩니다.

== 비교 연산자의 결과로 =으로 생성한 경우 true, new으로 생성한 경우 false가 반환됩니다.
생성된 객체에 상관없이 문자열의 내용을 비교하기 위해서는 equals() 메서드를 사용합니다.
```
String name1 = "codeomni";
String name2 = "codeomni";
String name3 = new String("codeomni");
    	
System.out.println(name1 == name2);		  // true
System.out.println(name1 == name3);		  // false
System.out.println(name1.equals(name3));  // true
```

6. null 사용

String 타입의 변수가 null으로 지정된 경우에 문자열을 참조하지 않는 상태입니다. 메모리에서 문자열 객체에 대한 참조가 끊어진 것으로 가비지 컬렉터(Garbage Collor)가 자동 제거합니다.
null인 String 변수를 사용할 경우 NullPointerException이 발생합니다.

NullPointerException에 대한 정보는 아래 링크를 참조해주세요.

* [github](https://github.com/laphayen/technote/tree/main/Java/Exception/NullPointerException)
* [codeomni](https://codeomni.tistory.com/964)

```
String name = null;
```