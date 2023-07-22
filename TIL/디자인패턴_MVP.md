## 1.9 MVP 패턴
- MVC로부터 파생되었으면 MVC에서 C에 해당하는 Controller가 presenter로 교체된 패턴
- 뷰와 프레젠터는 일대일 관계이기 때문에 MVC 패턴보다 더 강한 결합을 지닌 디자인 패턴이라고 볼 수 잇다.


### MVC와 MVP의 차이점?
- MVC 패턴에서는 Meodel과 view가 서로 연결되어 있어 의존 관계를 가지고 있다.
- MVP패턴은 Model과 View는 서로 연결되지 않고 Presenter를 통해서 변화를 알 수 있게 된다.
- 화면과 비즈니스 로직이 완전히 분리되면서 테스트가 용이
- 장점 : View와 Model을 분리시켜 MVC에서 하기 힘들었던 테스트가 용이
- 단점 : View와 Presenter의 의존관계가 강해지고 Controller 대신 Presenter가 복잡해짐

### MVP 패턴에서 뷰가 업데이트 되는 과정 
1. 사용자가 View에서 액션을 한다.
2. View는 Presenter에 액션이 들어왔다고 전달
3. Presenter는 View액션대로 Model이나 Service를 구성한다.
4. Update된 Presenter의 데이터를 View에 업데이트한다.

## 1.10 MVVM 패턴
- MVC의 C에 해당하는 컨트롤러가 View Model로 바뀐 패턴
- View Model : View를 더 추상화한 계층, MVC와는 다르게 커맨드와 데이터 바인딩을 가지는 것이 특징
- 뷰와 뷰 모델 사이읭 양방향 데이터 바인딩을 지원하면 UI를 별도의 코드 수정 없이 재사용할 수 있고 단위 테스팅하기 쉽다.

💚예시
Vue.js가 대표적인 MVVM패턴, watch와 computed 등으로 쉽게 반응형적인 값들을 구축할 수잇다. 
함수를 사용하지 않고 값 대입만으로도 변수가 변경되며 양방향 바인딩, html을 토대로 컴포넌트를 구축할 수 있는 장점
재사용 가능한 컴포넌트 기반으로 UI를 구축
   
