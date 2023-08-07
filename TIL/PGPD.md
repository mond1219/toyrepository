# 2 프로그래밍 패러다임(programming paradigm)
- 프로그래머에게 프로그래밍의 관점을 갖게 해주는 역할을 하는 개발 방법론   

💚예시   
  
  객체지향 프로그래밍 : 프로그래머들이 프로그램을 상호 작용하는 객체들의 집합으로 볼 수 있게 한다.   
  
  함수형 프로그래밍 : 상태 값을 지니지 않는 함수 값들의 연속으로 생각할 수 있게 해준다.   
  
  jdk 1.8 이전의 자바는 객체지향 프로그래밍을 지원하는 반명, 하스켈은 함수형 프로그래밍을 지원   
  
  여러 패라다임을 지원하는 언어 : C++, 파이썬, 자바스크립트   
  
  자바는 jdk 1.8부터 함수형 프로그래밍 패러다임을 지원하기 위해 람다식, 생성자 레퍼런스, 메서드 레퍼런스를 도입했고 선언형 프로그래밍을 위해 Stream같은 표준 API등을 추가

  ### Programing Paradigm
  - 선언형
    - 함수형   
  - 명령형
    - 객체지향형
    - 절차지향형
   
## 2.1 선언형과 함수형 프로그래밍

### Declarative Programming(선언형)
- `무엇을` 풀어내는가에 집중하는 패러다임, `프로그램은 함수로 이루어진 것이다`라는 명제가 담겨 있다.

### Functional Programming(함수형)
- 선언형의 일종, 자연수로 이루어진 배열에서 최대값을 찾으라고 한다면 다음과 같이 로직을 구성

``` javascript
const ret = [1, 2, 3, 4, 5, 11, 12]
.reduce((max, num) => num > max ? num : max, 0) // reduece()는 '배열'만 받아서 누적한 결과값을 반환하는 순수 함수
console.log(ret) //12
```
- 위와 같이 작은 `순수 함수`들을 블록처럼 쌓아 로직을 구현하고 `고차 함수`를 통해 재사용성을 높은 프로그래밍 패러다임이다.
- 자바스크립트는 단순하고 유연한 언어이며, 함수가 일급 객체이기 때문에 객체지향 프로그래밍보다는 함수형 프로그래밍 방식이 선호된다.

  ### 순수 함수
  - 출력이 입력에만 의존하는 것
  ``` javascript
  const pure = (a, b) => {
    return a + b
  }
  ```
  pure 함수는 들어오는 매개변수 a, b에만 영향을 받는다. a,b 말고 달느 전역변수 c 등이 이 출력에 영향을 주면 순수함수가 아니다.

  ### 고차 함수
  - 함수가 함수를 값처럼 매개젼수로 받아 로직을 생성할 수 있는 것
  - 고차 함수를 쓰기 위해서는 해당 언어가 일급 객체라는 특징을 가져야 한다.
    
  💚`일급 객체`
  - 변수나 메서드에 함수를 할당할 수 있다.
  - 함수 안에 함수를 매개변수로 담을 수 있다.
  - 함수가 함수를 반환할 수 있다. 
  