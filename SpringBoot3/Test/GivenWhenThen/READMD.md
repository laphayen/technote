### Given - When - Then 패턴

테스트 케이스를 구성하는 데 사용되는 패턴입니다. 논리적으로 구조화하고 이해하기 쉽게 만들어주며, BDD(Behavior-Driven Development) 스타일의 테스트 작성에 자주 활용합니다.

```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testMyService() {
        // Given
        MyService myService = new MyService();

        // When
        String result = myService.processData("input");

        // Then
        assertEquals("output", result);
    }
}
```