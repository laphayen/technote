### RestController

HTTP 요청과 매서드를 연결하는 라우터 역할을 하는 애너테이션입니다. pring MVC 기반의 웹 애플리케이션에서 RESTful한 웹 서비스를 개발 시 사용합니다. 해당 클래스는 RESTful 서비스의 엔드포인트를 처리하는 컨트롤러로 인식되며, 자동으로 HTTP 응답으로 변환되는 데이터를 반환할 수 있습니다.

```
@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "Hello, World!";
    }
}
```

@Controller와 @ResponseBody 애너테이션의 결합으로 @Controller가 HTML 페이지를 반환하지만 @RestController는 기본으로 JSON 형식 또는 설정으로 통해 XML 형식의 데이터를 반환합니다.