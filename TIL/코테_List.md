출처 : https://www.nossi.dev/ 
# 1. List
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


## 1.2 동적 배열 Dynamic array
- 선언 이후 size를 늘릴 수 있다.
- resizing : 선언한 static 배열보다 더 많은 값을 저장하게 되면 기존의 있던 배열보다 두배 더 큰 배열을 할당 받고 기존에 있던 값들을 옮겨 적는다
- 기존에 static 배열에 값을 저장하는 과정은 O(1)이지만 resizing하는 과정은 O(n)이다
- python의 list는 dynamic array로 되어 있고 growth pattern은 0, 4, 8, 16, 24, 32, 48, 52, 64, 76, ... 로 resize한다.

| access/update | Static | Dynamic |
| -------       | ---    | ---     |
| access/update | O(1)   | O(1)    |
| insert_back   | O(1)   | amortized O(1)|
| delete_back   | O(1)   | O(1)    |
| insert_at     | O(n)   | O(n)    |
| delete_at     | O(n)   | O(n)    |


# 2. Linked List

## 2.1 get()
``` python
class LinkedList(object):
  def __init__(self):
    self.head = None
  def get(self, idx):
    # 1. head에 접근
    current = self.head
    # 2. 원하는 인덱스로 이동
    for _ in range(idx):
       current = current.next
    # 3. value 반환
    return current.value
```

## 2.2 insert_at(idx, value)

``` python
class LinkedList(object):
  def __init__(self):
    self.head = None
  def insert(self, idx, value):
    # 1. head에 접근
    current = self.head
    for _ in range(idx):
       if _ == idx-1:
         new_node.next = current.next
         current.next = Node(value)
       current = current.next
```

## 2.3 remove_at(idx, value)

``` python
class LinkedList(object):
  def __init__(self):
    self.head = None
  def remove(self, idx, value):
    # 1. head에 접근
    current = self.head
    for _ in range(idx):
       if _ == idx-1:
         current.next = current.next.next
       current = current.next
```
## 2.4 insert_back(value) tail version O(1)

``` python
class LinkedList(object):
  def __init__(self):
    self.head = None
    self.tail = None
  def appned(self, value):
    new_node = Node(value)
    if self.head is None:
      self.head = new_node
      self.tail = new_node
    else: # O(1)으로 insert back을 한다.
      self.tail.next = new_node
      self.tail = self.tail.next
```


# 연결리스트 구현부

1. Linked List 자유자재로 구현 (선형 자료구조 + 중간에 데이터 추가/삭제 용이)
2. Tree or Graph에 활용

## step 1. 문제 이해하기
- input, output 확인
  - input 값의 특징 (정수인가? 값의 크기의 범위는? 마이너스도 되는건가? 소수인가? 자료형은 문자열인가? 등등)
  - output 값의 특징 (내가 어떤 값을 반환해줘야 하는지, 정해진 형식대로 반환하려면 어떻게 구현할지)

- input size N 확인
  - 시간복잡도를 계산하기 위한 input size N 또는 M이 무엇인지 확인
   
- 제약조건 확인
  - 시간복잡도 제한이 있는지 확인
  - 내가 선택할 수 있는 알고리즘이 무엇이 있는 지
   
- 예상할 수 있는 오류 파악
  - 상황을 가정하면서 예상할 수 있는 오류를 파악한다.
  - 입력값의 범위, stack overflow 등등

##  step 2. 접근 방법 (가장 어려워하는 부분)

- 직관적으로 생각하기
  - 보통 완전탐색으로 시작
  - 문제 상황을 단순화 하여 생각하기
  - 문제 상황을 극한화 하여 생각하기

- 자료구조와 알고리즘 활용
  - `문제이해`에서 파악한 내용을 토대로 어떤 자료구조를 사용하는게 가장 적합한지 결정
  - 대놓고 특정 자료구조와 알고리즘을 묻는 문제도 많음
  - 자료구조에 따라 선택할 수 있는 알고리즘을 문제에 적용

- 메모리 사용
  - 시간복잡도를 줄이기 위해 메모리를 사용하는 방법
  - 대표적으로 해시 테이블

### 문제 풀이 
``` python
class ListNode(object):
    def __init__(self, val= 0, next=None, prev=None):
        self.val = val
        self.next = next
        self.prev = prev


class BrowserHistory(object):
    def __init__(self, homepage):
        self.head = self.current = ListNode(val=homepage)

    def visit(self, url):
        self.current.next = ListNode(val=url, prev=self.current)
        self.current = self.current.next
        return None
    def back(self, steps):
        while steps > 0 and self.current.prev != None:
            steps -= 1
            self.current = self.current.prev
        return self.current.val
    def forward(self, steps):
        while steps > 0 and self.current.next != None:
            steps -= 1
            self.current = self.current.next
        return self.current.val




if __name__ == '__main__':
    browserHistory = BrowserHistory('leetcode.com')
    result = browserHistory.visit("google.com")
    print(result)
    result = browserHistory.visit("facebook.com")
    print(result)
    result = browserHistory.visit("youtube.com")
    print(result)
    result = browserHistory.back(1)
    print(result)
    result = browserHistory.back(1)
    print(result)
    result = browserHistory.forward(1)
    print(result)
    result = browserHistory.visit('linkedin.com')
    print(result)
    result = browserHistory.forward(2)
    print(result)
    result = browserHistory.back(2)
    print(result)
    result = browserHistory.back(7)
    print(result)
```







































