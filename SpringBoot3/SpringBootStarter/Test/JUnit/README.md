### JUnit

자바 언어를 위한 단위 테스트 프레임워크입니다. 테스트 방식을 구분할 수 있는 애너테이션을 제공합니다. @Test 애너테이션으로 메서드 호출할 때마다 새 인스턴스를 생성, 독립 테스트 가능합니다. 예상 결과를 검증하는 어설션 메서드 제공합니다. 사용 방법이 단순, 테스트 코드 작성 시간이 적고 자동 실행, 자체 결과를 확인하고 즉각적인 피드백을 제공합니다.

@DisplayName

테스트 이름을 명시합니다. 테스트 결과 보고서에서 테스트의 의도를 명확하게 파악할 수 있습니다. 테스트 메서드, 클래스의 이름이 길거나 의미가 명확하지 않을 때 사용합니다.
```
@DisplayName("JUnitTest 클래스 테스트")
public class JUnitTest {
    @DisplayName("덧셈 테스트")
    @Test
    public void addJunitTest () {
    }
}
```

@Test
테스트를 수행하는 메서드입니다. 애너테이션을 사용하는 매서드는 JUnit에 의해 테스트 메서드로 인식됩니다. 따라서 메서드의 이름이 test로 시작할 필요가 없습니다. @Test가 붙은 메서드는 독립적으로 실행됩니다.
```
public class JUnitTest {
    @DisplayName("덧셈 테스트")
    @Test
    public void addJunitTest () {
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(sum, a + b);
    }

    @DisplayName("뺄셈 테스트")
    @Test
    public void subJunitTest () {
        int a = 1;
        int b = 2;
        int sub = 3;

        Assertions.assertEquals(sub, a - b);
    }
}
```

assertEquals() 메서드

두 값이 동일한지를 확인합니다. 만약 두 값이 일치하지 않으면 테스트가 실패합니다. 다양한 형태로 오버로딩되어 여러 타입의 값을 비교합니다.
```
@DisplayName("JUnitTest 클래스 테스트")
public class JUnitTest {
    @DisplayName("덧셈 테스트")
    @Test
    public void addJunitTest () {
        MyMath math = new MyMath();
        int result = math.add(3, 5);

        // 오버로딩된 assertEquals 메소드 사용
        Assertions.assertEquals(8, result);

        // 문자열 비교
        Assertions.assertEquals("Hello", "Hello");

        // 부동소수점 비교 (오차범위 0.0000000000001)
        Assertions.assertEquals(3.14, 3.14, 0.0000000000001);
    }
}
```
```
// MyMath.java
public class MyMath {
    public int add(int a, int b) {
        return a + b;
    }
}
```

@BeforeAll

테스트 클래스 내의 모든 테스트 메서드가 실행되기 전에 한 번만 실행됩니다. 테스트 클래스의 초기화 작업이나 준비 작업을 수행하는 경우에 사용하고 인스턴스를 만들기 전에 메서드가 실행되어야 하기 때문에 static을 사용합니다.

@AfterAll

테스트 클래스 내의 모든 테스트 메서드가 실행된 후에 한 번만 실행됩니다. 전체 테스트가 완료된 후에 필요한 정리 작업을 수행하는 경우에 사용하고 인스턴스를 만들기 전에 메서드가 실행되어야 하기 때문에 statc을 사용합니다.

@BeforeEach

각각의 테스트 메서드가 실행되기 전에 매번 호출됩니다. 테스트 메서드가 실행되기 전에 초기화 작업을 수행합니다. 객체를 초기화 또는 필요한 값을 미리 넣을 경우에 사용합니다.

@AfterEach

각각의 테스트 매서드가 실행된 후에 매번 호출됩니다. 테스트 메서드가 실행된 후에 정리 작업을 수행합니다. 테스트 이후 특정 데이터를 삭제하는 경우에 사용합니다.