# 팰린드롬인지 확인하기 
# https://www.acmicpc.net/problem/10988

def palindrom():
    str = input()
    check = True
    while len(str) > 1:
        if str[0] != str[-1]:
            print(0)
            check = False
            break
        else:
            str = str[1:len(str) - 1]
    if check :
        print(1)
