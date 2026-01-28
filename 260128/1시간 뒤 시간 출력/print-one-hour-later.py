time = input()

t_list = time.split(':')

hour = int(t_list[0]) + 1
minute = int(t_list[1])
print(f"{hour}:{minute}")