### Spring Data JPA

스프링 프레임워크의 일부인 스프링 데이터 프로젝트의 일부 입니다. Java Persistence API를 사용하여 데이터 액세스 레이어를 구현하는 도구입니다.

스프링 데이터의 인터페이스인 PagingAndSortingRepository를 상속받아 JpaRepository 인터페이스를 만듭니다.

JpaRepository 인터페이스를 만든 인터페이스에서 상속받고, 제네릭에는 관리할 <엔터티 이름, 엔터티 기본키의 타입>을 입력하면 기본 CRUD 메서드를 사용할 수 있습니다.


##### @Entity

객체를 JPA가 관리하는 엔티티로 지정합니다. 클래스와 실제 데이터베이스의 테이블을 매핑합니다.

name 속성을 사용하면 해당 값을 가진 테이블 이름과 매핑되고, 미지정 시 클래스 이름과 같은 테이블과 매핑됩니다.
```
import javax.persistence.Entity;

@Entity(name = "users")
public class User {

}
```

##### @NoArgsConstructor(access = AccessLevel.PROTECTED)

엔터티는 기본 생성자가 필요하고, 접근 제어자는 public 또는 protected로 지정합니다. @NoArgsConstructor 어노테이션을 사용하여 protected 접근 수준을 갖는 기본 생성자를 자동으로 생성합니다. 외부에서는 인스턴화할 수 없지만 하위 클래스에서는 인스턴스화할 수 있습니다.

##### @Id

엔터티 클래스의 주요 식별자(primary key)를 지정합니다. 
```
@Id
private Long id;
```

##### @GeneratedValue(strategy = GenerationType.IDENTITY)

기본키의 생성 방식을 결정합니다.

* AUTO: 선택한 데이터베이스 방언(dialect)에 따라 자동 선택합니다.(기본값)
* IDENTITY: 기본키 생성을 데이터베이스에 위임합니다.(= AUTO_INCREMENT)
* SEQUENCE: 데이터베이스 시퀀스를 사용해서 기본키를 할당하는 방법으로, 오라클에서 주로 사용합니다.
* TABLE: 키 생성 테이블을 사용해서 기본키를 할당하는 방법입니다.

##### @Column

데이터베이스의 컬럼과 필드를 매핑합니다. 

* name: 필드와 매핑할 컬럼 이름, 미지정 시 필드 이름으로 지정합니다.
* nullalbe: 필드에 null 허용 여부입니다. 미지정 시 true(nullable)입니다.
* unique: 해당 필드의 값이 유일한지 여부를 지정합니다. 미지정 시 false(non-unique)입니다.
* columnDefinition: 컬럼 정보 설정입니다. default 값을 줄 수 있습니다.