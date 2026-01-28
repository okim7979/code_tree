phonenumber = input()
phonenum_list = phonenumber.split('-')
print(phonenum_list[0], phonenum_list[2], phonenum_list[1], sep="-")