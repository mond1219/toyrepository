# 재귀 Recursion

### 구성 요소 2가지 
- recurrence relation => 점화식
  - ex1) Factorial : f(n) = n * f(n-1)
  - ex2) Fibonacci sequence : f(n) = f(n-1) + f(n-2)
  - ex3) Pascal's Triangle f(n, m) = f(n-1, m-1) + f(n-1, m)
 
- base case
  - 더 이상 재귀호출을 하지 않아도 계산값을 반환할 수있는 상황(조건)을 말한다.
  - 모든 입력이 최종적으로 base case을 이용해서 문제를 해결할 수 있어야 한다.
  - base case가 무조건 있어야 재귀함수의 무한 루프를 방지할 수 있다.
