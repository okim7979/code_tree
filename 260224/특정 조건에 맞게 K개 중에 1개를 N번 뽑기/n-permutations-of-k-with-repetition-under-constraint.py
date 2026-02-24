import sys

input = sys.stdin.readline

k, n = map(int, input().split())

numList = []
numCount = [0]*k

def printnum():
    print(*numList)

def choose(curr_num):
    if curr_num == n:
        printnum()
        return

    for i in range(k):
        if numCount[i] > 1:
            continue
        numCount[i] += 1
        numList.append(i+1)
        choose(curr_num+1)

        numCount[i] -= 1
        numList.pop()

choose(0)
