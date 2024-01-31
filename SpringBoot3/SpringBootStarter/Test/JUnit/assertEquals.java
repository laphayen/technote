import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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