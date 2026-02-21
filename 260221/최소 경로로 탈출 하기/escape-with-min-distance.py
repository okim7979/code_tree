import sys
from collections import deque

input = sys.stdin.readline


n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
visited = [[-1]*m for _ in range(n)]
q = deque()

def bfs():
    q.append([0, 0])
    visited[0][0] += 1
    while q:
        x, y = q.popleft()
        dxs, dys = [0, 1, 0, -1], [1, 0, -1, 0]
        for dx, dy in zip(dxs, dys):
            nx, ny = x + dx, y + dy
            if canGo(nx, ny):
                q.append([nx, ny])
                visited[nx][ny] = visited[x][y] + 1


def inRange(x, y):
    return 0 <= x < n and 0 <= y < m

def canGo(x, y):
    return inRange(x, y) and grid[x][y] == 1 and visited[x][y] == -1

bfs()

print(visited[n-1][m-1])