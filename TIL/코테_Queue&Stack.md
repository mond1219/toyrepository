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
### valid Parentheses 문제 
23.10.05 풀이 temp를 리스트로 바꿔 주어야한다.   
23.10.06 temp -> stack으로 바꿔주고 사용자 입력 값을 inputList로 바꿔주었다. 

```python
    class LifoFirst(object):
        def __init__(self, input):
            self.inputList = list(input)
    
        def check(self):
            stack = []
            for str in self.inputList:
                if str == '(' or str == '{' or str == '[':
                   stack.append(str)
                elif len(stack) == 0:
                    return False
                elif str == ')' and stack.pop() != '(':
                    return False
                elif str == '}' and stack.pop() != '{':
                    return False
                elif str == ']' and stack.pop() != '[':
                    return False
            return not stack
    if __name__ == '__main__':
        lifo = LifoFirst('([]}')
        print(lifo.check())
```

### Dayly Temperatures 문제 
23.10.07 시간복잡도가 O(n^2)으로 복잡하다. 
```python
    class DailyTemperatures(object):
        def check(self, temperatures):
            output = []
            for idx, temp in enumerate(temperatures):
                for cnt in range(idx+1,len(temperatures)):
                    if temp < temperatures[cnt]:
                        output.append(cnt-idx)
                        break
    
                if len(output)-1 < idx:
                    output.append(0)
            return output
    
    
    
    if __name__ == '__main__':
        temperatures = [30, 40, 50, 60]
        daily = DailyTemperatures()
        print(daily.check(temperatures))
```

