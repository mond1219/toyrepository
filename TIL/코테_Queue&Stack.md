출처 : https://www.nossi.dev/
---
# Queue
- 선입선출 FIFO(First In First Out)형식으로 데이터를 저장하는 자료구조
- queue의 rear(뒤)에 데이터를 추가하는 것을 enqueue라고 한다.
- queue의 front에서 데이터를 꺼내는 것을 dequeue라고 한다.

## List Queue
```python
# queue 선언
q = []
# enqueue 0(1)
q.append(1)
q.append(2)
q.append(3)
q.append(4)
# dequeue O(n)
q.pop(0)
q.pop(0)
q.pop(0)
```


## Linked List Queue
```python
from collections import deque
queue = deque()
# enqueue() O(1)
queue.append(1)
queue.append(2)
queue.append(3)
queue.append(4)
# dequeue() O(1)
queue.popleft()
queue.popleft()
queue.popleft()
```

# Stack
- Array List를 사용해도 push, pop으로 시간복잡도가 O(1)이라 가능하다.
- 시간 순선상 가장 최근에 추가한 데이터가 가장 먼저 나오는 후입선출 LIFO(Last In First Out)형식으로 데이터를 저장하는 자료구조
- stack의 top에 데이터를 추가하는 것을 push라고 하고 stack의 top에서 데이터를 추출 하는 것은 pop이라고 한다.

```python
# stack 선언
stack = []
# push O(1)
stack.append(1)
stack.append(2)
stack.append(3)
stack.append(4)
# pop O(1)
stack.pop()
stack.pop()
stack.pop()
```
