#프로그래머스 Stack Queue 문제 풀이 
# Queue를 사용하려면 from collections import deque 를 반드시 해주어야한다. 

# 같은 숫자는 싫어
# https://school.programmers.co.kr/learn/courses/30/lessons/12906
from collections import deque

def hateSameNumber(arr):
    queue = deque()
    queue.append(arr[0])
    for now in arr:
        quePOP = queue.pop()
        if now != quePOP:
            queue.append(quePOP)
        queue.append(now)
    return list(queue)

# 기능 개발 
# https://school.programmers.co.kr/learn/courses/30/lessons/42586

import math
def functionDev(progresses, speeds):
    answer = []
    cnt = 0
    day = 0
    for idx, num in enumerate(progresses):
        if num + speeds[idx] * day >= 100:
            cnt += 1
        else:
            if cnt > 0: # 현재까지 계산한 것 Answer에 담아주기
                answer.append(cnt)

            # 지금 num의 day 계산해주기
            leftNum = 100 - num - day*speeds[idx] # 계산해야하는 progresse
            day = day + math.ceil(leftNum/speeds[idx])
            cnt = 1 # 1로 초기화 해주기

    answer.append(cnt) # 마지막 배포하는 기능 개수 담아주기
    return answer

# 올바른 괄호
# https://school.programmers.co.kr/learn/courses/30/lessons/12909
from collections import deque

def correctGwalho(s):
    queue = deque()
    for now in s:
        if now == '(':
            queue.append(now)
        elif len(queue) <= 0:
            return False
        else:
            queue.popleft()


    if  len(queue) != 0:
        return False
    return True

# 프로세스
# https://school.programmers.co.kr/learn/courses/30/lessons/42587
def process(priorities, location):
    standard = priorities.copy()
    standard.sort(reverse=True)
    queue = deque()
    for idx, now in enumerate(priorities):
        if location == idx:
            queue.append((now, True))
        else:
            queue.append((now, False))
    idx = 0
    while queue:
        now, check = queue.popleft()
        if now == standard[0]:
            idx += 1
            standard.pop(0)
            if check:
                return idx
        else:
            queue.append((now, check))

# 주식 가격 
# https://school.programmers.co.kr/learn/courses/30/lessons/42584
def price(prices):
    print(prices)
    answer = [ _ for _ in range(len(prices)-1, -1, -1)]
    queue = deque()
    for idx, now in enumerate(prices):
        while queue:
            before_idx, before_value = queue.popleft()
            if now < before_value:
                answer[before_idx] = idx-before_idx
            else:
                queue.appendleft((before_idx, before_value))
                break
        queue.appendleft((idx, now))

    return answer

# 다리를 지나는 트럭 
# https://school.programmers.co.kr/learn/courses/30/lessons/42583
```python 
    def bridgeTruck(bridge_length, weight, truck_weights):

        bridge = [0 for _ in range(bridge_length)]
        cnt = 0
        now_weight = 0
        while bridge:
            cnt += 1
            now_weight -= bridge.pop(0)
            if truck_weights:
                if now_weight + truck_weights[0] <= weight:
                    t = truck_weights.pop(0)
                    now_weight += t
                    bridge.append(t)
                else:
                    bridge.append(0)

        return cnt
```
