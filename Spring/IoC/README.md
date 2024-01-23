### IoC(Inversion of Control)

객체의 생성과 의존성 주입을 컨테이너가 담당하는 디자인 패턴입니다. 개발자가 직접 객체를 생성하고 의존성을 주입하지 않고, 스프링 IoC 컨테이너가 객체의 생명주기를 관리하고 필요한 의존성을 주입합니다.
스프링에서 IoC의 주요 구현체로 스프링 컨테이너가 있습니다. 객체의 생성, 관리, 의존성 주입을 담당합니다.

1. IoC 구현 방식

Bean Factory

> 기본적인 IoC 컨테이너입니다. 객체의 생성과 의존성 주입을 담당합니다. XML 기반 또는 어노테이션을 사용해서 객체의 메타데이터를 설정하고, 컨테이너가 이를 기반으로 객체를 생성합니다.

Application Context

> Bean Factory를 확장한 개념입니다. AOP(Aspect-Oriented Programming), 이벤트 처리, 메시지 소스, 국제화 등 다양한 기능을 지원합니다. XML, 어노테이션, 자바 설정 클래스 등 다양한 방식으로 객체의 설정을 지원합니다.

2. IoC 구성 요소

Bean

> 스프링 컨테이너에 의해 관리되는 객체입니다. 일반적으로 Java 클래스로 표현되며, IoC 컨테이너에 등록되어야 합니다.

Bean Definition

> Bean의 메타데이터로, 컨테이너에게 해당 Bean을 어떻게 생성하고, 어떤 의존성을 주입할지를 알려줍니다.
XML, 어노테이션, 자바 설정 클래스 등을 통해 정의합니다.

Container

> Bean 관리하고 생성하는 환경 또는 컨테이너를 의미합니다.
스프링에서 Bean Factory와 Application Context가 컨테이너 역할을 합니다.

ApplicationContext

> IoC 컨테이너의 종류로 Bean Factory를 확장한 개념입니다. 넓은 범위의 애플리케이션 컨텍스트를 지원합니다.