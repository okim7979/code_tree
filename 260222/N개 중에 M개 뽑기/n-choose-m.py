import sys

input = sys.stdin.readline

n, m = map(int, input().split())

ans = []
numList = []


def backtracking(curr_num, start):
    if curr_num == m:
        ans.append(numList.copy())
        return

    for i in range(start, n):
        numList.append(i + 1)
        backtracking(curr_num + 1, i + 1)
        numList.pop()

backtracking(0, 0)

for num in ans:
    print(*num)