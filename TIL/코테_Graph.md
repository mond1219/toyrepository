# Graph
- 그래프 G(V,E)는 어떤 자료나 개념을 표현하는 정점(vertex)들의 집합 V와 이들을 연결하는 간성(edge)들의 집합 E로 구성된 자료구조

## 그래프 종류
1. 방향 그래프 VS 무향 그래프(코테에 가장 많이 등장)
2. 다중 그래프 VS 단순 그래프
3. 가중치 그래프 => 다익스트라

## 그래프 활용  
현실 세계의 사물이나 추상적인 개념 간의 연결 관계를 표현한다.  
그래프는 현실의 문제를 해결하기 위한 도구로써 유용하게 이용 된다. => 문제가 많이 나온다.
- 도시들을 연결하는 도로망 : 도시(vertex), 도로망(edge)
- 지하철 연결 노선도 : 정거장(vertex), 정거장을 연결한 선(edge)
- 컴퓨터 네트워크 : 각 컴퓨터와 라우터(vertex), 라우터간의 연결관계(edge)

## 그래프 표현 방법

### 인접 리스트(adjacency list)
### 인접 행렬(adjacency matrix)
이중 행렬을 사용 
대칭이 된다. (1번과 3번이 연결된다면, 3번도 1번과 연결되기때문에 대칭이 될 수 밖에 없다.) 
```
graph = [  
          [0, 0, 1, 0, 1],   //1번 vertex랑 연결된 목록을 작성
          [0, 0, 0, 1, 1],  
          [1, 0, 0, 0, 1],  
          [0, 1, 0, 0, 1],  
          [1, 1, 1, 1, 0],  
          ]
```
### 암시적 그래프(implicit graph)
미로문제에서 vertex값을 이중행렬로 표시  
1은 벽이고 0은 통로이다.
```
graph = [  
          [1, 1, 1, 1, 1],   
          [0, 0, 0, 1, 1],  
          [1, 1, 0, 1, 1],  
          [1, 0, 0, 0, 1],  
          [1, 1, 1, 1, 1],  
          ]
```

## 그래프 순회 Traversal
- 그래프 탐색(search)라고도 불리며, 그래프의 각 정점을 방문하는 과정
- 순회에는 크게 깊이 우선 탐색 (Depth-First Search)와 너비 우선 탐색(Breadth-First Search)가 존재

### 너비 우선 탐색 BFS, Breadth-First search 

```python
graph = {
          'A' : ['B', 'D', 'E'],
          'B' : ['A', 'C', 'D'],
          'C' : ['B'],
          'D' : ['A', 'B'],
          'E' : ['A']
}

# BFS로 구현
from collections import deque

def bfs(graph, start_v):
    visit = [start_v]
    queue = deque(start_v)
    while queue:
        cur_v = queue.popleft()
        for v in graph[cur_v]:
            if v not in visit:
                visit.append(v)
                queue.append(v)
    return visit

bfs(graph, 'A')
```
### 깊이 우선 탐색 DFS, Depth-first search 

```python
graph = {
          'A' : ['B', 'D', 'E'],
          'B' : ['A', 'C', 'D'],
          'C' : ['B'],
          'D' : ['A', 'B'],
          'E' : ['A']
}

# DFS로 구현
def dfs(graph, cur_v, visited = []);
    visited.append(cur_v)
    for v in graph[cur_v]:
        if v not in visited:
            visited = dfs(graph, v, visited)
    return visited
dfs(graph, 'A')
```




















