### Java NullPointerException

자바에서 NullPoinerException은 Runtime에서 발생하는 예외입니다.

데이터 타입(Data Type)에는 기본 타입과 참조 타입이 있는 데, 여기서 null인 참조 타입의 변수를 사용하면 발생하는 오류입니다. 메소드 호출 시 null 참조, 배열에서 null 참조, 객체 필드에서 null 참조, 메소드 반환 값이 null 참조 등 상황에서 발생할 수 있습니다.

1. 메소드 호출 시 null 참조하는 경우
```
package test;

public class Example {
    public static void main(String[] args) {
        String str = null;
        int length = str.length(); // NullPointerException
    }
}
```

2. 배열에서 null 참조하는 경우
```
package test;

public class Example {
    public static void main(String[] args) {
        String[] array = new String[5];
        String value = array[2];
        int length = value.length();
    }
}
```

3. 객체 필드에서 null 참조하는 경우
```
package test;

class Obj {
    String text;
}

public class Example {
    public static void main(String[] args) {
        Obj obj = new Obj();
        int length = obj.text.length();
    }
}
```

4. 메소드 반환 값이 null인 경우
```
package test;

public class Example {
    static String getString() {
        return null;
    }
    
    public static void main(String[] args) {
        String str = getString();
        int length = str.length();
    }
}
```

예제 코드처럼 null 초기화된 참조 변수를 사용하면 console 창에서 메시지를 확인할 수 있습니다.
```
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
    at test.Example.main(Example.java:6)
```

NullPointerException은 디버깅하기 어렵기 때문에 참조 타입 변수가 null인지 확인하고 처리하는 것이 중요합니다.
따라서, 다음 코드처럼 if문을 사용해서 null인지 체크할 수 있습니다.

```
package test;

public class Example {
    public static void main(String[] args) {
        String str = null;
        
        if (str != null) {
            int length = str.length();
        }
        else {
            System.out.print("NullPointerException!");
        }
    }
}
```