import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n, m, k = map(int, input().split())
nums = list(map(int, input().split()))

num_is_over = [1]*k
max_num = float('-inf')

def findings():
    global max_num
    count = 0
    for i in num_is_over:
        if i >= m:
            count += 1
    if count > max_num:
        max_num = count

def choose(curr_num):
    if curr_num == n:
        findings()
        return

    for i in range(k):

        num_is_over[i] += nums[curr_num]
        choose(curr_num+1)

        num_is_over[i] -= nums[curr_num]


choose(0)
print(max_num)