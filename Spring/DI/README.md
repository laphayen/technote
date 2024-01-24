### DI (Dependency Injection)

스프링 프레임워크에서 제공하는 IoC를 구현하기 위해 사용하는 방법입니다. 객체 간의 의존성을 직접 코드 내에서 설정하는 것이 아니라 외부에서 주입하는 방식입니다.
@Autowired 어노테이션을 사용하면 스프링 IoC 컨테이너는 해당 클래스의 객체를 생성할 때, 의존성이 필요한 부분에 필요한 Bean을 주입해줍니다.

1. 생성자 주입(Constructor Injection)

객체의 생성자를 통해 의존성을 주입하는 방식입니다.
@Autowired 어노테이션을 사용해서 의존성을 주입합니다.
```
public class MyService {
    private final MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
```

2. Setter 주입(Setter Injection)

객체의 setter 메서드를 통해 의존성을 주입하는 방식입니다.
@Autowired 어노테이션을 사용해서 setter 메서드에 의존성을 주입합니다.

```
public class MyService {
    private MyRepository myRepository;

    @Autowired
    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
```

3. 필드 주입(Field Injection)

객체의 필드에 직접 의존성을 주입하는 방식입니다.
@Autowired 어노테이션을 사용해서 직접 필드에 의존성을 주입합니다.

```
public class MyService {
    @Autowired
    private MyRepository myRepository;
}
```