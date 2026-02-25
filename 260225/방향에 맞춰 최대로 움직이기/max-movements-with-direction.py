import sys

input = sys.stdin.readline

n = int(input())
num = [list(map(int, input().split())) for _ in range(n)]
move_dir = [list(map(int, input().split())) for _ in range(n)]
r, c = map(int, input().split())

dxs, dys = [-1, -1, 0, 1, 1, 1, 0, -1], [0, 1, 1, 1, 0, -1, -1, -1]

max_depth = float('-inf')

num_list = []

def inRange(r, c):
    return 0 <= r < n and 0 <= c < n
def canGo(r, c, pre_num):
    return inRange(r, c) and num[r][c] > pre_num

def backtracking(r, c):
    global max_depth
    max_depth = max(max_depth, len(num_list))
    for i in range(1, n):
        nx = r + dxs[move_dir[r][c] - 1]*i
        ny = c + dys[move_dir[r][c] - 1]*i
        if canGo(nx, ny, num[r][c]):
            num_list.append(num[nx][ny])
            backtracking(nx, ny)
            num_list.pop()

num_list.append(num[r-1][c-1])
backtracking(r-1, c-1)

print(max_depth - 1)

