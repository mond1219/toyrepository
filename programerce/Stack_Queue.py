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
