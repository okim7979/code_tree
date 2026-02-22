import sys

input = sys.stdin.readline

n = int(input())

numlist = []
visited = [False] * n

def printans():
    print(*numlist)

def choose(curr_num):
    if curr_num == n:
        printans()
        return
    for i in range(n):
        if visited[i]:
            continue

        visited[i] = True
        numlist.append(i + 1)
        choose(curr_num + 1)

        numlist.pop()
        visited[i] = False

choose(0)