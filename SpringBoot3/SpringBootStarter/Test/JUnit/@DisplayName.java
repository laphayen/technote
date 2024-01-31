import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnitTest 클래스 테스트")
public class JUnitTest {
    @DisplayName("덧셈 테스트")
    @Test
    public void addJunitTest () {
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(sum, a + b);
    }
}