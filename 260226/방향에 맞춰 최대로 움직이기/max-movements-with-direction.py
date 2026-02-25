import sys

input = sys.stdin.readline

n = int(input())
num = [list(map(int, input().split())) for _ in range(n)]
move_dir = [list(map(int, input().split())) for _ in range(n)]
r, c = map(int, input().split())

dxs, dys = [-1, -1, 0, 1, 1, 1, 0, -1], [0, 1, 1, 1, 0, -1, -1, -1]

max_depth = float('-inf')

def backtracking(r, c, depth):
    global max_depth
    if depth > max_depth:
        max_depth = depth

    for i in range(1, n):
        nx = r + dxs[move_dir[r][c] - 1]*i
        ny = c + dys[move_dir[r][c] - 1]*i
        if 0 <= nx < n and 0 <= ny < n and num[nx][ny] > num[r][c]:
            backtracking(nx, ny, depth + 1)

backtracking(r-1, c-1, 0)
print(max_depth)

