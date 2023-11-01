출처 : https://www.nossi.dev/
------
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

### Number Of Islands 문제  
- 23.10.29 DFS 내 풀이
```python
    def NumberOfIslandsDFS(graph, visitSet):
        landCount = 0
        for yRow, yValue in enumerate(graph):
            for xRow, xValue in enumerate(yValue):
                if graph[yRow][xRow] == '1' and (yRow, xRow) not in visitSet:
                    landCount += 1
                    queue = deque()
                    queue.append((xRow, yRow))
                    visitSet.add((xRow, yRow))
                    while queue:
                        cur_x, cur_y = queue.popleft()
                        if (cur_y, cur_x+1) not in visitSet and len(yValue) > cur_x +1 and graph[cur_y][cur_x+1] == '1':
                            queue.append((cur_x+1, cur_y))
                            visitSet.add((cur_x+1, cur_y))
                        if (cur_y+1, cur_x) not in visitSet and len(graph) > cur_y+1 and graph[cur_y+1] == '1':
                            queue.append((cur_x, cur_y+1))
                            visitSet.add((cur_x, cur_y+1))
        return landCount
# grid = [
#         ['1', '1', '1', '1', '0'],
#         ['1', '1', '0', '1', '0'],
#         ['1', '1', '0', '0', '0'],
#         ['0', '0', '0', '0', '0'],
#     ]
grid = [
        ['1', '1', '0', '0', '0'],
        ['1', '1', '0', '0', '0'],
        ['0', '0', '1', '0', '0'],
        ['0', '0', '0', '1', '1'],
    ]
NumberOfIslandsDFS(grid, set())
```
- 23.10.30 노씨 풀이
```python
def numIslands_BFS(grid):
    number_of_islands = 0
    m = len(grid)
    n = len(grid[0])
    visited = [[False]*n for _ in range(m)]
    def bfs(x, y):
        # 상하좌우로 이동
        dx = [-1, 1, 0, 0]
        dy = [0, 0, -1, 1]
        visited[x][y] = True
        queue = deque()
        queue.append((x, y))
        while queue:
            cur_x, cur_y = queue.popleft()

            for i in range(4):
                next_x = cur_x + dx[i]
                next_y = cur_y + dy[i]
                if next_x >= 0 and next_x < m and next_y >= 0 and next_y < n : # 방문하면 안되는 좌표
                    if grid[next_x][next_y] == '1' and not visited[next_x][next_y] :# and 물인곳 방문 X and 방문했던곳 방문 X :
                        visited[next_x][next_y] = True
                        queue.append((next_x, next_y))


    for i in range(m):
        for j in range(n):
            if grid[i][j] == '1' and not visited[i][j]:
                bfs(i, j)
                number_of_islands += 1
    return number_of_islands
```

### Shortest Path In Binary Matrix 문제 
- 23.11.01 노씨 풀이
```python
    def shortestPathInBinaryMatrix(grid):
        shortest_path_len = -1
        row = col = len(grid)
        if grid[0][0] == 1 or grid[row-1][col-1] == 1:
            return shortest_path_len

        queue = deque()
        queue.append((0,0, 1))

        delta = [(1, 0), (-1, 0), (0, 1), (0, -1),
                 (1, 1), (1, -1), (-1, 1), (-1, -1)]
        visited = [[False] * col for _ in range(row)]
        visited[0][0] = True
        while queue:
            cur_r, cur_c, cur_len = queue.popleft()
            # 목적지에 도착했을 때 그때의 cur_len를 shortest_path_len에 저장하면 된다.
            if cur_r == row-1 and cur_c == col -1:
                shortest_path_len = cur_len
                break

            # 연결되어 있는 vertex 확인하기
            for dr, dc in delta:
                next_r = cur_r + dr
                next_c = cur_c + dc
                if next_r >= 0 and next_r < row and next_c >= 0 and next_c < col:
                    if grid[next_r][next_c] == 0 and not visited[next_r][next_c]:
                        queue.append((next_r, next_c, cur_len+1))
                        visited[next_r][
```


















