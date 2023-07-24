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
  - 복잡한 시스템으로부터 핵심적인 개념 또는 기능을 간추려 나타냄
  - ex) 강아지, 리트리버, 발큼, 털 많이 빠짐 등의 특징이 있다면, 특징 중 코드로 나타낼 때 일부분의 특징인 강아지, 리트리버만 뽑아내거나 더 간추려 나타내는 것
- 캡슐화 `encapsulation`
  - 객체의속성과 메서드를 하나로 묶고 일부를 외부에 감추어 은닉하는 것
- 상속성 `inheritance`
  - 상위 클래스의 특성을 하위 클래스가 이어받아서 재사용하거나, 추가, 확장하는것
  - 코드의 재사용 측면, 계층적인 관계 생성, 유지 보수성 측면에서 중요
- 다형성 `polymorphism`
  - 하나의 메서나 클래스가 다양한 방법으로 동작하는 것을 말함
  - ex) 오버로딩, 오버라이딩
    
  - 오버 로딩 `overloading`
    - 같은 이름을 가진 메서드를 여러 개 두는 것
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
    
