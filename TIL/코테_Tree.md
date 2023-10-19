출처 : https://www.nossi.dev/
------
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

# Traversal 트리 순회
- 트리순회 == 트리 탐색(search), 트리의 각 노드를 방문하는 과정
- 모든 노드를 한번 씩 방문해야 하므로 완전 탐색이라고도 불린다.
- 순회 방법으로는 너비 우선 탐색의 BFS와 깊이 우선 탐색의 DFS가 있다.

## 너비 우선 탐색 BFS
-level의 따라서 level별로 탐색한다. 

```python
def bfs(root):
  visited = []
  if root is None:
    return 0;
  q = deque()
  q.append(root)
  while q:
    cur_node = q.popleft()
    visited.append(cur_node.value)

    if cur_node.left:
      q.append(cur_node.left)
    if cur_node.right:
      q.append(cur_node.right)
  return visited

bfs(root)
```

## 깊이 우선 탐색 DFS

```python
def dfs(root):
  if root is None:
    return
  dsf(root.left)
  dfs(root.rignt)

dfs(root)
```
### 전위순회 preorder

```python
def preorder(cur_node):
  if cur_node is None:
    return
  print(cur_node.value)
  preorder(cur_node.left)
  preorder(cur_node.right)
preorder(root)
```
### 중위순회 inorder
- left 자식 전부 확인 한 후 left 자식이 없으면 현제 cur_node를 방문한다. 
```python
def inorder(cur_node):
  if cur_node is None:
    return
  inorder(cur_node.left)
  print(cur_node.value)
  inorder(cur_node.right)
inorder(root)
```
### 후위순회 postorder
```python
def postorder(cur_node):
  if cur_node is None:
    return
  postorder(cur_node.left)
  postorder(cur_node.right)
  print(cur_node.value)
postorder(root)
```

### LowestCommonAncestor
23.10.20 노씨님 풀이
```python
    def LCA(root, p, q):
        if root == None:
            return None
        left = LCA(root.left, p, q)
        right = LCA(root.right, p, q)

        if root == p or root == q:
            return root
        elif left and right:
            return root
        return left or right

    LCA([3, 5, 1, 6, 2, 0, 8, None, None, 7, 4], 6, 4)
```
















