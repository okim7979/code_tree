li = list(map(int, input().split()))
print(sum(li), int(sum(li) / len(li)), sum(li) - int(sum(li) / len(li)),sep='\n')
