import sys

input = sys.stdin.readline

n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]
visited = [[False]*n for _ in range(n)]
count = 0
count_list = []
vil_count = 0

def dfs(x, y):
    global count
    visited[x][y] = True
    dxs = [0, 1, 0, -1]
    dys = [-1, 0, 1, 0]
    for dx, dy in zip(dxs, dys):
        nx = x + dx
        ny = y + dy
        if canGo(nx, ny):
            count += 1
            dfs(nx, ny)

def inRange(x, y):
    return 0 <= x < n and 0 <= y < n
def canGo(x, y):
    return inRange(x, y) and grid[x][y] == 1 and not visited[x][y]

for i in range(n):
    for j in range(n):
        if canGo(i, j):
            count = 1
            dfs(i, j)
            count_list.append(count)
            vil_count += 1

count_list.sort()
print(vil_count)
for incount in count_list:
    print(incount, sep= "\n")