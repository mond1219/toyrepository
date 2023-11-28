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

# 별찍기-7
# https://www.acmicpc.net/problem/2444
def printStar():
    n = int(input())

    for row in range(1, n+1):
        str = ''
        for i in range(0, n-row):
            str += ' '
        for star in range(0, 1+2*(row-1)):
            str += '*'
        print(str)
    for row in range(1, n):
        str = ''
        for i in range(0, row):
            str += ' '
        for star in range(0, (2*n-1)-(row*2)):
            str += '*'
        print(str)

# 킹, 퀸, 룩, 비숍, 나이트, 폰
# https://www.acmicpc.net/problem/3003

def nite():
    black = [1, 1, 2, 2, 2, 8]
    white = input().split(' ')
    answer = ''
    for idx, now in enumerate(white):
        if int(now) != black[idx]:
            answer += str(black[idx] - int(now))+' '
        else:
            answer +=  '0 '
    print(answer)
    
# 그룹 단어 체커
# https://www.acmicpc.net/problem/1316

def checker():
    n = int(input())
    answer  = n
    for i in range(0, n):
        str = input()
        stack = []
        strSet = set()
        while len(str) > 0:
            now = str[0]
            if len(stack) == 0:
                stack.append(now)
            elif now != stack[-1]:
                checkStr = stack.pop(-1)
                if checkStr not in strSet:
                    strSet.add(checkStr)
                    stack.append(now)
                else:
                    str = ''
                    answer -= 1
            str = str[1:]
        if len(stack) > 0 and stack[-1] in strSet:
            answer -= 1
    print(answer)
