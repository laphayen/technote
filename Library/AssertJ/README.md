### AssertJ

Java에서 사용되는 라이브러리입니다. JUnit과 함께 사용되어 테스트 코드를 작성하고 읽기 쉽고 유연하게 만들어줍니다. Fluent API 스타일을 채택하여 가독성이 뛰어나고, IDE의 자동 완성 기능을 지원합니다.

JUnit의 assertEquals, assertTure, assertFalse 등의 메소드 대신 간결하고 가독성이 높은 메서드를 사용할 수 있습니다.

* isEqualTo(A) - A값과 같은지 확인합니다.
* isNotEqualTo(A) - A값과 다른지 확인합니다.
* contains(A) - A값이 포함되어 있는지 확인합니다.
* doesNotContain(A) - A값이 포함되어 있지 않은지 확인합니다.
* startsWith(A) - A값이 시작하는지 확인합니다.
* endsWith(A) - A값이 끝나는지 확인합니다.
* isEmpty() - 빈 값인지 확인합니다.
* isNotEmpty() - 빈 값이 아닌지 확인합니다.
* isPositive() - 양수인지 확인합니다.
* isNegative() - 음수인지 확인합니다.
* isGreaterThan(A) - A보다 큰지 확인합니다.
* isLessThan(A) - A보다 작은지 확인합니다.