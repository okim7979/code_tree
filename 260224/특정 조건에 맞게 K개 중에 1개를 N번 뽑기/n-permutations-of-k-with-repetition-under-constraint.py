import sys

input = sys.stdin.readline

k, n = map(int, input().split())

numList = []

def printnum():
    print(*numList)

def choose(curr_num):
    if curr_num == n:
        printnum()
        return

    for i in range(k):
        if curr_num >= 2 and numList[-1] == i+1 and numList[-2] == i+1:
            continue


        numList.append(i+1)
        choose(curr_num+1)

        numList.pop()

choose(0)
