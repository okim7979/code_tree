import sys

input = sys.stdin.readline

k, n = map(int, input().split())

ans = []
numPair = []


def findNum(curr_num):
    if curr_num == n:
        ans.append(numPair.copy())
        return

    for num in range(k):
        numPair.append(num + 1)
        findNum(curr_num + 1)
        numPair.pop()

findNum(0)
ans.sort()
for num in ans:
    print(*num)