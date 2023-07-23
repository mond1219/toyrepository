# List
- [1, 2, 3] [3, 1, 2] `순서`만 바뀌어도 전혀 다른 List이다.

 - 1.1 Array List   
   - 1.1.1 Array   
   - 1.1.2 Dynamic Array   
- 1.2  Linked List   
  - 1.2.1 Node



## 1.1 배열
1. fixed-size
2. 순차적인 데이터 저장(order)

- 배열은  `선언시`에 size를 정하여 해당 size만큼의 연속된 메모리를 할당 받아 data를 연속적/순차적으로 저장하는 자료구조

  ``` c
  int arr[5] = {3,7,4,2,6} // sieze가 5인 int형 배열 선언
  ```
- arr은 size는 5로 정했기 때문에 int형 데이터(4 byte) 5개 저장할 메모리 공간인 20Byte를 미리 할당
- 고정된 size를 갖기 때문에 static array라고 한다.
- `Random access` or `Direct access`
  - 메모리에 저장된 데이터에 접금하려면 주소값을 알아야한다. 배열 변수 == 첫 번째 주소값
  - 배열은 연속적/순차적으로 저장되어 있기 때문에 첫 주소값만 알고 있따면 어떤 index에도 즉시 접근 가능
  - 그러므로 긴 배열이더라도 한번의 연산으로 원하는 데이터에 바로 접근 == O(1) 시간복잡도
  - linked list는 메모리상에서 연속적, 순차적 저장 X 이므로 random access는 불가능 == O(n) 시간복잡도
- `static array` 한계
  - 데이터가 정해져 있으면 효율적이지만 선언보다 많은 데이터를 저장해야 할 때는 비효율적
  - 매번 크기가 엄청 큰 배열을 선언하면 메모리 비효율, 이런 문제점 해결은 `dynamic array`
