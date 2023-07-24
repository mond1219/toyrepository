## 2.2 객체지향 프로그래밍(Object-Oriented Programming)
- 객체들의 집합으로 프로그램의 상호 작용을 표현하며 데이터를 객체로 취급하여 객체 내부에 선언된 메서드를 활용
- 설계에 많은 시간이 소요, 처리 속도가 다른 프로그래밍 패러다임에 비해 상대적으로 느림
💚예시
``` javascript
const ret = [1, 2, 3, 4, 5, 11, 12]
class List {
  constructor(list) {
    this.list = list
    this.mx = list.reduece((max,num) => num > max ? num: max, 0)
  }
  getMax(){
    return this.mx
  }
}
const a = new List(ret)
console.log(a.getMax()) // 12
// List라는 클래스를 만들고 a라는 객체를만들 때 최대값을 추출해내는 메서드 만듬
```
### 객체지향 프로그래밍 특징
- 추상화 `abstarction`
  - 복잡한 시스템으로부터 핵심적인 `개념` 또는 `기능`을 간추려 나타냄
  - ex) 강아지, 리트리버, 발큼, 털 많이 빠짐 등의 특징이 있다면, 특징 중 코드로 나타낼 때 일부분의 특징인 강아지, 리트리버만 뽑아내거나 더 간추려 나타내는 것
- 캡슐화 `encapsulation`
  - 객체의속성과 메서드를 하나로 묶고 일부를 외부에 감추어 `은닉`하는 것
- 상속성 `inheritance`
  - 상위 클래스의 특성을 하위 클래스가 이어받아서 `재사용`하거나, `추가`, `확장`하는것
  - 코드의 `재사용` 측면, `계층`적인 관계 생성, 유지 보수성 측면에서 중요
- 다형성 `polymorphism`
  - 하나의 메서나 클래스가 다양한 방법으로 동작하는 것을 말함
  - ex) 오버로딩, 오버라이딩
    
  - 오버 로딩 `overloading`
    - `같은 이름`을 가진 메서드를 `여러 개` 두는 것
    - 메서드 타입, 매개변수의 유형, 개수 등으로 여러개 둘 수 있다.
    - 컴파일 중에 발생하는 `정적` 다형성이다.
    ``` java
    class Person {

      public void eat(String a) {
        System.out.println("I eat " + a);
      }

      public void eat(String a, String b) {
        System.out.println("I eat" + a +" and" + b);
      }
    }

    public class CalculateArea {

      public static void main(string[] args){
        Person a = new Person();
        a.eat("apple"); // I eat apple
        a.eat("tomato", "banana"); // I eat tomato and banana
      }
    }
    ```

    - 오버 라이딩 `overriding`
      - 상위 클래스로 부터 상속받은 메서드를 하위 클래스가 재정의
      - 런타임 중에 발생하는 `동적` 다형성

     ``` python
     class Animal:
       def bark(self):
         print("bark bark!)

     class Dog(Animal):
       def bark(self):
         print("mumul mumul")

     dog = new Dog()
     dog.bark() # mumul mumul
     ```

  ### 객체 지향 설계 원칙
  - SOLID 원칙을 지켜야한다.
  - S : 단일 책임 원칙(SRP, Single Responsibility Principle)
    - 모든 클랙스는 각각 하나으 책임만 가져야한다.
    - ex) A라는 로직이 존재하면 어떠한 클래스는 A에 관한 클래스여야하고 이를 수정한다고 해도 A와 관련된 수정   
  - O : 개방-폐쇄 원칙(OCP, Open Closed Principle)
    - 유지 보수 사항이 생긴다면 코드를 쉽게 확장할 수 있도록 하고 수정할 때는 닫혀 있어야한다.
    - 기존 코드는 잘 병경하지 않으면서 확장은 쉬워야함 
  - L : 리스코프 치환 원칙(LSP, Liskov Substitution Principle)
    - 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.
    - 클래스는 상속되기 마련이고 부모, 자식이라는 계층 관계가 생성, 이때 부모 객체에 자식 객체를 넣어도 시스템이 문제없이 돌아가게 만드는 것
    - ex) 범석 객체가 홍철 객체의 자식 계층일 때 범석 객체를 홍철 객체와 바꿔도 문제가 없어야 하는 것
  - I : 인터페이스 분리 원칙 (ISP, Interface Segregation Principle)
    - 하나의 일반적인 인터페이스 보다 구체적인 여러 개의 인터페이스를 생성 
  - D : 의존 역전 원칙(DIP, Dependency Inversion Principle)
    - 자신보다 변하기 쉬운 것에 의존하던 것을 추상화된 인터페이스나 상위 클래스를 두어 변하기 쉬운 것의 변화에 영향받지 않게 한다.
    - 상위 계층은 하위 계청의 변화에 대한 구현으로부터 독립해야 한다. 
    - ex) 타이어를 갈아끼울 수 있는 틀을 만들어 놓은 후 다양한 타이어를 교체할 수 있어야한다. 
     
    
