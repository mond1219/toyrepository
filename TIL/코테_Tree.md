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

# Tree
- 서로 연결도니 node의 계층형 자료구조, root와 부모-자식 관계의 subtree로 구성되어 있다.


### Binary Tree의 Node
```python
class Node:
  def __init__(self):
    self.value = 0
    self.left_child = None
    self.right_child = None
```
### Binary Tree 구현 
```python
class Node:
  def __init__(self):
    self.value = 0
    self.left_child = None
    self.right_child = None
class BinaryTree:
  def __inti__(self):
    self.root = None

bt = BinaryTree()
bt.root = Node(vale=1)
bt.root.left = Node(value = 2)
bt.root.rignt = Node(value = 3)
bt.root.left.left =  Node(value = 4)
bt.root.left.right = Node(value = 5)
bt.root.right.right = Node(value = 6)
```
